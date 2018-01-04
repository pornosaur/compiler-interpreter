package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.DataType;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.antlr_gen.structures.Instruction.OPRType;
import kiv.fjp.antlr_gen.structures.Symbol;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;

import static kiv.fjp.antlr_gen.GrammarParser.*;

public class ExpressionVisitor extends GrammarVisitor<String>{

    /**
     * Jump to next instruction in list.
     */
    private static int NEXT_INT = 1;

    /**
     * Constant name for integer variable type.
     */
    private static final String INTEGER_NAME = "integer";

    /**
     * Constant name for bool variable type.
     */
    private static final String BOOL_NAME = "bool";

    /**
     * Constant name for plus symbol.
     */
    private static final String PLUS_NAME = "+";

    /**
     * Constant name for minus symbol.
     */
    private static final String MINUS_NAME = "-";

    /**
     * Constant name for multiple symbol.
     */
    private static final String MULTIPLE_NAME = "*";

    /**
     * Instance of caller block visitor.
     */
	private final BlockVisitor block;

    /**
     * Instance of caller context.
     */
	private final ParserRuleContext callerContext;

    /**
     * Check if input is array type.
     */
	private final boolean isVarArray;

    public ExpressionVisitor(BlockVisitor block, ParserRuleContext callerContext, boolean isVarArray) {
        this.block = block;
        this.callerContext = callerContext;
        this.isVarArray = isVarArray;
    }

    @Override
    public String visitIntegers(GrammarParser.IntegersContext ctx) {
        if ((callerContext instanceof Parallel_defContext || callerContext instanceof Multiple_defContext
                || callerContext instanceof Ternar_operContext || callerContext instanceof DefContext
                || callerContext instanceof R_returnContext) && isVarArray) {
            throw new ContextParseCancellationException("you can not assign non-array to array or conversely.", ctx);
        }
        if (ctx.parent instanceof DeclarContext && isVarArray) {
            throw new ContextParseCancellationException("you can not assign non-array to array or conversely.", ctx);
        }

        instructionList.add(new Instruction(IntType.LIT, 0, Integer.valueOf(ctx.getText())));

        return null;
    }

	@Override
	public String visitValue(GrammarParser.ValueContext ctx) {
        if(ctx.ID() != null) {
            visitID(ctx.ID().getText(), ctx);
        } else {
			 visitChildren(ctx);
		}

		return null;
	}

    @Override
    public String visitArray_pos(GrammarParser.Array_posContext ctx) {
        String id = ctx.ID(0).getText();

        Symbol symbol = symbolTable.findSymbol(id);
        if(symbol == null) {
            throw new ContextParseCancellationException("id `" + id + "` is not declared before.", ctx);
        }

        instructionList.add(new Instruction(IntType.LOD, 0, symbol.getAdr()));
        if(ctx.ID().size() == 2) {
            visitID(ctx.ID(1).getText(), ctx);
        }else {
            instructionList.add(new Instruction(IntType.LIT, 0, Integer.valueOf(ctx.integer().getText())));
        }

        instructionList.add(new Instruction(IntType.POS, 0, 0));

        return null;
    }
	
	@Override
	public String visitMultiDiv(GrammarParser.MultiDivContext ctx){
		visit(ctx.num_exp(0));
		visit(ctx.num_exp(1));

        OPRType oprType = (ctx.op.getText().compareTo(MULTIPLE_NAME) == 0) ? OPRType.MULTI : OPRType.DIV;
        instructionList.add(new Instruction(IntType.OPR, 0, oprType.ordinal()));

		return null;
	}
	
	@Override
	public String visitPlusMinus(GrammarParser.PlusMinusContext ctx){
		visit(ctx.num_exp(0));
		visit(ctx.num_exp(1));

		OPRType oprType = (ctx.op.getText().compareTo(PLUS_NAME) == 0) ? OPRType.PLUS : OPRType.MINUS;
        instructionList.add(new Instruction(IntType.OPR, 0, oprType.ordinal()));

		return null;
	}

