package kiv.fjp.antlr_gen.structures;

public class Symbol {
	private String indentificator;
	private DataType type;
	private int level;
	private int adr;
	private int size;
	private boolean isFunc;
	private boolean isConst;
	private boolean isDefined;
	public Symbol(String indentificator, String type, int level, int size, boolean isFunc, boolean isConst) {
		this.indentificator = indentificator;
		this.type = new DataType(type);
		this.level = level;
		this.size = size;
		this.isFunc = isFunc;
		this.isConst = isConst;
		this.isDefined = false;
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

	
	public boolean isFunc() {
		return isFunc;
	}

	public void setFunc(boolean isFunc) {
		this.isFunc = isFunc;
	}

	public boolean isConst() {
		return isConst;
	}

	public void setConst(boolean isConst) {
		this.isConst = isConst;
	}

	public boolean isDefined() {
		return isDefined;
	}

	public void setDefined(boolean isDefined) {
		this.isDefined = isDefined;
	}

	public int getLevel() { return level; }
	
	public int getAdr() { return adr; }
	
	public int getSize() { return size; }
	
	public void setAdr(int adr) {
		this.adr = adr;
	}
	
	
	
}
