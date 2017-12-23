package kiv.fjp;
import java.io.IOException;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class IfStatementTests extends CompilerTest{
	private static final String compFolder = "compilerTestFiles/ifStatement/";
	
	@Test
	public void testSimpleIf() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"simple_if.c", compFolder+"exp_simple_if"));
	}
	
	@Test
	public void testSimpleIfElse() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"simple_if_else.c", compFolder+"exp_simple_if_else"));
	}
	
	@Test
	public void testIfElse() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"if_else.c", compFolder+"exp_if_else"));
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative1Test(){
		Main.compile(compFolder+"negative1.c", GEN_FILE + compFolder+"negative1_output");
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative2Test(){
		Main.compile(compFolder+"negative2.c", GEN_FILE + compFolder+"negative2_output");
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative3Test(){
		Main.compile(compFolder+"negative3.c", GEN_FILE + compFolder+"negative3_output");
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative4Test(){
		Main.compile(compFolder+"negative4.c", GEN_FILE + compFolder + "negative4_output");
	}
	
	
}
