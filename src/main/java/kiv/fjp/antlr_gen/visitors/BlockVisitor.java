package kiv.fjp.antlr_gen.visitors;

import java.util.ArrayList;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.GrammarParser.StatementContext;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Symbol;
import kiv.fjp.antlr_gen.structures.SymbolTable;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;

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
		visit(ctx.bool_exp());
		visit(ctx.block(0));
		if(ctx.block().size() > 1) {
			visit(ctx.block(1)); //else
		}
        return null; 
    }
	
	@Override public String visitLoop(GrammarParser.LoopContext ctx) {
		
        return visitChildren(ctx);
        
    }
	
	@Override public String visitLoop_while(GrammarParser.Loop_whileContext ctx) {
		//TODO
		visit(ctx.bool_exp());
		visit(ctx.block());
        return visitChildren(ctx);
        
    }
	
	@Override public String visitLoop_for(GrammarParser.Loop_forContext ctx) {
		//TODO
        return visitChildren(ctx);
        
    }
	
	@Override public String visitDeclar(GrammarParser.DeclarContext ctx) {

        return visitChildren(ctx);
        
    }
	
	@Override public String visitDef(GrammarParser.DefContext ctx) {
        //TODO made multiple def in Expresion and call visit children
        String id = ctx.ID().getText(); //TODO find in symbol table

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(level);
        expressionVisitor.visitValue(ctx.value());
        //TODO call also for ternar operator

        instructionList.addAll(expressionVisitor.getInstructions());
        instructionList.add(new Instruction(IntType.STO, level, 3));

        return null;
    }

    @Override public String visitVar_type(GrammarParser.Var_typeContext ctx) {
        return visitChildren(ctx);
    }
	
	
}
