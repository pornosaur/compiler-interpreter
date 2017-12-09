package kiv.fjp.antlr_gen.structures;

import java.util.ArrayList;
import java.util.Stack;


public class SymbolTable {
	/**
	 * List of symbols
	 */
	private ArrayList<Symbol> symbols;
	/**
	 * List of backup symbols
	 */
	private Stack<ArrayList<Symbol>> backupSymbols;
	
	/**
	 * Constructor for symbol table. Init symbols and backup of symbols.
	 */
	public SymbolTable() {
		this.symbols = new ArrayList<>();
		this.backupSymbols = new Stack<>();
	}
	
	/**
	 * Store actual symbol list to stack.
	 */
	public void backupSymbols() {
		backupSymbols.push( new ArrayList<>(symbols));
	}
	
	/**
	 * Set symbols from the top of the stack as actual symbols
	 */
	public void restoreSymbols() {
		symbols = backupSymbols.pop();
	}
	
	/**
	 * Add new symbol to symbol list. If list contain the added symbol return false
	 *  otherwise it add symbol to the list and return true
	 * @param symbol added symbol
	 * @return Return true if symbol was added.
	 */
	public boolean addSymbol(Symbol symbol) {
		if(findSymbol(symbol.getIndentificator()) != null) {
			symbols.add(symbol);
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Find symbol in list of symbols by identificator. If list doesnt contain the search symbol return null
	 *  otherwise it returns symbol
	 * 
	 * @param symbolId Indeficator of search symbol
	 * @return search symbol or null if list doest contain it.
	 */
	private Symbol findSymbol(String symbolId) {
		for(Symbol symbol : symbols) {
			if(symbol.getIndentificator().equals(symbolId)) {
				return symbol;
			}
		}
		return null;
	}
}
