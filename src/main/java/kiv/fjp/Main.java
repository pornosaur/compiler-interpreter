package kiv.fjp;

import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import kiv.fjp.antlr_gen.GrammarBaseVisitor;
import kiv.fjp.antlr_gen.GrammarLexer;
import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.visitors.ProgramVisitor;



/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
    	String path = "test.c";
    	try {
			GrammarLexer grammarLexer = new GrammarLexer(CharStreams.fromFileName(path));
			CommonTokenStream commonTokenStream = new CommonTokenStream(grammarLexer);
			GrammarParser grammarParser = new GrammarParser(commonTokenStream);
			GrammarParser.ProgramContext programContext = grammarParser.program();
			
			ProgramVisitor programVisitor = new ProgramVisitor();
		    programVisitor.visitProgram(programContext);
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
