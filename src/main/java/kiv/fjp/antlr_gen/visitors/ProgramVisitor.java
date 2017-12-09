package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.GrammarParser;

public class ProgramVisitor<T> extends GrammarBaseVisitor<T> {

    @Override public T visitProgram(GrammarParser.ProgramContext ctx)  {

        return visitChildren(ctx);
    }

    @Override public T visitConst_declar(GrammarParser.Const_declarContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitDef(GrammarParser.DefContext ctx) {
        //TODO made multiple def in Expresion and call visit children
        String identifier = ctx.ID().getText();
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(0);
        expressionVisitor.visitValue(ctx.value());
        return null;
    }

    @Override public T visitVar_type(GrammarParser.Var_typeContext ctx) {
        return visitChildren(ctx);
    }

}
