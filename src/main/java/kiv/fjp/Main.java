
package kiv.fjp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;

import kiv.fjp.antlr_gen.structures.DataType;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Symbol;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.GrammarLexer;
import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.visitors.ProgramVisitor;
import kiv.fjp.interpreter.InstructionLoader;
import kiv.fjp.interpreter.Interpreter;



/**
 * Hello world!
 *
 */
public class Main
{
    public static void main(String[] args)
    {
    	String codePath = "test.c";
    	String outputCompPath="output_comp";
    	String interOutput = "output_inter";
    	
    	if(compile(codePath, outputCompPath)) {
    		interpret(outputCompPath, interOutput);
    	};
    	
    }
    
    public static boolean compile(String codePath, String outputPath ) {

    	FileWriter fw;
    	BufferedWriter bw = null;
    	
    	try {
    		fw = new FileWriter(outputPath);
			bw = new BufferedWriter(fw);
			GrammarLexer grammarLexer = new GrammarLexer(CharStreams.fromFileName(codePath));
			CommonTokenStream commonTokenStream = new CommonTokenStream(grammarLexer);
			GrammarParser grammarParser = new GrammarParser(commonTokenStream);
			GrammarParser.ProgramContext programContext = grammarParser.program();
			
			ProgramVisitor programVisitor = new ProgramVisitor();
		    programVisitor.visitProgram(programContext);
		    Symbol main = programVisitor.getMain();
		    if (main == null) {
                throw new ParseCancellationException("ParseError - you have to defined `void main() {...}` function!");
            }

            if (main.getType() != DataType.Type.VOID) {
                throw new ParseCancellationException("ParseError - main function must be void type!");
            }

			int pos = 0;
		    programVisitor.getInstructions().add(0, new Instruction(Instruction.IntType.JMP, 0, main.getAdr()));
			for (Object in : programVisitor.getInstructions()) {
				System.out.println(pos +" " +in.toString());
				bw.write(pos +"\t" +in.toString()+"\n");
				pos++;
			}
			
		} catch(ParseCancellationException ex) {
			System.err.println(ex.getMessage());
			return false;
		}catch (NoSuchFileException e) {
			System.err.println("File: " + e.getMessage() + " not found");
			return false;
    	}catch (IOException e) {
    		System.err.println(e.getMessage());
    		return false;
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    	return true;
    }
    
    public static void interpret(String compPath, String outputPath) {
    	FileWriter fw;
    	BufferedWriter bw = null;
    	
    	InstructionLoader instLoader = new InstructionLoader(compPath);
    	Interpreter interpreter = new Interpreter(instLoader.loadInstructions());
    	ArrayList<String> steps = interpreter.runInterpret();
    	
    	try {
			fw = new FileWriter(outputPath);
			bw = new BufferedWriter(fw);
			for(String step : steps) {
				bw.write(step);
	    	}
    	}catch (NoSuchFileException e) {
			System.err.println("File: " + e.getMessage() + " not found");
    	} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    }
}
