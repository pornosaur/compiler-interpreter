package kiv.fjp;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.BeforeClass;
import org.junit.Test;

import kiv.fjp.interpreter.InstructionLoader;
import kiv.fjp.interpreter.Interpreter;
import kiv.fjp.interpreter.InterpreterException;
import kiv.fjp.interpreter.InterpreterStep;

import static org.junit.Assert.assertEquals;
public class ComplexTests{
	private static final String COMP_FOLDER = "ComplexExamples/";
	private static final String GEN_FOLDER = "generate/ComplexTests/";
	
	@BeforeClass
    public static void setUp() throws IOException {
		Files.createDirectories(Paths.get(GEN_FOLDER));
    }
	
	@Test
	public void testCallingFunctions() throws IOException, InterpreterException {
		assertEquals(29, getValueFirstInitVariable(COMP_FOLDER+"callFnc.c", GEN_FOLDER+"callFnc"));
	}
	
	private int getValueFirstInitVariable(String codePath, String genPath) throws InterpreterException {
		Main.compile(codePath, genPath);
		int prevStepShift = 2;
		int firstInitValuePos = 3; 
		InstructionLoader instLoader = new InstructionLoader(genPath);
		Interpreter interpreter = new Interpreter(instLoader.loadInstructions());
		ArrayList<InterpreterStep> steps = interpreter.runInterpret();
		return steps.get(steps.size() - prevStepShift).getStack()[firstInitValuePos];
	}
	

	
	
}
