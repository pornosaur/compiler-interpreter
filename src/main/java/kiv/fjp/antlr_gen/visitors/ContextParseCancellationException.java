package kiv.fjp.antlr_gen.visitors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ContextParseCancellationException extends ParseCancellationException{
	private static final String ERROR_MESS = "Error at line: ";
	
	public ContextParseCancellationException(String message, ParserRuleContext  ctx) {
		super(ERROR_MESS+ctx.getStart().getLine()+"\n "+ message);
	}
}
