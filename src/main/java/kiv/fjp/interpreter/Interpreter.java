package kiv.fjp.interpreter;

import java.util.ArrayList;
import java.util.HashMap;

import kiv.fjp.antlr_gen.structures.Instruction;

public class Interpreter {
	private static final int STACK_SIZE = 32;

	private static final int SECOND_STACK_POS_SHIFT = 1;
	private static final int THIRD_STACK_POS_SHIFT = 2;
	private static final int FOURTH_STACK_POS_SHIFT = 3;
	private static final int INSTR_STACK_MAP_SHIFT = 1;
	private static final int FIRST_ACT_REC = -1;
	private ArrayList<Instruction> instructions;

	private int base;
	private int[] stack;
	private ArrayList<int[]> heap;
	private int stackPointer;
	private int instructionPointer;
	private Instruction instruction;

	public Interpreter(ArrayList<Instruction> instructions) {
		this.instructions = instructions;
		stack = new int[STACK_SIZE];
		heap = new ArrayList<>();
		base = 1;
		stackPointer = FIRST_ACT_REC;
	}

	public ArrayList<InterpreterStep> runInterpret() throws InterpreterException{
		ArrayList<InterpreterStep> steps = new ArrayList<>();
		try {
			while (instructionPointer != FIRST_ACT_REC) {
	
				instruction = instructions.get(instructionPointer);
	
				Instruction actualInstruction = instruction;
	
				switch (instruction.getIntstruction()) {
				case JMP:
					processJMP();
					break;
				case JMC:
					processJMC();
					break;
				case OPR:
					processOPR(instruction.getValue());
					break;
				case LIT:
					processLIT();
					break;
				case LOD:
					processLOD();
					break;
				case STO:
					processSTO();
					break;
				case CAL:
					processCAL();
					break;
				case INT:
					processINT();
					break;
				case RET:
					processRET();
					break;
				case ALC:
					processALC();
					break;
				case POS:
					processPOS();
					break;
				case MOV:
					processMOV();
					break;
				case LEN:
					processLEN();
					break;
				}
				steps.add(new InterpreterStep(actualInstruction, instructionPointer, base, stackPointer, stack.clone()));
				System.out.print(steps.get(steps.size()-1));
			}
		} catch(IndexOutOfBoundsException e){
			throw new InterpreterException("Stack overflow");
		}
		return steps;
	}

	private int findNewBaseByLevel(int level) {
		int newBase = base;
		for (int i = 0; i < level; i++) {
			newBase = stack[newBase];
		}
		return newBase;
	}

	private void processJMP() {
		instructionPointer = instruction.getValue();
	}

	private void processJMC() {
		if (stack[stackPointer] == 0) {
			instructionPointer = instruction.getValue();
		} else {
			instructionPointer++;
		}

		stackPointer--;
	}

	private void processLIT() {
		stackPointer++;
		stack[stackPointer] = instruction.getValue();
		instructionPointer++;
	}

	private void processLOD() {
		stackPointer++;
		stack[stackPointer] = stack[findNewBaseByLevel(instruction.getLevel()) + instruction.getValue() - INSTR_STACK_MAP_SHIFT];
		instructionPointer++;
	}

	private void processSTO() {
		stack[findNewBaseByLevel(instruction.getLevel()) + instruction.getValue() - INSTR_STACK_MAP_SHIFT] = stack[stackPointer];
		stackPointer--;
		instructionPointer++;
	}

	private void processCAL() {
		stack[stackPointer + SECOND_STACK_POS_SHIFT] = findNewBaseByLevel(instruction.getLevel());
		stack[stackPointer + THIRD_STACK_POS_SHIFT] = base;
		stack[stackPointer + FOURTH_STACK_POS_SHIFT] = instructionPointer + 1;
		base = stackPointer + THIRD_STACK_POS_SHIFT;
		instructionPointer = instruction.getValue();
	}

