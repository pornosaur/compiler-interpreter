package kiv.fjp;
import org.antlr.v4.runtime.misc.ParseCancellationException;
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
	public void testRET() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.RET, 0, 0));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
	
	@Test
	public void testINT() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.INT, 0, 4));
		instructions.add(new Instruction(IntType.RET, 0, 0));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 2, 1, 6, new int[]{0 ,0 ,-1 ,0 ,0 ,0 ,0}));
		expSteps.add(new InterpreterStep(instructions.get(2), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
	
	@Test
	public void testLIT() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 2));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.RET, 0, 0));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 2, 1, 3, new int[]{0 ,0 ,-1 ,2}));
		expSteps.add(new InterpreterStep(instructions.get(2), 3, 1, 4, new int[]{0 ,0 ,-1 ,2 ,3}));
		expSteps.add(new InterpreterStep(instructions.get(3), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
	
	@Test
	public void testJumpJMC() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 0));
		instructions.add(new Instruction(IntType.JMC, 0, 4));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 4));
		instructions.add(new Instruction(IntType.RET, 0, 0));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 2, 1, 3, new int[]{0 ,0 ,-1 ,0}));
		expSteps.add(new InterpreterStep(instructions.get(2), 4, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(4), 5, 1, 3, new int[]{0 ,0 ,-1 ,4}));
		expSteps.add(new InterpreterStep(instructions.get(5), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
	
	@Test
	public void testNotJumpJMC() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 1));
		instructions.add(new Instruction(IntType.JMC, 0, 4));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 4));
		instructions.add(new Instruction(IntType.RET, 0, 4));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 2, 1, 3, new int[]{0 ,0 ,-1 ,1}));
		expSteps.add(new InterpreterStep(instructions.get(2), 3, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(3), 4, 1, 3, new int[]{0 ,0 ,-1 ,3}));
		expSteps.add(new InterpreterStep(instructions.get(4), 5, 1, 4, new int[]{0 ,0 ,-1 ,3 ,4}));
		expSteps.add(new InterpreterStep(instructions.get(5), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
	
	@Test
	public void testJMP() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.JMP, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 2));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.RET, 0, 4));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 3, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(3), 4, 1, 3, new int[]{0 ,0 ,-1 ,3}));
		expSteps.add(new InterpreterStep(instructions.get(4), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
	
	@Test
	public void testLOD() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 2));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.LOD, 0, 3));
		instructions.add(new Instruction(IntType.RET, 0, 4));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 2, 1, 3, new int[]{0 ,0 ,-1 ,2}));
		expSteps.add(new InterpreterStep(instructions.get(2), 3, 1, 4, new int[]{0 ,0 ,-1 ,2 ,3}));
		expSteps.add(new InterpreterStep(instructions.get(3), 4, 1, 5, new int[]{0 ,0 ,-1 ,2 ,3 ,2}));
		expSteps.add(new InterpreterStep(instructions.get(4), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
	
	@Test
	public void testSTO() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 4));
		instructions.add(new Instruction(IntType.STO, 0, 3));
		instructions.add(new Instruction(IntType.RET, 0, 4));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 2, 1, 3, new int[]{0 ,0 ,-1 ,3}));
		expSteps.add(new InterpreterStep(instructions.get(2), 3, 1, 4, new int[]{0 ,0 ,-1 ,3 ,4}));
		expSteps.add(new InterpreterStep(instructions.get(3), 4, 1, 3, new int[]{0 ,0 ,-1 ,4}));
		expSteps.add(new InterpreterStep(instructions.get(4), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
	
	@Test
	public void testCAL() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.JMP, 0, 4));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.CAL, 0, 3));
		instructions.add(new Instruction(IntType.RET, 0, 4));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 2, 1, 3, new int[]{0 ,0 ,-1 ,3}));
		expSteps.add(new InterpreterStep(instructions.get(2), 3, 1, 4, new int[]{0 ,0 ,-1 ,3 ,4}));
		expSteps.add(new InterpreterStep(instructions.get(3), 4, 1, 3, new int[]{0 ,0 ,-1 ,4}));
		expSteps.add(new InterpreterStep(instructions.get(4), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		//TODO
	}
	
	@Test
	public void testALC() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.ALC, 0, 3));
		instructions.add(new Instruction(IntType.RET, 0, 4));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 2, 1, 3, new int[]{0 ,0 ,-1 ,3}));
		expSteps.add(new InterpreterStep(instructions.get(2), 3, 1, 3, new int[]{0 ,0 ,-1 ,0}));
		expSteps.add(new InterpreterStep(instructions.get(3), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
	
	@Test
	public void testPOS() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.ALC, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 2));
		instructions.add(new Instruction(IntType.POS, 0, 0));
		instructions.add(new Instruction(IntType.RET, 0, 0));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 2, 1, 3, new int[]{0 ,0 ,-1 ,3}));
		expSteps.add(new InterpreterStep(instructions.get(2), 3, 1, 3, new int[]{0 ,0 ,-1 ,0}));
		expSteps.add(new InterpreterStep(instructions.get(3), 4, 1, 4, new int[]{0 ,0 ,-1 ,0 ,2}));
		expSteps.add(new InterpreterStep(instructions.get(4), 5, 1, 4, new int[]{0 ,0 ,-1 ,0 ,0}));
		expSteps.add(new InterpreterStep(instructions.get(5), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
	
	@Test(expected = InterpreterException.class)
	public void testNegativePOS() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.ALC, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.POS, 0, 0));
		instructions.add(new Instruction(IntType.RET, 0, 0));
		
		Interpreter interpreter = new Interpreter(instructions);
		interpreter.runInterpret();
	}
	
	@Test
	public void testMOV() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.ALC, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 2));
		instructions.add(new Instruction(IntType.LIT, 0, 12));
		instructions.add(new Instruction(IntType.MOV, 0, 0));
		instructions.add(new Instruction(IntType.RET, 0, 0));
		
		ArrayList<InterpreterStep> expSteps = new ArrayList<>();
		expSteps.add(new InterpreterStep(instructions.get(0), 1, 1, 2, new int[]{0 ,0 ,-1}));
		expSteps.add(new InterpreterStep(instructions.get(1), 2, 1, 3, new int[]{0 ,0 ,-1 ,3}));
		expSteps.add(new InterpreterStep(instructions.get(2), 3, 1, 3, new int[]{0 ,0 ,-1 ,0}));
		expSteps.add(new InterpreterStep(instructions.get(3), 4, 1, 4, new int[]{0 ,0 ,-1 ,0 ,2}));
		expSteps.add(new InterpreterStep(instructions.get(4), 5, 1, 5, new int[]{0 ,0 ,-1 ,0 ,2 ,12}));
		expSteps.add(new InterpreterStep(instructions.get(5), 6, 1, 3, new int[]{0 ,0 ,-1 ,0}));
		expSteps.add(new InterpreterStep(instructions.get(6), -1, 0, -1, new int[]{0}));
		
		Interpreter interpreter = new Interpreter(instructions);
		ArrayList<InterpreterStep> steps =interpreter.runInterpret();
		assertEquals(expSteps, steps);
	}
	
	@Test(expected = InterpreterException.class)
	public void testNegativeMOV() throws InterpreterException {
		
		ArrayList<Instruction> instructions = new ArrayList<>();
		instructions.add(new Instruction(IntType.INT, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 3));
		instructions.add(new Instruction(IntType.ALC, 0, 3));
		instructions.add(new Instruction(IntType.LIT, 0, 10));
		instructions.add(new Instruction(IntType.LIT, 0, 12));
		instructions.add(new Instruction(IntType.MOV, 0, 0));
		instructions.add(new Instruction(IntType.RET, 0, 0));
		
		Interpreter interpreter = new Interpreter(instructions);
		interpreter.runInterpret();
	}
}
