package kiv.fjp;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class GrammarParserException extends BaseErrorListener {

	   public static final GrammarParserException INSTANCE = new GrammarParserException();

	   @Override
	   public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
	      throws ParseCancellationException {
	         throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
	      }
	}
