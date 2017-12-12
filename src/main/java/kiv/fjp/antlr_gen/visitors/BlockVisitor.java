package kiv.fjp.antlr_gen.visitors;

import java.util.ArrayList;
import java.util.List;

import kiv.fjp.antlr_gen.GrammarParser;
import kiv.fjp.antlr_gen.GrammarParser.StatementContext;
import kiv.fjp.antlr_gen.structures.Instruction;
import kiv.fjp.antlr_gen.structures.Symbol;
import kiv.fjp.antlr_gen.structures.SymbolTable;
import kiv.fjp.antlr_gen.structures.Instruction.IntType;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BlockVisitor extends GrammarVisitor<String>{

	public static final int FIRST_ADR_VAR = 3;

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
	
	@Override public String visitDeclarID(GrammarParser.DeclarIDContext ctx) {
        String id = ctx.ID().getText();
        String varType = ctx.var_type().getText();

        //TODO adr according to size of symbol table
        if(! symbolTable.addSymbol(new Symbol(id, varType, "", level, FIRST_ADR_VAR))) {
            throw new ParseCancellationException("ParseError - id " + id + " is already declared.");
        }

        return id;
    }

    @Override public String visitDeclarDef(GrammarParser.DeclarDefContext ctx) {
        String id = ctx.def().ID().getText();
        String varType = ctx.var_type().getText();

        //TODO adr according to size of symbol table
        if(! symbolTable.addSymbol(new Symbol(id, varType, "", level, FIRST_ADR_VAR))) {
            throw new ParseCancellationException("ParseError - id " + id + " is already declared.");
        }

        visitDef(ctx.def());

	    return id;
    }
	
	@Override public String visitDef(GrammarParser.DefContext ctx) {
        //TODO made multiple def in Expresion and call visit children
        String id = ctx.ID().getText();

		Symbol symbol;
		if((symbol = symbolTable.findSymbol(id)) == null) {
			throw new ParseCancellationException("ParseError - identificator " + id + " is not declared.");
		}

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(symbolTable, level);
        expressionVisitor.visitValue(ctx.value());
        //TODO call also for ternary operator - visit children

        instructionList.addAll(expressionVisitor.getInstructions());
        instructionList.add(new Instruction(IntType.STO, level, symbol.getAdr()));

        return id;
    }

    @Override public String visitMultiple_def(GrammarParser.Multiple_defContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(symbolTable, level);
        //TODO call also ternary operator
        expressionVisitor.visitValue(ctx.value());

        for (TerminalNode node : ctx.ID()) {
            String id = node.getText();
            Symbol symbol;
            if((symbol = symbolTable.findSymbol(id)) == null) {
                throw new ParseCancellationException("ParseError - identificator " + id + " is not declared.");
            }

            instructionList.addAll(expressionVisitor.getInstructions());
            instructionList.add(new Instruction(IntType.STO, level, symbol.getAdr()));
        }

	    return null;
    }

    @Override public String visitVar_type(GrammarParser.Var_typeContext ctx) {
        return visitChildren(ctx);
    }
	
	
}
