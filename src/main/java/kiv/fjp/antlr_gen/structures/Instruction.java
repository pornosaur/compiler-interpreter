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
	    RET;  		//návrat z procedury (return)
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
	
	
}