    @Override
    public String visitSigned(GrammarParser.SignedContext ctx){
        if (ctx.parent != null && ctx.parent instanceof SignedContext) {
            throw new ContextParseCancellationException("too much operators.", ctx);
        }

        visit(ctx.num_exp());

        if (ctx.sign.getText().compareTo(MINUS_NAME) == 0) {
            instructionList.add(new Instruction(IntType.OPR, 0, OPRType.UNARY_MINUS.ordinal()));
        }

	    return ctx.getText();
    }

    @Override
    public String visitBoolNumExp(GrammarParser.BoolNumExpContext ctx) {
        visit(ctx.num_exp(0));
        visit(ctx.num_exp(1));

        OPRType oprType = OPRType.UNUSED;
        String oprName = ctx.op.getText();

        switch (oprName) {
            case "<" :  oprType = OPRType.LESS;
                break;
            case "<=" : oprType = OPRType.LESS_EQ;
                break;
            case ">" :  oprType = OPRType.GREATER;
                break;
            case ">=" : oprType = OPRType.GREATER_EQ;
                break;
            case "==" : oprType = OPRType.TEST_EQ;
                break;
            case "!=" : oprType = OPRType.GREATER_EQ;
                break;
        }

        instructionList.add(new Instruction(IntType.OPR, 0, oprType.ordinal()));

        return null;
    }

    @Override
    public String visitBoolCompare(GrammarParser.BoolCompareContext ctx) {
        visit(ctx.bool_exp(0));
        visit(ctx.bool_exp(1));

        String op = ctx.op.getText();
        OPRType oprType = op.compareTo("!=") == 0 ? OPRType.TEST_NONEQ : OPRType.TEST_EQ;

        instructionList.add(new Instruction(IntType.OPR, 0, oprType.ordinal()));

        return null;
    }

    @Override
    public String visitNumID(GrammarParser.NumIDContext ctx) {
        if (callerContext instanceof S_switchContext) {
            throw new ContextParseCancellationException("you could not put id to switch.", ctx);
        }
        visitID(ctx.getText(), ctx);
        return ctx.getText();
    }

    @Override
    public String visitNumFunc(GrammarParser.NumFuncContext ctx){
        if (callerContext instanceof S_switchContext) {
            throw new ContextParseCancellationException("you could not put function to switch.", ctx);
        }

        String retType = block.visitFunc(ctx.func());
        if (retType.compareTo(INTEGER_NAME) != 0) {
            throw new ContextParseCancellationException("you could not call '"+ retType +"' function in num expression.", ctx);
        }

        return null;
    }

    @Override
    public String visitBoolFunc(GrammarParser.BoolFuncContext ctx){
        if (callerContext instanceof S_switchContext) {
            throw new ContextParseCancellationException("you could not put function to switch.", ctx);
        }

        String retType = block.visitFunc(ctx.func());
        if (retType.compareTo(BOOL_NAME) != 0) {
            throw new ContextParseCancellationException("you could not call '"+ retType +"' function in bool expression.", ctx);
        }

        return null;
    }

    @Override
    public String visitBoolExp(GrammarParser.BoolExpContext ctx) {
        visit(ctx.bool_exp(0));
        visit(ctx.bool_exp(1));

        String op = ctx.op.getText();
        OPRType oprType = op.compareTo("&&") == 0 ? OPRType.MULTI : OPRType.PLUS;

        instructionList.add(new Instruction(IntType.OPR, 0, oprType.ordinal()));

        return null;
    }

    @Override
    public String visitBoolNeg(GrammarParser.BoolNegContext ctx) {
        visit(ctx.bool_exp());
        instructionList.add(new Instruction(IntType.LIT, 0, 1));
        instructionList.add(new Instruction(IntType.OPR, 0, OPRType.TEST_NONEQ.ordinal()));

        return null;
    }

    @Override
    public String visitBoolean(GrammarParser.BooleanContext ctx) {
        String op = ctx.bool().getText();
        int value = op.compareTo("true") == 0 ? 1 : 0;

        instructionList.add(new Instruction(IntType.LIT, 0, value));

        return null;
    }

