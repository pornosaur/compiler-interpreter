package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.antlr_gen.structures.Instruction.OPRType;

import java.util.ArrayList;
import java.util.List;

public class ExpressionVisitor extends GrammarBaseVisitor<String>{

	private List<Instruction> instructions;

	private int level;

	public ExpressionVisitor(int level) {
		instructions = new ArrayList<>();
		this.level = level;
	}


    @Override
    public String visitIntegers(GrammarParser.IntegersContext ctx) {
	    instructions.add(new Instruction(IntType.LIT, level, Integer.valueOf(ctx.getText())));

        return ctx.getText();
    }


	@Override
	public String visitValue(GrammarParser.ValueContext ctx) {
		if(ctx.str_def() != null) {
			visitStr_def(ctx.str_def());
		}
		if(ctx.ID() != null) {
			ctx.ID().getText();
		}
		if(ctx.num_exp() != null) {
			 visitChildren(ctx);
		}
		if(ctx.bool_exp() != null) {
			 visitChildren(ctx);
		}
		return null;
	}
	
	@Override
	public String visitMultiDiv(GrammarParser.MultiDivContext ctx){
		visit(ctx.num_exp(0));
		visit(ctx.num_exp(1));

        OPRType oprType = (ctx.op.getText().compareTo("*") == 0) ? OPRType.MULTI : OPRType.DIV;
        instructions.add(new Instruction(IntType.OPR, level, oprType.ordinal()));

		return null;
	}
	
	@Override
	public String visitPlusMinus(GrammarParser.PlusMinusContext ctx){
		visit(ctx.num_exp(0));
		visit(ctx.num_exp(1));

		OPRType oprType = (ctx.op.getText().compareTo("+") == 0) ? OPRType.PLUS : OPRType.MINUS;
		instructions.add(new Instruction(IntType.OPR, level, oprType.ordinal()));

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
    public String visitNumID(GrammarParser.NumIDContext ctx){
	    String id = ctx.getText();
	    int value = 0;   //TODO find id in table symbols and set value of variable

        instructions.add(new Instruction(IntType.LIT, level, value));

	    return id;
    }

    @Override
    public String visitSigned(GrammarParser.SignedContext ctx){
        visit(ctx.num_exp());

        if (ctx.sign.getText().compareTo("-") == 0) {
            instructions.add(new Instruction(IntType.OPR, level, OPRType.UNARY_MINUS.ordinal()));
        }

	    return ctx.getText();
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

    public List<Instruction> getInstructions() {
        return instructions;
    }
}
