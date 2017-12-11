package kiv.fjp.antlr_gen.visitors;

import java.util.ArrayList;
import java.util.List;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.structures.Instruction;

public class GrammarVisitor<T> extends GrammarBaseVisitor<T>{
	protected final List<Instruction> instructionList = new ArrayList<>();
    protected int level = 0;
    
    public List<Instruction> getInstructions(){
    	return instructionList;
    }
}
