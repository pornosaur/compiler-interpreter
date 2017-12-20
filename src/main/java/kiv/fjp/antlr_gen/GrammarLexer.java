// Generated from P:/skola/KIV-FJP\Grammar.g4 by ANTLR 4.7
package kiv.fjp.antlr_gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "ID", "CHARS", "NUMERIC", "ALPHABET_NUMERIC", "ALPHABET", 
		"SPECIAL_CHARS", "ESCAPE", "MULTIDIV", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u012f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\5-\u010f\n-\3-\3-\7-\u0113\n"+
		"-\f-\16-\u0116\13-\3.\3.\3/\3/\3\60\3\60\5\60\u011e\n\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\3\64\3\65\6\65\u012a\n\65\r\65\16\65\u012b\3"+
		"\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66\3\2\5\4\2C\\c|\4\2,,\61\61\5\2\13\f\17\17\"\"\2\u0133\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3"+
		"\2\2\2\tq\3\2\2\2\13s\3\2\2\2\rx\3\2\2\2\17\177\3\2\2\2\21\u0087\3\2\2"+
		"\2\23\u008c\3\2\2\2\25\u008e\3\2\2\2\27\u0090\3\2\2\2\31\u0092\3\2\2\2"+
		"\33\u0094\3\2\2\2\35\u009a\3\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a0"+
		"\3\2\2\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00a8\3\2\2\2"+
		"-\u00aa\3\2\2\2/\u00ad\3\2\2\2\61\u00b0\3\2\2\2\63\u00b3\3\2\2\2\65\u00b6"+
		"\3\2\2\2\67\u00b9\3\2\2\29\u00bc\3\2\2\2;\u00be\3\2\2\2=\u00c3\3\2\2\2"+
		"?\u00c9\3\2\2\2A\u00cc\3\2\2\2C\u00d1\3\2\2\2E\u00d7\3\2\2\2G\u00da\3"+
		"\2\2\2I\u00de\3\2\2\2K\u00e6\3\2\2\2M\u00e8\3\2\2\2O\u00ef\3\2\2\2Q\u00f4"+
		"\3\2\2\2S\u00fa\3\2\2\2U\u0103\3\2\2\2W\u0105\3\2\2\2Y\u010e\3\2\2\2["+
		"\u0117\3\2\2\2]\u0119\3\2\2\2_\u011d\3\2\2\2a\u011f\3\2\2\2c\u0121\3\2"+
		"\2\2e\u0123\3\2\2\2g\u0126\3\2\2\2i\u0129\3\2\2\2kl\7*\2\2l\4\3\2\2\2"+
		"mn\7+\2\2n\6\3\2\2\2op\7}\2\2p\b\3\2\2\2qr\7\177\2\2r\n\3\2\2\2st\7x\2"+
		"\2tu\7q\2\2uv\7k\2\2vw\7f\2\2w\f\3\2\2\2xy\7u\2\2yz\7v\2\2z{\7t\2\2{|"+
		"\7k\2\2|}\7p\2\2}~\7i\2\2~\16\3\2\2\2\177\u0080\7k\2\2\u0080\u0081\7p"+
		"\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\u0084\7i\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7t\2\2\u0086\20\3\2\2\2\u0087\u0088\7d\2\2\u0088\u0089"+
		"\7q\2\2\u0089\u008a\7q\2\2\u008a\u008b\7n\2\2\u008b\22\3\2\2\2\u008c\u008d"+
		"\7.\2\2\u008d\24\3\2\2\2\u008e\u008f\7=\2\2\u008f\26\3\2\2\2\u0090\u0091"+
		"\7]\2\2\u0091\30\3\2\2\2\u0092\u0093\7_\2\2\u0093\32\3\2\2\2\u0094\u0095"+
		"\7e\2\2\u0095\u0096\7q\2\2\u0096\u0097\7p\2\2\u0097\u0098\7u\2\2\u0098"+
		"\u0099\7v\2\2\u0099\34\3\2\2\2\u009a\u009b\7?\2\2\u009b\36\3\2\2\2\u009c"+
		"\u009d\7,\2\2\u009d \3\2\2\2\u009e\u009f\7\61\2\2\u009f\"\3\2\2\2\u00a0"+
		"\u00a1\7-\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7/\2\2\u00a3&\3\2\2\2\u00a4\u00a5"+
		"\7\60\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7*\3\2\2\2\u00a8\u00a9"+
		"\7@\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\u00ac\7?\2\2\u00ac.\3"+
		"\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7?\2\2\u00af\60\3\2\2\2\u00b0\u00b1"+
		"\7@\2\2\u00b1\u00b2\7?\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4\u00b5"+
		"\7?\2\2\u00b5\64\3\2\2\2\u00b6\u00b7\7(\2\2\u00b7\u00b8\7(\2\2\u00b8\66"+
		"\3\2\2\2\u00b9\u00ba\7~\2\2\u00ba\u00bb\7~\2\2\u00bb8\3\2\2\2\u00bc\u00bd"+
		"\7#\2\2\u00bd:\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7w\2\2\u00c1\u00c2\7g\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5"+
		"\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		">\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7h\2\2\u00cb@\3\2\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"B\3\2\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7k\2\2\u00d4"+
		"\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6D\3\2\2\2\u00d7\u00d8\7f\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9F\3\2\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7t\2\2\u00ddH\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7e\2\2"+
		"\u00e4\u00e5\7j\2\2\u00e5J\3\2\2\2\u00e6\u00e7\7<\2\2\u00e7L\3\2\2\2\u00e8"+
		"\u00e9\7u\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7v\2\2"+
		"\u00ec\u00ed\7e\2\2\u00ed\u00ee\7j\2\2\u00eeN\3\2\2\2\u00ef\u00f0\7e\2"+
		"\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7g\2\2\u00f3P\3\2"+
		"\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8"+
		"\7c\2\2\u00f8\u00f9\7m\2\2\u00f9R\3\2\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7w\2\2\u00ff"+
		"\u0100\7n\2\2\u0100\u0101\7v\2\2\u0101\u0102\7<\2\2\u0102T\3\2\2\2\u0103"+
		"\u0104\7A\2\2\u0104V\3\2\2\2\u0105\u0106\7t\2\2\u0106\u0107\7g\2\2\u0107"+
		"\u0108\7v\2\2\u0108\u0109\7w\2\2\u0109\u010a\7t\2\2\u010a\u010b\7p\2\2"+
		"\u010bX\3\2\2\2\u010c\u010f\5a\61\2\u010d\u010f\5[.\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010d\3\2\2\2\u010f\u0114\3\2\2\2\u0110\u0113\5_\60\2\u0111"+
		"\u0113\5[.\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2"+
		"\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115Z\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0117\u0118\7a\2\2\u0118\\\3\2\2\2\u0119\u011a\4\62;\2\u011a"+
		"^\3\2\2\2\u011b\u011e\5a\61\2\u011c\u011e\5]/\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011c\3\2\2\2\u011e`\3\2\2\2\u011f\u0120\t\2\2\2\u0120b\3\2\2\2\u0121"+
		"\u0122\7$\2\2\u0122d\3\2\2\2\u0123\u0124\7\61\2\2\u0124\u0125\5c\62\2"+
		"\u0125f\3\2\2\2\u0126\u0127\t\3\2\2\u0127h\3\2\2\2\u0128\u012a\t\4\2\2"+
		"\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b\65\2\2\u012ej\3\2\2\2\b\2\u010e"+
		"\u0112\u0114\u011d\u012b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}