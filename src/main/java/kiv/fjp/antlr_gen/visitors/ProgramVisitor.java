package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;

import java.util.ArrayList;
import java.util.List;

public class ProgramVisitor<T> extends GrammarVisitor<T> {


    @Override public T visitProgram(GrammarParser.ProgramContext ctx)  {

        return visitChildren(ctx);
    }
    
    @Override public T visitFunc_def(GrammarParser.Func_defContext ctx)  {
        //TODO add too table
        ctx.return_type();
        ctx.ID();
        ctx.param();
        visit(ctx.block());
        return null;
    }

    
    @Override public T visitBlock(GrammarParser.BlockContext ctx) {
    	BlockVisitor blockVisitor = new BlockVisitor();
    	blockVisitor.visitBlock(ctx);
        return visitChildren(ctx);
    }
    

}
