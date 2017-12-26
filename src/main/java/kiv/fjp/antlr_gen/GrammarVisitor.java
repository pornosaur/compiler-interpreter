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
	 * Visit a parse tree produced by {@link GrammarParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(GrammarParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(GrammarParser.Array_typeContext ctx);
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
	 * Visit a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GrammarParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_item(GrammarParser.Param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_param(GrammarParser.Array_paramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarID}
	 * labeled alternative in {@link GrammarParser#declar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarID(GrammarParser.DeclarIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarArray}
	 * labeled alternative in {@link GrammarParser#declar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarArray(GrammarParser.DeclarArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarDef}
	 * labeled alternative in {@link GrammarParser#declar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarDef(GrammarParser.DeclarDefContext ctx);
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
	 * Visit a parse tree produced by {@link GrammarParser#array_pos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_pos(GrammarParser.Array_posContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array_asigne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_asigne(GrammarParser.Array_asigneContext ctx);
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
	 * Visit a parse tree produced by {@link GrammarParser#parallel_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_def(GrammarParser.Parallel_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_def(GrammarParser.Array_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiDiv}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiDiv(GrammarParser.MultiDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(GrammarParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numID}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumID(GrammarParser.NumIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numArray}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumArray(GrammarParser.NumArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numBrackets}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumBrackets(GrammarParser.NumBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signed}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned(GrammarParser.SignedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numFunc}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumFunc(GrammarParser.NumFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integers}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegers(GrammarParser.IntegersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(GrammarParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolArray}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArray(GrammarParser.BoolArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(GrammarParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolCompare}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCompare(GrammarParser.BoolCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolBrackets}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolBrackets(GrammarParser.BoolBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExp}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExp(GrammarParser.BoolExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolFunc}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFunc(GrammarParser.BoolFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNumExp}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNumExp(GrammarParser.BoolNumExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNeg}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNeg(GrammarParser.BoolNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolID}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolID(GrammarParser.BoolIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
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
	 * Visit a parse tree produced by {@link GrammarParser#repeat_until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_until(GrammarParser.Repeat_untilContext ctx);
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
	 * Visit a parse tree produced by {@link GrammarParser#s_break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_break(GrammarParser.S_breakContext ctx);
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
}