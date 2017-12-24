package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.GrammarParser.StatementContext;
import kiv.fjp.antlr_gen.structures.DataType;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Symbol;
import kiv.fjp.antlr_gen.structures.Symbol.SymbolType;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.List;

public class BlockVisitor extends GrammarVisitor<String>{

    private int param;
	
	public BlockVisitor(int level, int param){
	    this.level = level;
	    this.param = param;
	}

	@Override public String visitBlock(GrammarParser.BlockContext ctx) {
		for(int i = 0; i < ctx.getChildCount();i++) {
			if(ctx.getChild(i) instanceof StatementContext) {

			    //TODO for another statements
				symbolTable.addSymbolList();

				visit(ctx.getChild(i));

				symbolTable.removeSymbolList();
			}else { // its declar or define of variables
				visit(ctx.getChild(i));
			}
		}
        return null;
    }
	
	@Override public String visitStatement(GrammarParser.StatementContext ctx) {
	    ExpressionVisitor expressionVisitor = new ExpressionVisitor(level, this);
		expressionVisitor.visit(ctx.bool_exp());

        Instruction jmcInt = new Instruction(IntType.JMC, 0, 0);
        instructionList.add(jmcInt);

        Instruction jmpEndElse = new Instruction(IntType.JMP, 0, 0);
        if (ctx.block().size() > 0) {
            visit(ctx.block(0));
            instructionList.add(jmpEndElse);
        }

        //+1 because of jump end of if or else
        int jmpEndElsePos = instructionList.size() + 1, elseJmpPos = instructionList.size() + 1;
		if(ctx.block().size() == 2) {
			visit(ctx.block(1));
            jmpEndElsePos = instructionList.size() + 1;
		}

        jmpEndElse.setValue(jmpEndElsePos);
		jmcInt.setValue(elseJmpPos);

        return null;
    }

    @Override public String visitS_switch(GrammarParser.S_switchContext ctx) {
        Symbol symbol = symbolTable.findSymbol(ctx.ID().getText());
        if(symbol == null) {
            throw new ParseCancellationException("ParseError - id " + ctx.ID().getText() + " must be defined before.");
        }
        if (symbol.getType()== DataType.Type.BOOL) {
            throw new ParseCancellationException("ParseError - could not be bool type in switch.");
        }
        
        List<Instruction> breakList = new ArrayList<>();
        if (!ctx.s_case().isEmpty()) {
            for (GrammarParser.S_caseContext c : ctx.s_case()) {
                instructionList.add(new Instruction(IntType.LOD, 0, symbol.getAdr()));
                String s = visitS_case(c);
                if (s != null) {
                    Instruction intJMP = new Instruction(IntType.JMP, 0, 0);
                    instructionList.add(intJMP);
                    breakList.add(intJMP);
                }
            }
        } else {
            //visitS_default(ctx.s_default());
        }

        for (Instruction i : breakList) {
            i.setValue(instructionList.size() + 1);
        }

        return null;
    }

    @Override public String visitS_case(GrammarParser.S_caseContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level, this, ctx);
        expressionVisitor.visit(ctx.num_exp());

        instructionList.add(new Instruction(IntType.OPR, 0, Instruction.OPRType.TEST_EQ.ordinal()));

        Instruction intJMC = new Instruction(IntType.JMC, 0, 0);
        instructionList.add(intJMC);

        visitBlock(ctx.block());

        int extra = ctx.BREAK() != null ? 1 : 0;

        intJMC.setValue(instructionList.size() + 1 + extra); //extra because of JMP instruction after break;

