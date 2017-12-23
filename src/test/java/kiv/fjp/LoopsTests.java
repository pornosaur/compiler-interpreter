package kiv.fjp;
import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class LoopsTests extends CompilerTest{
	private static final String compFolder = "compilerTestFiles/Loops/";
	
	@BeforeClass
    public static void setUp() {
		File file = new File(GEN_FILE + compFolder);
		file.getParentFile().mkdirs();
    }
	
	@Test
	public void testWhile() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"while.c", compFolder+"exp_while"));
	}
	
	@Test
	public void testDoWhile() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"do_while.c", compFolder+"exp_do_while"));
	}
	
	@Test
	public void testFor() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"for.c", compFolder+"exp_for"));
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative1Test(){
		Main.compile(compFolder+"negative1.c", GEN_FILE + compFolder + "negative1_output");
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative2Test(){
		Main.compile(compFolder+"negative2.c", GEN_FILE + compFolder + "negative2_output");
	}
	@Test(expected = ParseCancellationException.class)
	public void negative3Test(){
		Main.compile(compFolder+"negative3.c", GEN_FILE + compFolder + "negative3_output");
	}
	@Test(expected = ParseCancellationException.class)
	public void negative4Test(){
		Main.compile(compFolder+"negative4.c", GEN_FILE + compFolder + "negative4_output");
	}
	@Test(expected = ParseCancellationException.class)
	public void negative5Test(){
		Main.compile(compFolder+"negative5.c", GEN_FILE + compFolder + "negative5_output");
	}
	@Test(expected = ParseCancellationException.class)
	public void negative6Test(){
		Main.compile(compFolder+"negative6.c", GEN_FILE + compFolder + "negative6_output");
	}
	@Test(expected = ParseCancellationException.class)
	public void negative7Test(){
		Main.compile(compFolder+"negative7.c", GEN_FILE + compFolder + "negative7_output");
	}
	@Test(expected = ParseCancellationException.class)
	public void negative8Test(){
		Main.compile(compFolder+"negative8.c", GEN_FILE + compFolder + "negative8_output");
	}
}
