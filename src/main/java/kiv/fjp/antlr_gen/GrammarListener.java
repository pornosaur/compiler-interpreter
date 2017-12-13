// Generated from P:/skola/KIV-FJP\Grammar.g4 by ANTLR 4.7
package kiv.fjp.antlr_gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(GrammarParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(GrammarParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(GrammarParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(GrammarParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(GrammarParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(GrammarParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(GrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(GrammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(GrammarParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(GrammarParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GrammarParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GrammarParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarID}
	 * labeled alternative in {@link GrammarParser#declar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarID(GrammarParser.DeclarIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarID}
	 * labeled alternative in {@link GrammarParser#declar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarID(GrammarParser.DeclarIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarDef}
	 * labeled alternative in {@link GrammarParser#declar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarDef(GrammarParser.DeclarDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarDef}
	 * labeled alternative in {@link GrammarParser#declar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarDef(GrammarParser.DeclarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#const_declar}.
	 * @param ctx the parse tree
	 */
	void enterConst_declar(GrammarParser.Const_declarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#const_declar}.
	 * @param ctx the parse tree
	 */
	void exitConst_declar(GrammarParser.Const_declarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#value_array}.
	 * @param ctx the parse tree
	 */
	void enterValue_array(GrammarParser.Value_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#value_array}.
	 * @param ctx the parse tree
	 */
	void exitValue_array(GrammarParser.Value_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(GrammarParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(GrammarParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multiple_def}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_def(GrammarParser.Multiple_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multiple_def}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_def(GrammarParser.Multiple_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiDiv}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void enterMultiDiv(GrammarParser.MultiDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiDiv}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void exitMultiDiv(GrammarParser.MultiDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(GrammarParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(GrammarParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numID}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void enterNumID(GrammarParser.NumIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numID}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void exitNumID(GrammarParser.NumIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numBrackets}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void enterNumBrackets(GrammarParser.NumBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numBrackets}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void exitNumBrackets(GrammarParser.NumBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signed}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void enterSigned(GrammarParser.SignedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signed}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void exitSigned(GrammarParser.SignedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void enterReal(GrammarParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void exitReal(GrammarParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integers}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void enterIntegers(GrammarParser.IntegersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integers}
	 * labeled alternative in {@link GrammarParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void exitIntegers(GrammarParser.IntegersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#array_def}.
	 * @param ctx the parse tree
	 */
	void enterArray_def(GrammarParser.Array_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#array_def}.
	 * @param ctx the parse tree
	 */
	void exitArray_def(GrammarParser.Array_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GrammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GrammarParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#str_def}.
	 * @param ctx the parse tree
	 */
	void enterStr_def(GrammarParser.Str_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#str_def}.
	 * @param ctx the parse tree
	 */
	void exitStr_def(GrammarParser.Str_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(GrammarParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(GrammarParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(GrammarParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(GrammarParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolCompare}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolCompare(GrammarParser.BoolCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolCompare}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolCompare(GrammarParser.BoolCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolBrackets}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolBrackets(GrammarParser.BoolBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolBrackets}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolBrackets(GrammarParser.BoolBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExp}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolExp(GrammarParser.BoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExp}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolExp(GrammarParser.BoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNumExp}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolNumExp(GrammarParser.BoolNumExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNumExp}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolNumExp(GrammarParser.BoolNumExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNeg}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolNeg(GrammarParser.BoolNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNeg}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolNeg(GrammarParser.BoolNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolID}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolID(GrammarParser.BoolIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolID}
	 * labeled alternative in {@link GrammarParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolID(GrammarParser.BoolIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(GrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(GrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(GrammarParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(GrammarParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#loop_while}.
	 * @param ctx the parse tree
	 */
	void enterLoop_while(GrammarParser.Loop_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#loop_while}.
	 * @param ctx the parse tree
	 */
	void exitLoop_while(GrammarParser.Loop_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(GrammarParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(GrammarParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#loop_for}.
	 * @param ctx the parse tree
	 */
	void enterLoop_for(GrammarParser.Loop_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#loop_for}.
	 * @param ctx the parse tree
	 */
	void exitLoop_for(GrammarParser.Loop_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(GrammarParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(GrammarParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#s_switch}.
	 * @param ctx the parse tree
	 */
	void enterS_switch(GrammarParser.S_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#s_switch}.
	 * @param ctx the parse tree
	 */
	void exitS_switch(GrammarParser.S_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#call_fnc}.
	 * @param ctx the parse tree
	 */
	void enterCall_fnc(GrammarParser.Call_fncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#call_fnc}.
	 * @param ctx the parse tree
	 */
	void exitCall_fnc(GrammarParser.Call_fncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(GrammarParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(GrammarParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ternar_oper}.
	 * @param ctx the parse tree
	 */
	void enterTernar_oper(GrammarParser.Ternar_operContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ternar_oper}.
	 * @param ctx the parse tree
	 */
	void exitTernar_oper(GrammarParser.Ternar_operContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#r_return}.
	 * @param ctx the parse tree
	 */
	void enterR_return(GrammarParser.R_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#r_return}.
	 * @param ctx the parse tree
	 */
	void exitR_return(GrammarParser.R_returnContext ctx);
}