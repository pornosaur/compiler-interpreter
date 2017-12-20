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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, ID=44, CHARS=45, NUMERIC=46, 
		ALPHABET_NUMERIC=47, ALPHABET=48, SPECIAL_CHARS=49, ESCAPE=50, MULTIDIV=51, 
		WS=52;
	public static final int
		RULE_program = 0, RULE_func_def = 1, RULE_return_type = 2, RULE_block = 3, 
		RULE_data_type = 4, RULE_param = 5, RULE_declar = 6, RULE_const_declar = 7, 
		RULE_value = 8, RULE_def = 9, RULE_multiple_def = 10, RULE_parallel_def = 11, 
		RULE_array_def = 12, RULE_num_exp = 13, RULE_integer = 14, RULE_str_def = 15, 
		RULE_str = 16, RULE_bool_exp = 17, RULE_bool = 18, RULE_statement = 19, 
		RULE_loop = 20, RULE_loop_while = 21, RULE_do_while = 22, RULE_loop_for = 23, 
		RULE_foreach = 24, RULE_s_switch = 25, RULE_call_fnc = 26, RULE_func = 27, 
		RULE_ternar_oper = 28, RULE_r_return = 29;
	public static final String[] ruleNames = {
		"program", "func_def", "return_type", "block", "data_type", "param", "declar", 
		"const_declar", "value", "def", "multiple_def", "parallel_def", "array_def", 
		"num_exp", "integer", "str_def", "str", "bool_exp", "bool", "statement", 
		"loop", "loop_while", "do_while", "loop_for", "foreach", "s_switch", "call_fnc", 
		"func", "ternar_oper", "r_return"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'void'", "'string'", "'integer'", "'bool'", 
		"','", "';'", "'['", "']'", "'const'", "'='", "'*'", "'/'", "'+'", "'-'", 
		"'.'", "'<'", "'>'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'!'", 
		"'true'", "'false'", "'if'", "'else'", "'while'", "'do'", "'for'", "'foreach'", 
		"':'", "'switch'", "'case'", "'break'", "'default:'", "'?'", "'return'", 
		null, "'_'", null, null, null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ID", "CHARS", "NUMERIC", 
		"ALPHABET_NUMERIC", "ALPHABET", "SPECIAL_CHARS", "ESCAPE", "MULTIDIV", 
		"WS"
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				{
				setState(60);
				func_def();
				}
				}
				setState(65);
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
			setState(66);
			return_type();
			setState(67);
			match(ID);
			setState(68);
			match(T__0);
			setState(69);
			param();
			setState(70);
			match(T__1);
			setState(71);
			match(T__2);
			setState(72);
			block();
			setState(73);
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				data_type();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
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
		enterRule(_localctx, 6, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(79);
						declar();
						}
						break;
					case 2:
						{
						setState(80);
						const_declar();
						}
						break;
					case 3:
						{
						setState(81);
						def();
						}
						break;
					case 4:
						{
						setState(82);
						multiple_def();
						}
						break;
					case 5:
						{
						setState(83);
						parallel_def();
						}
						break;
					case 6:
						{
						setState(84);
						array_def();
						}
						break;
					case 7:
						{
						setState(85);
						loop();
						}
						break;
					case 8:
						{
						setState(86);
						statement();
						}
						break;
					case 9:
						{
						setState(87);
						s_switch();
						}
						break;
					case 10:
						{
						setState(88);
						call_fnc();
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(94);
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
		enterRule(_localctx, 8, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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

	public static class ParamContext extends ParserRuleContext {
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
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
		enterRule(_localctx, 10, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(99);
				data_type();
				setState(100);
				match(ID);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(101);
					match(T__8);
					setState(102);
					data_type();
					setState(103);
					match(ID);
					}
					}
					setState(109);
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
		enterRule(_localctx, 12, RULE_declar);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DeclarIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				data_type();
				setState(113);
				match(ID);
				setState(114);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new DeclarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				data_type();
				setState(117);
				match(ID);
				setState(118);
				match(T__10);
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERIC:
					{
					setState(119);
					integer();
					}
					break;
				case ID:
					{
					setState(120);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123);
				match(T__11);
				setState(124);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new DeclarDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				data_type();
				setState(127);
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
		enterRule(_localctx, 14, RULE_const_declar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__12);
			setState(132);
			data_type();
			setState(133);
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
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public Str_defContext str_def() {
			return getRuleContext(Str_defContext.class,0);
		}
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
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
		enterRule(_localctx, 16, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(135);
				match(ID);
				}
				break;
			case 2:
				{
				setState(136);
				num_exp(0);
				}
				break;
			case 3:
				{
				setState(137);
				str_def();
				}
				break;
			case 4:
				{
				setState(138);
				bool_exp(0);
				}
				break;
			case 5:
				{
				setState(139);
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

	public static class DefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
			setState(143);
			match(T__13);
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(144);
				func();
				}
				break;
			case 2:
				{
				setState(145);
				ternar_oper();
				}
				break;
			case 3:
				{
				setState(146);
				value();
				}
				break;
			}
			setState(149);
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
		enterRule(_localctx, 20, RULE_multiple_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ID);
			setState(154); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(152);
					match(T__13);
					setState(153);
					match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(158);
			match(T__13);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(159);
				func();
				}
				break;
			case 2:
				{
				setState(160);
				value();
				}
				break;
			case 3:
				{
				setState(161);
				ternar_oper();
				}
				break;
			}
			setState(164);
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
		enterRule(_localctx, 22, RULE_parallel_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__2);
			setState(167);
			match(ID);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(168);
				match(T__8);
				setState(169);
				match(ID);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__3);
			setState(176);
			match(T__13);
			setState(177);
			match(T__2);
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(178);
				func();
				}
				break;
			case 2:
				{
				setState(179);
				value();
				}
				break;
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(182);
				match(T__8);
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(183);
					func();
					}
					break;
				case 2:
					{
					setState(184);
					value();
					}
					break;
				}
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(T__3);
			setState(193);
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
		enterRule(_localctx, 24, RULE_array_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
			setState(196);
			match(T__10);
			setState(197);
			value();
			setState(198);
			match(T__11);
			setState(199);
			match(T__13);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(200);
				func();
				}
				break;
			case 2:
				{
				setState(201);
				ternar_oper();
				}
				break;
			case 3:
				{
				setState(202);
				value();
				}
				break;
			}
			setState(205);
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
	public static class RealContext extends Num_expContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public RealContext(Num_expContext ctx) { copyFrom(ctx); }
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_num_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new IntegersContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(208);
				integer();
				}
				break;
			case 2:
				{
				_localctx = new RealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				integer();
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(210);
					match(T__18);
					setState(211);
					integer();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new NumFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				func();
				}
				break;
			case 4:
				{
				_localctx = new NumArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(ID);
				setState(216);
				match(T__10);
				setState(217);
				num_exp(0);
				setState(218);
				match(T__11);
				}
				break;
			case 5:
				{
				_localctx = new NumIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new NumBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(T__0);
				setState(222);
				num_exp(0);
				setState(223);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new SignedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				((SignedContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
					((SignedContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				num_exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MultiDivContext(new Num_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_exp);
						setState(229);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(230);
						((MultiDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((MultiDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(231);
						num_exp(10);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new Num_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_exp);
						setState(232);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(233);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(234);
						num_exp(9);
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 28, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(240);
					match(NUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(243); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 30, RULE_str_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			str();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(246);
				match(T__16);
				setState(247);
				str();
				}
				}
				setState(252);
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
		enterRule(_localctx, 32, RULE_str);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(SPECIAL_CHARS);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << CHARS) | (1L << NUMERIC) | (1L << ALPHABET_NUMERIC) | (1L << ALPHABET) | (1L << ESCAPE) | (1L << MULTIDIV) | (1L << WS))) != 0)) {
				{
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(254);
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
					setState(255);
					match(ESCAPE);
					}
					break;
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_bool_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new BoolNumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(264);
				num_exp(0);
				setState(265);
				((BoolNumExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
					((BoolNumExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				num_exp(0);
				}
				break;
			case 2:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				bool();
				}
				break;
			case 3:
				{
				_localctx = new BoolIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new BoolBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(T__0);
				setState(271);
				bool_exp(0);
				setState(272);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new BoolNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(T__27);
				setState(275);
				bool_exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(284);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new BoolCompareContext(new Bool_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_exp);
						setState(278);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(279);
						((BoolCompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__24) ) {
							((BoolCompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(280);
						bool_exp(7);
						}
						break;
					case 2:
						{
						_localctx = new BoolExpContext(new Bool_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_exp);
						setState(281);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(282);
						((BoolExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((BoolExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(283);
						bool_exp(6);
						}
						break;
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 36, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
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
		enterRule(_localctx, 38, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__30);
			setState(292);
			match(T__0);
			setState(293);
			bool_exp(0);
			setState(294);
			match(T__1);
			setState(295);
			match(T__2);
			setState(296);
			block();
			setState(297);
			match(T__3);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(298);
				match(T__31);
				setState(299);
				match(T__2);
				setState(300);
				block();
				setState(301);
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
		enterRule(_localctx, 40, RULE_loop);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				loop_while();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				loop_for();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				do_while();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
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
		enterRule(_localctx, 42, RULE_loop_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__32);
			setState(312);
			match(T__0);
			setState(313);
			bool_exp(0);
			setState(314);
			match(T__1);
			setState(315);
			match(T__2);
			setState(316);
			block();
			setState(317);
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
		enterRule(_localctx, 44, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__33);
			setState(320);
			match(T__2);
			setState(321);
			block();
			setState(322);
			match(T__3);
			setState(323);
			match(T__32);
			setState(324);
			match(T__0);
			setState(325);
			bool_exp(0);
			setState(326);
			match(T__1);
			setState(327);
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
		enterRule(_localctx, 46, RULE_loop_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__34);
			setState(330);
			match(T__0);
			setState(331);
			data_type();
			setState(332);
			def();
			setState(333);
			match(T__9);
			setState(334);
			bool_exp(0);
			setState(335);
			match(T__9);
			setState(336);
			def();
			setState(337);
			match(T__1);
			setState(338);
			match(T__2);
			setState(339);
			block();
			setState(340);
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
		enterRule(_localctx, 48, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__35);
			setState(343);
			match(T__0);
			setState(344);
			data_type();
			setState(345);
			match(ID);
			setState(346);
			match(T__36);
			setState(347);
			match(ID);
			setState(348);
			match(T__1);
			setState(349);
			match(T__2);
			setState(350);
			block();
			setState(351);
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
		enterRule(_localctx, 50, RULE_s_switch);
		int _la;
		try {
			int _alt;
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(T__37);
				setState(354);
				match(T__0);
				setState(355);
				match(ID);
				setState(356);
				match(T__1);
				setState(357);
				match(T__2);
				setState(373); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(365); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(358);
								match(T__38);
								setState(361);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case T__0:
								case T__16:
								case T__17:
								case ID:
								case NUMERIC:
									{
									setState(359);
									num_exp(0);
									}
									break;
								case SPECIAL_CHARS:
									{
									setState(360);
									str_def();
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(363);
								match(T__36);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(367); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(369);
						block();
						setState(371);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(370);
							match(T__39);
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(375); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__3:
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(378); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(377);
							match(T__40);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(380); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(382);
					block();
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__39) {
						{
						setState(383);
						match(T__39);
						}
					}

					}
				}

				setState(388);
				match(T__3);
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
		enterRule(_localctx, 52, RULE_call_fnc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			func();
			setState(392);
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
		enterRule(_localctx, 54, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(ID);
			setState(395);
			match(T__0);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__17) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << NUMERIC) | (1L << SPECIAL_CHARS))) != 0)) {
				{
				setState(396);
				value();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(397);
					match(T__8);
					setState(398);
					value();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(406);
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
		enterRule(_localctx, 56, RULE_ternar_oper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			bool_exp(0);
			setState(409);
			match(T__41);
			setState(410);
			value();
			setState(411);
			match(T__36);
			setState(412);
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
		enterRule(_localctx, 58, RULE_r_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__42);
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(415);
				ternar_oper();
				}
				break;
			case 2:
				{
				setState(416);
				value();
				}
				break;
			case 3:
				{
				setState(417);
				func();
				}
				break;
			}
			setState(420);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return num_exp_sempred((Num_expContext)_localctx, predIndex);
		case 17:
			return bool_exp_sempred((Bool_expContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean num_exp_sempred(Num_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean bool_exp_sempred(Bool_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u01a9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4P\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3"+
		"\5\5\5b\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\5"+
		"\7q\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b|\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u0084\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\13\3\13\3\f\3\f\3\f\6\f\u009d"+
		"\n\f\r\f\16\f\u009e\3\f\3\f\3\f\3\f\5\f\u00a5\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\7\r\u00ad\n\r\f\r\16\r\u00b0\13\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b7\n"+
		"\r\3\r\3\r\3\r\5\r\u00bc\n\r\7\r\u00be\n\r\f\r\16\r\u00c1\13\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ce\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00d7\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00ee\n\17\f\17\16\17\u00f1\13\17\3\20\6\20\u00f4\n\20"+
		"\r\20\16\20\u00f5\3\21\3\21\3\21\7\21\u00fb\n\21\f\21\16\21\u00fe\13\21"+
		"\3\22\3\22\3\22\7\22\u0103\n\22\f\22\16\22\u0106\13\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0117"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u011f\n\23\f\23\16\23\u0122\13"+
		"\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u0132\n\25\3\26\3\26\3\26\3\26\5\26\u0138\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u016c\n\33\3\33\3\33\6\33\u0170\n\33\r"+
		"\33\16\33\u0171\3\33\3\33\5\33\u0176\n\33\6\33\u0178\n\33\r\33\16\33\u0179"+
		"\3\33\6\33\u017d\n\33\r\33\16\33\u017e\3\33\3\33\5\33\u0183\n\33\5\33"+
		"\u0185\n\33\3\33\5\33\u0188\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\7\35\u0192\n\35\f\35\16\35\u0195\13\35\5\35\u0197\n\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u01a5\n\37\3\37"+
		"\3\37\3\37\2\4\34$ \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<\2\n\3\2\b\n\3\2\23\24\3\2\21\22\3\2\63\63\3\2\26\33\4\2\30"+
		"\30\33\33\3\2\34\35\3\2\37 \2\u01ce\2A\3\2\2\2\4D\3\2\2\2\6O\3\2\2\2\b"+
		"]\3\2\2\2\nc\3\2\2\2\fp\3\2\2\2\16\u0083\3\2\2\2\20\u0085\3\2\2\2\22\u008e"+
		"\3\2\2\2\24\u0090\3\2\2\2\26\u0099\3\2\2\2\30\u00a8\3\2\2\2\32\u00c5\3"+
		"\2\2\2\34\u00e5\3\2\2\2\36\u00f3\3\2\2\2 \u00f7\3\2\2\2\"\u00ff\3\2\2"+
		"\2$\u0116\3\2\2\2&\u0123\3\2\2\2(\u0125\3\2\2\2*\u0137\3\2\2\2,\u0139"+
		"\3\2\2\2.\u0141\3\2\2\2\60\u014b\3\2\2\2\62\u0158\3\2\2\2\64\u0187\3\2"+
		"\2\2\66\u0189\3\2\2\28\u018c\3\2\2\2:\u019a\3\2\2\2<\u01a0\3\2\2\2>@\5"+
		"\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CA\3\2\2\2DE"+
		"\5\6\4\2EF\7.\2\2FG\7\3\2\2GH\5\f\7\2HI\7\4\2\2IJ\7\5\2\2JK\5\b\5\2KL"+
		"\7\6\2\2L\5\3\2\2\2MP\5\n\6\2NP\7\7\2\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2"+
		"Q\\\5\16\b\2R\\\5\20\t\2S\\\5\24\13\2T\\\5\26\f\2U\\\5\30\r\2V\\\5\32"+
		"\16\2W\\\5*\26\2X\\\5(\25\2Y\\\5\64\33\2Z\\\5\66\34\2[Q\3\2\2\2[R\3\2"+
		"\2\2[S\3\2\2\2[T\3\2\2\2[U\3\2\2\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2"+
		"\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`b\5"+
		"<\37\2a`\3\2\2\2ab\3\2\2\2b\t\3\2\2\2cd\t\2\2\2d\13\3\2\2\2ef\5\n\6\2"+
		"fm\7.\2\2gh\7\13\2\2hi\5\n\6\2ij\7.\2\2jl\3\2\2\2kg\3\2\2\2lo\3\2\2\2"+
		"mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pe\3\2\2\2pq\3\2\2\2q\r\3\2\2"+
		"\2rs\5\n\6\2st\7.\2\2tu\7\f\2\2u\u0084\3\2\2\2vw\5\n\6\2wx\7.\2\2x{\7"+
		"\r\2\2y|\5\36\20\2z|\7.\2\2{y\3\2\2\2{z\3\2\2\2|}\3\2\2\2}~\7\16\2\2~"+
		"\177\7\f\2\2\177\u0084\3\2\2\2\u0080\u0081\5\n\6\2\u0081\u0082\5\24\13"+
		"\2\u0082\u0084\3\2\2\2\u0083r\3\2\2\2\u0083v\3\2\2\2\u0083\u0080\3\2\2"+
		"\2\u0084\17\3\2\2\2\u0085\u0086\7\17\2\2\u0086\u0087\5\n\6\2\u0087\u0088"+
		"\5\24\13\2\u0088\21\3\2\2\2\u0089\u008f\7.\2\2\u008a\u008f\5\34\17\2\u008b"+
		"\u008f\5 \21\2\u008c\u008f\5$\23\2\u008d\u008f\5\32\16\2\u008e\u0089\3"+
		"\2\2\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\23\3\2\2\2\u0090\u0091\7.\2\2\u0091\u0095\7\20\2"+
		"\2\u0092\u0096\58\35\2\u0093\u0096\5:\36\2\u0094\u0096\5\22\n\2\u0095"+
		"\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\7\f\2\2\u0098\25\3\2\2\2\u0099\u009c\7.\2\2\u009a\u009b"+
		"\7\20\2\2\u009b\u009d\7.\2\2\u009c\u009a\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a4\7\20"+
		"\2\2\u00a1\u00a5\58\35\2\u00a2\u00a5\5\22\n\2\u00a3\u00a5\5:\36\2\u00a4"+
		"\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\7\f\2\2\u00a7\27\3\2\2\2\u00a8\u00a9\7\5\2\2\u00a9\u00ae"+
		"\7.\2\2\u00aa\u00ab\7\13\2\2\u00ab\u00ad\7.\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\6\2\2\u00b2\u00b3\7\20\2\2\u00b3"+
		"\u00b6\7\5\2\2\u00b4\u00b7\58\35\2\u00b5\u00b7\5\22\n\2\u00b6\u00b4\3"+
		"\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00bf\3\2\2\2\u00b8\u00bb\7\13\2\2\u00b9"+
		"\u00bc\58\35\2\u00ba\u00bc\5\22\n\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3"+
		"\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b8\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00c3\7\6\2\2\u00c3\u00c4\7\f\2\2\u00c4\31\3\2\2\2\u00c5\u00c6"+
		"\7.\2\2\u00c6\u00c7\7\r\2\2\u00c7\u00c8\5\22\n\2\u00c8\u00c9\7\16\2\2"+
		"\u00c9\u00cd\7\20\2\2\u00ca\u00ce\58\35\2\u00cb\u00ce\5:\36\2\u00cc\u00ce"+
		"\5\22\n\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\f\2\2\u00d0\33\3\2\2\2\u00d1\u00d2"+
		"\b\17\1\2\u00d2\u00e6\5\36\20\2\u00d3\u00d6\5\36\20\2\u00d4\u00d5\7\25"+
		"\2\2\u00d5\u00d7\5\36\20\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00e6\3\2\2\2\u00d8\u00e6\58\35\2\u00d9\u00da\7.\2\2\u00da\u00db\7\r"+
		"\2\2\u00db\u00dc\5\34\17\2\u00dc\u00dd\7\16\2\2\u00dd\u00e6\3\2\2\2\u00de"+
		"\u00e6\7.\2\2\u00df\u00e0\7\3\2\2\u00e0\u00e1\5\34\17\2\u00e1\u00e2\7"+
		"\4\2\2\u00e2\u00e6\3\2\2\2\u00e3\u00e4\t\3\2\2\u00e4\u00e6\5\34\17\3\u00e5"+
		"\u00d1\3\2\2\2\u00e5\u00d3\3\2\2\2\u00e5\u00d8\3\2\2\2\u00e5\u00d9\3\2"+
		"\2\2\u00e5\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00ef\3\2\2\2\u00e7\u00e8\f\13\2\2\u00e8\u00e9\t\4\2\2\u00e9\u00ee\5"+
		"\34\17\f\u00ea\u00eb\f\n\2\2\u00eb\u00ec\t\3\2\2\u00ec\u00ee\5\34\17\13"+
		"\u00ed\u00e7\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\35\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f4\7\60\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\37\3\2\2\2\u00f7\u00fc\5\"\22\2\u00f8"+
		"\u00f9\7\23\2\2\u00f9\u00fb\5\"\22\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd!\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0104\7\63\2\2\u0100\u0103\n\5\2\2\u0101\u0103\7\64\2\2"+
		"\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0108\7\63\2\2\u0108#\3\2\2\2\u0109\u010a\b\23\1\2\u010a\u010b\5\34\17"+
		"\2\u010b\u010c\t\6\2\2\u010c\u010d\5\34\17\2\u010d\u0117\3\2\2\2\u010e"+
		"\u0117\5&\24\2\u010f\u0117\7.\2\2\u0110\u0111\7\3\2\2\u0111\u0112\5$\23"+
		"\2\u0112\u0113\7\4\2\2\u0113\u0117\3\2\2\2\u0114\u0115\7\36\2\2\u0115"+
		"\u0117\5$\23\3\u0116\u0109\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u010f\3\2"+
		"\2\2\u0116\u0110\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0120\3\2\2\2\u0118"+
		"\u0119\f\b\2\2\u0119\u011a\t\7\2\2\u011a\u011f\5$\23\t\u011b\u011c\f\7"+
		"\2\2\u011c\u011d\t\b\2\2\u011d\u011f\5$\23\b\u011e\u0118\3\2\2\2\u011e"+
		"\u011b\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121%\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\t\t\2\2\u0124\'\3"+
		"\2\2\2\u0125\u0126\7!\2\2\u0126\u0127\7\3\2\2\u0127\u0128\5$\23\2\u0128"+
		"\u0129\7\4\2\2\u0129\u012a\7\5\2\2\u012a\u012b\5\b\5\2\u012b\u0131\7\6"+
		"\2\2\u012c\u012d\7\"\2\2\u012d\u012e\7\5\2\2\u012e\u012f\5\b\5\2\u012f"+
		"\u0130\7\6\2\2\u0130\u0132\3\2\2\2\u0131\u012c\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132)\3\2\2\2\u0133\u0138\5,\27\2\u0134\u0138\5\60\31\2\u0135\u0138"+
		"\5.\30\2\u0136\u0138\5\62\32\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2"+
		"\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138+\3\2\2\2\u0139\u013a\7"+
		"#\2\2\u013a\u013b\7\3\2\2\u013b\u013c\5$\23\2\u013c\u013d\7\4\2\2\u013d"+
		"\u013e\7\5\2\2\u013e\u013f\5\b\5\2\u013f\u0140\7\6\2\2\u0140-\3\2\2\2"+
		"\u0141\u0142\7$\2\2\u0142\u0143\7\5\2\2\u0143\u0144\5\b\5\2\u0144\u0145"+
		"\7\6\2\2\u0145\u0146\7#\2\2\u0146\u0147\7\3\2\2\u0147\u0148\5$\23\2\u0148"+
		"\u0149\7\4\2\2\u0149\u014a\7\f\2\2\u014a/\3\2\2\2\u014b\u014c\7%\2\2\u014c"+
		"\u014d\7\3\2\2\u014d\u014e\5\n\6\2\u014e\u014f\5\24\13\2\u014f\u0150\7"+
		"\f\2\2\u0150\u0151\5$\23\2\u0151\u0152\7\f\2\2\u0152\u0153\5\24\13\2\u0153"+
		"\u0154\7\4\2\2\u0154\u0155\7\5\2\2\u0155\u0156\5\b\5\2\u0156\u0157\7\6"+
		"\2\2\u0157\61\3\2\2\2\u0158\u0159\7&\2\2\u0159\u015a\7\3\2\2\u015a\u015b"+
		"\5\n\6\2\u015b\u015c\7.\2\2\u015c\u015d\7\'\2\2\u015d\u015e\7.\2\2\u015e"+
		"\u015f\7\4\2\2\u015f\u0160\7\5\2\2\u0160\u0161\5\b\5\2\u0161\u0162\7\6"+
		"\2\2\u0162\63\3\2\2\2\u0163\u0164\7(\2\2\u0164\u0165\7\3\2\2\u0165\u0166"+
		"\7.\2\2\u0166\u0167\7\4\2\2\u0167\u0177\7\5\2\2\u0168\u016b\7)\2\2\u0169"+
		"\u016c\5\34\17\2\u016a\u016c\5 \21\2\u016b\u0169\3\2\2\2\u016b\u016a\3"+
		"\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7\'\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u0168\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0175\5\b\5\2\u0174\u0176\7*\2\2\u0175"+
		"\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u016f\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u0188\3\2\2\2\u017b\u017d\7+\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0182\5\b\5\2\u0181\u0183\7*\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0185\3\2\2\2\u0184\u017c\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0188\7\6\2\2\u0187\u0163\3\2\2\2\u0187\u0184\3\2"+
		"\2\2\u0188\65\3\2\2\2\u0189\u018a\58\35\2\u018a\u018b\7\f\2\2\u018b\67"+
		"\3\2\2\2\u018c\u018d\7.\2\2\u018d\u0196\7\3\2\2\u018e\u0193\5\22\n\2\u018f"+
		"\u0190\7\13\2\2\u0190\u0192\5\22\n\2\u0191\u018f\3\2\2\2\u0192\u0195\3"+
		"\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u018e\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u0199\7\4\2\2\u01999\3\2\2\2\u019a\u019b\5$\23\2\u019b\u019c"+
		"\7,\2\2\u019c\u019d\5\22\n\2\u019d\u019e\7\'\2\2\u019e\u019f\5\22\n\2"+
		"\u019f;\3\2\2\2\u01a0\u01a4\7-\2\2\u01a1\u01a5\5:\36\2\u01a2\u01a5\5\22"+
		"\n\2\u01a3\u01a5\58\35\2\u01a4\u01a1\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\f\2\2\u01a7=\3\2\2\2"+
		",AO[]amp{\u0083\u008e\u0095\u009e\u00a4\u00ae\u00b6\u00bb\u00bf\u00cd"+
		"\u00d6\u00e5\u00ed\u00ef\u00f5\u00fc\u0102\u0104\u0116\u011e\u0120\u0131"+
		"\u0137\u016b\u0171\u0175\u0179\u017e\u0182\u0184\u0187\u0193\u0196\u01a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}