package kiv.fjp.antlr_gen.structures;

public class Instruction {
	
	public enum IntType{
	    LIT,		//ulož konstantu A do zásobníku
	    OPR, 		//proveď instrukci A
	    LOD,		//ulož hodnotu proměnné z adr. L,A na vrchol zásobníku
	    STO,		//zapiš do proměnné z adr. L,A hodnotu z vrcholu zásobníku
	    CAL,		//volej proceduru A z úrovně L
	    INT,		//zvyš obsah top-registru zásobníku o hodnotu A
	    JMP,		//proveď skok na adresu A
	    JMC,		//proveď skok na adresu A, je-li hodnota na vrcholu zásobníku 0
	    RET,  		//návrat z procedury (return)
		ALC,  		//alokuj místo pro pole/string podle hodnoty na vrcholu zásobníku a prida na nej odkaz do hlady na vytvorene pole
		POS,		//pozice v poli, ze ktere se precte hodnota. Bere posledni dve hodnoty na zasobniku.
					//Prvni urcuje pozici pole v halde a druha udava posun(index). Ulozi na zasobnik hodnotu na daný pozici.
		MOV, 		//Prida na danou pozici v poli hodnotu. Prvni tri hodnoty ze zasobnkiku. Prvni dve stejne jako u pos
					//a treti hodnota bude ta, ktera se prida na dane misto v poli
		LEN; 		//Zjisti velikost pole podle indexu na vrcholu zasobiku a tuto velikost da na zasobnik
	}

	public enum OPRType {
		UNUSED,			//Because to start from 1
		UNARY_MINUS,
		PLUS,
		MINUS,
		MULTI,
		DIV,
		MOD,
		ODD,
		TEST_EQ,
		TEST_NONEQ,
		LESS,
		GREATER_EQ,
		GREATER,
		LESS_EQ

	}

	private IntType intstruction;
	private int level;
	private int value;
	
	public Instruction(IntType instruction, int level, int value) {
		this.intstruction = instruction;
		this.level = level;
		this.value = value;
	}
	
	public IntType getIntstruction() {
		return intstruction;
	}

	public void setIntstruction(IntType intstruction) {
		this.intstruction = intstruction;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		return intstruction.name()+ "\t" + level + "\t" + value;
	}
}
