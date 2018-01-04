package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.DataType;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Symbol;
import kiv.fjp.antlr_gen.structures.Symbol.SymbolType;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;

import java.util.ArrayList;
import java.util.List;

public class BlockVisitor extends GrammarVisitor<String>{

    /**
     * Constant name for non-void return type.
     */
    private static final String VOID_RET_NAME = "void";

    /**
     * Constant name for integer variable type.
     */
    private static final String INTEGER_NAME = "integer";

    /**
     * Constant name for break in loops.
     */
    private static final String BREAK_NAME = "break;";

    /**
     * Jump to next instruction in list.
     */
    private static int NEXT_INT = 1;

    /**
     * Check if return type of function is array.
     */
    private boolean returnArr;

    /**
     * Count of parameters in function.
     */
    private int params;

    private DataType.Type typeRet;
	
	public BlockVisitor(int params, boolean returnArr, DataType.Type typeRet){
	    this.params = params;
	    this.returnArr = returnArr;
	    this.typeRet = typeRet;
	}

	@Override public String visitBlock(GrammarParser.BlockContext ctx) {
	    visitChildren(ctx);

        return null;
    }
	
	@Override public String visitStatement(GrammarParser.StatementContext ctx) {
	    ExpressionVisitor expressionVisitor = new ExpressionVisitor(this, ctx, false);
		expressionVisitor.visit(ctx.bool_exp());

        Instruction jmcInt = new Instruction(IntType.JMC, 0, 0);
        instructionList.add(jmcInt);

        Instruction jmpEndElse = new Instruction(IntType.JMP, 0, 0);
        if (ctx.block().size() > 0) {
            symbolTable.addSymbolList(symbolTable.getActualSize());
            visit(ctx.block(0));
            instructionList.add(new Instruction(IntType.INT, 0, -symbolTable.getActualSize()));
            symbolTable.removeSymbolList();
            instructionList.add(jmpEndElse);
        }

        //+1 because of jump end of if or else
        int jmpEndElsePos = instructionList.size() + NEXT_INT, elseJmpPos = instructionList.size() + NEXT_INT;
		if(ctx.block().size() == 2) {
            symbolTable.addSymbolList(symbolTable.getActualSize());
            visit(ctx.block(1));
            instructionList.add(new Instruction(IntType.INT, 0, -symbolTable.getActualSize()));
            symbolTable.removeSymbolList();
            jmpEndElsePos = instructionList.size() + NEXT_INT;
		}

        jmpEndElse.setValue(jmpEndElsePos);
		jmcInt.setValue(elseJmpPos);

        return null;
    }

    @Override public String visitS_switch(GrammarParser.S_switchContext ctx) {
        Symbol symbol = symbolTable.findSymbol(ctx.ID().getText());
        if(symbol == null) {
            throw new ContextParseCancellationException("id `" + ctx.ID().getText() + "` must be defined before.", ctx);
        }
        if (symbol.getType()== DataType.Type.BOOL) {
            throw new ContextParseCancellationException("could not be bool type in switch.", ctx);
        }

        symbolTable.addSymbolList(symbolTable.getActualSize());
        List<Instruction> breakList = new ArrayList<>();
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(this, ctx, false);
        if (!ctx.num_exp().isEmpty()) {
            int caseCount = ctx.num_exp().size();

            Instruction skipBreak = null;
            for (int i = 0; i < caseCount; i++) {
                instructionList.add(new Instruction(IntType.LOD, 0, symbol.getAdr()));

                expressionVisitor.visit(ctx.num_exp(i));
                instructionList.add(new Instruction(IntType.OPR, 0, Instruction.OPRType.TEST_EQ.ordinal()));

                Instruction intJMC = new Instruction(IntType.JMC, 0, 0);
                instructionList.add(intJMC);

                if (skipBreak != null) {
                    skipBreak.setValue(instructionList.size() + NEXT_INT);
                }

                visitBlock(ctx.block(i));

                Instruction jmpInt = new Instruction(IntType.JMP, 0,0);
                instructionList.add(jmpInt);
                if (ctx.s_break(i).getText().compareTo(BREAK_NAME) == 0) {
                    breakList.add(jmpInt);
                    skipBreak = null;
                } else {
                    skipBreak = jmpInt;
                }

                intJMC.setValue(instructionList.size() + NEXT_INT);
            }
        }

        for (Instruction i : breakList) {
            i.setValue(instructionList.size() + NEXT_INT);
        }

        instructionList.add(new Instruction(IntType.INT, 0, -symbolTable.getActualSize()));
        symbolTable.removeSymbolList();

        return null;
    }

