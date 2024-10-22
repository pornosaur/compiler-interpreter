package kiv.fjp.interpreter;

import java.util.ArrayList;
import java.util.HashMap;

import kiv.fjp.antlr_gen.structures.Instruction;

public class Interpreter {
	/**
	 * Maximal size of stack
	 */
	private static final int STACK_SIZE = 200;
	/**
	 * shift to second position(1) relevate to the top of stack (first is top)
	 */
	private static final int SECOND_STACK_POS_SHIFT = 1;
	/**
	 * shift to third position(2) relevate to the top of stack (first is top)
	 */
	private static final int THIRD_STACK_POS_SHIFT = 2;
	/**
	 * shift to fourth position(3) relevate to the top of stack (first is top)
	 */
	private static final int FOURTH_STACK_POS_SHIFT = 3;
	/**
	 * value for remap number of intruction to position in stack.
	 */
	private static final int INSTR_STACK_MAP_SHIFT = 1;
	/**
	 * flag for first activation record
	 */
	private static final int FIRST_ACT_REC = -1;
	/**
	 * shift to next instruction
	 */
	private static final int NEXT_INST_SHIFT = 1;
	/**
	 * Shift to instruction from base
	 */
	private static final int BASE_SHIFT_TO_INSTR = 1;
	/**
	 * Shift to stackpointer position from base 
	 */
	private static final int BASE_SHIFT_STACK_POS = 2;
	/**
	 * Shift to last item in heap
	 */
	private static final int LAST_ITEM_SHIFT = 1;
	/**
	 * List of instructions
	 */
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
	/**
	 * Method for proccess all instructions in list.
	 * @return
	 * @throws InterpreterException
	 */
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
				//System.out.print(steps.get(steps.size()-1));
			}
		} catch(InterpreterException e){
			throw e;
		}
		catch(IndexOutOfBoundsException e){
			throw new InterpreterException("Stack overflow");
		}
		return steps;
	}
	/**
	 * Find new base according to level
	 * @param level level for new base
	 * @return
	 */
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
		stack[stackPointer + FOURTH_STACK_POS_SHIFT] = instructionPointer + NEXT_INST_SHIFT;
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
		instructionPointer = stack[base + BASE_SHIFT_TO_INSTR];
		stackPointer = base - BASE_SHIFT_STACK_POS;
		base = stack[base];
	}

	private void processALC() {
		heap.add(new int[stack[stackPointer]]);
		stackPointer--;
		stack[stackPointer] = heap.size() - LAST_ITEM_SHIFT;
		instructionPointer++;
		
	}

	private void processPOS() throws InterpreterException {
		int [] arr = heap.get(stack[stackPointer - SECOND_STACK_POS_SHIFT]);
		if(stack[stackPointer] < arr.length) {
			int tmp = arr[stack[stackPointer]];
			stackPointer--;
			stack[stackPointer] = tmp;
			instructionPointer++;
		}else {
			throw new InterpreterException("Index out of bounds. Index: " + stack[stackPointer - SECOND_STACK_POS_SHIFT]+ " size: " + 
					+heap.get(stack[stackPointer - SECOND_STACK_POS_SHIFT]).length);
		}		
	}

	private void processMOV() throws InterpreterException {
		int [] arr = heap.get(stack[stackPointer - THIRD_STACK_POS_SHIFT]);
		if(stack[stackPointer - SECOND_STACK_POS_SHIFT] < arr.length) {
			arr[stack[stackPointer - SECOND_STACK_POS_SHIFT]] = stack[stackPointer];
			stackPointer -= FOURTH_STACK_POS_SHIFT;
			instructionPointer++;
		}else {
			throw new InterpreterException("Index out of bounds. Index: " + stack[stackPointer - SECOND_STACK_POS_SHIFT]+ " size: " + 
					+heap.get(stack[stackPointer - THIRD_STACK_POS_SHIFT]).length);
		}

	}
	
	private void processLEN() {
		int length = heap.get(stack[stackPointer]).length;
		stack[stackPointer] = length;
		instructionPointer++;
	}
	/**
	 * Process instruction for operators. According to input value performs operation
	 * @param value value for operation
	 */
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
