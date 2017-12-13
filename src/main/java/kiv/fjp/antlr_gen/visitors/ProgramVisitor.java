package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.antlr_gen.structures.Symbol;
import kiv.fjp.antlr_gen.structures.Symbol.SymbolType;

public class ProgramVisitor<T> extends GrammarVisitor<T> {

    private static final int DEF_SIZE_STACK = 4;
    private static final int DEF_LEVEL = 0;

    @Override public T visitProgram(GrammarParser.ProgramContext ctx)  {
        return visitChildren(ctx);
    }
    
    @Override public T visitFunc_def(GrammarParser.Func_defContext ctx)  {
        ctx.return_type();
        ctx.ID();
        ctx.param();

        int stackSize = DEF_SIZE_STACK;
        level = DEF_LEVEL;

        if (ctx.param() != null) {
            stackSize += ctx.param().ID().size();
        }

        symbolTable.addSymbol(new Symbol(ctx.ID().getText(),ctx.return_type().getText(), 0,
                stackSize, SymbolType.FUNCTION));
        instructionList.add(new Instruction(IntType.INT, 0, stackSize));

        symbolTable.addSymbolList();
        if (ctx.param() != null) {
            visit(ctx.param());
        }

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

    @Override
    public T visitParam(GrammarParser.ParamContext ctx) {
        for (int i = 0; i < ctx.var_type().size(); i++) {
            String idType = ctx.var_type(i).getText();
            String id = ctx.ID(i).getText();

            symbolTable.addSymbol(new Symbol(id, idType, level,0, SymbolType.VAR));
        }

        return null;
    }
    
    @Override public T visitBlock(GrammarParser.BlockContext ctx) {
    	BlockVisitor blockVisitor = new BlockVisitor(level);
    	blockVisitor.visitBlock(ctx);
        return null;
    }
    

}
