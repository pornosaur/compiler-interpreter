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
		T__38=39, T__39=40, T__40=41, BREAK=42, ID=43, CHARS=44, NUMVAL=45, ALPHABET_NUMERIC=46, 
		ALPHABET=47, MULTIDIV=48, WS=49;
	public static final int
		RULE_program = 0, RULE_func_def = 1, RULE_return_type = 2, RULE_array_type = 3, 
		RULE_block = 4, RULE_data_type = 5, RULE_param = 6, RULE_param_item = 7, 
		RULE_array_param = 8, RULE_declar = 9, RULE_const_declar = 10, RULE_value = 11, 
		RULE_array_pos = 12, RULE_array_asigne = 13, RULE_def = 14, RULE_multiple_def = 15, 
		RULE_parallel_def = 16, RULE_array_def = 17, RULE_num_exp = 18, RULE_integer = 19, 
		RULE_bool_exp = 20, RULE_bool = 21, RULE_statement = 22, RULE_loop = 23, 
		RULE_loop_while = 24, RULE_do_while = 25, RULE_repeat_until = 26, RULE_loop_for = 27, 
		RULE_foreach = 28, RULE_s_switch = 29, RULE_s_break = 30, RULE_func = 31, 
		RULE_ternar_oper = 32, RULE_r_return = 33;
	public static final String[] ruleNames = {
		"program", "func_def", "return_type", "array_type", "block", "data_type", 
		"param", "param_item", "array_param", "declar", "const_declar", "value", 
		"array_pos", "array_asigne", "def", "multiple_def", "parallel_def", "array_def", 
		"num_exp", "integer", "bool_exp", "bool", "statement", "loop", "loop_while", 
		"do_while", "repeat_until", "loop_for", "foreach", "s_switch", "s_break", 
		"func", "ternar_oper", "r_return"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'void'", "'['", "']'", "';'", "'integer'", 
		"'bool'", "','", "'const'", "'='", "'*'", "'/'", "'+'", "'-'", "'<'", 
		"'>'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'!'", "'true'", 
		"'false'", "'if'", "'else'", "'while'", "'do'", "'repeat'", "'until'", 
		"'for'", "'foreach'", "':'", "'switch'", "'case'", "'?'", "'return'", 
		"'break;'", null, "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BREAK", "ID", "CHARS", "NUMVAL", 
		"ALPHABET_NUMERIC", "ALPHABET", "MULTIDIV", "WS"
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
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				{
				setState(68);
				func_def();
				}
				}
				setState(73);
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

	public static class Func_defContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
			setState(74);
			return_type();
			setState(75);
			match(ID);
			setState(76);
			match(T__0);
			setState(77);
			param();
			setState(78);
			match(T__1);
			setState(79);
			match(T__2);
			setState(80);
			block();
			setState(81);
			match(T__3);
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

	public static class Return_typeContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_return_type);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				data_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				array_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(T__4);
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

	public static class Array_typeContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			data_type();
			setState(89);
			match(T__5);
			setState(90);
			match(T__6);
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
		public List<Multiple_defContext> multiple_def() {
			return getRuleContexts(Multiple_defContext.class);
		}
		public Multiple_defContext multiple_def(int i) {
			return getRuleContext(Multiple_defContext.class,i);
		}
		public List<Parallel_defContext> parallel_def() {
			return getRuleContexts(Parallel_defContext.class);
		}
		public Parallel_defContext parallel_def(int i) {
			return getRuleContext(Parallel_defContext.class,i);
		}
		public List<Array_defContext> array_def() {
			return getRuleContexts(Array_defContext.class);
		}
		public Array_defContext array_def(int i) {
			return getRuleContext(Array_defContext.class,i);
		}
		public List<Array_asigneContext> array_asigne() {
			return getRuleContexts(Array_asigneContext.class);
		}
		public Array_asigneContext array_asigne(int i) {
			return getRuleContext(Array_asigneContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<S_switchContext> s_switch() {
			return getRuleContexts(S_switchContext.class);
		}
		public S_switchContext s_switch(int i) {
			return getRuleContext(S_switchContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
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
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << ID))) != 0)) {
				{
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(92);
					declar();
					setState(93);
					match(T__7);
					}
					break;
				case 2:
					{
					setState(95);
					const_declar();
					setState(96);
					match(T__7);
					}
					break;
				case 3:
					{
					setState(98);
					def();
					setState(99);
					match(T__7);
					}
					break;
				case 4:
					{
					setState(101);
					multiple_def();
					setState(102);
					match(T__7);
					}
					break;
				case 5:
					{
					setState(104);
					parallel_def();
					setState(105);
					match(T__7);
					}
					break;
				case 6:
					{
					setState(107);
					array_def();
					setState(108);
					match(T__7);
					}
					break;
				case 7:
					{
					setState(110);
					array_asigne();
					setState(111);
					match(T__7);
					}
					break;
				case 8:
					{
					setState(113);
					loop();
					}
					break;
				case 9:
					{
					setState(114);
					statement();
					}
					break;
				case 10:
					{
					setState(115);
					s_switch();
					}
					break;
				case 11:
					{
					setState(116);
					func();
					setState(117);
					match(T__7);
					}
					break;
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(124);
				r_return();
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
		enterRule(_localctx, 10, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	public static class ParamContext extends ParserRuleContext {
		public List<Param_itemContext> param_item() {
			return getRuleContexts(Param_itemContext.class);
		}
		public Param_itemContext param_item(int i) {
			return getRuleContext(Param_itemContext.class,i);
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
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(129);
				param_item();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(130);
					match(T__10);
					setState(131);
					param_item();
					}
					}
					setState(136);
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

	public static class Param_itemContext extends ParserRuleContext {
		public Array_paramContext array_param() {
			return getRuleContext(Array_paramContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParam_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParam_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParam_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_itemContext param_item() throws RecognitionException {
		Param_itemContext _localctx = new Param_itemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				{
				setState(139);
				data_type();
				setState(140);
				match(ID);
				}
				}
				break;
			case 2:
				{
				setState(142);
				array_param();
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

	public static class Array_paramContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Array_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArray_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_paramContext array_param() throws RecognitionException {
		Array_paramContext _localctx = new Array_paramContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			data_type();
			setState(146);
			match(ID);
			setState(147);
			match(T__5);
			setState(148);
			match(T__6);
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
		public DeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar; }
	 
		public DeclarContext() { }
		public void copyFrom(DeclarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarDefContext extends DeclarContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public DeclarDefContext(DeclarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclarDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarIDContext extends DeclarContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public DeclarIDContext(DeclarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclarID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclarID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclarID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarArrayContext extends DeclarContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public DeclarArrayContext(DeclarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclarArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclarArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclarArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarContext declar() throws RecognitionException {
		DeclarContext _localctx = new DeclarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declar);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new DeclarIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				data_type();
				setState(151);
				match(ID);
				}
				break;
			case 2:
				_localctx = new DeclarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				data_type();
				setState(154);
				match(ID);
				setState(155);
				match(T__5);
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMVAL:
					{
					setState(156);
					integer();
					}
					break;
				case ID:
					{
					setState(157);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160);
				match(T__6);
				}
				break;
			case 3:
				_localctx = new DeclarDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				data_type();
				setState(163);
				def();
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

	public static class Const_declarContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
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
		enterRule(_localctx, 20, RULE_const_declar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__11);
			setState(168);
			data_type();
			setState(169);
			def();
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
		public Array_posContext array_pos() {
			return getRuleContext(Array_posContext.class,0);
		}
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
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
		enterRule(_localctx, 22, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(171);
				match(ID);
				}
				break;
			case 2:
				{
				setState(172);
				array_pos();
				}
				break;
			case 3:
				{
				setState(173);
				num_exp(0);
				}
				break;
			case 4:
				{
				setState(174);
				bool_exp(0);
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

	public static class Array_posContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Array_posContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_pos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray_pos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray_pos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArray_pos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_posContext array_pos() throws RecognitionException {
		Array_posContext _localctx = new Array_posContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			match(T__5);
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
				{
				setState(179);
				integer();
				}
				break;
			case ID:
				{
				setState(180);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(183);
			match(T__6);
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

	public static class Array_asigneContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Array_asigneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_asigne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray_asigne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray_asigne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArray_asigne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_asigneContext array_asigne() throws RecognitionException {
		Array_asigneContext _localctx = new Array_asigneContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array_asigne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			data_type();
			setState(186);
			match(ID);
			setState(187);
			match(T__5);
			setState(188);
			match(T__6);
			setState(189);
			match(T__12);
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(190);
				match(ID);
				}
				break;
			case 2:
				{
				setState(191);
				func();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Ternar_operContext ternar_oper() {
			return getRuleContext(Ternar_operContext.class,0);
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
		enterRule(_localctx, 28, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(195);
			match(T__12);
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(196);
				value();
				}
				break;
			case 2:
				{
				setState(197);
				func();
				}
				break;
			case 3:
				{
				setState(198);
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

	public static class Multiple_defContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
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
		enterRule(_localctx, 30, RULE_multiple_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(204); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(202);
					match(T__12);
					setState(203);
					match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(206); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(208);
			match(T__12);
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(209);
				func();
				}
				break;
			case 2:
				{
				setState(210);
				value();
				}
				break;
			case 3:
				{
				setState(211);
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

	public static class Parallel_defContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Parallel_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParallel_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParallel_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParallel_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parallel_defContext parallel_def() throws RecognitionException {
		Parallel_defContext _localctx = new Parallel_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parallel_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__2);
			setState(215);
			match(ID);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(216);
				match(T__10);
				setState(217);
				match(ID);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(T__3);
			setState(224);
			match(T__12);
			setState(225);
			match(T__2);
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(226);
				func();
				}
				break;
			case 2:
				{
				setState(227);
				value();
				}
				break;
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(230);
				match(T__10);
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(231);
					func();
					}
					break;
				case 2:
					{
					setState(232);
					value();
					}
					break;
				}
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(T__3);
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

	public static class Array_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Ternar_operContext ternar_oper() {
			return getRuleContext(Ternar_operContext.class,0);
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
		enterRule(_localctx, 34, RULE_array_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(ID);
			setState(243);
			match(T__5);
			setState(244);
			value();
			setState(245);
			match(T__6);
			setState(246);
			match(T__12);
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(247);
				func();
				}
				break;
			case 2:
				{
				setState(248);
				ternar_oper();
				}
				break;
			case 3:
				{
				setState(249);
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
	public static class MultiDivContext extends Num_expContext {
		public Token op;
		public List<Num_expContext> num_exp() {
			return getRuleContexts(Num_expContext.class);
		}
		public Num_expContext num_exp(int i) {
			return getRuleContext(Num_expContext.class,i);
		}
		public MultiDivContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultiDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultiDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMultiDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusContext extends Num_expContext {
		public Token op;
		public List<Num_expContext> num_exp() {
			return getRuleContexts(Num_expContext.class);
		}
		public Num_expContext num_exp(int i) {
			return getRuleContext(Num_expContext.class,i);
		}
		public PlusMinusContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumIDContext extends Num_expContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public NumIDContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumArrayContext extends Num_expContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public NumArrayContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumBracketsContext extends Num_expContext {
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public NumBracketsContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignedContext extends Num_expContext {
		public Token sign;
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
	public static class NumFuncContext extends Num_expContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public NumFuncContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegersContext extends Num_expContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public IntegersContext(Num_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntegers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntegers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIntegers(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_num_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new IntegersContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(253);
				integer();
				}
				break;
			case 2:
				{
				_localctx = new NumFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				func();
				}
				break;
			case 3:
				{
				_localctx = new NumArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(ID);
				setState(256);
				match(T__5);
				setState(257);
				num_exp(0);
				setState(258);
				match(T__6);
				}
				break;
			case 4:
				{
				_localctx = new NumIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new NumBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(T__0);
				setState(262);
				num_exp(0);
				setState(263);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new SignedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				((SignedContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
					((SignedContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				num_exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(275);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultiDivContext(new Num_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_exp);
						setState(269);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(270);
						((MultiDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
							((MultiDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(271);
						num_exp(9);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new Num_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_exp);
						setState(272);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(273);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(274);
						num_exp(8);
						}
						break;
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NUMVAL() { return getToken(GrammarParser.NUMVAL, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(NUMVAL);
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

	public static class Bool_expContext extends ParserRuleContext {
		public Bool_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_exp; }
	 
		public Bool_expContext() { }
		public void copyFrom(Bool_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolArrayContext extends Bool_expContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public BoolArrayContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends Bool_expContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BooleanContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolCompareContext extends Bool_expContext {
		public Token op;
		public List<Bool_expContext> bool_exp() {
			return getRuleContexts(Bool_expContext.class);
		}
		public Bool_expContext bool_exp(int i) {
			return getRuleContext(Bool_expContext.class,i);
		}
		public BoolCompareContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolBracketsContext extends Bool_expContext {
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
		}
		public BoolBracketsContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpContext extends Bool_expContext {
		public Token op;
		public List<Bool_expContext> bool_exp() {
			return getRuleContexts(Bool_expContext.class);
		}
		public Bool_expContext bool_exp(int i) {
			return getRuleContext(Bool_expContext.class,i);
		}
		public BoolExpContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolFuncContext extends Bool_expContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public BoolFuncContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNumExpContext extends Bool_expContext {
		public Token op;
		public List<Num_expContext> num_exp() {
			return getRuleContexts(Num_expContext.class);
		}
		public Num_expContext num_exp(int i) {
			return getRuleContext(Num_expContext.class,i);
		}
		public BoolNumExpContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolNumExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolNumExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolNumExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNegContext extends Bool_expContext {
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
		}
		public BoolNegContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolIDContext extends Bool_expContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public BoolIDContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expContext bool_exp() throws RecognitionException {
		return bool_exp(0);
	}

	private Bool_expContext bool_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_expContext _localctx = new Bool_expContext(_ctx, _parentState);
		Bool_expContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_bool_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new BoolNumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(283);
				num_exp(0);
				setState(284);
				((BoolNumExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
					((BoolNumExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(285);
				num_exp(0);
				}
				break;
			case 2:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				bool();
				}
				break;
			case 3:
				{
				_localctx = new BoolFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				func();
				}
				break;
			case 4:
				{
				_localctx = new BoolArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				match(ID);
				setState(290);
				match(T__5);
				setState(291);
				num_exp(0);
				setState(292);
				match(T__6);
				}
				break;
			case 5:
				{
				_localctx = new BoolIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new BoolBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(T__0);
				setState(296);
				bool_exp(0);
				setState(297);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new BoolNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				match(T__25);
				setState(300);
				bool_exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new BoolCompareContext(new Bool_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_exp);
						setState(303);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(304);
						((BoolCompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__22) ) {
							((BoolCompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(305);
						bool_exp(9);
						}
						break;
					case 2:
						{
						_localctx = new BoolExpContext(new Bool_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_exp);
						setState(306);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(307);
						((BoolExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((BoolExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(308);
						bool_exp(8);
						}
						break;
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class BoolContext extends ParserRuleContext {
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
		enterRule(_localctx, 42, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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

	public static class StatementContext extends ParserRuleContext {
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__28);
			setState(317);
			match(T__0);
			setState(318);
			bool_exp(0);
			setState(319);
			match(T__1);
			setState(320);
			match(T__2);
			setState(321);
			block();
			setState(322);
			match(T__3);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(323);
				match(T__29);
				setState(324);
				match(T__2);
				setState(325);
				block();
				setState(326);
				match(T__3);
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
		public Repeat_untilContext repeat_until() {
			return getRuleContext(Repeat_untilContext.class,0);
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
		enterRule(_localctx, 46, RULE_loop);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				loop_while();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				loop_for();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				do_while();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				repeat_until();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
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
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
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
		enterRule(_localctx, 48, RULE_loop_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__30);
			setState(338);
			match(T__0);
			setState(339);
			bool_exp(0);
			setState(340);
			match(T__1);
			setState(341);
			match(T__2);
			setState(342);
			block();
			setState(343);
			match(T__3);
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
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
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
		enterRule(_localctx, 50, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__31);
			setState(346);
			match(T__2);
			setState(347);
			block();
			setState(348);
			match(T__3);
			setState(349);
			match(T__30);
			setState(350);
			match(T__0);
			setState(351);
			bool_exp(0);
			setState(352);
			match(T__1);
			setState(353);
			match(T__7);
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

	public static class Repeat_untilContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
		}
		public Repeat_untilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRepeat_until(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRepeat_until(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRepeat_until(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_untilContext repeat_until() throws RecognitionException {
		Repeat_untilContext _localctx = new Repeat_untilContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_repeat_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__32);
			setState(356);
			match(T__2);
			setState(357);
			block();
			setState(358);
			match(T__3);
			setState(359);
			match(T__33);
			setState(360);
			match(T__0);
			setState(361);
			bool_exp(0);
			setState(362);
			match(T__1);
			setState(363);
			match(T__7);
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
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
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
		enterRule(_localctx, 54, RULE_loop_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__34);
			setState(366);
			match(T__0);
			setState(367);
			data_type();
			setState(368);
			def();
			setState(369);
			match(T__7);
			setState(370);
			bool_exp(0);
			setState(371);
			match(T__7);
			setState(372);
			def();
			setState(373);
			match(T__1);
			setState(374);
			match(T__2);
			setState(375);
			block();
			setState(376);
			match(T__3);
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
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
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
		enterRule(_localctx, 56, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__35);
			setState(379);
			match(T__0);
			setState(380);
			data_type();
			setState(381);
			match(ID);
			setState(382);
			match(T__36);
			setState(383);
			match(ID);
			setState(384);
			match(T__1);
			setState(385);
			match(T__2);
			setState(386);
			block();
			setState(387);
			match(T__3);
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
		public List<Num_expContext> num_exp() {
			return getRuleContexts(Num_expContext.class);
		}
		public Num_expContext num_exp(int i) {
			return getRuleContext(Num_expContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<S_breakContext> s_break() {
			return getRuleContexts(S_breakContext.class);
		}
		public S_breakContext s_break(int i) {
			return getRuleContext(S_breakContext.class,i);
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
		enterRule(_localctx, 58, RULE_s_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(T__37);
			setState(390);
			match(T__0);
			setState(391);
			match(ID);
			setState(392);
			match(T__1);
			setState(393);
			match(T__2);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(394);
				match(T__38);
				setState(395);
				num_exp(0);
				setState(396);
				match(T__36);
				setState(397);
				block();
				setState(398);
				s_break();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			match(T__3);
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

	public static class S_breakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(GrammarParser.BREAK, 0); }
		public S_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS_break(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS_break(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_breakContext s_break() throws RecognitionException {
		S_breakContext _localctx = new S_breakContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_s_break);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(407);
				match(BREAK);
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
		enterRule(_localctx, 62, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(ID);
			setState(411);
			match(T__0);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__15) | (1L << T__16) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ID) | (1L << NUMVAL))) != 0)) {
				{
				setState(412);
				value();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(413);
					match(T__10);
					setState(414);
					value();
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(422);
			match(T__1);
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
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
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
		enterRule(_localctx, 64, RULE_ternar_oper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			bool_exp(0);
			setState(425);
			match(T__39);
			setState(426);
			value();
			setState(427);
			match(T__36);
			setState(428);
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
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public Array_defContext array_def() {
			return getRuleContext(Array_defContext.class,0);
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
		enterRule(_localctx, 66, RULE_r_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__40);
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(431);
				ternar_oper();
				}
				break;
			case 2:
				{
				setState(432);
				value();
				}
				break;
			case 3:
				{
				setState(433);
				func();
				}
				break;
			case 4:
				{
				setState(434);
				def();
				}
				break;
			case 5:
				{
				setState(435);
				array_def();
				}
				break;
			}
			setState(438);
			match(T__7);
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
		case 18:
			return num_exp_sempred((Num_expContext)_localctx, predIndex);
		case 20:
			return bool_exp_sempred((Bool_expContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean num_exp_sempred(Num_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean bool_exp_sempred(Bool_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u01bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6z\n\6\f\6\16\6}\13\6\3\6\5\6\u0080\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\5\b\u008c\n\b\3\t\3\t\3\t"+
		"\3\t\5\t\u0092\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00a1\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a8\n\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00b2\n\r\3\16\3\16\3\16\3\16\5\16\u00b8"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c3\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00ca\n\20\3\21\3\21\3\21\6\21\u00cf\n\21\r"+
		"\21\16\21\u00d0\3\21\3\21\3\21\3\21\5\21\u00d7\n\21\3\22\3\22\3\22\3\22"+
		"\7\22\u00dd\n\22\f\22\16\22\u00e0\13\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00e7\n\22\3\22\3\22\3\22\5\22\u00ec\n\22\7\22\u00ee\n\22\f\22\16\22"+
		"\u00f1\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fd"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u010e\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0116\n"+
		"\24\f\24\16\24\u0119\13\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0130"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0138\n\26\f\26\16\26\u013b\13"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u014b\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0152\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u0193\n\37\f\37\16\37\u0196\13\37\3\37"+
		"\3\37\3 \5 \u019b\n \3!\3!\3!\3!\3!\7!\u01a2\n!\f!\16!\u01a5\13!\5!\u01a7"+
		"\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u01b7\n#\3#\3#"+
		"\3#\2\4&*$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BD\2\t\3\2\13\f\3\2\22\23\3\2\20\21\3\2\24\31\4\2\26\26\31\31\3\2"+
		"\32\33\3\2\35\36\2\u01d9\2I\3\2\2\2\4L\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\n"+
		"{\3\2\2\2\f\u0081\3\2\2\2\16\u008b\3\2\2\2\20\u0091\3\2\2\2\22\u0093\3"+
		"\2\2\2\24\u00a7\3\2\2\2\26\u00a9\3\2\2\2\30\u00b1\3\2\2\2\32\u00b3\3\2"+
		"\2\2\34\u00bb\3\2\2\2\36\u00c4\3\2\2\2 \u00cb\3\2\2\2\"\u00d8\3\2\2\2"+
		"$\u00f4\3\2\2\2&\u010d\3\2\2\2(\u011a\3\2\2\2*\u012f\3\2\2\2,\u013c\3"+
		"\2\2\2.\u013e\3\2\2\2\60\u0151\3\2\2\2\62\u0153\3\2\2\2\64\u015b\3\2\2"+
		"\2\66\u0165\3\2\2\28\u016f\3\2\2\2:\u017c\3\2\2\2<\u0187\3\2\2\2>\u019a"+
		"\3\2\2\2@\u019c\3\2\2\2B\u01aa\3\2\2\2D\u01b0\3\2\2\2FH\5\4\3\2GF\3\2"+
		"\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3\2\2\2KI\3\2\2\2LM\5\6\4\2MN\7"+
		"-\2\2NO\7\3\2\2OP\5\16\b\2PQ\7\4\2\2QR\7\5\2\2RS\5\n\6\2ST\7\6\2\2T\5"+
		"\3\2\2\2UY\5\f\7\2VY\5\b\5\2WY\7\7\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y"+
		"\7\3\2\2\2Z[\5\f\7\2[\\\7\b\2\2\\]\7\t\2\2]\t\3\2\2\2^_\5\24\13\2_`\7"+
		"\n\2\2`z\3\2\2\2ab\5\26\f\2bc\7\n\2\2cz\3\2\2\2de\5\36\20\2ef\7\n\2\2"+
		"fz\3\2\2\2gh\5 \21\2hi\7\n\2\2iz\3\2\2\2jk\5\"\22\2kl\7\n\2\2lz\3\2\2"+
		"\2mn\5$\23\2no\7\n\2\2oz\3\2\2\2pq\5\34\17\2qr\7\n\2\2rz\3\2\2\2sz\5\60"+
		"\31\2tz\5.\30\2uz\5<\37\2vw\5@!\2wx\7\n\2\2xz\3\2\2\2y^\3\2\2\2ya\3\2"+
		"\2\2yd\3\2\2\2yg\3\2\2\2yj\3\2\2\2ym\3\2\2\2yp\3\2\2\2ys\3\2\2\2yt\3\2"+
		"\2\2yu\3\2\2\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{"+
		"\3\2\2\2~\u0080\5D#\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\13\3\2\2\2"+
		"\u0081\u0082\t\2\2\2\u0082\r\3\2\2\2\u0083\u0088\5\20\t\2\u0084\u0085"+
		"\7\r\2\2\u0085\u0087\5\20\t\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u008c\3\2\2\2\u008c\17\3\2\2\2\u008d"+
		"\u008e\5\f\7\2\u008e\u008f\7-\2\2\u008f\u0092\3\2\2\2\u0090\u0092\5\22"+
		"\n\2\u0091\u008d\3\2\2\2\u0091\u0090\3\2\2\2\u0092\21\3\2\2\2\u0093\u0094"+
		"\5\f\7\2\u0094\u0095\7-\2\2\u0095\u0096\7\b\2\2\u0096\u0097\7\t\2\2\u0097"+
		"\23\3\2\2\2\u0098\u0099\5\f\7\2\u0099\u009a\7-\2\2\u009a\u00a8\3\2\2\2"+
		"\u009b\u009c\5\f\7\2\u009c\u009d\7-\2\2\u009d\u00a0\7\b\2\2\u009e\u00a1"+
		"\5(\25\2\u009f\u00a1\7-\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a8\3\2\2\2\u00a4\u00a5\5\f"+
		"\7\2\u00a5\u00a6\5\36\20\2\u00a6\u00a8\3\2\2\2\u00a7\u0098\3\2\2\2\u00a7"+
		"\u009b\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\25\3\2\2\2\u00a9\u00aa\7\16\2"+
		"\2\u00aa\u00ab\5\f\7\2\u00ab\u00ac\5\36\20\2\u00ac\27\3\2\2\2\u00ad\u00b2"+
		"\7-\2\2\u00ae\u00b2\5\32\16\2\u00af\u00b2\5&\24\2\u00b0\u00b2\5*\26\2"+
		"\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4\u00b7\7\b\2\2\u00b5"+
		"\u00b8\5(\25\2\u00b6\u00b8\7-\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\t\2\2\u00ba\33\3\2\2\2\u00bb\u00bc"+
		"\5\f\7\2\u00bc\u00bd\7-\2\2\u00bd\u00be\7\b\2\2\u00be\u00bf\7\t\2\2\u00bf"+
		"\u00c2\7\17\2\2\u00c0\u00c3\7-\2\2\u00c1\u00c3\5@!\2\u00c2\u00c0\3\2\2"+
		"\2\u00c2\u00c1\3\2\2\2\u00c3\35\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5\u00c9"+
		"\7\17\2\2\u00c6\u00ca\5\30\r\2\u00c7\u00ca\5@!\2\u00c8\u00ca\5B\"\2\u00c9"+
		"\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\37\3\2\2"+
		"\2\u00cb\u00ce\7-\2\2\u00cc\u00cd\7\17\2\2\u00cd\u00cf\7-\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d6\7\17\2\2\u00d3\u00d7\5@!\2\u00d4\u00d7\5\30"+
		"\r\2\u00d5\u00d7\5B\"\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00d9\7\5\2\2\u00d9\u00de\7-\2\2\u00da"+
		"\u00db\7\r\2\2\u00db\u00dd\7-\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e2\7\6\2\2\u00e2\u00e3\7\17\2\2\u00e3\u00e6\7"+
		"\5\2\2\u00e4\u00e7\5@!\2\u00e5\u00e7\5\30\r\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00ef\3\2\2\2\u00e8\u00eb\7\r\2\2\u00e9\u00ec\5@"+
		"!\2\u00ea\u00ec\5\30\r\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f3\7\6\2\2\u00f3#\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5\u00f6\7\b\2\2\u00f6"+
		"\u00f7\5\30\r\2\u00f7\u00f8\7\t\2\2\u00f8\u00fc\7\17\2\2\u00f9\u00fd\5"+
		"@!\2\u00fa\u00fd\5B\"\2\u00fb\u00fd\5\30\r\2\u00fc\u00f9\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd%\3\2\2\2\u00fe\u00ff\b\24\1\2"+
		"\u00ff\u010e\5(\25\2\u0100\u010e\5@!\2\u0101\u0102\7-\2\2\u0102\u0103"+
		"\7\b\2\2\u0103\u0104\5&\24\2\u0104\u0105\7\t\2\2\u0105\u010e\3\2\2\2\u0106"+
		"\u010e\7-\2\2\u0107\u0108\7\3\2\2\u0108\u0109\5&\24\2\u0109\u010a\7\4"+
		"\2\2\u010a\u010e\3\2\2\2\u010b\u010c\t\3\2\2\u010c\u010e\5&\24\3\u010d"+
		"\u00fe\3\2\2\2\u010d\u0100\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u0106\3\2"+
		"\2\2\u010d\u0107\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0117\3\2\2\2\u010f"+
		"\u0110\f\n\2\2\u0110\u0111\t\4\2\2\u0111\u0116\5&\24\13\u0112\u0113\f"+
		"\t\2\2\u0113\u0114\t\3\2\2\u0114\u0116\5&\24\n\u0115\u010f\3\2\2\2\u0115"+
		"\u0112\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\'\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7/\2\2\u011b)\3\2"+
		"\2\2\u011c\u011d\b\26\1\2\u011d\u011e\5&\24\2\u011e\u011f\t\5\2\2\u011f"+
		"\u0120\5&\24\2\u0120\u0130\3\2\2\2\u0121\u0130\5,\27\2\u0122\u0130\5@"+
		"!\2\u0123\u0124\7-\2\2\u0124\u0125\7\b\2\2\u0125\u0126\5&\24\2\u0126\u0127"+
		"\7\t\2\2\u0127\u0130\3\2\2\2\u0128\u0130\7-\2\2\u0129\u012a\7\3\2\2\u012a"+
		"\u012b\5*\26\2\u012b\u012c\7\4\2\2\u012c\u0130\3\2\2\2\u012d\u012e\7\34"+
		"\2\2\u012e\u0130\5*\26\3\u012f\u011c\3\2\2\2\u012f\u0121\3\2\2\2\u012f"+
		"\u0122\3\2\2\2\u012f\u0123\3\2\2\2\u012f\u0128\3\2\2\2\u012f\u0129\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130\u0139\3\2\2\2\u0131\u0132\f\n\2\2\u0132"+
		"\u0133\t\6\2\2\u0133\u0138\5*\26\13\u0134\u0135\f\t\2\2\u0135\u0136\t"+
		"\7\2\2\u0136\u0138\5*\26\n\u0137\u0131\3\2\2\2\u0137\u0134\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a+\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013c\u013d\t\b\2\2\u013d-\3\2\2\2\u013e\u013f\7"+
		"\37\2\2\u013f\u0140\7\3\2\2\u0140\u0141\5*\26\2\u0141\u0142\7\4\2\2\u0142"+
		"\u0143\7\5\2\2\u0143\u0144\5\n\6\2\u0144\u014a\7\6\2\2\u0145\u0146\7 "+
		"\2\2\u0146\u0147\7\5\2\2\u0147\u0148\5\n\6\2\u0148\u0149\7\6\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0145\3\2\2\2\u014a\u014b\3\2\2\2\u014b/\3\2\2\2"+
		"\u014c\u0152\5\62\32\2\u014d\u0152\58\35\2\u014e\u0152\5\64\33\2\u014f"+
		"\u0152\5\66\34\2\u0150\u0152\5:\36\2\u0151\u014c\3\2\2\2\u0151\u014d\3"+
		"\2\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\61\3\2\2\2\u0153\u0154\7!\2\2\u0154\u0155\7\3\2\2\u0155\u0156\5*\26\2"+
		"\u0156\u0157\7\4\2\2\u0157\u0158\7\5\2\2\u0158\u0159\5\n\6\2\u0159\u015a"+
		"\7\6\2\2\u015a\63\3\2\2\2\u015b\u015c\7\"\2\2\u015c\u015d\7\5\2\2\u015d"+
		"\u015e\5\n\6\2\u015e\u015f\7\6\2\2\u015f\u0160\7!\2\2\u0160\u0161\7\3"+
		"\2\2\u0161\u0162\5*\26\2\u0162\u0163\7\4\2\2\u0163\u0164\7\n\2\2\u0164"+
		"\65\3\2\2\2\u0165\u0166\7#\2\2\u0166\u0167\7\5\2\2\u0167\u0168\5\n\6\2"+
		"\u0168\u0169\7\6\2\2\u0169\u016a\7$\2\2\u016a\u016b\7\3\2\2\u016b\u016c"+
		"\5*\26\2\u016c\u016d\7\4\2\2\u016d\u016e\7\n\2\2\u016e\67\3\2\2\2\u016f"+
		"\u0170\7%\2\2\u0170\u0171\7\3\2\2\u0171\u0172\5\f\7\2\u0172\u0173\5\36"+
		"\20\2\u0173\u0174\7\n\2\2\u0174\u0175\5*\26\2\u0175\u0176\7\n\2\2\u0176"+
		"\u0177\5\36\20\2\u0177\u0178\7\4\2\2\u0178\u0179\7\5\2\2\u0179\u017a\5"+
		"\n\6\2\u017a\u017b\7\6\2\2\u017b9\3\2\2\2\u017c\u017d\7&\2\2\u017d\u017e"+
		"\7\3\2\2\u017e\u017f\5\f\7\2\u017f\u0180\7-\2\2\u0180\u0181\7\'\2\2\u0181"+
		"\u0182\7-\2\2\u0182\u0183\7\4\2\2\u0183\u0184\7\5\2\2\u0184\u0185\5\n"+
		"\6\2\u0185\u0186\7\6\2\2\u0186;\3\2\2\2\u0187\u0188\7(\2\2\u0188\u0189"+
		"\7\3\2\2\u0189\u018a\7-\2\2\u018a\u018b\7\4\2\2\u018b\u0194\7\5\2\2\u018c"+
		"\u018d\7)\2\2\u018d\u018e\5&\24\2\u018e\u018f\7\'\2\2\u018f\u0190\5\n"+
		"\6\2\u0190\u0191\5> \2\u0191\u0193\3\2\2\2\u0192\u018c\3\2\2\2\u0193\u0196"+
		"\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0198\7\6\2\2\u0198=\3\2\2\2\u0199\u019b\7,\2\2\u019a"+
		"\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b?\3\2\2\2\u019c\u019d\7-\2\2\u019d"+
		"\u01a6\7\3\2\2\u019e\u01a3\5\30\r\2\u019f\u01a0\7\r\2\2\u01a0\u01a2\5"+
		"\30\r\2\u01a1\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u019e\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7\4\2\2\u01a9"+
		"A\3\2\2\2\u01aa\u01ab\5*\26\2\u01ab\u01ac\7*\2\2\u01ac\u01ad\5\30\r\2"+
		"\u01ad\u01ae\7\'\2\2\u01ae\u01af\5\30\r\2\u01afC\3\2\2\2\u01b0\u01b6\7"+
		"+\2\2\u01b1\u01b7\5B\"\2\u01b2\u01b7\5\30\r\2\u01b3\u01b7\5@!\2\u01b4"+
		"\u01b7\5\36\20\2\u01b5\u01b7\5$\23\2\u01b6\u01b1\3\2\2\2\u01b6\u01b2\3"+
		"\2\2\2\u01b6\u01b3\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b9\7\n\2\2\u01b9E\3\2\2\2$IXy{\177\u0088\u008b"+
		"\u0091\u00a0\u00a7\u00b1\u00b7\u00c2\u00c9\u00d0\u00d6\u00de\u00e6\u00eb"+
		"\u00ef\u00fc\u010d\u0115\u0117\u012f\u0137\u0139\u014a\u0151\u0194\u019a"+
		"\u01a3\u01a6\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}