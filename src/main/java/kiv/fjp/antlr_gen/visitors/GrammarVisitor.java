package kiv.fjp.antlr_gen.visitors;

import java.util.ArrayList;
import java.util.List;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.SymbolTable;

public class GrammarVisitor<T> extends GrammarBaseVisitor<T>{

    /**
     * List of whole instruction of input source code.
     */
    protected static List<Instruction> instructionList = new ArrayList<>();

    /**
     * Symbol table.
     */
    protected static SymbolTable symbolTable = new SymbolTable();
	
	public GrammarVisitor() {}

    /**
     * Getter for list of instructions.
     *
     * @return List of instructions.
     */
    public List<Instruction> getInstructions(){
    	return instructionList;
    }
}
