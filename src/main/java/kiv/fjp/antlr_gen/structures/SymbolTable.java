package kiv.fjp.antlr_gen.structures;

import java.util.ArrayList;
import java.util.Stack;


public class SymbolTable {
	int FIRST_ADR_POS = 3; 
	/**
	 * Stack with list of symbols
	 */
	private Stack<ArrayList<Symbol>> symbolsStack;
	
	/**
	 * Constructor for symbol table. Init symbols and backup of symbols.
	 */
	public SymbolTable() {
		this.symbolsStack = new Stack<>();
	}
	

	public void addSymbolList() {
		symbolsStack.push( new ArrayList<>());
	}
	
	/**
	 * Set symbols from the top of the stack as actual symbols
	 */
	public void removeSymbolList() {
		symbolsStack.pop();
	}
	
	/**
	 * Add new symbol to symbol list. If list contain the added symbol return false
	 *  otherwise it add symbol to the list and return true
	 * @param symbol added symbol
	 * @return Return true if symbol was added.
	 */
	public boolean addSymbol(Symbol symbol) {
		for(Symbol tmpSymbol : symbolsStack.peek()) {
			if(symbol.getIndentificator().compareTo(tmpSymbol.getIndentificator()) == 0) {
				//TODO throw exception
				return false;
			}
		}
		if(findSymbol(symbol.getIndentificator()) == null) {
			symbol.setAdr(symbolsStack.peek().size() + FIRST_ADR_POS);
			symbolsStack.peek().add(symbol);
			return true;
		}
		
		return false;
	}
	/**
	 * Find symbol in list of symbols by identificator. If list doesnt contain the search symbol return null,
	 *  otherwise, it is returned a symbol.
	 * 
	 * @param symbolId Identification of search symbol.
	 * @return search symbol or null if list doesnt contain it.
	 */
	public Symbol findSymbol(String symbolId) {
		for(ArrayList<Symbol> symbols : symbolsStack) {
			for(Symbol symbol : symbols) {
				if(symbol.getIndentificator().compareTo(symbolId) == 0) {
					return symbol;
				}
			}
			
		}
		return null;
	}
}
