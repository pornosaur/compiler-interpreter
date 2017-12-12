package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.DataType;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.antlr_gen.structures.Instruction.OPRType;
import kiv.fjp.antlr_gen.structures.Symbol;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.List;

public class ExpressionVisitor extends GrammarVisitor<String>{


	private int level;

	private DataType.Type dataType;

	public ExpressionVisitor(int level, DataType.Type dataType) {
		this.level = level;
		this.dataType = dataType;
	}


    @Override
    public String visitIntegers(GrammarParser.IntegersContext ctx) {
        instructionList.add(new Instruction(IntType.LIT, level, Integer.valueOf(ctx.getText())));

        return ctx.getText();
    }


	@Override
	public String visitValue(GrammarParser.ValueContext ctx) {
        if(ctx.bool_exp() != null) {
            visitChildren(ctx);
        }else if(ctx.ID() != null) {
            String id = ctx.ID().getText();

            Symbol symbol;
            if ((symbol = symbolTable.findSymbol(id)) == null) {
                throw new ParseCancellationException("ParseError - identificator " + id + " is not declared.");
            }

            if (symbol.getType() != dataType) {
                throw new ParseCancellationException("ParseError - bad conversion " + symbol.getType().toString() + " to " + dataType.toString());
            }

            instructionList.add(new Instruction(IntType.LOD, level, symbol.getAdr()));
        } else if(ctx.num_exp() != null) {
			 visitChildren(ctx);
		}

		return null;
	}
	
	@Override
	public String visitMultiDiv(GrammarParser.MultiDivContext ctx){
		visit(ctx.num_exp(0));
		visit(ctx.num_exp(1));

        OPRType oprType = (ctx.op.getText().compareTo("*") == 0) ? OPRType.MULTI : OPRType.DIV;
        instructionList.add(new Instruction(IntType.OPR, level, oprType.ordinal()));

		return null;
	}
	
	@Override
	public String visitPlusMinus(GrammarParser.PlusMinusContext ctx){
		visit(ctx.num_exp(0));
		visit(ctx.num_exp(1));

		OPRType oprType = (ctx.op.getText().compareTo("+") == 0) ? OPRType.PLUS : OPRType.MINUS;
        instructionList.add(new Instruction(IntType.OPR, level, oprType.ordinal()));

		return null;
	}

    @Override
    public String visitReal(GrammarParser.RealContext ctx){
        String decadic = visit(ctx.integer(0));
        String mantis = visit(ctx.integer(1));
        //TODO how to save real?
        return null;
    }

    @Override
    public String visitSigned(GrammarParser.SignedContext ctx){
        visit(ctx.num_exp());

        if (ctx.sign.getText().compareTo("-") == 0) {
            instructionList.add(new Instruction(IntType.OPR, level, OPRType.UNARY_MINUS.ordinal()));
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

        instructionList.add(new Instruction(IntType.OPR, level, oprType.ordinal()));

        return null;
    }

    @Override
    public String visitBoolCompare(GrammarParser.BoolCompareContext ctx) {
        visit(ctx.bool_exp(0));
        visit(ctx.bool_exp(1));

        String op = ctx.op.getText();
        OPRType oprType = op.compareTo("!=") == 0 ? OPRType.TEST_NONEQ : OPRType.TEST_EQ;

        instructionList.add(new Instruction(IntType.OPR, level, oprType.ordinal()));

        return null;
    }

    @Override
    public String visitBoolExp(GrammarParser.BoolExpContext ctx) {
        visit(ctx.bool_exp(0));
        visit(ctx.bool_exp(1));

        String op = ctx.op.getText();
        OPRType oprType = op.compareTo("&&") == 0 ? OPRType.MULTI : OPRType.PLUS;

        instructionList.add(new Instruction(IntType.OPR, level, oprType.ordinal()));

        return null;
    }

    @Override
    public String visitBoolNeg(GrammarParser.BoolNegContext ctx) {
        instructionList.add(new Instruction(IntType.LIT, level, 1));
        instructionList.add(new Instruction(IntType.OPR, level, OPRType.TEST_NONEQ.ordinal()));

        return null;
    }

    @Override
    public String visitBoolean(GrammarParser.BooleanContext ctx) {
        String op = ctx.bool().getText();
        int value = op.compareTo("true") == 0 ? 1 : 0;

        instructionList.add(new Instruction(IntType.LIT, level, value));

        return null;
    }

	@Override
	public String visitStr_def(GrammarParser.Str_defContext ctx){
		visitChildren(ctx);
		return null;
	}
	
	@Override
	public String visitStr(GrammarParser.StrContext ctx) {
		ctx.getText();
		return visitChildren(ctx);
	}

}