    @Override public String visitForeach(GrammarParser.ForeachContext ctx) {
        instructionList.add(new Instruction(IntType.INT, 0 , 1));
	    Symbol symbol = new Symbol("", INTEGER_NAME, 0, 0, SymbolType.VAR);
        if (! symbolTable.addSymbol(symbol)) {
            throw new ContextParseCancellationException("problem with variable for position in FOREACH.", ctx);
        }

        instructionList.add(new Instruction(IntType.INT, 0 , 1));
        Symbol symbolID = new Symbol(ctx.ID(0).getText(), ctx.data_type().getText(), 0, 0, SymbolType.VAR);
        if (! symbolTable.addSymbol(symbolID)) {
            throw new ContextParseCancellationException("id `" + ctx.ID(0).getText() + "` is already declared.", ctx);
        }

	    Symbol sArr = symbolTable.findSymbol(ctx.ID(1).getText());
	    if (sArr == null) {
            throw new ContextParseCancellationException("array `" + sArr.getIndentificator() + "` is not defined before.", ctx);
        }

        instructionList.add(new Instruction(IntType.LIT, 0 , 0));
        instructionList.add(new Instruction(IntType.STO, 0 , symbol.getAdr()));
        int jmpSize = instructionList.size() + NEXT_INT;

        instructionList.add(new Instruction(IntType.LOD, 0, sArr.getAdr()));
        instructionList.add(new Instruction(IntType.LEN, 0, 0));
        instructionList.add(new Instruction(IntType.LOD, 0, symbol.getAdr()));
        instructionList.add(new Instruction(IntType.OPR, 0, Instruction.OPRType.TEST_NONEQ.ordinal()));
        Instruction intJMP = new Instruction(IntType.JMC, 0, 0);
        instructionList.add(intJMP);

        instructionList.add(new Instruction(IntType.LOD, 0, sArr.getAdr()));
        instructionList.add(new Instruction(IntType.LOD, 0, symbol.getAdr()));
        instructionList.add(new Instruction(IntType.POS, 0, 0));
        instructionList.add(new Instruction(IntType.STO, 0, symbolID.getAdr()));

        visitBlock(ctx.block());

        instructionList.add(new Instruction(IntType.LOD, 0, symbol.getAdr()));
        instructionList.add(new Instruction(IntType.LIT, 0, 1));
        instructionList.add(new Instruction(IntType.OPR, 0, Instruction.OPRType.PLUS.ordinal()));
        instructionList.add(new Instruction(IntType.STO, 0, symbol.getAdr()));
        instructionList.add(new Instruction(IntType.JMP, 0, jmpSize));
        intJMP.setValue(instructionList.size() + NEXT_INT);

	    return null;
    }
    @Override public String visitLoop(GrammarParser.LoopContext ctx) {
        symbolTable.addSymbolList(symbolTable.getActualSize());
        visitChildren(ctx);
        symbolTable.removeSymbolList();

        return null;
    }

	@Override public String visitLoop_while(GrammarParser.Loop_whileContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(this, ctx, false);

        int jmpBoolAdr = instructionList.size() + NEXT_INT;
        expressionVisitor.visit(ctx.bool_exp());


        Instruction jmcInt = new Instruction(IntType.JMC, 0, 0);
        instructionList.add(jmcInt);

        visit(ctx.block());

        instructionList.add(new Instruction(IntType.JMP, 0, jmpBoolAdr));
        jmcInt.setValue(instructionList.size() + NEXT_INT);

        return null;
    }

    @Override public String visitDo_while(GrammarParser.Do_whileContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(this, ctx, false);
        int jmpToDo = instructionList.size() + NEXT_INT;

        visitBlock(ctx.block());
        expressionVisitor.visit(ctx.bool_exp());

        instructionList.add(new Instruction(IntType.LIT, 0, 1));
        instructionList.add(new Instruction(IntType.OPR, 0, Instruction.OPRType.TEST_NONEQ.ordinal()));
        instructionList.add(new Instruction(IntType.JMC, 0, jmpToDo));

        return null;
    }

