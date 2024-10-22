package kiv.fjp;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DefDeclarTests extends CompilerTest{
	private static final String compFolder = "compilerTestFiles/defDec/";
	
	@BeforeClass
    public static void setUp() throws IOException {
		Files.createDirectories(Paths.get(GEN_FILE + compFolder));
    }
	
	@Test
	public void testSimpleDeclar() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"simple_declar.c", compFolder+"exp_simple_declar"));
	}
	
	@Test
	public void testSimpleDef() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"simple_def.c", compFolder+"exp_simple_def"));
	}
	
	@Test
	public void testParDef() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"par_def.c", compFolder+"exp_par_def"));
	}
	
	@Test
	public void testArrayDef() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"array_def.c", compFolder+"exp_array_def"));
	}
	
	@Test
	public void testMultiDef() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"multi_def.c", compFolder+"exp_multi_def"));
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
	@Test(expected = ParseCancellationException.class)
	public void negative9Test(){
		Main.compile(compFolder+"negative9.c", GEN_FILE + compFolder + "negative9_output");
	}
	@Test(expected = ParseCancellationException.class)
	public void negative10Test(){
		Main.compile(compFolder+"negative10.c", GEN_FILE + compFolder + "negative10_output");
	}
	@Test(expected = ParseCancellationException.class)
	public void negative11Test(){
		Main.compile(compFolder+"negative11.c", GEN_FILE + compFolder + "negative11_output");
	}
	@Test(expected = ParseCancellationException.class)
	public void negative12Test(){
		Main.compile(compFolder+"negative12.c", GEN_FILE + compFolder + "negative12_output");
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative13Test(){
		Main.compile(compFolder+"negative13.c", GEN_FILE + compFolder + "negative13_output");
	}
}
