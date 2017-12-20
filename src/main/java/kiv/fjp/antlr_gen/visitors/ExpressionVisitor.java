package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.antlr_gen.structures.Instruction.OPRType;
import kiv.fjp.antlr_gen.structures.Symbol;

import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ExpressionVisitor extends GrammarVisitor<String>{

	private int level;
	private BlockVisitor block;

	public ExpressionVisitor(int level, BlockVisitor block) {
		this.level = level;
		this.block = block;
	}


    @Override
    public String visitIntegers(GrammarParser.IntegersContext ctx) {
        instructionList.add(new Instruction(IntType.LIT, 0, Integer.valueOf(ctx.getText())));

        return ctx.getText();
    }


	@Override
	public String visitValue(GrammarParser.ValueContext ctx) {
        if(ctx.bool_exp() != null) {
            visitChildren(ctx);
        }else if(ctx.ID() != null) {
            String id = ctx.ID().getText();
            visitID(id);
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
        instructionList.add(new Instruction(IntType.OPR, 0, oprType.ordinal()));

		return null;
	}
	
	@Override
	public String visitPlusMinus(GrammarParser.PlusMinusContext ctx){
		visit(ctx.num_exp(0));
		visit(ctx.num_exp(1));

		OPRType oprType = (ctx.op.getText().compareTo("+") == 0) ? OPRType.PLUS : OPRType.MINUS;
        instructionList.add(new Instruction(IntType.OPR, 0, oprType.ordinal()));

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

        instructionList.add(new Instruction(IntType.OPR, level, oprType.ordinal()));

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
    public String visitNumFunc(GrammarParser.NumFuncContext ctx){

        //BlockVisitor block = new BlockVisitor(level, param);
        block.visitFunc(ctx.func());

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

        int elseJmp = instructionList.size();
        visit(ctx.value(1));

        jmcInt.setValue(elseJmp);
        jmpEndElse.setValue(instructionList.size());

        return null;
    }

    @Override
    public String visitNumID(GrammarParser.NumIDContext ctx) {
        visitID(ctx.getText());
        return ctx.getText();
    }

    @Override
    public String visitBoolID(GrammarParser.BoolIDContext ctx) {
        visitID(ctx.getText());
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

	private void visitID(String id) {
        Symbol symbol;
        if ((symbol = symbolTable.findSymbol(id)) == null) {
            throw new ParseCancellationException("ParseError - identificator " + id + " is not declared.");
        }

        /*
        //TODO make conversion but on different place, not here!
        if (symbol.getType() != dataType) {
            throw new ParseCancellationException("ParseError - bad conversion " + symbol.getType().toString()
                    + " to " + dataType.toString());
        }
        */

        instructionList.add(new Instruction(IntType.LOD, level, symbol.getAdr()));
    }

}
