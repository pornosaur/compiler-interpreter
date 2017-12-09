package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;

import java.util.ArrayList;
import java.util.List;

public class ProgramVisitor<T> extends GrammarBaseVisitor<T> {

    private List<Instruction> instructionList;
    private int level;

    @Override public T visitProgram(GrammarParser.ProgramContext ctx)  {
        instructionList = new ArrayList<>();
        level = 0;

        return visitChildren(ctx);
    }

    @Override public T visitConst_declar(GrammarParser.Const_declarContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitDef(GrammarParser.DefContext ctx) {
        //TODO made multiple def in Expresion and call visit children
        String id = ctx.ID().getText(); //TODO find in symbol table

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level);
        expressionVisitor.visitValue(ctx.value());
        //TODO call also for ternar operator

        instructionList.addAll(expressionVisitor.getInstructions());
        instructionList.add(new Instruction(IntType.STO, level, 3));

        return null;
    }

    @Override public T visitVar_type(GrammarParser.Var_typeContext ctx) {
        return visitChildren(ctx);
    }

}