    @Override public String visitRepeat_until(GrammarParser.Repeat_untilContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(this, ctx, false);
        int jmpToDo = instructionList.size() + NEXT_INT;

        visitBlock(ctx.block());
        expressionVisitor.visit(ctx.bool_exp());

        instructionList.add(new Instruction(IntType.JMC, 0, jmpToDo));

        return null;
    }
	
	@Override public String visitLoop_for(GrammarParser.Loop_forContext ctx) {
        ExpressionVisitor ev = new ExpressionVisitor(this, ctx, false);
        String id = ctx.def(0).ID().getText();

        Symbol symbol = new Symbol(id, ctx.data_type().getText(), 0, 0, SymbolType.VAR);
        if (! symbolTable.addSymbol(symbol)) {
            throw new ContextParseCancellationException("id `" + id + "` is already declared.", ctx);
        }

        instructionList.add(new Instruction(IntType.INT, 0, 1));
        visit(ctx.def(0));

        Instruction notCheckFirst = new Instruction(IntType.JMP, 0 , 0);
        instructionList.add(notCheckFirst);

        int jmpBoolAdr = instructionList.size() + NEXT_INT;
        visit(ctx.def(1));
        notCheckFirst.setValue(instructionList.size() + NEXT_INT);
        ev.visit(ctx.bool_exp());

        Instruction jmcInt = new Instruction(IntType.JMC, 0, 0);
        instructionList.add(jmcInt);

        visit(ctx.block());

        instructionList.add(new Instruction(IntType.JMP, 0, jmpBoolAdr));
        jmcInt.setValue(instructionList.size() + NEXT_INT);

        return null;
    }

    @Override
    public String visitConst_declar(GrammarParser.Const_declarContext ctx) {
        String id = ctx.def().ID().getText();
        String varType = ctx.data_type().getText();

        Symbol symbol = new Symbol(id, varType, 0, 0, SymbolType.VAR);
        if (! symbolTable.addSymbol(symbol)) {
            throw new ContextParseCancellationException("id `" + id + "` is already declared.", ctx);
        }

        visitDef(ctx.def());
        symbol.setSymbolType(SymbolType.CONST_VAR);

        return null;
    }

    @Override public String visitArray_asigne(GrammarParser.Array_asigneContext ctx) {
        String id = ctx.ID(0).getText(), idRight;
        String varType = ctx.data_type().getText();

        Symbol symbolRight;
        instructionList.add(new Instruction(IntType.INT, 0, 1));
        if (ctx.ID(1) != null) {
            idRight = ctx.ID(1).getText();
            symbolRight = symbolTable.findSymbol(idRight);

            if (symbolRight == null) {
                throw new ContextParseCancellationException("id `" + idRight + "` is not declared before.", ctx);
            }

        } else {
            Symbol symbolFunc = symbolTable.findSymbol(ctx.func().ID().getText(), SymbolType.FUNCTION);
            if (symbolFunc == null) {
                throw new ContextParseCancellationException("function `" + ctx.func().ID().getText() + "` not exists.", ctx);
            }
            if (! symbolFunc.isArray()) {
                throw new ContextParseCancellationException("you could not assign non-array to array.", ctx);
            }
            symbolRight = symbolFunc;
            visitFunc(ctx.func());
        }

        Symbol symbolArr = new Symbol(id, varType, 0, 0, SymbolType.VAR);
        if(! symbolTable.addSymbol(symbolArr)) {
            throw new ContextParseCancellationException("id `" + id + "` is already declared.", ctx);
        }
        if (symbolRight.getType() != symbolArr.getType()) {
            throw new ContextParseCancellationException("you could not assign array to array with different data type.", ctx);
        }
        symbolArr.setArray(true);

        instructionList.add(new Instruction(IntType.STO, 0, symbolArr.getAdr()));

        return null;
    }

