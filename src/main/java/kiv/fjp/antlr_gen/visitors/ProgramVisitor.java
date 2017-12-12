package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.antlr_gen.structures.Symbol;

import java.util.ArrayList;
import java.util.List;

public class ProgramVisitor<T> extends GrammarVisitor<T> {


    @Override public T visitProgram(GrammarParser.ProgramContext ctx)  {

        return visitChildren(ctx);
    }
    
    @Override public T visitFunc_def(GrammarParser.Func_defContext ctx)  {
        ctx.return_type();
        ctx.ID();
        ctx.param();
        symbolTable.addSymbol(new Symbol(ctx.ID().getText(),ctx.return_type().getText(), 0,
                4, true, false));
        instructionList.add(new Instruction(IntType.INT, 0, 4));

        symbolTable.addSymbolList();
        visit(ctx.block());
        symbolTable.removeSymbolList();

        instructionList.add(new Instruction(IntType.RET, 0, 0));
        int pos = 0;
        for (Instruction i : instructionList) {
            System.out.println(pos +" " +i.toString());
            pos++;
        }

        return null;
    }

    
    @Override public T visitBlock(GrammarParser.BlockContext ctx) {
    	BlockVisitor blockVisitor = new BlockVisitor();
    	blockVisitor.visitBlock(ctx);
        return visitChildren(ctx);
    }
    

}
