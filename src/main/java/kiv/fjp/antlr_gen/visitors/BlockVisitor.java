package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.GrammarParser.StatementContext;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Symbol;
import kiv.fjp.antlr_gen.structures.Symbol.SymbolType;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class BlockVisitor extends GrammarVisitor<Integer>{
	
	public BlockVisitor(int level){
	    this.level = level;
	}

	@Override public Integer visitBlock(GrammarParser.BlockContext ctx) {
		for(int i = 0; i < ctx.getChildCount();i++) {
			if(ctx.getChild(i) instanceof StatementContext) { //TODO for another statements
				symbolTable.addSymbolList();
				//level++;


				visit(ctx.getChild(i));

				//intInstructionSize.setValue(symbolTable.getActualSize());
				//level--;
				symbolTable.removeSymbolList();
			}else { // its declar or define of variables
				visit(ctx.getChild(i));
			}
		}
        return null;
    }
	
	@Override public Integer visitStatement(GrammarParser.StatementContext ctx) {
	    ExpressionVisitor expressionVisitor = new ExpressionVisitor(level);
		expressionVisitor.visit(ctx.bool_exp());

        Instruction jmcInt = new Instruction(IntType.JMC, 0, 0);
        instructionList.add(jmcInt);
        Instruction intInstructionSize = new Instruction(IntType.INT, 0 ,0);

        Instruction jmpEndElse = new Instruction(IntType.JMP, 0, 0);
        if (ctx.block().size() > 0) {
            instructionList.add(intInstructionSize);
            visit(ctx.block(0));
            intInstructionSize.setValue(symbolTable.getActualSize());
            instructionList.add(new Instruction(IntType.INT, 0, -symbolTable.getActualSize()));
            instructionList.add(jmpEndElse);
        }

        int jmpEndElsePos = instructionList.size(), elseJmpPos = instructionList.size();
		if(ctx.block().size() == 2) {
            instructionList.add(intInstructionSize);
			visit(ctx.block(1));
			intInstructionSize.setValue(symbolTable.getActualSize());
            instructionList.add(new Instruction(IntType.INT, 0, -symbolTable.getActualSize()));
            jmpEndElsePos = instructionList.size();
		}

        jmpEndElse.setValue(jmpEndElsePos);
		jmcInt.setValue(elseJmpPos);

        return null; 
    }
	
	@Override public Integer visitLoop_while(GrammarParser.Loop_whileContext ctx) {
		//TODO
		visit(ctx.bool_exp());
		visit(ctx.block());
        return visitChildren(ctx);
        
    }
	
	@Override public Integer visitLoop_for(GrammarParser.Loop_forContext ctx) {
		//TODO
        return visitChildren(ctx);
        
    }

    @Override
    public Integer visitConst_declar(GrammarParser.Const_declarContext ctx) {
        String id = ctx.def().ID().getText();
        String varType = ctx.var_type().getText();

        Symbol symbol = new Symbol(id, varType, level, 0, SymbolType.VAR);
        if (! symbolTable.addSymbol(symbol)) {
            throw new ParseCancellationException("ParseError - id " + id + " is already declared.");
        }

        visitDef(ctx.def());
        symbol.setSymbolType(SymbolType.CONST_VAR);

        return null;
    }
	
	@Override public Integer visitDeclarID(GrammarParser.DeclarIDContext ctx) {
        String id = ctx.ID().getText();
        String varType = ctx.var_type().getText();

        if(! symbolTable.addSymbol(new Symbol(id, varType, level, 0, SymbolType.VAR))) {
            throw new ParseCancellationException("ParseError - id " + id + " is already declared.");
        }

        return null;
    }

    @Override public Integer visitDeclarDef(GrammarParser.DeclarDefContext ctx) {
        String id = ctx.def().ID().getText();
        String varType = ctx.var_type().getText();

        if(! symbolTable.addSymbol(new Symbol(id, varType, level, 0, SymbolType.VAR))) {
            throw new ParseCancellationException("ParseError - id " + id + " is already declared.");
        }

        visitDef(ctx.def());

	    return null;
    }

    @Override public Integer visitR_return(GrammarParser.R_returnContext ctx) {
	    ExpressionVisitor expressionVisitor = new ExpressionVisitor(level);

	    if (ctx.value() != null ||ctx.ternar_oper() != null) {
	        expressionVisitor.visit(ctx);
        } else {
	        visitFunc(ctx.func());
        }

	    return null;
    }
	
	@Override public Integer visitDef(GrammarParser.DefContext ctx) {
        String id = ctx.ID().getText();

		Symbol symbol;
		if ((symbol = symbolTable.findSymbol(id)) == null) {
			throw new ParseCancellationException("ParseError - identificator " + id + " is not declared.");
		}

		if (symbol.getSymbolType() == SymbolType.CONST_VAR) {
            throw new ParseCancellationException("ParseError - identificator " + id + " is const.");
        }

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level);
        if (ctx.value() != null) {
            expressionVisitor.visitValue(ctx.value());
        } else if (ctx.ternar_oper() != null) {
            expressionVisitor.visitTernar_oper(ctx.ternar_oper());
        } else {
            visitFunc(ctx.func());
        }

        instructionList.add(new Instruction(IntType.STO, symbol.getLevel(), symbol.getAdr()));

        return null;
    }

    @Override public Integer visitMultiple_def(GrammarParser.Multiple_defContext ctx) {
        int sizeListID = ctx.ID().size() - 1;
        String lastIDName = ctx.ID().get(sizeListID).getText();
        Symbol lastID = symbolTable.findSymbol(lastIDName);
        if (lastID == null) {
            throw new ParseCancellationException("ParseError - identificator `" + lastIDName + "` is not declared.");
        }

        if (lastID.getSymbolType() == SymbolType.CONST_VAR) {
            throw new ParseCancellationException("ParseError - identificator " + lastIDName + " is const.");
        }

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level);
        if (ctx.value() != null) {
            expressionVisitor.visitValue(ctx.value());
        } else if (ctx.ternar_oper() != null) {
            expressionVisitor.visitTernar_oper(ctx.ternar_oper());
        } else {
            visitFunc(ctx.func());
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
    public Integer visitFunc(GrammarParser.FuncContext ctx) {
        String id = ctx.ID().getText();


        Symbol symbol = symbolTable.findSymbol(id, SymbolType.FUNCTION);
        if (symbol == null) {
            throw new ParseCancellationException("ParseError - function " + id + " is not declared before.");
        }
        System.out.println("ID: " + id +" - " + symbol.getAdr());

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level);
        expressionVisitor.visit(ctx);
        instructionList.add(new Instruction(IntType.INT, 0, 1));    //Store for return value
        instructionList.add(new Instruction(IntType.CAL, 0, symbol.getAdr()));

	    return null;
    }
	
	
}
