package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.GrammarParser;

public class ExpresionVisitor extends GrammarVisitor<String>{
	
	@Override
	public String visitDef(GrammarParser.DefContext ctx) {
		ctx.ID().getText();
		
		return visitChildren(ctx);
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
		String op = ctx.op.getText();
		return null;
	}
	

	
	@Override
	public String visitPlusMinus(GrammarParser.PlusMinusContext ctx){
		visit(ctx.num_exp(0));
		visit(ctx.num_exp(1));
		String op = ctx.op.getText();
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
