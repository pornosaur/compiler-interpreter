// Generated from P:/skola/KIV-FJP\Grammar.g4 by ANTLR 4.7
package kiv.fjp.antlr_gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, ID=47, CHARS=48, NUMERIC=49, ALPHABET_NUMERIC=50, ALPHABET=51, 
		SPECIAL_CHARS=52, ESCAPE=53, MULTIDIV=54, WS=55;
	public static final int
		RULE_program = 0, RULE_func_def = 1, RULE_block = 2, RULE_data_type = 3, 
		RULE_array = 4, RULE_var_type = 5, RULE_param = 6, RULE_declar = 7, RULE_const_declar = 8, 
		RULE_value = 9, RULE_value_array = 10, RULE_def = 11, RULE_multiple_def = 12, 
		RULE_num_exp = 13, RULE_array_def = 14, RULE_term = 15, RULE_factor = 16, 
		RULE_num = 17, RULE_real = 18, RULE_integer = 19, RULE_str_def = 20, RULE_str = 21, 
		RULE_bool_def = 22, RULE_bool = 23, RULE_cond = 24, RULE_cond_head = 25, 
		RULE_bin_oper = 26, RULE_comp_oper = 27, RULE_loop = 28, RULE_loop_while = 29, 
		RULE_do_while = 30, RULE_loop_for = 31, RULE_foreach = 32, RULE_s_switch = 33, 
		RULE_call_fnc = 34, RULE_func = 35, RULE_ternar_oper = 36, RULE_r_return = 37, 
		RULE_sign = 38;
	public static final String[] ruleNames = {
		"program", "func_def", "block", "data_type", "array", "var_type", "param", 
		"declar", "const_declar", "value", "value_array", "def", "multiple_def", 
		"num_exp", "array_def", "term", "factor", "num", "real", "integer", "str_def", 
		"str", "bool_def", "bool", "cond", "cond_head", "bin_oper", "comp_oper", 
		"loop", "loop_while", "do_while", "loop_for", "foreach", "s_switch", "call_fnc", 
		"func", "ternar_oper", "r_return", "sign"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'void'", "'('", "')'", "'{'", "'}'", "'string'", "'integer'", "'bool'", 
		"'['", "']'", "','", "';'", "'const'", "'='", "'*'", "'/'", "'+'", "'-'", 
		"'&'", "'|'", "'!'", "'.'", "'true'", "'false'", "'if'", "'else'", "'&&'", 
		"'||'", "'=='", "'>='", "'<='", "'>'", "'<'", "'!='", "'==='", "'while'", 
		"'do'", "'for'", "'foreach'", "':'", "'switch'", "'case'", "'break'", 
		"'default:'", "'?'", "'return'", null, "'_'", null, null, null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "ID", 
		"CHARS", "NUMERIC", "ALPHABET_NUMERIC", "ALPHABET", "SPECIAL_CHARS", "ESCAPE", 
		"MULTIDIV", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Const_declarContext const_declar() {
			return getRuleContext(Const_declarContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			const_declar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				{
				setState(80);
				var_type();
				}
				break;
			case T__0:
				{
				setState(81);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(84);
			match(ID);
			setState(85);
			match(T__1);
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__6:
			case T__7:
				{
				setState(86);
				param();
				}
				break;
			case T__0:
				{
				setState(87);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90);
			match(T__2);
			setState(91);
			match(T__3);
			setState(92);
			block();
			setState(93);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<DeclarContext> declar() {
			return getRuleContexts(DeclarContext.class);
		}
		public DeclarContext declar(int i) {
			return getRuleContext(DeclarContext.class,i);
		}
		public List<Const_declarContext> const_declar() {
			return getRuleContexts(Const_declarContext.class);
		}
		public Const_declarContext const_declar(int i) {
			return getRuleContext(Const_declarContext.class,i);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<S_switchContext> s_switch() {
			return getRuleContexts(S_switchContext.class);
		}
		public S_switchContext s_switch(int i) {
			return getRuleContext(S_switchContext.class,i);
		}
		public List<Call_fncContext> call_fnc() {
			return getRuleContexts(Call_fncContext.class);
		}
		public Call_fncContext call_fnc(int i) {
			return getRuleContext(Call_fncContext.class,i);
		}
		public R_returnContext r_return() {
			return getRuleContext(R_returnContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(95);
						declar();
						}
						break;
					case 2:
						{
						setState(96);
						const_declar();
						}
						break;
					case 3:
						{
						setState(97);
						def();
						}
						break;
					case 4:
						{
						setState(98);
						loop();
						}
						break;
					case 5:
						{
						setState(99);
						cond();
						}
						break;
					case 6:
						{
						setState(100);
						s_switch();
						}
						break;
					case 7:
						{
						setState(101);
						call_fnc();
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(107);
				r_return();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			data_type();
			setState(113);
			match(T__8);
			setState(114);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_type);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				data_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(120);
				var_type();
				setState(121);
				match(ID);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(122);
					match(T__10);
					setState(123);
					var_type();
					setState(124);
					match(ID);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public Multiple_defContext multiple_def() {
			return getRuleContext(Multiple_defContext.class,0);
		}
		public DeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarContext declar() throws RecognitionException {
		DeclarContext _localctx = new DeclarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			var_type();
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(134);
				match(ID);
				}
				break;
			case 2:
				{
				setState(135);
				def();
				}
				break;
			case 3:
				{
				setState(136);
				multiple_def();
				}
				break;
			}
			setState(139);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_declarContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public Multiple_defContext multiple_def() {
			return getRuleContext(Multiple_defContext.class,0);
		}
		public Const_declarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_declar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConst_declar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConst_declar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitConst_declar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declarContext const_declar() throws RecognitionException {
		Const_declarContext _localctx = new Const_declarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_const_declar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__12);
			setState(142);
			var_type();
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(143);
				def();
				}
				break;
			case 2:
				{
				setState(144);
				multiple_def();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public Str_defContext str_def() {
			return getRuleContext(Str_defContext.class,0);
		}
		public Bool_defContext bool_def() {
			return getRuleContext(Bool_defContext.class,0);
		}
		public Array_defContext array_def() {
			return getRuleContext(Array_defContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(147);
				match(ID);
				}
				break;
			case 2:
				{
				setState(148);
				num_exp(0);
				}
				break;
			case 3:
				{
				setState(149);
				str_def();
				}
				break;
			case 4:
				{
				setState(150);
				bool_def();
				}
				break;
			case 5:
				{
				setState(151);
				array_def();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_arrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public Str_defContext str_def() {
			return getRuleContext(Str_defContext.class,0);
		}
		public Bool_defContext bool_def() {
			return getRuleContext(Bool_defContext.class,0);
		}
		public Value_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitValue_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_arrayContext value_array() throws RecognitionException {
		Value_arrayContext _localctx = new Value_arrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(154);
				match(ID);
				}
				break;
			case 2:
				{
				setState(155);
				num_exp(0);
				}
				break;
			case 3:
				{
				setState(156);
				str_def();
				}
				break;
			case 4:
				{
				setState(157);
				bool_def();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Ternar_operContext ternar_oper() {
			return getRuleContext(Ternar_operContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
			setState(161);
			match(T__13);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(162);
				ternar_oper();
				}
				break;
			case 2:
				{
				setState(163);
				value();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiple_defContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Ternar_operContext ternar_oper() {
			return getRuleContext(Ternar_operContext.class,0);
		}
		public Multiple_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultiple_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultiple_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMultiple_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_defContext multiple_def() throws RecognitionException {
		Multiple_defContext _localctx = new Multiple_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiple_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					match(T__13);
					setState(168);
					match(ID);
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(174);
			match(T__13);
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(175);
				value();
				}
				break;
			case 2:
				{
				setState(176);
				ternar_oper();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_expContext extends ParserRuleContext {
		public Num_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_exp; }
	 
		public Num_expContext() { }
		public void copyFrom(Num_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultidivContext extends Num_expContext {
		public Token op;
		public List<Num_expContext> num_exp() {
			return getRuleContexts(Num_expContext.class);
		}
		public Num_expContext num_exp(int i) {
			return getRuleContext(Num_expContext.class,i);
		}
		public MultidivContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultidiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultidiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMultidiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusminusContext extends Num_expContext {
		public Token op;
		public List<Num_expContext> num_exp() {
			return getRuleContexts(Num_expContext.class);
		}
		public Num_expContext num_exp(int i) {
			return getRuleContext(Num_expContext.class,i);
		}
		public PlusminusContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlusminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlusminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPlusminus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericsContext extends Num_expContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NumericsContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumerics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumerics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumerics(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignedContext extends Num_expContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public SignedContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSigned(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSigned(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSigned(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsContext extends Num_expContext {
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public BracketsContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_expContext num_exp() throws RecognitionException {
		return num_exp(0);
	}

	private Num_expContext num_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Num_expContext _localctx = new Num_expContext(_ctx, _parentState);
		Num_expContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_num_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMERIC:
				{
				_localctx = new NumericsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(180);
				num();
				}
				break;
			case T__1:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(T__1);
				setState(182);
				num_exp(0);
				setState(183);
				match(T__2);
				}
				break;
			case T__16:
			case T__17:
				{
				_localctx = new SignedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				sign();
				setState(186);
				num_exp(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultidivContext(new Num_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_exp);
						setState(190);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(191);
						((MultidivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((MultidivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						num_exp(6);
						}
						break;
					case 2:
						{
						_localctx = new PlusminusContext(new Num_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_exp);
						setState(193);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(194);
						((PlusminusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((PlusminusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						num_exp(5);
						}
						break;
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Array_defContext extends ParserRuleContext {
		public List<Value_arrayContext> value_array() {
			return getRuleContexts(Value_arrayContext.class);
		}
		public Value_arrayContext value_array(int i) {
			return getRuleContext(Value_arrayContext.class,i);
		}
		public Array_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArray_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_defContext array_def() throws RecognitionException {
		Array_defContext _localctx = new Array_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__3);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << NUMERIC) | (1L << SPECIAL_CHARS))) != 0)) {
				{
				setState(202);
				value_array();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(203);
					match(T__10);
					setState(204);
					value_array();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(212);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			factor();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19))) != 0)) {
				{
				{
				setState(215);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(216);
				factor();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(222);
					num();
					}
					break;
				case 2:
					{
					setState(223);
					bool();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(226);
					match(T__20);
					}
				}

				setState(229);
				match(T__1);
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(230);
					num_exp(0);
					}
					break;
				case 2:
					{
					setState(231);
					bool();
					}
					break;
				}
				setState(234);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(T__20);
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(237);
					num();
					}
					break;
				case 2:
					{
					setState(238);
					bool();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_num);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				real();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealContext extends ParserRuleContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			integer();
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(249);
				match(T__21);
				setState(250);
				integer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> NUMERIC() { return getTokens(GrammarParser.NUMERIC); }
		public TerminalNode NUMERIC(int i) {
			return getToken(GrammarParser.NUMERIC, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(253);
					match(NUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(256); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Str_defContext extends ParserRuleContext {
		public List<StrContext> str() {
			return getRuleContexts(StrContext.class);
		}
		public StrContext str(int i) {
			return getRuleContext(StrContext.class,i);
		}
		public Str_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStr_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStr_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStr_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_defContext str_def() throws RecognitionException {
		Str_defContext _localctx = new Str_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_str_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			str();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(259);
				match(T__16);
				setState(260);
				str();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrContext extends ParserRuleContext {
		public List<TerminalNode> ESCAPE() { return getTokens(GrammarParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(GrammarParser.ESCAPE, i);
		}
		public List<TerminalNode> SPECIAL_CHARS() { return getTokens(GrammarParser.SPECIAL_CHARS); }
		public TerminalNode SPECIAL_CHARS(int i) {
			return getToken(GrammarParser.SPECIAL_CHARS, i);
		}
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_str);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(SPECIAL_CHARS);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID) | (1L << CHARS) | (1L << NUMERIC) | (1L << ALPHABET_NUMERIC) | (1L << ALPHABET) | (1L << ESCAPE) | (1L << MULTIDIV) | (1L << WS))) != 0)) {
				{
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(267);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==SPECIAL_CHARS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(268);
					match(ESCAPE);
					}
					break;
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(SPECIAL_CHARS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_defContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Bin_operContext> bin_oper() {
			return getRuleContexts(Bin_operContext.class);
		}
		public Bin_operContext bin_oper(int i) {
			return getRuleContext(Bin_operContext.class,i);
		}
		public Bool_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBool_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBool_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBool_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_defContext bool_def() throws RecognitionException {
		Bool_defContext _localctx = new Bool_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bool_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			factor();
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					bin_oper();
					setState(278);
					factor();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public Cond_headContext cond_head() {
			return getRuleContext(Cond_headContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__24);
			setState(288);
			match(T__1);
			setState(289);
			cond_head();
			setState(290);
			match(T__2);
			setState(291);
			match(T__3);
			setState(292);
			block();
			setState(293);
			match(T__4);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(294);
				match(T__25);
				setState(295);
				match(T__3);
				setState(296);
				block();
				setState(297);
				match(T__4);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_headContext extends ParserRuleContext {
		public List<Bool_defContext> bool_def() {
			return getRuleContexts(Bool_defContext.class);
		}
		public Bool_defContext bool_def(int i) {
			return getRuleContext(Bool_defContext.class,i);
		}
		public List<Num_expContext> num_exp() {
			return getRuleContexts(Num_expContext.class);
		}
		public Num_expContext num_exp(int i) {
			return getRuleContext(Num_expContext.class,i);
		}
		public List<Comp_operContext> comp_oper() {
			return getRuleContexts(Comp_operContext.class);
		}
		public Comp_operContext comp_oper(int i) {
			return getRuleContext(Comp_operContext.class,i);
		}
		public List<Bin_operContext> bin_oper() {
			return getRuleContexts(Bin_operContext.class);
		}
		public Bin_operContext bin_oper(int i) {
			return getRuleContext(Bin_operContext.class,i);
		}
		public Cond_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCond_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCond_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCond_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_headContext cond_head() throws RecognitionException {
		Cond_headContext _localctx = new Cond_headContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cond_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				{
				setState(301);
				num_exp(0);
				setState(302);
				comp_oper();
				setState(303);
				num_exp(0);
				}
				}
				break;
			case 2:
				{
				setState(305);
				bool_def();
				}
				break;
			}
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << ID) | (1L << NUMERIC))) != 0)) {
				{
				setState(314);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__26:
				case T__27:
					{
					{
					setState(308);
					bin_oper();
					setState(309);
					num_exp(0);
					setState(310);
					comp_oper();
					setState(311);
					num_exp(0);
					}
					}
					break;
				case T__1:
				case T__20:
				case T__22:
				case T__23:
				case ID:
				case NUMERIC:
					{
					setState(313);
					bool_def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_operContext extends ParserRuleContext {
		public Bin_operContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_oper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBin_oper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBin_oper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBin_oper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_operContext bin_oper() throws RecognitionException {
		Bin_operContext _localctx = new Bin_operContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bin_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_operContext extends ParserRuleContext {
		public Comp_operContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_oper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterComp_oper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitComp_oper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitComp_oper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_operContext comp_oper() throws RecognitionException {
		Comp_operContext _localctx = new Comp_operContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comp_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public Loop_whileContext loop_while() {
			return getRuleContext(Loop_whileContext.class,0);
		}
		public Loop_forContext loop_for() {
			return getRuleContext(Loop_forContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_loop);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				loop_while();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				loop_for();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				do_while();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				foreach();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_whileContext extends ParserRuleContext {
		public Cond_headContext cond_head() {
			return getRuleContext(Cond_headContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Loop_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLoop_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLoop_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLoop_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_whileContext loop_while() throws RecognitionException {
		Loop_whileContext _localctx = new Loop_whileContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loop_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__35);
			setState(330);
			match(T__1);
			setState(331);
			cond_head();
			setState(332);
			match(T__2);
			setState(333);
			match(T__3);
			setState(334);
			block();
			setState(335);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_whileContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Cond_headContext cond_head() {
			return getRuleContext(Cond_headContext.class,0);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__36);
			setState(338);
			match(T__3);
			setState(339);
			block();
			setState(340);
			match(T__4);
			setState(341);
			match(T__35);
			setState(342);
			match(T__1);
			setState(343);
			cond_head();
			setState(344);
			match(T__2);
			setState(345);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_forContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public Cond_headContext cond_head() {
			return getRuleContext(Cond_headContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Loop_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLoop_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLoop_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLoop_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_forContext loop_for() throws RecognitionException {
		Loop_forContext _localctx = new Loop_forContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_loop_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__37);
			setState(348);
			match(T__1);
			setState(349);
			data_type();
			setState(350);
			def();
			setState(351);
			match(T__11);
			setState(352);
			cond_head();
			setState(353);
			match(T__11);
			setState(354);
			def();
			setState(355);
			match(T__2);
			setState(356);
			match(T__3);
			setState(357);
			block();
			setState(358);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__38);
			setState(361);
			match(T__1);
			setState(362);
			var_type();
			setState(363);
			match(ID);
			setState(364);
			match(T__39);
			setState(365);
			match(ID);
			setState(366);
			match(T__2);
			setState(367);
			match(T__3);
			setState(368);
			block();
			setState(369);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_switchContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<Num_expContext> num_exp() {
			return getRuleContexts(Num_expContext.class);
		}
		public Num_expContext num_exp(int i) {
			return getRuleContext(Num_expContext.class,i);
		}
		public List<Str_defContext> str_def() {
			return getRuleContexts(Str_defContext.class);
		}
		public Str_defContext str_def(int i) {
			return getRuleContext(Str_defContext.class,i);
		}
		public S_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS_switch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_switchContext s_switch() throws RecognitionException {
		S_switchContext _localctx = new S_switchContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_s_switch);
		int _la;
		try {
			int _alt;
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(T__40);
				setState(372);
				match(T__1);
				setState(373);
				match(ID);
				setState(374);
				match(T__2);
				setState(375);
				match(T__3);
				setState(391); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(383); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(376);
								match(T__41);
								setState(379);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case T__1:
								case T__16:
								case T__17:
								case ID:
								case NUMERIC:
									{
									setState(377);
									num_exp(0);
									}
									break;
								case SPECIAL_CHARS:
									{
									setState(378);
									str_def();
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(381);
								match(T__39);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(385); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(387);
						block();
						setState(389);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(388);
							match(T__42);
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(393); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__4:
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__43) {
					{
					setState(396); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(395);
							match(T__43);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(398); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(400);
					block();
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__42) {
						{
						setState(401);
						match(T__42);
						}
					}

					}
				}

				setState(406);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_fncContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Call_fncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_fnc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCall_fnc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCall_fnc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCall_fnc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_fncContext call_fnc() throws RecognitionException {
		Call_fncContext _localctx = new Call_fncContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_call_fnc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			func();
			setState(410);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(ID);
			setState(413);
			match(T__1);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << NUMERIC) | (1L << SPECIAL_CHARS))) != 0)) {
				{
				setState(414);
				value();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(415);
					match(T__10);
					setState(416);
					value();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(424);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ternar_operContext extends ParserRuleContext {
		public Cond_headContext cond_head() {
			return getRuleContext(Cond_headContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Ternar_operContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternar_oper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTernar_oper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTernar_oper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTernar_oper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternar_operContext ternar_oper() throws RecognitionException {
		Ternar_operContext _localctx = new Ternar_operContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ternar_oper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			cond_head();
			setState(427);
			match(T__44);
			setState(428);
			value();
			setState(429);
			match(T__39);
			setState(430);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_returnContext extends ParserRuleContext {
		public Ternar_operContext ternar_oper() {
			return getRuleContext(Ternar_operContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public R_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterR_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitR_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitR_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_returnContext r_return() throws RecognitionException {
		R_returnContext _localctx = new R_returnContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_r_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__45);
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(433);
				ternar_oper();
				}
				break;
			case 2:
				{
				setState(434);
				value();
				}
				break;
			case 3:
				{
				setState(435);
				func();
				}
				break;
			}
			setState(438);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return num_exp_sempred((Num_expContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean num_exp_sempred(Num_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u01bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\5\3"+
		"U\n\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\4\5\4o\n\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\5\7y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0081\n\b\f\b\16\b\u0084"+
		"\13\b\5\b\u0086\n\b\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n\u0094\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13\3\f\3\f\3"+
		"\f\3\f\5\f\u00a1\n\f\3\r\3\r\3\r\3\r\5\r\u00a7\n\r\3\16\3\16\3\16\7\16"+
		"\u00ac\n\16\f\16\16\16\u00af\13\16\3\16\3\16\3\16\5\16\u00b4\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bf\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00c7\n\17\f\17\16\17\u00ca\13\17\3\20\3\20\3\20"+
		"\3\20\7\20\u00d0\n\20\f\20\16\20\u00d3\13\20\5\20\u00d5\n\20\3\20\3\20"+
		"\3\21\3\21\3\21\7\21\u00dc\n\21\f\21\16\21\u00df\13\21\3\22\3\22\5\22"+
		"\u00e3\n\22\3\22\5\22\u00e6\n\22\3\22\3\22\3\22\5\22\u00eb\n\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00f2\n\22\5\22\u00f4\n\22\3\23\3\23\3\23\5\23"+
		"\u00f9\n\23\3\24\3\24\3\24\5\24\u00fe\n\24\3\25\6\25\u0101\n\25\r\25\16"+
		"\25\u0102\3\26\3\26\3\26\7\26\u0108\n\26\f\26\16\26\u010b\13\26\3\27\3"+
		"\27\3\27\7\27\u0110\n\27\f\27\16\27\u0113\13\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\7\30\u011b\n\30\f\30\16\30\u011e\13\30\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u012e\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0135\n\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u013d\n\33\f\33\16\33\u0140\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\5\36\u014a\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u017e"+
		"\n#\3#\3#\6#\u0182\n#\r#\16#\u0183\3#\3#\5#\u0188\n#\6#\u018a\n#\r#\16"+
		"#\u018b\3#\6#\u018f\n#\r#\16#\u0190\3#\3#\5#\u0195\n#\5#\u0197\n#\3#\5"+
		"#\u019a\n#\3$\3$\3$\3%\3%\3%\3%\3%\7%\u01a4\n%\f%\16%\u01a7\13%\5%\u01a9"+
		"\n%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u01b7\n\'\3\'\3\'\3(\3"+
		"(\3(\2\3\34)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLN\2\n\3\2\b\n\3\2\21\22\3\2\23\24\4\2\21\22\25\26\3\2\66"+
		"\66\4\2\31\32\61\61\3\2\35\36\3\2\37%\2\u01d7\2P\3\2\2\2\4T\3\2\2\2\6"+
		"j\3\2\2\2\bp\3\2\2\2\nr\3\2\2\2\fx\3\2\2\2\16\u0085\3\2\2\2\20\u0087\3"+
		"\2\2\2\22\u008f\3\2\2\2\24\u009a\3\2\2\2\26\u00a0\3\2\2\2\30\u00a2\3\2"+
		"\2\2\32\u00a8\3\2\2\2\34\u00be\3\2\2\2\36\u00cb\3\2\2\2 \u00d8\3\2\2\2"+
		"\"\u00f3\3\2\2\2$\u00f8\3\2\2\2&\u00fa\3\2\2\2(\u0100\3\2\2\2*\u0104\3"+
		"\2\2\2,\u010c\3\2\2\2.\u0116\3\2\2\2\60\u011f\3\2\2\2\62\u0121\3\2\2\2"+
		"\64\u0134\3\2\2\2\66\u0141\3\2\2\28\u0143\3\2\2\2:\u0149\3\2\2\2<\u014b"+
		"\3\2\2\2>\u0153\3\2\2\2@\u015d\3\2\2\2B\u016a\3\2\2\2D\u0199\3\2\2\2F"+
		"\u019b\3\2\2\2H\u019e\3\2\2\2J\u01ac\3\2\2\2L\u01b2\3\2\2\2N\u01ba\3\2"+
		"\2\2PQ\5\22\n\2Q\3\3\2\2\2RU\5\f\7\2SU\7\3\2\2TR\3\2\2\2TS\3\2\2\2UV\3"+
		"\2\2\2VW\7\61\2\2WZ\7\4\2\2X[\5\16\b\2Y[\7\3\2\2ZX\3\2\2\2ZY\3\2\2\2["+
		"\\\3\2\2\2\\]\7\5\2\2]^\7\6\2\2^_\5\6\4\2_`\7\7\2\2`\5\3\2\2\2ai\5\20"+
		"\t\2bi\5\22\n\2ci\5\30\r\2di\5:\36\2ei\5\62\32\2fi\5D#\2gi\5F$\2ha\3\2"+
		"\2\2hb\3\2\2\2hc\3\2\2\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2il\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2mo\5L\'\2nm\3\2\2\2no\3\2"+
		"\2\2o\7\3\2\2\2pq\t\2\2\2q\t\3\2\2\2rs\5\b\5\2st\7\13\2\2tu\7\f\2\2u\13"+
		"\3\2\2\2vy\5\b\5\2wy\5\n\6\2xv\3\2\2\2xw\3\2\2\2y\r\3\2\2\2z{\5\f\7\2"+
		"{\u0082\7\61\2\2|}\7\r\2\2}~\5\f\7\2~\177\7\61\2\2\177\u0081\3\2\2\2\u0080"+
		"|\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085z\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\17\3\2\2\2\u0087\u008b\5\f\7\2\u0088\u008c\7\61\2\2\u0089"+
		"\u008c\5\30\r\2\u008a\u008c\5\32\16\2\u008b\u0088\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\16\2\2"+
		"\u008e\21\3\2\2\2\u008f\u0090\7\17\2\2\u0090\u0093\5\f\7\2\u0091\u0094"+
		"\5\30\r\2\u0092\u0094\5\32\16\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2"+
		"\2\u0094\23\3\2\2\2\u0095\u009b\7\61\2\2\u0096\u009b\5\34\17\2\u0097\u009b"+
		"\5*\26\2\u0098\u009b\5.\30\2\u0099\u009b\5\36\20\2\u009a\u0095\3\2\2\2"+
		"\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\25\3\2\2\2\u009c\u00a1\7\61\2\2\u009d\u00a1\5\34\17\2\u009e"+
		"\u00a1\5*\26\2\u009f\u00a1\5.\30\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a3"+
		"\7\61\2\2\u00a3\u00a6\7\20\2\2\u00a4\u00a7\5J&\2\u00a5\u00a7\5\24\13\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00ad"+
		"\7\61\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ac\7\61\2\2\u00ab\u00a9\3\2\2"+
		"\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\7\20\2\2\u00b1\u00b4\5\24\13"+
		"\2\u00b2\u00b4\5J&\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\33"+
		"\3\2\2\2\u00b5\u00b6\b\17\1\2\u00b6\u00bf\5$\23\2\u00b7\u00b8\7\4\2\2"+
		"\u00b8\u00b9\5\34\17\2\u00b9\u00ba\7\5\2\2\u00ba\u00bf\3\2\2\2\u00bb\u00bc"+
		"\5N(\2\u00bc\u00bd\5\34\17\3\u00bd\u00bf\3\2\2\2\u00be\u00b5\3\2\2\2\u00be"+
		"\u00b7\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\u00c8\3\2\2\2\u00c0\u00c1\f\7"+
		"\2\2\u00c1\u00c2\t\3\2\2\u00c2\u00c7\5\34\17\b\u00c3\u00c4\f\6\2\2\u00c4"+
		"\u00c5\t\4\2\2\u00c5\u00c7\5\34\17\7\u00c6\u00c0\3\2\2\2\u00c6\u00c3\3"+
		"\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\35\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00d4\7\6\2\2\u00cc\u00d1\5\26\f"+
		"\2\u00cd\u00ce\7\r\2\2\u00ce\u00d0\5\26\f\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\7\7\2\2\u00d7\37\3\2\2\2\u00d8\u00dd\5\"\22"+
		"\2\u00d9\u00da\t\5\2\2\u00da\u00dc\5\"\22\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de!\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e3\5$\23\2\u00e1\u00e3\5\60\31\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00f4\3\2\2\2\u00e4\u00e6\7\27\2\2"+
		"\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea"+
		"\7\4\2\2\u00e8\u00eb\5\34\17\2\u00e9\u00eb\5\60\31\2\u00ea\u00e8\3\2\2"+
		"\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\5\2\2\u00ed\u00f4"+
		"\3\2\2\2\u00ee\u00f1\7\27\2\2\u00ef\u00f2\5$\23\2\u00f0\u00f2\5\60\31"+
		"\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e2"+
		"\3\2\2\2\u00f3\u00e5\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f4#\3\2\2\2\u00f5"+
		"\u00f9\5(\25\2\u00f6\u00f9\5&\24\2\u00f7\u00f9\7\61\2\2\u00f8\u00f5\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9%\3\2\2\2\u00fa\u00fd"+
		"\5(\25\2\u00fb\u00fc\7\30\2\2\u00fc\u00fe\5(\25\2\u00fd\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\'\3\2\2\2\u00ff\u0101\7\63\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		")\3\2\2\2\u0104\u0109\5,\27\2\u0105\u0106\7\23\2\2\u0106\u0108\5,\27\2"+
		"\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a+\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0111\7\66\2\2\u010d"+
		"\u0110\n\6\2\2\u010e\u0110\7\67\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3"+
		"\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\66\2\2\u0115-\3\2\2\2"+
		"\u0116\u011c\5\"\22\2\u0117\u0118\5\66\34\2\u0118\u0119\5\"\22\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0117\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d/\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120"+
		"\t\7\2\2\u0120\61\3\2\2\2\u0121\u0122\7\33\2\2\u0122\u0123\7\4\2\2\u0123"+
		"\u0124\5\64\33\2\u0124\u0125\7\5\2\2\u0125\u0126\7\6\2\2\u0126\u0127\5"+
		"\6\4\2\u0127\u012d\7\7\2\2\u0128\u0129\7\34\2\2\u0129\u012a\7\6\2\2\u012a"+
		"\u012b\5\6\4\2\u012b\u012c\7\7\2\2\u012c\u012e\3\2\2\2\u012d\u0128\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\63\3\2\2\2\u012f\u0130\5\34\17\2\u0130"+
		"\u0131\58\35\2\u0131\u0132\5\34\17\2\u0132\u0135\3\2\2\2\u0133\u0135\5"+
		".\30\2\u0134\u012f\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u013e\3\2\2\2\u0136"+
		"\u0137\5\66\34\2\u0137\u0138\5\34\17\2\u0138\u0139\58\35\2\u0139\u013a"+
		"\5\34\17\2\u013a\u013d\3\2\2\2\u013b\u013d\5.\30\2\u013c\u0136\3\2\2\2"+
		"\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\65\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\t\b\2\2\u0142"+
		"\67\3\2\2\2\u0143\u0144\t\t\2\2\u01449\3\2\2\2\u0145\u014a\5<\37\2\u0146"+
		"\u014a\5@!\2\u0147\u014a\5> \2\u0148\u014a\5B\"\2\u0149\u0145\3\2\2\2"+
		"\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a;\3"+
		"\2\2\2\u014b\u014c\7&\2\2\u014c\u014d\7\4\2\2\u014d\u014e\5\64\33\2\u014e"+
		"\u014f\7\5\2\2\u014f\u0150\7\6\2\2\u0150\u0151\5\6\4\2\u0151\u0152\7\7"+
		"\2\2\u0152=\3\2\2\2\u0153\u0154\7\'\2\2\u0154\u0155\7\6\2\2\u0155\u0156"+
		"\5\6\4\2\u0156\u0157\7\7\2\2\u0157\u0158\7&\2\2\u0158\u0159\7\4\2\2\u0159"+
		"\u015a\5\64\33\2\u015a\u015b\7\5\2\2\u015b\u015c\7\16\2\2\u015c?\3\2\2"+
		"\2\u015d\u015e\7(\2\2\u015e\u015f\7\4\2\2\u015f\u0160\5\b\5\2\u0160\u0161"+
		"\5\30\r\2\u0161\u0162\7\16\2\2\u0162\u0163\5\64\33\2\u0163\u0164\7\16"+
		"\2\2\u0164\u0165\5\30\r\2\u0165\u0166\7\5\2\2\u0166\u0167\7\6\2\2\u0167"+
		"\u0168\5\6\4\2\u0168\u0169\7\7\2\2\u0169A\3\2\2\2\u016a\u016b\7)\2\2\u016b"+
		"\u016c\7\4\2\2\u016c\u016d\5\f\7\2\u016d\u016e\7\61\2\2\u016e\u016f\7"+
		"*\2\2\u016f\u0170\7\61\2\2\u0170\u0171\7\5\2\2\u0171\u0172\7\6\2\2\u0172"+
		"\u0173\5\6\4\2\u0173\u0174\7\7\2\2\u0174C\3\2\2\2\u0175\u0176\7+\2\2\u0176"+
		"\u0177\7\4\2\2\u0177\u0178\7\61\2\2\u0178\u0179\7\5\2\2\u0179\u0189\7"+
		"\6\2\2\u017a\u017d\7,\2\2\u017b\u017e\5\34\17\2\u017c\u017e\5*\26\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7*"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u017a\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\5\6"+
		"\4\2\u0186\u0188\7-\2\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018a\3\2\2\2\u0189\u0181\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u019a\3\2\2\2\u018d\u018f\7.\2\2\u018e"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0194\5\6\4\2\u0193\u0195\7-\2\2\u0194"+
		"\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u018e\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\7\7\2\2\u0199"+
		"\u0175\3\2\2\2\u0199\u0196\3\2\2\2\u019aE\3\2\2\2\u019b\u019c\5H%\2\u019c"+
		"\u019d\7\16\2\2\u019dG\3\2\2\2\u019e\u019f\7\61\2\2\u019f\u01a8\7\4\2"+
		"\2\u01a0\u01a5\5\24\13\2\u01a1\u01a2\7\r\2\2\u01a2\u01a4\5\24\13\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a0\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\7\5\2\2\u01abI\3\2\2\2"+
		"\u01ac\u01ad\5\64\33\2\u01ad\u01ae\7/\2\2\u01ae\u01af\5\24\13\2\u01af"+
		"\u01b0\7*\2\2\u01b0\u01b1\5\24\13\2\u01b1K\3\2\2\2\u01b2\u01b6\7\60\2"+
		"\2\u01b3\u01b7\5J&\2\u01b4\u01b7\5\24\13\2\u01b5\u01b7\5H%\2\u01b6\u01b3"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\7\16\2\2\u01b9M\3\2\2\2\u01ba\u01bb\t\4\2\2\u01bbO\3\2\2\2\63T"+
		"Zhjnx\u0082\u0085\u008b\u0093\u009a\u00a0\u00a6\u00ad\u00b3\u00be\u00c6"+
		"\u00c8\u00d1\u00d4\u00dd\u00e2\u00e5\u00ea\u00f1\u00f3\u00f8\u00fd\u0102"+
		"\u0109\u010f\u0111\u011c\u012d\u0134\u013c\u013e\u0149\u017d\u0183\u0187"+
		"\u018b\u0190\u0194\u0196\u0199\u01a5\u01a8\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}