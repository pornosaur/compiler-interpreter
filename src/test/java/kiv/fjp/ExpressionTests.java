package kiv.fjp;
import java.io.IOException;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ExpressionTests extends CompilerTest{
	private static final String compFolder = "compilerTests/numExp/";
	@Test
	public void testExp() throws IOException {
		assertEquals(SAME_FILES,testFiles(compFolder+"plus_multi.c", compFolder+"exp_plus_multi"));
	}
	
	@Test(expected = ParseCancellationException.class)
	public void negativeTest(){
		Main.compile(compFolder+"negative01.c", compFolder+"negative01_output");
	}
}
