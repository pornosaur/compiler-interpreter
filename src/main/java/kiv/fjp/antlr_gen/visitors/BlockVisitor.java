package kiv.fjp.antlr_gen.visitors;

import java.util.ArrayList;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.GrammarParser.StatementContext;
import kiv.fjp.antlr_gen.structures.Symbol;
import kiv.fjp.antlr_gen.structures.SymbolTable;

public class BlockVisitor extends GrammarVisitor<String>{
	SymbolTable symbolTable;
	
	public BlockVisitor(){
		this.symbolTable = new SymbolTable();
	}
	@Override public String visitBlock(GrammarParser.BlockContext ctx) {
		for(int i = 0; i < ctx.getChildCount();i++) {
			
			if(ctx.getChild(i) instanceof StatementContext) { //TODO for another statements
				symbolTable.backupSymbols();
				visit(ctx.getChild(i));
				symbolTable.restoreSymbols();
			}else { // its declar or define of variables
				visit(ctx.getChild(i));
			}
			
		}
        return null;
    }
	
	@Override public String visitStatement(GrammarParser.StatementContext ctx) {
		//symbols.add(new Symbol("aaa", "aaa", "cccc"));
		
        return visitChildren(ctx);
        
    }
	
	@Override public String visitLoop(GrammarParser.LoopContext ctx) {

        return visitChildren(ctx);
        
    }
	
	@Override public String visitDeclar(GrammarParser.DeclarContext ctx) {

        return visitChildren(ctx);
        
    }
	
	
}
