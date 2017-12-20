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
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(88);
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
						loop();
						}
						break;
					case 7:
						{
						setState(85);
						statement();
						}
						break;
					case 8:
						{
						setState(86);
						s_switch();
						}
						break;
					case 9:
						{
						setState(87);
						call_fnc();
						}
						break;
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(93);
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
			setState(96);
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(98);
				data_type();
				setState(99);
				match(ID);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(100);
					match(T__8);
					setState(101);
					data_type();
					setState(102);
					match(ID);
					}
					}
					setState(108);
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DeclarIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				data_type();
				setState(112);
				match(ID);
				setState(113);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new DeclarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				data_type();
				setState(116);
				match(ID);
				setState(117);
				match(T__10);
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERIC:
					{
					setState(118);
					integer();
					}
					break;
				case ID:
					{
					setState(119);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122);
				match(T__11);
				setState(123);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new DeclarDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				data_type();
				setState(126);
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
			setState(130);
			match(T__12);
			setState(131);
			data_type();
			setState(132);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(134);
				match(ID);
				}
				break;
			case 2:
				{
				setState(135);
				num_exp(0);
				}
				break;
			case 3:
				{
				setState(136);
				str_def();
				}
				break;
			case 4:
				{
				setState(137);
				bool_exp(0);
				}
				break;
			case 5:
				{
				setState(138);
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
			setState(141);
			match(ID);
			setState(142);
			match(T__13);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(143);
				func();
				}
				break;
			case 2:
				{
				setState(144);
				ternar_oper();
				}
				break;
			case 3:
				{
				setState(145);
				value();
				}
				break;
			}
			setState(148);
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
			setState(150);
			match(ID);
			setState(153); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(151);
					match(T__13);
					setState(152);
					match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(157);
			match(T__13);
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(158);
				func();
				}
				break;
			case 2:
				{
				setState(159);
				value();
				}
				break;
			case 3:
				{
				setState(160);
				ternar_oper();
				}
				break;
			}
			setState(163);
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
			setState(165);
			match(T__2);
			setState(166);
			match(ID);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(167);
				match(T__8);
				setState(168);
				match(ID);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(T__3);
			setState(175);
			match(T__13);
			setState(176);
			match(T__2);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(177);
				func();
				}
				break;
			case 2:
				{
				setState(178);
				value();
				}
				break;
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(181);
				match(T__8);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(182);
					func();
					}
					break;
				case 2:
					{
					setState(183);
					value();
					}
					break;
				}
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(T__3);
			setState(192);
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
			setState(194);
			match(ID);
			setState(195);
			match(T__10);
			setState(196);
			value();
			setState(197);
			match(T__11);
			setState(198);
			match(T__13);
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(199);
				func();
				}
				break;
			case 2:
				{
				setState(200);
				ternar_oper();
				}
				break;
			case 3:
				{
				setState(201);
				value();
				}
				break;
			}
			setState(204);
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new IntegersContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(207);
				integer();
				}
				break;
			case 2:
				{
				_localctx = new RealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				integer();
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(209);
					match(T__18);
					setState(210);
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
				setState(213);
				func();
				}
				break;
			case 4:
				{
				_localctx = new NumArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(ID);
				setState(215);
				match(T__10);
				setState(216);
				num_exp(0);
				setState(217);
				match(T__11);
				}
				break;
			case 5:
				{
				_localctx = new NumIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new NumBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(T__0);
				setState(221);
				num_exp(0);
				setState(222);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new SignedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
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
				setState(225);
				num_exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MultiDivContext(new Num_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_exp);
						setState(228);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(229);
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
						setState(230);
						num_exp(10);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new Num_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_exp);
						setState(231);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(232);
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
						setState(233);
						num_exp(9);
						}
						break;
					}
					} 
				}
				setState(238);
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
			setState(240); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(239);
					match(NUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(242); 
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
			setState(244);
			str();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(245);
				match(T__16);
				setState(246);
				str();
				}
				}
				setState(251);
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
			setState(252);
			match(SPECIAL_CHARS);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << CHARS) | (1L << NUMERIC) | (1L << ALPHABET_NUMERIC) | (1L << ALPHABET) | (1L << ESCAPE) | (1L << MULTIDIV) | (1L << WS))) != 0)) {
				{
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(253);
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
					setState(254);
					match(ESCAPE);
					}
					break;
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new BoolNumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(263);
				num_exp(0);
				setState(264);
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
				setState(265);
				num_exp(0);
				}
				break;
			case 2:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				bool();
				}
				break;
			case 3:
				{
				_localctx = new BoolIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new BoolBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(T__0);
				setState(270);
				bool_exp(0);
				setState(271);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new BoolNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(T__27);
				setState(274);
				bool_exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new BoolCompareContext(new Bool_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_exp);
						setState(277);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(278);
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
						setState(279);
						bool_exp(7);
						}
						break;
					case 2:
						{
						_localctx = new BoolExpContext(new Bool_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_exp);
						setState(280);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(281);
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
						setState(282);
						bool_exp(6);
						}
						break;
					}
					} 
				}
				setState(287);
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
			setState(288);
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
			setState(290);
			match(T__30);
			setState(291);
			match(T__0);
			setState(292);
			bool_exp(0);
			setState(293);
			match(T__1);
			setState(294);
			match(T__2);
			setState(295);
			block();
			setState(296);
			match(T__3);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(297);
				match(T__31);
				setState(298);
				match(T__2);
				setState(299);
				block();
				setState(300);
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
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				loop_while();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				loop_for();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				do_while();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
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
			setState(310);
			match(T__32);
			setState(311);
			match(T__0);
			setState(312);
			bool_exp(0);
			setState(313);
			match(T__1);
			setState(314);
			match(T__2);
			setState(315);
			block();
			setState(316);
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
			setState(318);
			match(T__33);
			setState(319);
			match(T__2);
			setState(320);
			block();
			setState(321);
			match(T__3);
			setState(322);
			match(T__32);
			setState(323);
			match(T__0);
			setState(324);
			bool_exp(0);
			setState(325);
			match(T__1);
			setState(326);
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
			setState(328);
			match(T__34);
			setState(329);
			match(T__0);
			setState(330);
			data_type();
			setState(331);
			def();
			setState(332);
			match(T__9);
			setState(333);
			bool_exp(0);
			setState(334);
			match(T__9);
			setState(335);
			def();
			setState(336);
			match(T__1);
			setState(337);
			match(T__2);
			setState(338);
			block();
			setState(339);
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
			setState(341);
			match(T__35);
			setState(342);
			match(T__0);
			setState(343);
			data_type();
			setState(344);
			match(ID);
			setState(345);
			match(T__36);
			setState(346);
			match(ID);
			setState(347);
			match(T__1);
			setState(348);
			match(T__2);
			setState(349);
			block();
			setState(350);
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
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__37);
				setState(353);
				match(T__0);
				setState(354);
				match(ID);
				setState(355);
				match(T__1);
				setState(356);
				match(T__2);
				setState(372); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(364); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(357);
								match(T__38);
								setState(360);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case T__0:
								case T__16:
								case T__17:
								case ID:
								case NUMERIC:
									{
									setState(358);
									num_exp(0);
									}
									break;
								case SPECIAL_CHARS:
									{
									setState(359);
									str_def();
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(362);
								match(T__36);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(366); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(368);
						block();
						setState(370);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(369);
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
					setState(374); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__3:
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(377); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(376);
							match(T__40);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(379); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(381);
					block();
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__39) {
						{
						setState(382);
						match(T__39);
						}
					}

					}
				}

				setState(387);
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
			setState(390);
			func();
			setState(391);
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
			setState(393);
			match(ID);
			setState(394);
			match(T__0);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__17) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << NUMERIC) | (1L << SPECIAL_CHARS))) != 0)) {
				{
				setState(395);
				value();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(396);
					match(T__8);
					setState(397);
					value();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(405);
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
			setState(407);
			bool_exp(0);
			setState(408);
			match(T__41);
			setState(409);
			value();
			setState(410);
			match(T__36);
			setState(411);
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
			setState(413);
			match(T__42);
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(414);
				ternar_oper();
				}
				break;
			case 2:
				{
				setState(415);
				value();
				}
				break;
			case 3:
				{
				setState(416);
				func();
				}
				break;
			}
			setState(419);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u01a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4P\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\5\5"+
		"a\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\5\7p\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b{\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0083\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0095\n\13\3\13\3\13\3\f\3\f\3\f\6\f\u009c\n"+
		"\f\r\f\16\f\u009d\3\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r"+
		"\3\r\3\r\3\r\5\r\u00bb\n\r\7\r\u00bd\n\r\f\r\16\r\u00c0\13\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00cd\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00d6\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e5\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00ed\n\17\f\17\16\17\u00f0\13\17\3\20\6\20\u00f3\n\20"+
		"\r\20\16\20\u00f4\3\21\3\21\3\21\7\21\u00fa\n\21\f\21\16\21\u00fd\13\21"+
		"\3\22\3\22\3\22\7\22\u0102\n\22\f\22\16\22\u0105\13\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0116"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u011e\n\23\f\23\16\23\u0121\13"+
		"\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u0131\n\25\3\26\3\26\3\26\3\26\5\26\u0137\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u016b\n\33\3\33\3\33\6\33\u016f\n\33\r"+
		"\33\16\33\u0170\3\33\3\33\5\33\u0175\n\33\6\33\u0177\n\33\r\33\16\33\u0178"+
		"\3\33\6\33\u017c\n\33\r\33\16\33\u017d\3\33\3\33\5\33\u0182\n\33\5\33"+
		"\u0184\n\33\3\33\5\33\u0187\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\7\35\u0191\n\35\f\35\16\35\u0194\13\35\5\35\u0196\n\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u01a4\n\37\3\37"+
		"\3\37\3\37\2\4\34$ \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<\2\n\3\2\b\n\3\2\23\24\3\2\21\22\3\2\63\63\3\2\26\33\4\2\30"+
		"\30\33\33\3\2\34\35\3\2\37 \2\u01cc\2A\3\2\2\2\4D\3\2\2\2\6O\3\2\2\2\b"+
		"\\\3\2\2\2\nb\3\2\2\2\fo\3\2\2\2\16\u0082\3\2\2\2\20\u0084\3\2\2\2\22"+
		"\u008d\3\2\2\2\24\u008f\3\2\2\2\26\u0098\3\2\2\2\30\u00a7\3\2\2\2\32\u00c4"+
		"\3\2\2\2\34\u00e4\3\2\2\2\36\u00f2\3\2\2\2 \u00f6\3\2\2\2\"\u00fe\3\2"+
		"\2\2$\u0115\3\2\2\2&\u0122\3\2\2\2(\u0124\3\2\2\2*\u0136\3\2\2\2,\u0138"+
		"\3\2\2\2.\u0140\3\2\2\2\60\u014a\3\2\2\2\62\u0157\3\2\2\2\64\u0186\3\2"+
		"\2\2\66\u0188\3\2\2\28\u018b\3\2\2\2:\u0199\3\2\2\2<\u019f\3\2\2\2>@\5"+
		"\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CA\3\2\2\2DE"+
		"\5\6\4\2EF\7.\2\2FG\7\3\2\2GH\5\f\7\2HI\7\4\2\2IJ\7\5\2\2JK\5\b\5\2KL"+
		"\7\6\2\2L\5\3\2\2\2MP\5\n\6\2NP\7\7\2\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2"+
		"Q[\5\16\b\2R[\5\20\t\2S[\5\24\13\2T[\5\26\f\2U[\5\30\r\2V[\5*\26\2W[\5"+
		"(\25\2X[\5\64\33\2Y[\5\66\34\2ZQ\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2"+
		"ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_a\5<\37\2`_\3\2\2\2`a\3\2\2\2a\t\3"+
		"\2\2\2bc\t\2\2\2c\13\3\2\2\2de\5\n\6\2el\7.\2\2fg\7\13\2\2gh\5\n\6\2h"+
		"i\7.\2\2ik\3\2\2\2jf\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2n"+
		"l\3\2\2\2od\3\2\2\2op\3\2\2\2p\r\3\2\2\2qr\5\n\6\2rs\7.\2\2st\7\f\2\2"+
		"t\u0083\3\2\2\2uv\5\n\6\2vw\7.\2\2wz\7\r\2\2x{\5\36\20\2y{\7.\2\2zx\3"+
		"\2\2\2zy\3\2\2\2{|\3\2\2\2|}\7\16\2\2}~\7\f\2\2~\u0083\3\2\2\2\177\u0080"+
		"\5\n\6\2\u0080\u0081\5\24\13\2\u0081\u0083\3\2\2\2\u0082q\3\2\2\2\u0082"+
		"u\3\2\2\2\u0082\177\3\2\2\2\u0083\17\3\2\2\2\u0084\u0085\7\17\2\2\u0085"+
		"\u0086\5\n\6\2\u0086\u0087\5\24\13\2\u0087\21\3\2\2\2\u0088\u008e\7.\2"+
		"\2\u0089\u008e\5\34\17\2\u008a\u008e\5 \21\2\u008b\u008e\5$\23\2\u008c"+
		"\u008e\5\32\16\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\23\3\2\2\2\u008f"+
		"\u0090\7.\2\2\u0090\u0094\7\20\2\2\u0091\u0095\58\35\2\u0092\u0095\5:"+
		"\36\2\u0093\u0095\5\22\n\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\f\2\2\u0097\25\3\2\2"+
		"\2\u0098\u009b\7.\2\2\u0099\u009a\7\20\2\2\u009a\u009c\7.\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a3\7\20\2\2\u00a0\u00a4\58\35\2\u00a1\u00a4\5"+
		"\22\n\2\u00a2\u00a4\5:\36\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\27\3\2\2"+
		"\2\u00a7\u00a8\7\5\2\2\u00a8\u00ad\7.\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ac"+
		"\7.\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\6"+
		"\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00b5\7\5\2\2\u00b3\u00b6\58\35\2\u00b4"+
		"\u00b6\5\22\n\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00be\3"+
		"\2\2\2\u00b7\u00ba\7\13\2\2\u00b8\u00bb\58\35\2\u00b9\u00bb\5\22\n\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b7\3\2"+
		"\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3\7\f"+
		"\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7.\2\2\u00c5\u00c6\7\r\2\2\u00c6\u00c7"+
		"\5\22\n\2\u00c7\u00c8\7\16\2\2\u00c8\u00cc\7\20\2\2\u00c9\u00cd\58\35"+
		"\2\u00ca\u00cd\5:\36\2\u00cb\u00cd\5\22\n\2\u00cc\u00c9\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\f"+
		"\2\2\u00cf\33\3\2\2\2\u00d0\u00d1\b\17\1\2\u00d1\u00e5\5\36\20\2\u00d2"+
		"\u00d5\5\36\20\2\u00d3\u00d4\7\25\2\2\u00d4\u00d6\5\36\20\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00e5\3\2\2\2\u00d7\u00e5\58\35\2\u00d8"+
		"\u00d9\7.\2\2\u00d9\u00da\7\r\2\2\u00da\u00db\5\34\17\2\u00db\u00dc\7"+
		"\16\2\2\u00dc\u00e5\3\2\2\2\u00dd\u00e5\7.\2\2\u00de\u00df\7\3\2\2\u00df"+
		"\u00e0\5\34\17\2\u00e0\u00e1\7\4\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e3\t"+
		"\3\2\2\u00e3\u00e5\5\34\17\3\u00e4\u00d0\3\2\2\2\u00e4\u00d2\3\2\2\2\u00e4"+
		"\u00d7\3\2\2\2\u00e4\u00d8\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00de\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00ee\3\2\2\2\u00e6\u00e7\f\13\2\2\u00e7"+
		"\u00e8\t\4\2\2\u00e8\u00ed\5\34\17\f\u00e9\u00ea\f\n\2\2\u00ea\u00eb\t"+
		"\3\2\2\u00eb\u00ed\5\34\17\13\u00ec\u00e6\3\2\2\2\u00ec\u00e9\3\2\2\2"+
		"\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\35"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\7\60\2\2\u00f2\u00f1\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\37"+
		"\3\2\2\2\u00f6\u00fb\5\"\22\2\u00f7\u00f8\7\23\2\2\u00f8\u00fa\5\"\22"+
		"\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc!\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0103\7\63\2\2\u00ff"+
		"\u0102\n\5\2\2\u0100\u0102\7\64\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3"+
		"\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\63\2\2\u0107#\3\2\2\2"+
		"\u0108\u0109\b\23\1\2\u0109\u010a\5\34\17\2\u010a\u010b\t\6\2\2\u010b"+
		"\u010c\5\34\17\2\u010c\u0116\3\2\2\2\u010d\u0116\5&\24\2\u010e\u0116\7"+
		".\2\2\u010f\u0110\7\3\2\2\u0110\u0111\5$\23\2\u0111\u0112\7\4\2\2\u0112"+
		"\u0116\3\2\2\2\u0113\u0114\7\36\2\2\u0114\u0116\5$\23\3\u0115\u0108\3"+
		"\2\2\2\u0115\u010d\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u011f\3\2\2\2\u0117\u0118\f\b\2\2\u0118\u0119\t\7"+
		"\2\2\u0119\u011e\5$\23\t\u011a\u011b\f\7\2\2\u011b\u011c\t\b\2\2\u011c"+
		"\u011e\5$\23\b\u011d\u0117\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120%\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0123\t\t\2\2\u0123\'\3\2\2\2\u0124\u0125\7!\2\2\u0125"+
		"\u0126\7\3\2\2\u0126\u0127\5$\23\2\u0127\u0128\7\4\2\2\u0128\u0129\7\5"+
		"\2\2\u0129\u012a\5\b\5\2\u012a\u0130\7\6\2\2\u012b\u012c\7\"\2\2\u012c"+
		"\u012d\7\5\2\2\u012d\u012e\5\b\5\2\u012e\u012f\7\6\2\2\u012f\u0131\3\2"+
		"\2\2\u0130\u012b\3\2\2\2\u0130\u0131\3\2\2\2\u0131)\3\2\2\2\u0132\u0137"+
		"\5,\27\2\u0133\u0137\5\60\31\2\u0134\u0137\5.\30\2\u0135\u0137\5\62\32"+
		"\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137+\3\2\2\2\u0138\u0139\7#\2\2\u0139\u013a\7\3\2\2\u013a\u013b"+
		"\5$\23\2\u013b\u013c\7\4\2\2\u013c\u013d\7\5\2\2\u013d\u013e\5\b\5\2\u013e"+
		"\u013f\7\6\2\2\u013f-\3\2\2\2\u0140\u0141\7$\2\2\u0141\u0142\7\5\2\2\u0142"+
		"\u0143\5\b\5\2\u0143\u0144\7\6\2\2\u0144\u0145\7#\2\2\u0145\u0146\7\3"+
		"\2\2\u0146\u0147\5$\23\2\u0147\u0148\7\4\2\2\u0148\u0149\7\f\2\2\u0149"+
		"/\3\2\2\2\u014a\u014b\7%\2\2\u014b\u014c\7\3\2\2\u014c\u014d\5\n\6\2\u014d"+
		"\u014e\5\24\13\2\u014e\u014f\7\f\2\2\u014f\u0150\5$\23\2\u0150\u0151\7"+
		"\f\2\2\u0151\u0152\5\24\13\2\u0152\u0153\7\4\2\2\u0153\u0154\7\5\2\2\u0154"+
		"\u0155\5\b\5\2\u0155\u0156\7\6\2\2\u0156\61\3\2\2\2\u0157\u0158\7&\2\2"+
		"\u0158\u0159\7\3\2\2\u0159\u015a\5\n\6\2\u015a\u015b\7.\2\2\u015b\u015c"+
		"\7\'\2\2\u015c\u015d\7.\2\2\u015d\u015e\7\4\2\2\u015e\u015f\7\5\2\2\u015f"+
		"\u0160\5\b\5\2\u0160\u0161\7\6\2\2\u0161\63\3\2\2\2\u0162\u0163\7(\2\2"+
		"\u0163\u0164\7\3\2\2\u0164\u0165\7.\2\2\u0165\u0166\7\4\2\2\u0166\u0176"+
		"\7\5\2\2\u0167\u016a\7)\2\2\u0168\u016b\5\34\17\2\u0169\u016b\5 \21\2"+
		"\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d"+
		"\7\'\2\2\u016d\u016f\3\2\2\2\u016e\u0167\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\5\b"+
		"\5\2\u0173\u0175\7*\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u016e\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u0187\3\2\2\2\u017a\u017c\7+\2\2\u017b"+
		"\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f\u0181\5\b\5\2\u0180\u0182\7*\2\2\u0181"+
		"\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u017b\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\7\6\2\2\u0186"+
		"\u0162\3\2\2\2\u0186\u0183\3\2\2\2\u0187\65\3\2\2\2\u0188\u0189\58\35"+
		"\2\u0189\u018a\7\f\2\2\u018a\67\3\2\2\2\u018b\u018c\7.\2\2\u018c\u0195"+
		"\7\3\2\2\u018d\u0192\5\22\n\2\u018e\u018f\7\13\2\2\u018f\u0191\5\22\n"+
		"\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u018d\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7\4\2\2\u01989\3\2\2\2"+
		"\u0199\u019a\5$\23\2\u019a\u019b\7,\2\2\u019b\u019c\5\22\n\2\u019c\u019d"+
		"\7\'\2\2\u019d\u019e\5\22\n\2\u019e;\3\2\2\2\u019f\u01a3\7-\2\2\u01a0"+
		"\u01a4\5:\36\2\u01a1\u01a4\5\22\n\2\u01a2\u01a4\58\35\2\u01a3\u01a0\3"+
		"\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\7\f\2\2\u01a6=\3\2\2\2,AOZ\\`loz\u0082\u008d\u0094\u009d\u00a3"+
		"\u00ad\u00b5\u00ba\u00be\u00cc\u00d5\u00e4\u00ec\u00ee\u00f4\u00fb\u0101"+
		"\u0103\u0115\u011d\u011f\u0130\u0136\u016a\u0170\u0174\u0178\u017d\u0181"+
		"\u0183\u0186\u0192\u0195\u01a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}