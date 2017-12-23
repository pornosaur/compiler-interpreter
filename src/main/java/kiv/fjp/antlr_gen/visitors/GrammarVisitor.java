package kiv.fjp.antlr_gen.visitors;

import java.util.ArrayList;
import java.util.List;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.SymbolTable;

public class GrammarVisitor<T> extends GrammarBaseVisitor<T>{
	protected static List<Instruction> instructionList = new ArrayList<>();
    protected int level = 0;
    
    protected static SymbolTable symbolTable = new SymbolTable();
	
	public GrammarVisitor(){
		
	}
    public List<Instruction> getInstructions(){
    	return instructionList;
    }
}
