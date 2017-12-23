package kiv.fjp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompilerTest {
	protected static final String SAME_FILES = "Files have same content.";
	protected static final String GEN_FILE = "generate/";
	
	public String testFiles(String testFilePath, String expResFilePath) throws IOException  {
		
		String genFilePath = GEN_FILE+testFilePath;
		File file = new File(genFilePath);

		file.getParentFile().mkdirs();
		Main.compile(testFilePath, genFilePath);
		
		BufferedReader bwExpRes = new BufferedReader(new FileReader(expResFilePath));
        BufferedReader bwGen = new BufferedReader(new FileReader(genFilePath));
         
        String line1 = bwExpRes.readLine();
        String line2 = bwGen.readLine();
         
        boolean areEqual = true;
        int lineNum = 1;
         
        while (line1 != null || line2 != null) {
            if(line1 == null || line2 == null) {
                areEqual = false;
                break;
            }
            if(!line1.equals(line2)) {
            	areEqual = false;
            	break;
            }
            	       
            line1 = bwExpRes.readLine();
            line2 = bwGen.readLine();
             
            lineNum++;
        }
        
        bwExpRes.close();
        bwGen.close();
        
        if(areEqual) {
            return SAME_FILES;
        }
        else
        {
        	return "Files are different. They differ at line "+lineNum;
        }
         
        
	}
}
