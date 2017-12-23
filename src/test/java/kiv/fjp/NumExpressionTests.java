package kiv.fjp;
import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class NumExpressionTests extends CompilerTest{
	private static final String compFolder = "compilerTestFiles/numExp/";
	
	@BeforeClass
    public static void setUp() {
		File file = new File(GEN_FILE + compFolder);
		file.getParentFile().mkdirs();
    }
	
	@Test
	public void testPlusMulti() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"plus_multi.c", compFolder+"exp_plus_multi"));
	}
	
	@Test
	public void testBracket() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"brackets.c", compFolder+"exp_brackets"));
	}
	
	@Test
	public void testUnaryPlus() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"unary_plus.c", compFolder+"exp_unary_plus"));
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative01Test(){
		Main.compile(compFolder+"negative01.c", compFolder+"negative01_output");
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative02Test(){
		Main.compile(compFolder+"negative02.c", compFolder+"negative01_output");
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative03Test(){
		Main.compile(compFolder+"negative03.c", compFolder+"negative01_output");
	}
}
