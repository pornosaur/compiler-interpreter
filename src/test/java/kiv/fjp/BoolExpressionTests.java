package kiv.fjp;
import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class BoolExpressionTests extends CompilerTest{
	private static final String compFolder = "compilerTestFiles/boolExp/";
	
	@BeforeClass
    public static void setUp() {
		File file = new File(GEN_FILE + compFolder);
		file.getParentFile().mkdirs();
    }
	
	@Test
	public void testSimpleBracketsBool() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"simple_bracket_bool.c", compFolder+"exp_simple_bracket_bool"));
	}
	
	@Test
	public void testSimpleBracketsNum() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"simple_bracket_num.c", compFolder+"exp_simple_bracket_num"));
	}
	
	@Test
	public void testSimpleBracketsComb() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"simple_bracket_comb.c", compFolder+"exp_simple_bracket_comb"));
	}
	
	@Test
	public void testNegation() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"negation.c", compFolder+"exp_negation"));
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
