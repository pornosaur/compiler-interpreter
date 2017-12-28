package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.DataType;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.antlr_gen.structures.Instruction.OPRType;
import kiv.fjp.antlr_gen.structures.Symbol;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ExpressionVisitor extends GrammarVisitor<String>{

	private int level;
	private BlockVisitor block;
	private RuleContext sw;

    public ExpressionVisitor(int level, BlockVisitor block, RuleContext sw) {
        this.level = level;
        this.block = block;
        this.sw = sw;
    }

	public ExpressionVisitor(int level, BlockVisitor block) {
		this(level, block, null);
	}

    @Override
    public String visitIntegers(GrammarParser.IntegersContext ctx) {
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
            throw new ParseCancellationException("ParseError - id " + id + " is not declared before.");
        }

        instructionList.add(new Instruction(IntType.LOD, 0, symbol.getAdr()));
        if(ctx.ID().size() == 2) {
            visitID(ctx.ID(1).getText(), ctx);
        }else {
            visitInteger(ctx.integer());
        }

        instructionList.add(new Instruction(IntType.POS, 0, 0));

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
    public String visitSigned(GrammarParser.SignedContext ctx){
        if (ctx.parent != null) {
            if (ctx.parent instanceof GrammarParser.SignedContext) {
                throw new ParseCancellationException("ParseError - too much operators!");
            }
        }

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
    public String visitNumID(GrammarParser.NumIDContext ctx) {
        if (sw != null && sw instanceof GrammarParser.S_switchContext) {
            throw new ParseCancellationException("ParseError - you could not put id to switch");
        }
        visitID(ctx.getText(), ctx);
        return ctx.getText();
    }

    @Override
    public String visitNumFunc(GrammarParser.NumFuncContext ctx){
        if (sw != null && sw instanceof GrammarParser.S_switchContext) {
            throw new ParseCancellationException("ParseError - you could not put function to switch");
        }

        String s = block.visitFunc(ctx.func());
        if (s.compareTo("integer") != 0) {
            throw new ParseCancellationException("ParseError - you could not call '"+ s +"' function in num expression.");
        }


        return null;
    }

    @Override
    public String visitBoolFunc(GrammarParser.BoolFuncContext ctx){
        if (sw != null && sw instanceof GrammarParser.S_switchContext) {
            throw new ParseCancellationException("ParseError - you could not put function to switch");
        }

        String s = block.visitFunc(ctx.func());
        if (s.compareTo("bool") != 0) {
            throw new ParseCancellationException("ParseError - you could not call '"+ s +"' function in bool expression.");
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

        int elseJmp = instructionList.size() + 1;
        visit(ctx.value(1));

        jmcInt.setValue(elseJmp);
        jmpEndElse.setValue(instructionList.size() + 1);

        return null;
    }

    @Override
    public String visitNumArray(GrammarParser.NumArrayContext ctx) {
        if (sw != null && sw instanceof GrammarParser.S_switchContext) {
            throw new ParseCancellationException("ParseError - you could not put array to switch");
        }
        visitID(ctx.ID().getText(), ctx);
        visit(ctx.num_exp());
        instructionList.add(new Instruction(IntType.POS, 0, 0));
        return null;
    }

    @Override
    public String visitBoolArray(GrammarParser.BoolArrayContext ctx) {
        if (sw != null && sw instanceof GrammarParser.S_switchContext) {
            throw new ParseCancellationException("ParseError - you could not put array to switch");
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

	private String visitID(String id, RuleContext c) {
        Symbol symbol;
        if ((symbol = symbolTable.findSymbol(id)) == null) {
            throw new ParseCancellationException("ParseError - identificator " + id + " is not declared.");
        }
        if (sw != null && sw instanceof GrammarParser.Loop_forContext) {
            if (symbol.getType() != DataType.Type.BOOL && c.parent instanceof GrammarParser.Loop_forContext) {
                throw new ParseCancellationException("ParseError - id in condition must be boolean!");
            }
        }
        if (c instanceof GrammarParser.NumArrayContext) {
            if (! symbol.isArray()) {
                throw new ParseCancellationException("ParseError - id `" + symbol.getIndentificator() + "` is not array.");
            }
        }

        if (sw != null && sw instanceof GrammarParser.R_returnContext) {
            if (symbol.isArray() != block.isReturnArr()) {
                throw new ParseCancellationException("ParseError - bad return type.");
            }
        }

       if (sw != null && sw instanceof GrammarParser.FuncContext) {
            if (c instanceof GrammarParser.ValueContext) {
                GrammarParser.ValueContext gp = (GrammarParser.ValueContext) c;
                int i = ((GrammarParser.FuncContext) sw).value().indexOf(c);
                Symbol func = symbolTable.findSymbol(((GrammarParser.FuncContext) sw).ID().getText(), Symbol.SymbolType.FUNCTION);
                Symbol param = func.getParams().get(i);

                if (param.isArray() != symbol.isArray()) {
                    throw new ParseCancellationException("ParseError - type in params are not compatible.");
                }
                if (param.getType() != symbol.getType()) {
                    System.out.println("Warning - you passed " + symbol.getType().toString() + " into " + param.getType().toString()
                            + " as parameter.");
                }
            }
        }

        if (symbol.getType() == DataType.Type.INTEGER && c instanceof GrammarParser.Bool_expContext) {
            throw new ParseCancellationException("ParseError - integer can not be in bool expression.");
        }
        if (symbol.getType() == DataType.Type.BOOL && c instanceof GrammarParser.Num_expContext) {
            throw new ParseCancellationException("ParseError - bool can not be in number expression. ");
        }

        instructionList.add(new Instruction(IntType.LOD, level, symbol.getAdr()));

        return symbol.getIndentificator().toString();
    }

}
