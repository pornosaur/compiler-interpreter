package kiv.fjp.antlr_gen.structures;

public class Symbol {
	private String indentificator;
	private DataType type;
	private String attribute;
	
	public Symbol(String indentificator, String type, String attribute) {
		this.indentificator = indentificator;
		this.type = new DataType(type);
		this.attribute = attribute;
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
	
	
	
	
	
}
