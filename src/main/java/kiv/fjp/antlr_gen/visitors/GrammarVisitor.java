package kiv.fjp.antlr_gen.visitors;

import java.util.ArrayList;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.structures.Symbol;

public class GrammarVisitor<T> extends GrammarBaseVisitor<T>{
	ArrayList<Symbol> symbols;
	
	public GrammarVisitor(ArrayList<Symbol> symbols){
		this.symbols = symbols;
	}
	
	public GrammarVisitor(){
		this.symbols = null;
	}
}