    @Override
    public String visitTernar_oper(GrammarParser.Ternar_operContext ctx) {
        visit(ctx.bool_exp());

        Instruction jmcInt = new Instruction(IntType.JMC, 0, 0);
        instructionList.add(jmcInt);

        visit(ctx.value(0));
        Instruction jmpEndElse = new Instruction(IntType.JMP, 0, 0);
        instructionList.add(jmpEndElse);

        int elseJmp = instructionList.size() + NEXT_INT;
        visit(ctx.value(1));

        jmcInt.setValue(elseJmp);
        jmpEndElse.setValue(instructionList.size() + NEXT_INT);

        return null;
    }

    @Override
    public String visitNumArray(GrammarParser.NumArrayContext ctx) {
        if (callerContext instanceof S_switchContext) {
            throw new ContextParseCancellationException("you could not put array to switch.", ctx);
        }

        visitID(ctx.ID().getText(), ctx);
        visit(ctx.num_exp());
        instructionList.add(new Instruction(IntType.POS, 0, 0));

        return null;
    }

    @Override
    public String visitBoolArray(GrammarParser.BoolArrayContext ctx) {
        if (callerContext instanceof S_switchContext) {
            throw new ContextParseCancellationException("you could not put array to switch.", ctx);
        }

        visitID(ctx.ID().getText(), ctx);
        visit(ctx.num_exp());
        instructionList.add(new Instruction(IntType.POS, 0, 0));

        return null;
    }

    @Override
    public String visitBoolID(GrammarParser.BoolIDContext ctx) {
        return visitID(ctx.getText(), ctx);
    }

	private String visitID(String id, ParserRuleContext context) {
        Symbol symbol;
        if ((symbol = symbolTable.findSymbol(id)) == null) {
            throw new ContextParseCancellationException("id `" + id + "` is not declared.", context);
        }
        if (callerContext instanceof Loop_forContext) {
            if (symbol.getType() != DataType.Type.BOOL && context.parent instanceof Loop_forContext) {
                throw new ContextParseCancellationException("id in condition must be boolean!", context);
            }
        }
        if (context instanceof NumArrayContext && !symbol.isArray()) {
            throw new ContextParseCancellationException("id `" + symbol.getIndentificator() + "` is not array.", context);

        }

        if ((callerContext instanceof Parallel_defContext || callerContext instanceof Multiple_defContext) && (symbol.isArray() != isVarArray)) {
            throw new ContextParseCancellationException("you can not assign non-array to array or conversely.", context);
        }

        if (callerContext instanceof R_returnContext && symbol.isArray() != isVarArray) {
            throw new ContextParseCancellationException("bad return type.", context);
        }

        if ((callerContext instanceof DefContext) && (symbol.isArray() != isVarArray) && !(context instanceof NumArrayContext
                || context instanceof  BoolArrayContext)) {
            throw new ContextParseCancellationException("you could not put non-array type to array type or conversely.", context);
        }

       if (callerContext instanceof FuncContext && context instanceof ValueContext) {
           int i = ((FuncContext) callerContext).value().indexOf(context);

           Symbol func = symbolTable.findSymbol(((FuncContext) callerContext).ID().getText(), Symbol.SymbolType.FUNCTION);
           Symbol param = func.getParams().get(i);

           if (param.isArray() != symbol.isArray()) {
                    throw new ContextParseCancellationException("type in params are not compatible.", context);
           }
        }

        if (symbol.getType() == DataType.Type.INTEGER && context instanceof Bool_expContext) {
            throw new ContextParseCancellationException("integer can not be in bool expression.", context);
        }
        if (symbol.getType() == DataType.Type.BOOL && context instanceof Num_expContext) {
            throw new ContextParseCancellationException("bool can not be in number expression.", context);
        }

        instructionList.add(new Instruction(IntType.LOD, 0, symbol.getAdr()));

        return symbol.getIndentificator().toString();
    }

}