        return ctx.BREAK() != null ? "break" : null;
    }

    @Override public String visitS_default(GrammarParser.S_defaultContext ctx) {
        visitBlock(ctx.block());

        return ctx.BREAK() != null ? "break" : null;
    }
	
	@Override public String visitLoop_while(GrammarParser.Loop_whileContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level, this);

        int jmpBoolAdr = instructionList.size() + 1;
        expressionVisitor.visit(ctx.bool_exp());


        Instruction jmcInt = new Instruction(IntType.JMC, 0, 0);
        instructionList.add(jmcInt);

        visit(ctx.block());

        instructionList.add(new Instruction(IntType.JMP, 0, jmpBoolAdr));
        jmcInt.setValue(instructionList.size() + 1); //+1 => jump out of while

        return null;
    }

    @Override public String visitDo_while(GrammarParser.Do_whileContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level,this);
        int jmpToDo = instructionList.size() + 1;

        visitBlock(ctx.block());
        expressionVisitor.visit(ctx.bool_exp());

        instructionList.add(new Instruction(IntType.LIT, 0, 1));
        instructionList.add(new Instruction(IntType.OPR, 0, Instruction.OPRType.TEST_NONEQ.ordinal()));
        instructionList.add(new Instruction(IntType.JMC, 0, jmpToDo));

        return null;
    }

    @Override public String visitRepeat_until(GrammarParser.Repeat_untilContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level,this);
        int jmpToDo = instructionList.size() + 1;

        visitBlock(ctx.block());
        expressionVisitor.visit(ctx.bool_exp());

        instructionList.add(new Instruction(IntType.JMC, 0, jmpToDo));

        return null;
    }
	
	@Override public String visitLoop_for(GrammarParser.Loop_forContext ctx) {
        ExpressionVisitor ev = new ExpressionVisitor(level, this, ctx);
        String id = ctx.def(0).ID().getText();

        Symbol symbol = new Symbol(id, ctx.data_type().getText(), level, 0, SymbolType.VAR);
        if (! symbolTable.addSymbol(symbol)) {
            throw new ParseCancellationException("ParseError - id " + id + " is already declared.");
        }

        instructionList.add(new Instruction(IntType.INT, 0, 1));
        visit(ctx.def(0));

        int jmpBoolAdr = instructionList.size() + 1;
        ev.visit(ctx.bool_exp());

        Instruction jmcInt = new Instruction(IntType.JMC, 0, 0);
        instructionList.add(jmcInt);

        visit(ctx.def(1));
        visit(ctx.block());

        instructionList.add(new Instruction(IntType.JMP, 0, jmpBoolAdr));
        jmcInt.setValue(instructionList.size() + 1); //+1 => jump out of while

        return null;
    }

    @Override
    public String visitConst_declar(GrammarParser.Const_declarContext ctx) {
        String id = ctx.def().ID().getText();
        String varType = ctx.data_type().getText();

        Symbol symbol = new Symbol(id, varType, level, 0, SymbolType.VAR);
        if (! symbolTable.addSymbol(symbol)) {
            throw new ParseCancellationException("ParseError - id " + id + " is already declared.");
        }

        visitDef(ctx.def());
        symbol.setSymbolType(SymbolType.CONST_VAR);

        return null;
    }
	
	@Override public String visitDeclarID(GrammarParser.DeclarIDContext ctx) {
        String id = ctx.ID().getText();
        String varType = ctx.data_type().getText();

        instructionList.add(new Instruction(IntType.INT, 0, 1));
        Symbol symbol = new Symbol(id, varType, level, 0, SymbolType.VAR);
        if(! symbolTable.addSymbol(symbol)) {
            throw new ParseCancellationException("ParseError - id " + id + " is already declared.");
        }

        if (symbol.getType()== DataType.Type.INTEGER || symbol.getType() == DataType.Type.BOOL) {
            instructionList.add(new Instruction(IntType.LIT, 0, 0));
            instructionList.add(new Instruction(IntType.STO, 0, symbol.getAdr()));
        }

        return null;
    }

    @Override public String visitDeclarDef(GrammarParser.DeclarDefContext ctx) {
        String id = ctx.def().ID().getText();
        String varType = ctx.data_type().getText();

        instructionList.add(new Instruction(IntType.INT, 0, 1));
        if(! symbolTable.addSymbol(new Symbol(id, varType, level, 0, SymbolType.VAR))) {
            throw new ParseCancellationException("ParseError - id " + id + " is already declared.");
        }

        visitDef(ctx.def());

	    return null;
    }

    @Override
    public String visitDeclarArray(GrammarParser.DeclarArrayContext ctx) {
        String id = ctx.ID(0).getText();
        String varType = ctx.data_type().getText();

        instructionList.add(new Instruction(IntType.INT, 0, 1));
        if(! symbolTable.addSymbol(new Symbol(id, varType, level, 0, SymbolType.ARRAY))) {
            throw new ParseCancellationException("ParseError - id " + id + " is already declared.");
        }
        
        if(ctx.ID().size() == 2) {
        	Symbol symbol = symbolTable.findSymbol(ctx.ID(1).getText());
        	if(symbol != null) {
        		instructionList.add(new Instruction(IntType.LOD, symbol.getLevel(), symbol.getAdr()));
        		instructionList.add(new Instruction(IntType.ALC, 0,0));
        	}
        }else {
        	int size = Integer.valueOf(ctx.integer().getText());
        	instructionList.add(new Instruction(IntType.LIT, level, size));
        	instructionList.add(new Instruction(IntType.ALC, 0, 0));
        }
        
	    return null;
    }
    
    @Override public String visitArray_def(GrammarParser.Array_defContext ctx) {
    	String id = ctx.ID().getText();

		Symbol symbol;
		if ((symbol = symbolTable.findSymbol(id)) == null) {
			throw new ParseCancellationException("ParseError - identificator " + id + " is not declared.");
		}

		/*if (symbol.getSymbolType() == SymbolType.CONST_VAR) {
            throw new ParseCancellationException("ParseError - identificator " + id + " is const.");
        }*/

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level, this);
        instructionList.add(new Instruction(IntType.LOD, symbol.getLevel(), symbol.getAdr()));
        expressionVisitor.visitValue(ctx.value(0));
        
        if (ctx.value().size() == 2) {
            expressionVisitor.visitValue(ctx.value(1));
        } else if (ctx.ternar_oper() != null) {
            expressionVisitor.visitTernar_oper(ctx.ternar_oper());
        } else {
            String s = visitFunc(ctx.func());
            if (s.compareTo("void") == 0) {
                throw new ParseCancellationException("ParseError - you could not assigned void function.");
            }
        }

        instructionList.add(new Instruction(IntType.MOV, 0, 0));

        return null;
    }

    @Override public String visitParallel_def(GrammarParser.Parallel_defContext ctx) {
	    ExpressionVisitor expressionVisitor = new ExpressionVisitor(level, this);
        int idSize = ctx.ID().size();
        int valSize = ctx.value() == null ? ctx.func().size() : ctx.value().size();

        if (idSize != valSize ){
            throw new ParseCancellationException("ParseError - size of both sides must be equal.");
        }

        for (int i = 0; i < idSize; i++) {
            String id = ctx.ID(i).getText();

            Symbol symbol;
            if ((symbol = symbolTable.findSymbol(id)) == null) {
                throw new ParseCancellationException("ParseError - identificator " + id + " is not declared.");
            }

            if (symbol.getSymbolType() == SymbolType.CONST_VAR) {
                throw new ParseCancellationException("ParseError - identificator " + id + " is const.");
            }

            if (ctx.value() != null) {
                expressionVisitor.visitValue(ctx.value(i));
            } else {
                String s = visitFunc(ctx.func(i));
                if (s.compareTo("void") == 0) {
                    throw new ParseCancellationException("ParseError - you could not assigned void function.");
                }

            }

            instructionList.add(new Instruction(IntType.STO, symbol.getLevel(), symbol.getAdr()));
        }

	    return null;
    }

    @Override public String visitR_return(GrammarParser.R_returnContext ctx) {
	    ExpressionVisitor expressionVisitor = new ExpressionVisitor(level, this);

	    if (ctx.value() != null ||ctx.ternar_oper() != null || ctx.def() != null) {
	        expressionVisitor.visit(ctx);
        } else {
	       String s = visitFunc(ctx.func());
	       if (s.compareTo("void") == 0) {
               throw new ParseCancellationException("ParseError - you could not call void function in return.");
           }
        }

        instructionList.add(new Instruction(IntType.STO, 0, -param-1));
        instructionList.add(new Instruction(IntType.RET, 0, 0));
	    return null;
    }


	
	@Override public String visitDef(GrammarParser.DefContext ctx) {
        String id = ctx.ID().getText();

		Symbol symbol;
		if ((symbol = symbolTable.findSymbol(id)) == null) {
			throw new ParseCancellationException("ParseError - identificator " + id + " is not declared.");
		}

		if (symbol.getSymbolType() == SymbolType.CONST_VAR) {
            throw new ParseCancellationException("ParseError - identificator " + id + " is const.");
        }

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level, this);
        if (ctx.value() != null) {
            expressionVisitor.visitValue(ctx.value());
        } else if (ctx.ternar_oper() != null) {
            expressionVisitor.visitTernar_oper(ctx.ternar_oper());
        } else {
            String s = visitFunc(ctx.func());
            if (s.compareTo("void") == 0) {
                throw new ParseCancellationException("ParseError - you could not assigned void function.");
            }
        }

        System.out.println("S: " + id + "  adr: " + symbol.getAdr());
        instructionList.add(new Instruction(IntType.STO, symbol.getLevel(), symbol.getAdr()));

        return null;
    }

    @Override public String visitMultiple_def(GrammarParser.Multiple_defContext ctx) {
        int sizeListID = ctx.ID().size() - 1;
        String lastIDName = ctx.ID().get(sizeListID).getText();
        Symbol lastID = symbolTable.findSymbol(lastIDName);

        if (lastID == null) {
            throw new ParseCancellationException("ParseError - identificator `" + lastIDName + "` is not declared.");
        }

        if (lastID.getSymbolType() == SymbolType.CONST_VAR) {
            throw new ParseCancellationException("ParseError - identificator " + lastIDName + " is const.");
        }

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level, this);
        if (ctx.value() != null) {
            expressionVisitor.visitValue(ctx.value());
        } else if (ctx.ternar_oper() != null) {
            expressionVisitor.visitTernar_oper(ctx.ternar_oper());
        } else {
            String s = visitFunc(ctx.func());
            if (s.compareTo("void") == 0) {
                throw new ParseCancellationException("ParseError - you could not assigned void function.");
            }
        }

        instructionList.add(new Instruction(IntType.STO, lastID.getLevel(), lastID.getAdr()));

        for (int i = sizeListID - 1; i >= 0; i--) {
            String symbolID = ctx.ID(i).getText();

            Symbol symbol;
            if ((symbol = symbolTable.findSymbol(symbolID)) == null) {
                throw new ParseCancellationException("ParseError - identificator `" + symbolID + "` is not declared.");
            }
            if (symbol.getSymbolType() == SymbolType.CONST_VAR) {
                throw new ParseCancellationException("ParseError - identificator " + symbolID + " is const.");
            }

            instructionList.add(new Instruction(IntType.LOD, symbol.getLevel(), lastID.getAdr()));
            instructionList.add(new Instruction(IntType.STO, symbol.getLevel(), symbol.getAdr()));
        }

	    return null;
    }

    @Override
    public String visitFunc(GrammarParser.FuncContext ctx) {
        String id = ctx.ID().getText();

        Symbol symbol = symbolTable.findSymbol(id, SymbolType.FUNCTION);
        if (symbol == null) {
            throw new ParseCancellationException("ParseError - function " + id + " is not declared before.");
        }

        instructionList.add(new Instruction(IntType.INT, 0, 1));    //Store on stack for return value

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level, this);

        int paramCount = ctx.value().size();
        if (paramCount != symbol.getSize()) {
            throw new ParseCancellationException("ParseError - function expects "+symbol.getSize()+
                    " parameter(s), but you passed " + paramCount + "!");
        }

        for (int i = paramCount - 1; i >= 0; i--) {
            expressionVisitor.visitValue(ctx.value(i));
        }

        instructionList.add(new Instruction(IntType.CAL, 0, symbol.getAdr()));
        instructionList.add(new Instruction(IntType.INT, 0, -ctx.value().size()));

	    return symbol.getType().toString();
    }
	
	
}
