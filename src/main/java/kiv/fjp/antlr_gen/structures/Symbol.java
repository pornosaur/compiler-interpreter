package kiv.fjp.antlr_gen.structures;

public class Symbol {
	private String indentificator;
	private DataType type;
	private String attribute;
	private int level;
	private int adr;
	
	public Symbol(String indentificator, String type, String attribute, int level, int adr) {
		this.indentificator = indentificator;
		this.type = new DataType(type);
		this.attribute = attribute;
		this.level = level;
		this.adr = adr;
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

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
	public int getLevel() { return adr; }

	public int getAdr() { return level; }
	
	
	
}
