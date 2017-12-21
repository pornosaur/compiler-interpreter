package kiv.fjp.antlr_gen.structures;

public class Symbol {

    public enum SymbolType {
        VAR,
        ARRAY,
        CONST_VAR,
        FUNCTION
    }

	private String indentificator;
	private DataType type;
	private int level;
	private int adr;
	private int size;
	private SymbolType symbolType;

	public Symbol(String indentificator, String type, int level, int size, SymbolType symbolType) {
		this.indentificator = indentificator;
		this.type = new DataType(type);
		this.level = level;
		this.size = size;
		this.symbolType = symbolType;
	}

	public String getIndentificator() {
		return indentificator;
	}

	public void setIndentificator(String indentificator) {
		this.indentificator = indentificator;
	}

	public DataType.Type getType() {
		return type.getType();
	}

    public SymbolType getSymbolType() {
        return symbolType;
    }

    public void setSymbolType(SymbolType symbolType) {
        this.symbolType = symbolType;
    }

	public int getLevel() { return level; }
	
	public int getAdr() { return adr; }
	
	public int getSize() { return size; }
	
	public void setAdr(int adr) {
		this.adr = adr;
	}
	
	
	
}
