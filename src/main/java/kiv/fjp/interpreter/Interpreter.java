package kiv.fjp.interpreter;

import java.util.ArrayList;

import kiv.fjp.antlr_gen.structures.Instruction;

public class Interpreter {
	private static final int STACK_SIZE = 32;
	private ArrayList<Instruction> instructions;
	
	private int base;
	private int[] stack;
	private int stackPointer;
	private int instructionPointer;
	
	
	public Interpreter(ArrayList<Instruction> instructions) {
		this.instructions = instructions;
		stack = new int[STACK_SIZE];
		base = 1;
		stackPointer = -1;
	}
	
	public void runInterpret() {
		while(true) {
			
			Instruction instruction = instructions.get(instructionPointer);
			System.out.println(instructionPointer+" "+instruction.toString());
			switch (instruction.getIntstruction()) {
			case JMP:
				instructionPointer = instruction.getValue();
				break;
			case JMC:
				if(stack[stackPointer] == 0) {
					instructionPointer = instruction.getValue();
				}
				stackPointer--;
				break;
			case OPR:
				processOPR(instruction.getValue());
			case LIT:
				stackPointer++;
				stack[stackPointer] = instruction.getValue();
				
				instructionPointer++;
				break;
			case LOD:
				//TODO
				break;
			case STO:
				
				stack[findNewBaseByLevel(instruction.getLevel())+instruction.getValue()-1] = stack[stackPointer];
				stackPointer--;
				instructionPointer++;
				break;
			case CAL:
				
				stack[stackPointer + 1] = findNewBaseByLevel(instruction.getLevel());
				stack[stackPointer + 2] = base;
				stack[stackPointer + 3] = instructionPointer + 1;
				base = stackPointer + 1 + 1; //TODO
				instructionPointer = instruction.getValue();
				
				break;
			case INT:
				
				if(stackPointer == -1) {
					
					stack[stackPointer + 1] = 0;
					stack[stackPointer + 2] = 0;
					stack[stackPointer + 3] = -1;
				}
				stackPointer += instruction.getValue();
				instructionPointer++;
				break;
			case RET:
				instructionPointer = instructions.get(base + 3).getValue();
				stackPointer = base - 1;
				base = stack[base];
				//TODO
				
				return;
				
			}
			System.out.println("Instruction: "+instructionPointer);
			System.out.println("Base: "+ base);
			System.out.println("Stack pointer: " + (stackPointer + 1));
			for(int i = 0; i <= stackPointer; i++) {
				System.out.println(i+1 +" " + stack[i] );
			}
			System.out.println("---------------------------------------------");
		}
	}
	private int findNewBaseByLevel(int level){
		int newBase = base;
		for(int i = 0; i < level; i++) {
			newBase = stack[newBase];
		}
		return newBase;
	}
	private void processOPR(int value) {
		
	
		switch (Instruction.OPRType.values()[value]) {
		case UNARY_MINUS:
			break;
		case PLUS:
			
			break;
		case MINUS:
			break;
		case MULTI:
			break;
		case DIV:
			break;
		case MOD:
			break;
		case ODD:
			break;
		case TEST_EQ:
			break;
		case TEST_NONEQ:
			break;
		case LESS:
			break;
		case GREATER_EQ:
			break;
		case GREATER:
			break;
		case LESS_EQ:			
			break;
		case UNUSED:
			break;

		}
	}

}
