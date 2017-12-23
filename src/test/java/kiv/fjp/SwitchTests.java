package kiv.fjp;
import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SwitchTests extends CompilerTest{
	private static final String compFolder = "compilerTestFiles/switch/";
	
	@BeforeClass
    public static void setUp() {
		File file = new File(GEN_FILE + compFolder);
		file.getParentFile().mkdirs();
    }
	
	@Test
	public void testSimple() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"simple.c", compFolder+"exp_simple"));
	}
	
	@Test
	public void testCases() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"cases.c", compFolder+"exp_cases"));
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative01Test(){
		Main.compile(compFolder+"negative1.c", compFolder+"negative01_output");
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