	private void processINT() {
		if (stackPointer == FIRST_ACT_REC) {
			stack[stackPointer + SECOND_STACK_POS_SHIFT] = 0;
			stack[stackPointer + THIRD_STACK_POS_SHIFT] = 0;
			stack[stackPointer + FOURTH_STACK_POS_SHIFT] = FIRST_ACT_REC;
		}
		stackPointer += instruction.getValue();
		instructionPointer++;
	}

	private void processRET() {
		instructionPointer = stack[base + 1];
		stackPointer = base - 2;
		base = stack[base];
	}

	private void processALC() {
		heap.add(new int[stack[stackPointer]]);
		stackPointer--;
		stack[stackPointer] = heap.size() - 1;
		instructionPointer++;
		
	}

	private void processPOS() throws InterpreterException {
		try {
			int tmp1 = heap.get(stack[stackPointer - SECOND_STACK_POS_SHIFT])[stack[stackPointer]];
			stack[stackPointer] = tmp1;
			instructionPointer++;
		}catch (IndexOutOfBoundsException e) { 
			throw new InterpreterException("Index out of bounds. Index: " + stack[stackPointer]+ ", size: " + 
						+heap.get(stack[stackPointer - SECOND_STACK_POS_SHIFT]).length);
		}
		
	}

	private void processMOV() throws InterpreterException {
		try {
			heap.get(stack[stackPointer - THIRD_STACK_POS_SHIFT])[stack[stackPointer - SECOND_STACK_POS_SHIFT]] = stack[stackPointer];
			stackPointer -= THIRD_STACK_POS_SHIFT;
			instructionPointer++;
		}catch (IndexOutOfBoundsException e) { 
			throw new InterpreterException("Index out of bounds. Index: " + stack[stackPointer - SECOND_STACK_POS_SHIFT]+ " size: " + 
						+heap.get(stack[stackPointer - SECOND_STACK_POS_SHIFT]).length);
		}
	}
	
	private void processLEN() throws InterpreterException {
		int length = heap.get(stack[stackPointer]).length;
		stack[stackPointer] = length;
		instructionPointer++;
	}

	private void processOPR(int value) {

		switch (Instruction.OPRType.values()[value]) {
		case UNARY_MINUS:
			stack[stackPointer] = -stack[stackPointer];
			break;
		case PLUS:
			stack[stackPointer - SECOND_STACK_POS_SHIFT] += stack[stackPointer];
			stackPointer--;
			break;
		case MINUS:
			stack[stackPointer - SECOND_STACK_POS_SHIFT] -= stack[stackPointer];
			stackPointer--;
			break;
		case MULTI:
			stack[stackPointer - SECOND_STACK_POS_SHIFT] *= stack[stackPointer];
			stackPointer--;
			break;
		case DIV:
			stack[stackPointer - SECOND_STACK_POS_SHIFT] /= stack[stackPointer];
			stackPointer--;
			break;
		case MOD:
			stack[stackPointer - SECOND_STACK_POS_SHIFT] %= stack[stackPointer];
			stackPointer--;
			break;
		case TEST_EQ:
			stack[stackPointer - SECOND_STACK_POS_SHIFT] =
								(stack[stackPointer - SECOND_STACK_POS_SHIFT] == stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		case TEST_NONEQ:
			stack[stackPointer - SECOND_STACK_POS_SHIFT] =
								(stack[stackPointer - SECOND_STACK_POS_SHIFT] != stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		case LESS:
			stack[stackPointer - SECOND_STACK_POS_SHIFT] = 
								(stack[stackPointer - SECOND_STACK_POS_SHIFT] < stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		case GREATER_EQ:
			stack[stackPointer - SECOND_STACK_POS_SHIFT] = 
								(stack[stackPointer - SECOND_STACK_POS_SHIFT] >= stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		case GREATER:
			stack[stackPointer - SECOND_STACK_POS_SHIFT] = 
								(stack[stackPointer - SECOND_STACK_POS_SHIFT] > stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		case LESS_EQ:
			stack[stackPointer - SECOND_STACK_POS_SHIFT] = 
								(stack[stackPointer - SECOND_STACK_POS_SHIFT] <= stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		default:
			break;

		}
		instructionPointer++;
	}

}
