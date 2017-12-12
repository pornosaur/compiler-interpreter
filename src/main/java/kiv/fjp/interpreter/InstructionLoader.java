package kiv.fjp.interpreter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import kiv.fjp.antlr_gen.structures.Instruction;

public class InstructionLoader {
	private String path;

	public InstructionLoader (String path){
		this.path = path;
	}
	
	public ArrayList<Instruction> loadInstructions() {
		File file = new File(path);
		ArrayList<Instruction> instructions = new ArrayList<>();
		String[] strInstr = new String[3];
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	strInstr = line.split("\t");
		    	instructions.add(new Instruction(Instruction.IntType.valueOf(strInstr[0]), Integer.valueOf(strInstr[1]), Integer.valueOf(strInstr[2])));
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return instructions;
	}
}
