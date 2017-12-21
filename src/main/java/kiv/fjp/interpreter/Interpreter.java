package kiv.fjp.interpreter;

import java.util.ArrayList;
import java.util.HashMap;

import kiv.fjp.antlr_gen.structures.Instruction;

public class Interpreter {
	private static final int STACK_SIZE = 32;
	private ArrayList<Instruction> instructions;

	private int base;
	private int[] stack;
	private ArrayList<int[]> heap;
	private int stackPointer;
	private int instructionPointer;

	public Interpreter(ArrayList<Instruction> instructions) {
		this.instructions = instructions;
		stack = new int[STACK_SIZE];
		heap = new ArrayList<>();
		base = 1;
		stackPointer = -1;
	}

	public ArrayList<String> runInterpret() {
		ArrayList<String> steps = new ArrayList<>();
		while (instructionPointer != -1) {

			Instruction instruction = instructions.get(instructionPointer);
			String step = instructionPointer + " " + instruction.toString() + "\n";
			switch (instruction.getIntstruction()) {
			case JMP:
				instructionPointer = instruction.getValue();
				break;
			case JMC:
				if (stack[stackPointer] == 0) {
					instructionPointer = instruction.getValue();
				}
				stackPointer--;
				instructionPointer++;
				break;
			case OPR:
				processOPR(instruction.getValue());
				break;
			case LIT:
				stackPointer++;
				stack[stackPointer] = instruction.getValue();
				instructionPointer++;
				break;
			case LOD:
				stackPointer++;
				stack[stackPointer] = stack[findNewBaseByLevel(instruction.getLevel()) + instruction.getValue()-1];
				instructionPointer++;
				
				break;
			case STO:
				if(findNewBaseByLevel(instruction.getLevel()) + instruction.getValue() - 1==-1) {
					instructionPointer++;
					continue;
					
				}
				stack[findNewBaseByLevel(instruction.getLevel()) + instruction.getValue() - 1] = stack[stackPointer];
				stackPointer--;
				instructionPointer++;
				break;
			case CAL:
				stack[stackPointer + 1] = findNewBaseByLevel(instruction.getLevel());
				stack[stackPointer + 2] = base;
				stack[stackPointer + 3] = instructionPointer + 1;
				base = stackPointer + 1 + 1; // TODO
				instructionPointer = instruction.getValue();

				break;
			case INT:
				if (stackPointer == -1) {
					stack[stackPointer + 1] = 0;
					stack[stackPointer + 2] = 0;
					stack[stackPointer + 3] = -1;
				}
				stackPointer += instruction.getValue();
				instructionPointer++;
				break;
			case RET:
				instructionPointer = stack[base + 1];
				stackPointer = base - 2;
				base = stack[base];
				break;
			case ALC:
				heap.add(new int[stack[stackPointer]]);
				stackPointer--;
				stack[stackPointer] = heap.size()-1;
				instructionPointer++;
				break;
			case POS:
				int tmp1 = heap.get(stack[stackPointer-1])[stack[stackPointer]];
				stackPointer--;
				stack[stackPointer] = tmp1;
				instructionPointer++;
				break;
			case MOV:
				heap.get(stack[stackPointer - 2])[stack[stackPointer - 1]] = stack[stackPointer];
				stackPointer -=3;
				instructionPointer++;
				break;
			}
			step += "Next instruction: " + instructionPointer + "\n";
			step += "Base: " + base + "\n";
			step += "Stack pointer: " + (stackPointer + 1) + "\n";
			for (int i = 0; i <= stackPointer; i++) {
				step += i + 1 + " " + stack[i] + "\n";
			}
			step += "---------------------------------------------\n";
			steps.add(step);
			//System.out.println(step);
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

	private void processOPR(int value) {

		switch (Instruction.OPRType.values()[value]) {
		case UNARY_MINUS:
			stack[stackPointer] = -stack[stackPointer];
			break;
		case PLUS:
			stack[stackPointer - 1] += stack[stackPointer];
			stackPointer--;
			break;
		case MINUS:
			stack[stackPointer - 1] -= stack[stackPointer];
			stackPointer--;
			break;
		case MULTI:
			stack[stackPointer - 1] *= stack[stackPointer];
			stackPointer--;
			break;
		case DIV:
			stack[stackPointer - 1] /= stack[stackPointer];
			stackPointer--;
			break;
		case MOD:
			stack[stackPointer - 1] %= stack[stackPointer];
			stackPointer--;
			break;
		case TEST_EQ:
			stack[stackPointer - 1] = (stack[stackPointer - 1] == stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		case TEST_NONEQ:
			stack[stackPointer - 1] = (stack[stackPointer - 1] != stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		case LESS:
			stack[stackPointer - 1] = (stack[stackPointer - 1] < stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		case GREATER_EQ:
			stack[stackPointer - 1] = (stack[stackPointer - 1] >= stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		case GREATER:
			stack[stackPointer - 1] = (stack[stackPointer - 1] > stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		case LESS_EQ:
			stack[stackPointer - 1] = (stack[stackPointer - 1] <= stack[stackPointer]) ? 1 : 0;
			stackPointer--;
			break;
		default:
			break;

		}
		instructionPointer++;
	}

}
