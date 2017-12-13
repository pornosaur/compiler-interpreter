package kiv.fjp.antlr_gen.structures;

import java.util.ArrayList;
import java.util.Stack;


public class SymbolTable {

	/**
	 * Stack with list of symbols
	 */
	private Stack<ArrayList<Symbol>> symbolsStack;

	private int lastAdr;
	/**
	 * Constructor for symbol table. Init symbols and backup of symbols.
	 */
	public SymbolTable() {
		this.symbolsStack = new Stack<>();
		symbolsStack.add(new ArrayList<>());
		lastAdr = 0;
	}
	

	public void addSymbolList(int incAdr) {
	    lastAdr = incAdr;
		symbolsStack.push( new ArrayList<>());
	}

    public void addSymbolList() {
        symbolsStack.push( new ArrayList<>());
    }
	
	/**
	 * Set symbols from the top of the stack as actual symbols
	 */
	public void removeSymbolList() {
	    lastAdr -= symbolsStack.peek().size();
		symbolsStack.pop();
	}
	
	/**
	 * Add new symbol to symbol list. If list contain the added symbol return false
	 * otherwise it add symbol to the list and return true
	 * @param symbol added symbol
	 * @return Return true if symbol was added.
	 */
	public boolean addSymbol(Symbol symbol) {
		for (Symbol tmpSymbol : symbolsStack.peek()) {
			if (symbol.getIndentificator().compareTo(tmpSymbol.getIndentificator()) == 0) {
				//TODO throw exception
				return false;
			}
		}

        symbol.setAdr(lastAdr);
		lastAdr++;
        symbolsStack.peek().add(symbol);
        return true;
	}


	/**
	 * Find symbol in list of symbols by identificator. If list doesnt contain the search symbol return null,
	 *  otherwise, it is returned a symbol.
	 * 
	 * @param symbolId Identification of search symbol.
	 * @return search symbol or null if list doesnt contain it.
	 */
	public Symbol findSymbol(String symbolId) {
		for (ArrayList<Symbol> symbols : symbolsStack) {
			for (Symbol symbol : symbols) {
				if (symbol.getIndentificator().compareTo(symbolId) == 0) {
					return symbol;
				}
			}
			
		}
		return null;
	}

	public Symbol findSymbol(String symbolId, Symbol.SymbolType type) {
        for (ArrayList<Symbol> symbols : symbolsStack) {
            for (Symbol symbol : symbols) {
                if (symbol.getIndentificator().compareTo(symbolId) == 0 && symbol.getSymbolType() == type) {
                    return symbol;
                }
            }
        }
        return null;
    }
}
