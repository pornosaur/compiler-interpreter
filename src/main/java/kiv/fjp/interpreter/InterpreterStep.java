package kiv.fjp.interpreter;

import java.util.Arrays;

import kiv.fjp.antlr_gen.structures.Instruction;
/**
 * Class representing step of interpreter
 * @author Ludek Kanak
 *
 */
public class InterpreterStep {

	private Instruction instruction;
	private int nextInstruction;
	private int base;
	private int stackPointer;
	private int []stack;
	
	public InterpreterStep(Instruction instruction, int nextInstruction, int base, int stackPointer, int[] stack) {
		this.instruction = instruction;
		this.nextInstruction = nextInstruction;
		this.base = base;
		this.stackPointer = stackPointer;
		this.stack = stack;
	}

	@Override
	public String toString() {
		String step = instruction.toString() + "\n";
		step += "Next instruction: " + nextInstruction + "\n";
		step += "Base: " + base + "\n";
		step += "Stack pointer: " + (stackPointer + 1) + "\n";
		for (int i = 0; i <= stackPointer; i++) {
			step += i + 1 + " " + stack[i] + "\n";
		}
		step += "---------------------------------------------\n";
		/*String step = "expSteps.add(new InterpreterStep(instructions.get(), " + nextInstruction + ", " + base+", " + stackPointer+ ", new int[]{";
		step += stack[0];
		for (int i = 1; i <= stackPointer; i++) {
			step += " ," + stack[i];
		}
		step += "}));\n";*/
		return step;
	}
	
	public Instruction getInstruction() {
		return instruction;
	}

	public void setInstruction(Instruction instruction) {
		this.instruction = instruction;
	}

	public int getNextInstruction() {
		return nextInstruction;
	}

	public void setNextInstruction(int nextInstruction) {
		this.nextInstruction = nextInstruction;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getStackPointer() {
		return stackPointer;
	}

	public void setStackPointer(int stackPointer) {
		this.stackPointer = stackPointer;
	}

	public int[] getStack() {
		return stack;
	}

	public void setStack(int[] stack) {
		this.stack = stack;
	}

	@Override
    public boolean equals(Object obj) {
		if(obj instanceof InterpreterStep) {
			InterpreterStep step = (InterpreterStep)obj;
			if(this.instruction.equals(step.instruction) && this.base == step.base && this.nextInstruction == step.nextInstruction
					 && this.stackPointer == step.stackPointer){
				for(int i= 0; i < ((this.stack.length<step.stack.length) ? this.stack.length : step.stack.length); i++) {
					if(this.stack[i] != step.stack[i]) {
						return false;
					}
				}
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
        
    }
	
	
}
