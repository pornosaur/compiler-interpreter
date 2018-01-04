package kiv.fjp.antlr_gen.structures;

import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;


public class SymbolTable {

	/**
	 * Stack with list of symbols
	 */
	private Stack<ArrayList<Symbol>> symbolsStack;

    /**
     * Number of symbols declared before.
     */
	private int incAdr = 0;


	/**
	 * Constructor for symbol table. Init symbols and backup of symbols.
	 */
	public SymbolTable() {
		this.symbolsStack = new Stack<>();
		symbolsStack.add(new ArrayList<>());
	}

    /**
     * Add new symbol table at the top of stack.
     *
     * @param incAdr number of symbols before.
     */
	public void addSymbolList(int incAdr) {
		this.incAdr = incAdr;
		symbolsStack.push( new ArrayList<>());
	}

    /**
     * Add new symbol table at the top of stack.
     */
    public void addSymbolList() {
	    this.incAdr = 0;
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

        symbol.setAdr(symbolsStack.peek().size() + 3 + incAdr);
        symbolsStack.peek().add(symbol);

        return true;
	}

	/**
	 * Find symbol in list of symbols by id. If list doesn't contain the search symbol return null,
	 *  otherwise, it is returned a symbol.
	 * 
	 * @param symbolId Identification of search symbol.
	 * @return search symbol or null if list doesn't contain it.
	 */
	public Symbol findSymbol(String symbolId) {
        for (Symbol symbol : symbolsStack.peek()) {
            if (symbol.getIndentificator().compareTo(symbolId) == 0) {
                return symbol;
            }
        }
	    for(int i = symbolsStack.size() - 1; i > 0; i--){
            for (Symbol symbol : symbolsStack.get(i)) {
                if (symbol.getIndentificator().compareTo(symbolId) == 0) {
                    return symbol;
                }
            }
        }

		return null;
	}

	/**
	 * Find symbol in list of symbols by id. If list doesn't contain the search symbol return null,
	 *  otherwise, it is returned a symbol. According to symbol type.
	 *
	 * @param symbolId Identification of search symbol.
     * @param type symbol type.
	 * @return search symbol or null if list doesn't contain it.
	 */
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

    /**
     * Getter for actual size of symbol table at the top of stack.
     *
     * @return size of actual symbol table.
     */
    public int getActualSize() {
	    return symbolsStack.peek().size();
    }
}
