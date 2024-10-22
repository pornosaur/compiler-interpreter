package kiv.fjp.antlr_gen.visitors;

import java.util.ArrayList;
import java.util.List;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.structures.DataType;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.antlr_gen.structures.Symbol;
import kiv.fjp.antlr_gen.structures.Symbol.SymbolType;
import kiv.fjp.antlr_gen.structures.SymbolTable;

import javax.xml.crypto.Data;

public class ProgramVisitor extends GrammarVisitor<String> {

    /**
     * Constant for name of main function.
     */
    private static final String MAIN_FUNC_NAME = "main";

    /**
     * Constant fo name of void return type.
     */
    private static final String VOID_NAME = "void";

    /**
     * List of parameters for actual function.
     */
    private List<Symbol> params;

    /**
     * Check if non-void function has return at the end.
     */
    private boolean isReturn;

    /**
     * Check if non-void function has return as array type.
     */
    private boolean returnArr;


    private DataType.Type retType;

    /**
     * The first call of parsing, program is entry point.
     */
    public ProgramVisitor() {
		super();
		instructionList = new ArrayList<>();
		symbolTable = new SymbolTable();
	}

    @Override
    public String visitFunc_def(GrammarParser.Func_defContext ctx)  {
        params = new ArrayList<>();
        isReturn = false;
        returnArr = ctx.return_type().array_type() != null;

        String ret = ctx.return_type().array_type() == null ? ctx.return_type().getText() : ctx.return_type().array_type().data_type().getText();
        if (ret.compareTo("integer") == 0) {
            retType = DataType.Type.INTEGER;
        } else if (ret.compareTo("void") == 0) {
            retType = DataType.Type.VOID;
        } else if (ret.compareTo("bool") == 0) {
            retType = DataType.Type.BOOL;
        }

        DataType returnType = new DataType(ctx.return_type().getText());
        int countParam = ctx.param()!= null ? ctx.param().param_item().size() : 0;

        Instruction intInstructionFunc = new Instruction(IntType.INT, 0, 3);
        instructionList.add(intInstructionFunc);

        Symbol sFunc = new Symbol(ctx.ID().getText(), ret, 0,
                countParam, SymbolType.FUNCTION);
        if (ctx.return_type().array_type() != null) {
            sFunc.setArray(true);
        }
        symbolTable.addSymbol(sFunc);
        sFunc.setAdr(instructionList.size());

        symbolTable.addSymbolList();
        if (countParam != 0) {
            visitParam(ctx.param());
            sFunc.setParams(params);
        }

        visitBlock(ctx.block());

        if (returnType.getType() != DataType.Type.VOID) {
            if (! isReturn) {
                throw new ContextParseCancellationException("you have to put return at the end of this function.", ctx);
            }

            instructionList.add(new Instruction(IntType.STO, 0, -countParam - 1)); //store ret. value at adr = 3;
        }

        if(! isReturn) {
            instructionList.add(new Instruction(IntType.RET, 0, 0));
        }

        symbolTable.removeSymbolList();

        return null;
    }

    @Override
    public String visitParam(GrammarParser.ParamContext ctx) {
        for (int i = 0; i < ctx.param_item().size(); i++) {
            Symbol symbol;
            if (ctx.param_item(i).array_param() != null) {
                symbol = new Symbol(ctx.param_item(i).array_param().ID().getText(),
                        ctx.param_item(i).array_param().data_type().getText(), 0,0, SymbolType.VAR);
                symbol.setArray(true);
            } else {
                symbol = new Symbol(ctx.param_item(i).ID().getText(), ctx.param_item(i).data_type().getText(),
                        0,0, SymbolType.VAR);
            }

            symbolTable.addSymbol(symbol);
            instructionList.add(new Instruction(IntType.LOD, 0, -(i + 1)));
            params.add(symbol);
        }

        return null;
    }
    
    @Override public String visitBlock(GrammarParser.BlockContext ctx) {
    	BlockVisitor blockVisitor = new BlockVisitor(params.size(), returnArr, retType);
        blockVisitor.visitBlock(ctx);
        isReturn = ctx.r_return()!= null;

        return null;
    }

    /**
     * The method find main function in table of symbols.
     *
     * @return Symbol with the main function.
     */
    public Symbol getMain() {
        return symbolTable.findSymbol(MAIN_FUNC_NAME, SymbolType.FUNCTION);
    }
}
