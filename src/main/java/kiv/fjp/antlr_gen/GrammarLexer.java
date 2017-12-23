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
		T__38=39, T__39=40, T__40=41, BREAK=42, ID=43, CHARS=44, NUMVAL=45, ALPHABET_NUMERIC=46, 
		ALPHABET=47, SPECIAL_CHARS=48, ESCAPE=49, MULTIDIV=50, WS=51;
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
		"BREAK", "ID", "CHARS", "NUMVAL", "ALPHABET_NUMERIC", "ALPHABET", "SPECIAL_CHARS", 
		"ESCAPE", "MULTIDIV", "WS", "NUMERIC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'void'", "';'", "'string'", "'integer'", 
		"'bool'", "','", "'['", "']'", "'const'", "'='", "'*'", "'/'", "'+'", 
		"'-'", "'<'", "'>'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'!'", 
		"'true'", "'false'", "'if'", "'else'", "'while'", "'do'", "'for'", "'foreach'", 
		"':'", "'switch'", "'case'", "'default:'", "'?'", "'return'", "'break;'", 
		null, "'_'", null, null, null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BREAK", "ID", "CHARS", "NUMVAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0133\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*"+
		"\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\5,\u010e\n,\3,\3,\7,\u0112\n,\f,\16"+
		",\u0115\13,\3-\3-\3.\6.\u011a\n.\r.\16.\u011b\3/\3/\5/\u0120\n/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\6\64\u012c\n\64\r\64\16\64"+
		"\u012d\3\64\3\64\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\2\3\2\6\4\2C\\c|\4\2,,\61\61\5\2\13\f\16\17\"\""+
		"\3\2\62;\2\u0137\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3k\3\2\2\2\5m"+
		"\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\rx\3\2\2\2\17z\3\2\2\2\21\u0081"+
		"\3\2\2\2\23\u0089\3\2\2\2\25\u008e\3\2\2\2\27\u0090\3\2\2\2\31\u0092\3"+
		"\2\2\2\33\u0094\3\2\2\2\35\u009a\3\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2"+
		"\2#\u00a0\3\2\2\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00a8"+
		"\3\2\2\2-\u00ab\3\2\2\2/\u00ae\3\2\2\2\61\u00b1\3\2\2\2\63\u00b4\3\2\2"+
		"\2\65\u00b7\3\2\2\2\67\u00ba\3\2\2\29\u00bc\3\2\2\2;\u00c1\3\2\2\2=\u00c7"+
		"\3\2\2\2?\u00ca\3\2\2\2A\u00cf\3\2\2\2C\u00d5\3\2\2\2E\u00d8\3\2\2\2G"+
		"\u00dc\3\2\2\2I\u00e4\3\2\2\2K\u00e6\3\2\2\2M\u00ed\3\2\2\2O\u00f2\3\2"+
		"\2\2Q\u00fb\3\2\2\2S\u00fd\3\2\2\2U\u0104\3\2\2\2W\u010d\3\2\2\2Y\u0116"+
		"\3\2\2\2[\u0119\3\2\2\2]\u011f\3\2\2\2_\u0121\3\2\2\2a\u0123\3\2\2\2c"+
		"\u0125\3\2\2\2e\u0128\3\2\2\2g\u012b\3\2\2\2i\u0131\3\2\2\2kl\7*\2\2l"+
		"\4\3\2\2\2mn\7+\2\2n\6\3\2\2\2op\7}\2\2p\b\3\2\2\2qr\7\177\2\2r\n\3\2"+
		"\2\2st\7x\2\2tu\7q\2\2uv\7k\2\2vw\7f\2\2w\f\3\2\2\2xy\7=\2\2y\16\3\2\2"+
		"\2z{\7u\2\2{|\7v\2\2|}\7t\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7i\2\2\u0080"+
		"\20\3\2\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7i\2\2\u0086\u0087\7g\2\2\u0087\u0088\7t\2\2"+
		"\u0088\22\3\2\2\2\u0089\u008a\7d\2\2\u008a\u008b\7q\2\2\u008b\u008c\7"+
		"q\2\2\u008c\u008d\7n\2\2\u008d\24\3\2\2\2\u008e\u008f\7.\2\2\u008f\26"+
		"\3\2\2\2\u0090\u0091\7]\2\2\u0091\30\3\2\2\2\u0092\u0093\7_\2\2\u0093"+
		"\32\3\2\2\2\u0094\u0095\7e\2\2\u0095\u0096\7q\2\2\u0096\u0097\7p\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7v\2\2\u0099\34\3\2\2\2\u009a\u009b\7?\2\2\u009b"+
		"\36\3\2\2\2\u009c\u009d\7,\2\2\u009d \3\2\2\2\u009e\u009f\7\61\2\2\u009f"+
		"\"\3\2\2\2\u00a0\u00a1\7-\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7/\2\2\u00a3"+
		"&\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7*"+
		"\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9\u00aa\7?\2\2\u00aa,\3\2\2\2\u00ab\u00ac"+
		"\7>\2\2\u00ac\u00ad\7?\2\2\u00ad.\3\2\2\2\u00ae\u00af\7@\2\2\u00af\u00b0"+
		"\7?\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7#\2\2\u00b2\u00b3\7?\2\2\u00b3\62"+
		"\3\2\2\2\u00b4\u00b5\7(\2\2\u00b5\u00b6\7(\2\2\u00b6\64\3\2\2\2\u00b7"+
		"\u00b8\7~\2\2\u00b8\u00b9\7~\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb"+
		"8\3\2\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7w\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7c\2\2\u00c3"+
		"\u00c4\7n\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7g\2\2\u00c6<\3\2\2\2\u00c7"+
		"\u00c8\7k\2\2\u00c8\u00c9\7h\2\2\u00c9>\3\2\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce@\3\2\2\2\u00cf"+
		"\u00d0\7y\2\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2"+
		"\u00d3\u00d4\7g\2\2\u00d4B\3\2\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7q\2"+
		"\2\u00d7D\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7"+
		"t\2\2\u00dbF\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7q\2\2\u00de\u00df"+
		"\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7e\2\2\u00e2"+
		"\u00e3\7j\2\2\u00e3H\3\2\2\2\u00e4\u00e5\7<\2\2\u00e5J\3\2\2\2\u00e6\u00e7"+
		"\7u\2\2\u00e7\u00e8\7y\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7e\2\2\u00eb\u00ec\7j\2\2\u00ecL\3\2\2\2\u00ed\u00ee\7e\2\2\u00ee"+
		"\u00ef\7c\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7g\2\2\u00f1N\3\2\2\2\u00f2"+
		"\u00f3\7f\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6\7c\2\2"+
		"\u00f6\u00f7\7w\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa"+
		"\7<\2\2\u00faP\3\2\2\2\u00fb\u00fc\7A\2\2\u00fcR\3\2\2\2\u00fd\u00fe\7"+
		"t\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7w\2\2\u0101\u0102"+
		"\7t\2\2\u0102\u0103\7p\2\2\u0103T\3\2\2\2\u0104\u0105\7d\2\2\u0105\u0106"+
		"\7t\2\2\u0106\u0107\7g\2\2\u0107\u0108\7c\2\2\u0108\u0109\7m\2\2\u0109"+
		"\u010a\7=\2\2\u010aV\3\2\2\2\u010b\u010e\5_\60\2\u010c\u010e\5Y-\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u0113\3\2\2\2\u010f\u0112\5]"+
		"/\2\u0110\u0112\5Y-\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114X\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\7a\2\2\u0117Z\3\2\2\2\u0118\u011a\5i\65\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\\\3\2\2\2\u011d\u0120\5_\60\2\u011e\u0120\5i\65\2\u011f\u011d"+
		"\3\2\2\2\u011f\u011e\3\2\2\2\u0120^\3\2\2\2\u0121\u0122\t\2\2\2\u0122"+
		"`\3\2\2\2\u0123\u0124\7$\2\2\u0124b\3\2\2\2\u0125\u0126\7\61\2\2\u0126"+
		"\u0127\5a\61\2\u0127d\3\2\2\2\u0128\u0129\t\3\2\2\u0129f\3\2\2\2\u012a"+
		"\u012c\t\4\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b\64\2\2\u0130"+
		"h\3\2\2\2\u0131\u0132\t\5\2\2\u0132j\3\2\2\2\t\2\u010d\u0111\u0113\u011b"+
		"\u011f\u012d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}