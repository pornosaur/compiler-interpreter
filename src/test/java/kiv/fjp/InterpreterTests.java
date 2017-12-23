package kiv.fjp;
import org.junit.Test;

import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import kiv.fjp.interpreter.Interpreter;
import kiv.fjp.interpreter.InterpreterException;
import kiv.fjp.interpreter.InterpreterStep;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
public class InterpreterTests {
	@Test
	public void testInt() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.INT, 0, 4));
		instructions.add(new Instruction(IntType.RET, 0, 4));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 2, 1, 6, new int[]{0 ,0 ,-1 ,0 ,0 ,0 ,0}));
		expSteps.add(new InterpreterStep(instructions.get(2), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
}
