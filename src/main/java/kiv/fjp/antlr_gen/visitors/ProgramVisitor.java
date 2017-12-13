package kiv.fjp.antlr_gen.visitors;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.DataType;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.antlr_gen.structures.Symbol;
import kiv.fjp.antlr_gen.structures.Symbol.SymbolType;
import org.antlr.v4.runtime.misc.ParseCancellationException;


public class ProgramVisitor<T> extends GrammarVisitor<Integer> {

    private static final int DEF_SIZE_STACK = 4;        //D+S+RET_ADR+RET_VAL
    private static final int DEF_LEVEL = 0;
    
    @Override public Integer visitFunc_def(GrammarParser.Func_defContext ctx)  {
        DataType returnType = new DataType(ctx.return_type().getText());
        boolean isReturn = false;
        if (ctx.r_return() != null) {
            isReturn = true;
        }

        int stackSize = DEF_SIZE_STACK;
        level = DEF_LEVEL;

        if (ctx.param() != null) {
            stackSize += ctx.param().ID().size();
        }

        symbolTable.addSymbol(new Symbol(ctx.ID().getText(),ctx.return_type().getText(), 0,
                stackSize, SymbolType.FUNCTION));
        Instruction intInstructionFunc = new Instruction(IntType.INT, 0, 0);
        instructionList.add(intInstructionFunc);


        symbolTable.addSymbolList(DEF_SIZE_STACK);
        if (ctx.param() != null) {
            visit(ctx.param());
        }

        visitBlock(ctx.block());

        intInstructionFunc.setValue(stackSize + symbolTable.getActualSize());

        if (returnType.getType() != DataType.Type.VOID) {
            if (! isReturn) {
                throw new ParseCancellationException("ParseError - `return` is expected at the end of the function.");
            }
            instructionList.add(new Instruction(IntType.STO, 0, 3)); //store ret. value at adr = 3;
            instructionList.add(new Instruction(IntType.INT, 0, -(DEF_SIZE_STACK + 1))); //store return value behind actual base.
            instructionList.add(new Instruction(IntType.LOD, 0, 3));
        }

        if (returnType.getType() == DataType.Type.VOID && isReturn) {
            throw new ParseCancellationException("ParseError - function is void type.");
        }

        instructionList.add(new Instruction(IntType.RET, 0, 0));
        symbolTable.removeSymbolList();

        return null;
    }

    @Override
    public Integer visitParam(GrammarParser.ParamContext ctx) {
        for (int i = 0; i < ctx.var_type().size(); i++) {
            String idType = ctx.var_type(i).getText();
            String id = ctx.ID(i).getText();

            symbolTable.addSymbol(new Symbol(id, idType, level,0, SymbolType.VAR));
        }

        return null;
    }
    
    @Override public Integer visitBlock(GrammarParser.BlockContext ctx) {
    	BlockVisitor blockVisitor = new BlockVisitor(level);
        return blockVisitor.visitBlock(ctx);
    }
    

}