	@Override public String visitDeclarID(GrammarParser.DeclarIDContext ctx) {
        String id = ctx.ID().getText();
        String varType = ctx.data_type().getText();

        instructionList.add(new Instruction(IntType.INT, 0, 1));
        Symbol symbol = new Symbol(id, varType, 0, 0, SymbolType.VAR);
        if(! symbolTable.addSymbol(symbol)) {
            throw new ContextParseCancellationException("id `" + id + "` is already declared.", ctx);
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
        if(! symbolTable.addSymbol(new Symbol(id, varType, 0, 0, SymbolType.VAR))) {
            throw new ContextParseCancellationException("id `" + id + "` is already declared.", ctx);
        }

        visitDef(ctx.def());

	    return null;
    }

    @Override
    public String visitDeclarArray(GrammarParser.DeclarArrayContext ctx) {
        String id = ctx.ID(0).getText();
        String varType = ctx.data_type().getText();

        instructionList.add(new Instruction(IntType.INT, 0, 1));
        Symbol symbol = new Symbol(id, varType, 0, 0, SymbolType.VAR);
        symbol.setArray(true);
        if(! symbolTable.addSymbol(symbol)) {
            throw new ContextParseCancellationException("id `" + id + "` is already declared.", ctx);
        }
        
        if(ctx.ID().size() == 2) {
           Symbol symbol2 = symbolTable.findSymbol(ctx.ID(1).getText());
        	if(symbol2 != null) {
        		instructionList.add(new Instruction(IntType.LOD, symbol2.getLevel(), symbol2.getAdr()));
        		instructionList.add(new Instruction(IntType.ALC, 0,0));
        	}
        }else {
        	int size = Integer.valueOf(ctx.integer().getText());
        	instructionList.add(new Instruction(IntType.LIT, 0, size));
        	instructionList.add(new Instruction(IntType.ALC, 0, 0));
        }
        
	    return null;
    }
    
    @Override public String visitArray_def(GrammarParser.Array_defContext ctx) {
    	String id = ctx.ID().getText();

		Symbol symbol;
		if ((symbol = symbolTable.findSymbol(id)) == null) {
			throw new ContextParseCancellationException("id `" + id + "` is not declared.", ctx);
		}

		if (! symbol.isArray()) {
            throw new ContextParseCancellationException("id `" + id + "` is not array type.", ctx);
        }

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(this, ctx, symbol.isArray());
        instructionList.add(new Instruction(IntType.LOD, symbol.getLevel(), symbol.getAdr()));
        expressionVisitor.visitValue(ctx.value(0));
        
        if (ctx.value().size() == 2) {
            expressionVisitor.visitValue(ctx.value(1));
        } else if (ctx.ternar_oper() != null) {
            expressionVisitor.visitTernar_oper(ctx.ternar_oper());
        } else {
            String s = visitFunc(ctx.func());
            if (s.compareTo(VOID_RET_NAME) == 0) {
                throw new ContextParseCancellationException("you could not assigned " + VOID_RET_NAME + " function.", ctx);
            }
        }

        testBool(symbol);
        instructionList.add(new Instruction(IntType.MOV, 0, 0));

        return null;
    }

    @Override public String visitParallel_def(GrammarParser.Parallel_defContext ctx) {
        int idSize = ctx.ID().size();
        int valSize = ctx.value().size() + ctx.func().size();

        if (idSize != valSize ){
            throw new ContextParseCancellationException("size of both sides must be equal.", ctx);
        }

        for (int i = 0; i < idSize; i++) {
            String id = ctx.ID(i).getText();

            Symbol symbol;
            if ((symbol = symbolTable.findSymbol(id)) == null) {
                throw new ContextParseCancellationException("id `" + id + "` is not declared.", ctx);
            }

            if (symbol.getSymbolType() == SymbolType.CONST_VAR) {
                throw new ContextParseCancellationException("id `" + id + "` is const.", ctx);
            }

            ExpressionVisitor expressionVisitor = new ExpressionVisitor(this, ctx, symbol.isArray(), symbol.getType());
            if (ctx.value(i) != null) {
                expressionVisitor.visitValue(ctx.value(i));
            } else {
                Symbol symbolFunc = symbolTable.findSymbol(ctx.func(i).ID().getText(), SymbolType.FUNCTION);
                if (symbolFunc == null) {
                    throw new ContextParseCancellationException("function `" + ctx.func(i).ID().getText() + "` not exists!", ctx);
                }
                if (symbol.isArray() != symbolFunc.isArray()) {
                    throw new ContextParseCancellationException("you could not assign array to non-array and conversely.", ctx);
                }
                if (symbol.isArray() && symbolFunc.isArray() && (symbol.getType() != symbolFunc.getType())) {
                    throw new ContextParseCancellationException("you could not assign array to array with different data type.", ctx);
                }
                String s = visitFunc(ctx.func(i));
                if (s.compareTo(VOID_RET_NAME) == 0) {
                    throw new ContextParseCancellationException("you could not assigned `" + VOID_RET_NAME + "` function.", ctx);
                }
            }

            testBool(symbol);
            instructionList.add(new Instruction(IntType.STO, symbol.getLevel(), symbol.getAdr()));
        }

	    return null;
    }

    @Override public String visitR_return(GrammarParser.R_returnContext ctx) {
	    ExpressionVisitor expressionVisitor = new ExpressionVisitor(this, ctx, returnArr, typeRet);

	    if (typeRet == DataType.Type.VOID && (ctx.func() != null || ctx.ternar_oper() != null || ctx.value() != null)) {
            throw new ContextParseCancellationException("you could return value in void type function.", ctx);
        }

        if (typeRet != DataType.Type.VOID && ctx.value() == null && ctx.ternar_oper() == null && ctx.func() == null) {
            throw new ContextParseCancellationException("you have return a value in non-void function.", ctx);
        }

	    if (ctx.func() == null) {
	        expressionVisitor.visit(ctx);
        } else {
	       String s = visitFunc(ctx.func());
	       if (s.compareTo(VOID_RET_NAME) == 0) {
               throw new ContextParseCancellationException("you could not call " + VOID_RET_NAME + " function in return.", ctx);
           }
        }

        testBool(typeRet);
        instructionList.add(new Instruction(IntType.STO, 0, -params - NEXT_INT));
        instructionList.add(new Instruction(IntType.RET, 0, 0));
	    return null;
    }
	
	@Override public String visitDef(GrammarParser.DefContext ctx) {
        String id = ctx.ID().getText();

		Symbol symbol;
		if ((symbol = symbolTable.findSymbol(id)) == null) {
			throw new ContextParseCancellationException("id `" + id + "` is not declared.", ctx);
		}

		if (symbol.getSymbolType() == SymbolType.CONST_VAR) {
            throw new ContextParseCancellationException("id `" + id + "` is const.", ctx);
        }

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(this, ctx, symbol.isArray(), symbol.getType());
        if (ctx.value() != null) {
            expressionVisitor.visitValue(ctx.value());
        } else if (ctx.ternar_oper() != null) {
            expressionVisitor.visitTernar_oper(ctx.ternar_oper());
        } else {
            Symbol symbolFunc = symbolTable.findSymbol(ctx.func().ID().getText(), SymbolType.FUNCTION);
            if (symbolFunc == null) {
                throw new ContextParseCancellationException("function `" + ctx.func().ID().getText() + "` not exists!", ctx);
            }
            if (symbolFunc.isArray() != symbol.isArray()) {
                throw new ContextParseCancellationException("you could not assign array to non-array or conversely!", ctx);
            }
            if (symbol.isArray() && symbolFunc.isArray() && (symbol.getType() != symbolFunc.getType())) {
                throw new ContextParseCancellationException("you could not assign array to array with different data type.", ctx);
            }
            String s = visitFunc(ctx.func());
            if (s.compareTo(VOID_RET_NAME) == 0) {
                throw new ContextParseCancellationException("you could not assigned " + VOID_RET_NAME + " function.", ctx);
            }
        }

       testBool(symbol);

        instructionList.add(new Instruction(IntType.STO, symbol.getLevel(), symbol.getAdr()));

        return null;
    }

    @Override public String visitMultiple_def(GrammarParser.Multiple_defContext ctx) {
        int sizeListID = ctx.ID().size() - 1;
        String lastIDName = ctx.ID().get(sizeListID).getText();
        Symbol lastID = symbolTable.findSymbol(lastIDName);

        if (lastID == null) {
            throw new ContextParseCancellationException("id `" + lastIDName + "` is not declared.", ctx);
        }

        if (lastID.getSymbolType() == SymbolType.CONST_VAR) {
            throw new ContextParseCancellationException("id `" + lastIDName + "` is const.", ctx);
        }

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(this, ctx, lastID.isArray(), lastID.getType());
        if (ctx.value() != null) {
            expressionVisitor.visitValue(ctx.value());
        } else if (ctx.ternar_oper() != null) {
            expressionVisitor.visitTernar_oper(ctx.ternar_oper());
        } else {
            String s = visitFunc(ctx.func());
            Symbol symbolFunc = symbolTable.findSymbol(ctx.func().ID().getText(), SymbolType.FUNCTION);
            if (symbolFunc == null) {
                throw new ContextParseCancellationException("function `" + ctx.func().ID().getText() + "` not exists!", ctx);
            }
            if (lastID.isArray() != symbolFunc.isArray()) {
                throw new ContextParseCancellationException("you could not assign array to non-array and conversely.", ctx);
            }
            if (s.compareTo(VOID_RET_NAME) == 0) {
                throw new ContextParseCancellationException("you could not assigned " + VOID_RET_NAME + " function.", ctx);
            }
            if (lastID.isArray() && symbolFunc.isArray() && (lastID.getType() != symbolFunc.getType())) {
                throw new ContextParseCancellationException("you could not assign array to array with different data type.", ctx);
            }
        }

        instructionList.add(new Instruction(IntType.STO, lastID.getLevel(), lastID.getAdr()));

        for (int i = sizeListID - 1; i >= 0; i--) {
            String symbolID = ctx.ID(i).getText();

            Symbol symbol;
            if ((symbol = symbolTable.findSymbol(symbolID)) == null) {
                throw new ContextParseCancellationException("id `" + symbolID + "` is not declared.", ctx);
            }
            if (symbol.getSymbolType() == SymbolType.CONST_VAR) {
                throw new ContextParseCancellationException("id `" + symbolID + "` is const.", ctx);
            }
            if (symbol.isArray() != lastID.isArray()) {
                throw new ContextParseCancellationException("you can not assign non-array to array.", ctx);
            }
            if (lastID.isArray() && symbol.isArray() && (lastID.getType() != symbol.getType())) {
                throw new ContextParseCancellationException("you could not assign array to array with different data type.", ctx);
            }

            instructionList.add(new Instruction(IntType.LOD, symbol.getLevel(), lastID.getAdr()));
            testBool(symbol);
            instructionList.add(new Instruction(IntType.STO, symbol.getLevel(), symbol.getAdr()));
        }

	    return null;
    }

    @Override
    public String visitFunc(GrammarParser.FuncContext ctx) {
        String id = ctx.ID().getText();

        Symbol symbol = symbolTable.findSymbol(id, SymbolType.FUNCTION);
        if (symbol == null) {
            throw new ContextParseCancellationException("function `" + id + "` is not declared before.", ctx);
        }
        if (symbol.isArray()) {
            if (ctx.parent instanceof GrammarParser.NumFuncContext || ctx.parent instanceof GrammarParser.BoolFuncContext) {
                throw new ContextParseCancellationException("you have to assign array into the variable at the first.", ctx);
            }
        }

        instructionList.add(new Instruction(IntType.INT, 0, 1));    //Store on stack for return value



        int paramCount = ctx.value().size();
        if (paramCount != symbol.getSize()) {
            throw new ContextParseCancellationException("function expects " + symbol.getSize() +
                    " parameter(s), but you passed " + paramCount + "!", ctx);
        }

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(this, ctx, returnArr);
        for (int i = paramCount - 1; i >= 0; i--) {
            expressionVisitor.visitValue(ctx.value(i));
        }

        instructionList.add(new Instruction(IntType.CAL, 0, symbol.getAdr()));
        instructionList.add(new Instruction(IntType.INT, 0, -ctx.value().size()));

	    return String.valueOf(symbol.getType());
    }

    /**
     * Implicit type conversion integer to bool. Greater or equal number to 1 => 1(true). Less or equal number to 0
     * => 0(false).
     *
     * @param symbol input symbol.
     */
    private void testBool(Symbol symbol) {
        if (symbol.getType() == DataType.Type.BOOL) {
            boolConvert();
        }
    }

    private void testBool(DataType.Type type) {
        if (type == DataType.Type.BOOL) {
           boolConvert();
        }
    }

    private void boolConvert() {
        instructionList.add(new Instruction(IntType.LIT, 0, 1));
        instructionList.add(new Instruction(IntType.OPR, 0, Instruction.OPRType.GREATER_EQ.ordinal()));
        instructionList.add(new Instruction(IntType.JMC, 0, instructionList.size() + 4));
        instructionList.add(new Instruction(IntType.LIT, 0, 1));
        instructionList.add(new Instruction(IntType.JMP, 0, instructionList.size() + 3));
        instructionList.add(new Instruction(IntType.LIT, 0, 0));
    }

}
