package kiv.fjp.antlr_gen.visitors;

import java.util.ArrayList;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.DataType;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.antlr_gen.structures.Symbol;
import kiv.fjp.antlr_gen.structures.Symbol.SymbolType;
import kiv.fjp.antlr_gen.structures.SymbolTable;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ProgramVisitor extends GrammarVisitor<String> {

    private static final int DEF_SIZE_STACK = 3;        //D+S+RET_ADR+RET_VAL
    private static final int DEF_LEVEL = 0;

    private int param;
    private boolean isReturn = false;
    
    public ProgramVisitor() {
		super();
		instructionList = new ArrayList<>();
		symbolTable = new SymbolTable();
	}

    @Override
    public String visitFunc_def(GrammarParser.Func_defContext ctx)  {
        isReturn = false;
        DataType returnType = new DataType(ctx.return_type().getText());

        int countParam = ctx.param()!= null ? ctx.param().param_item().size() : 0;

        level = DEF_LEVEL;
        param = countParam;

        Instruction intInstructionFunc = new Instruction(IntType.INT, 0, 3);
        instructionList.add(intInstructionFunc);

        Symbol sFunc = new Symbol(ctx.ID().getText(),ctx.return_type().getText(), 0,
                countParam, SymbolType.FUNCTION);
        if (ctx.return_type().array_type() != null) {
            sFunc.setArray(true);
        }
        symbolTable.addSymbol(sFunc);
        sFunc.setAdr(instructionList.size());

        symbolTable.addSymbolList(DEF_SIZE_STACK);
        if (countParam != 0) {
            visitParam(ctx.param());
        }

        visitBlock(ctx.block());

        if (returnType.getType() != DataType.Type.VOID) {
            if (! isReturn) {
                throw new ParseCancellationException("ParseError - you have to put return at the end of this function.");
            }

            instructionList.add(new Instruction(IntType.STO, 0, -countParam-1)); //store ret. value at adr = 3;
        }

        instructionList.add(new Instruction(IntType.RET, 0, 0));

        symbolTable.removeSymbolList();

        return null;
    }

    @Override
    public String visitParam(GrammarParser.ParamContext ctx) {
        for (int i = 0; i < ctx.param_item().size(); i++) {
            Symbol symbol;
            if (ctx.param_item(i).array_param() != null) {
                symbol = new Symbol(ctx.param_item(i).array_param().ID().getText(),
                        ctx.param_item(i).array_param().data_type().getText(),  level,0, SymbolType.VAR);
                symbol.setArray(true);
            } else {
                symbol = new Symbol(ctx.param_item(i).ID().getText(), ctx.param_item(i).data_type().getText(),
                        level,0, SymbolType.VAR);
            }

            symbolTable.addSymbol(symbol);
            instructionList.add(new Instruction(IntType.LOD, 0, -(i + 1)));
        }

        return null;
    }
    
    @Override public String visitBlock(GrammarParser.BlockContext ctx) {
    	BlockVisitor blockVisitor = new BlockVisitor(level, param);
        blockVisitor.visitBlock(ctx);
        isReturn = ctx.r_return()!= null;

        if (ctx.r_return() != null) {
          //  ctx.r_return().
        }

        return null;
    }
    

    public Symbol getMain() {
        return symbolTable.findSymbol("main", SymbolType.FUNCTION);
    }
}
