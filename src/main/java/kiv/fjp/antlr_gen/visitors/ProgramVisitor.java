package kiv.fjp.antlr_gen.visitors;

import java.util.ArrayList;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.DataType;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.antlr_gen.structures.Symbol;
import kiv.fjp.antlr_gen.structures.Symbol.SymbolType;

public class ProgramVisitor extends GrammarVisitor<String> {

    private static final int DEF_SIZE_STACK = 3;        //D+S+RET_ADR+RET_VAL
    private static final int DEF_LEVEL = 0;

    private int param;
    
    public ProgramVisitor() {
		super();
		instructionList = new ArrayList<>();
		symbolTable = new SymbolTable();
	}
    @Override public String visitFunc_def(GrammarParser.Func_defContext ctx)  {
        DataType returnType = new DataType(ctx.return_type().getText());

        int countParam = ctx.param()!= null ? ctx.param().ID().size() : 0;
        isRet = returnType.getType() != DataType.Type.VOID; 
        level = DEF_LEVEL;
        param = countParam;

        Instruction intInstructionFunc = new Instruction(IntType.INT, 0, 3);
        instructionList.add(intInstructionFunc);

        Symbol sFunc = new Symbol(ctx.ID().getText(),ctx.return_type().getText(), 0,
                countParam, SymbolType.FUNCTION);
        symbolTable.addSymbol(sFunc);
        sFunc.setAdr(instructionList.size());

        symbolTable.addSymbolList(DEF_SIZE_STACK);
        if (countParam != 0) {
            visitParam(ctx.param());
        }

        visitBlock(ctx.block());

        if (returnType.getType() != DataType.Type.VOID) {
           /* if (! isReturn) {
                throw new ParseCancellationException("ParseError - `return` is expected at the end of the function.");
            }*/

            instructionList.add(new Instruction(IntType.STO, 0, -countParam-1)); //store ret. value at adr = 3;
        }

       /* if (returnType.getType() == DataType.Type.VOID && isReturn) {
            throw new ParseCancellationException("ParseError - function is void type.");
        }*/

        instructionList.add(new Instruction(IntType.RET, 0, 0));

        symbolTable.removeSymbolList();

        return null;
    }

    @Override
    public String visitParam(GrammarParser.ParamContext ctx) {
        for (int i = 0; i < ctx.data_type().size(); i++) {
            symbolTable.addSymbol(new Symbol(ctx.ID(i).getText(), ctx.data_type(i).getText(), level,0, SymbolType.VAR));
            instructionList.add(new Instruction(IntType.LOD, 0, -(i + 1)));
        }

        return null;
    }
    
    @Override public String visitBlock(GrammarParser.BlockContext ctx) {
    	BlockVisitor blockVisitor = new BlockVisitor(level, param);
        return blockVisitor.visitBlock(ctx);
    }
    

    public Symbol getMain() {
        return symbolTable.findSymbol("main", SymbolType.FUNCTION);
    }
}
