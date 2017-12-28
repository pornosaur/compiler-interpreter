package kiv.fjp;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class FunctionsTests extends CompilerTest{
	private static final String compFolder = "compilerTestFiles/functions/";
	
	@BeforeClass
    public static void setUp() throws IOException {
		Files.createDirectories(Paths.get(GEN_FILE + compFolder));
    }
	
	@Test
	public void testSimple() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"simple.c", compFolder+"exp_simple"));
	}
	
	@Test
	public void testSimpleReturn() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"simple_return.c", compFolder+"exp_simple_return"));
	}
	
	@Test
	public void testParam() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"params.c", compFolder+"exp_params"));
	}
	
	@Test
	public void testParamRet() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"params_ret.c", compFolder+"exp_params_ret"));
	}
	
	@Test
	public void testNumBool() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"num_bool.c", compFolder+"exp_num_bool"));
	}
	
	@Test
	public void testBoolNum() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"bool_num.c", compFolder+"exp_bool_num"));
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
	
	@Test(expected = ParseCancellationException.class)
	public void negative5Test(){
		Main.compile(compFolder+"negative5.c", GEN_FILE + compFolder + "negative5_output");
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negative6Test(){
		Main.compile(compFolder+"negative6.c", GEN_FILE + compFolder + "negative6_output");
	}
	
	
}
