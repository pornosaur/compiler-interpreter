// Generated from P:/skola/KIV-FJP\Grammar.g4 by ANTLR 4.7
package kiv.fjp.antlr_gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(GrammarParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(GrammarParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(GrammarParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(GrammarParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GrammarParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#declar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclar(GrammarParser.DeclarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#const_declar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_declar(GrammarParser.Const_declarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(GrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#value_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_array(GrammarParser.Value_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(GrammarParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#multiple_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_def(GrammarParser.Multiple_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multidiv}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultidiv(GrammarParser.MultidivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusminus}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusminus(GrammarParser.PlusminusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numerics}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerics(GrammarParser.NumericsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signed}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned(GrammarParser.SignedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(GrammarParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_def(GrammarParser.Array_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(GrammarParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(GrammarParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(GrammarParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#str_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_def(GrammarParser.Str_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(GrammarParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bool_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_def(GrammarParser.Bool_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(GrammarParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cond_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_head(GrammarParser.Cond_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bin_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_oper(GrammarParser.Bin_operContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#comp_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_oper(GrammarParser.Comp_operContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(GrammarParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#loop_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_while(GrammarParser.Loop_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(GrammarParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#loop_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_for(GrammarParser.Loop_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#foreach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(GrammarParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_switch(GrammarParser.S_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#call_fnc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_fnc(GrammarParser.Call_fncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(GrammarParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ternar_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernar_oper(GrammarParser.Ternar_operContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#r_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_return(GrammarParser.R_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(GrammarParser.SignContext ctx);
}