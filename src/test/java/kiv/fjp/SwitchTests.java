package kiv.fjp;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SwitchTests extends CompilerTest{
	private static final String compFolder = "compilerTestFiles/switch/";
	
	@BeforeClass
    public static void setUp() throws IOException {
		Files.createDirectories(Paths.get(GEN_FILE + compFolder));
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
		Main.compile(compFolder+"negative1.c", compFolder+"negative1_output");
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative02Test(){
		Main.compile(compFolder+"negative2.c", compFolder+"negative3_output");
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative03Test(){
		Main.compile(compFolder+"negative3.c", compFolder+"negative3_output");
	}
}
