package kiv.fjp.antlr_gen.structures;

public class Instruction {
	
	public enum type{
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
	
	String funcName;
	int level;
	int address;
	
	public Instruction(String funcName, int level, int address) {
		this.funcName = funcName;
		this.level = level;
		this.address = address;
	}
	
	
}
