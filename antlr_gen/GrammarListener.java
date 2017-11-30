// Generated from P:/skola/KIV-FJP\Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link GrammarParser#declar}.
	 * @param ctx the parse tree
	 */
	void enterDeclar(GrammarParser.DeclarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declar}.
	 * @param ctx the parse tree
	 */
	void exitDeclar(GrammarParser.DeclarContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#num_def}.
	 * @param ctx the parse tree
	 */
	void enterNum_def(GrammarParser.Num_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#num_def}.
	 * @param ctx the parse tree
	 */
	void exitNum_def(GrammarParser.Num_defContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(GrammarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(GrammarParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(GrammarParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(GrammarParser.RealContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#bool_def}.
	 * @param ctx the parse tree
	 */
	void enterBool_def(GrammarParser.Bool_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bool_def}.
	 * @param ctx the parse tree
	 */
	void exitBool_def(GrammarParser.Bool_defContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(GrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(GrammarParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cond_head}.
	 * @param ctx the parse tree
	 */
	void enterCond_head(GrammarParser.Cond_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cond_head}.
	 * @param ctx the parse tree
	 */
	void exitCond_head(GrammarParser.Cond_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bin_oper}.
	 * @param ctx the parse tree
	 */
	void enterBin_oper(GrammarParser.Bin_operContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bin_oper}.
	 * @param ctx the parse tree
	 */
	void exitBin_oper(GrammarParser.Bin_operContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comp_oper}.
	 * @param ctx the parse tree
	 */
	void enterComp_oper(GrammarParser.Comp_operContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comp_oper}.
	 * @param ctx the parse tree
	 */
	void exitComp_oper(GrammarParser.Comp_operContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(GrammarParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(GrammarParser.SignContext ctx);
}