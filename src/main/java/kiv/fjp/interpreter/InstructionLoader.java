package kiv.fjp.interpreter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import kiv.fjp.antlr_gen.structures.Instruction;
/**
 * Class for loading insturtions from file
 * @author Ludek Kanak
 *
 */
public class InstructionLoader {
	/**
	 * Path to file with instructions
	 */
	private String path;

	public InstructionLoader (String path){
		this.path = path;
	}
	
	/**
	 * Load instructions from file to list with instructions
	 * @return List of instructions
	 */
	public ArrayList<Instruction> loadInstructions() {
		File file = new File(path);
		ArrayList<Instruction> instructions = new ArrayList<>();
		String[] strInstr = new String[3];
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	strInstr = line.split("\t");
		    	instructions.add(new Instruction(Instruction.IntType.valueOf(strInstr[1]), Integer.valueOf(strInstr[2]), Integer.valueOf(strInstr[3])));
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return instructions;
	}
}
