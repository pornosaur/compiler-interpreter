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
		base = 0;
		stackPointer = 0;
	}
	
	public void runInterpret() {
		while(stackPointer != 0) {
			Instruction instruction = instructions.get(instructionPointer);
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
				if(stackPointer <= STACK_SIZE) {
					//TODO throw exception stack overflow
				}
				
				stack[stackPointer] = instruction.getValue();
				stackPointer++;
				instructionPointer++;
				break;
			case LOD:
				//TODO
				break;
			case STO:
				//TODO
				break;
			case CAL:
				//TODO
				break;
			case INT:
				//TODO
				break;
			case RET:
				//TODO
				break;
			}
		}
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

		default:
			break;
		}
	}
}
