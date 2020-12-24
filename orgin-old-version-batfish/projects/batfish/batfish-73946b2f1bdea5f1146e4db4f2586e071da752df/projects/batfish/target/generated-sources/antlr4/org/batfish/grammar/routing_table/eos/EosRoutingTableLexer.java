// Generated from org/batfish/grammar/routing_table/eos/EosRoutingTableLexer.g4 by ANTLR 4.7.1
package org.batfish.grammar.routing_table.eos;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EosRoutingTableLexer extends org.batfish.grammar.BatfishLexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CODES=1, GATEWAY=2, IS_DIRECTLY_CONNECTED=3, NAME=4, VIA=5, VRF=6, BRACKET_LEFT=7, 
		BRACKET_RIGHT=8, COLON=9, COMMA=10, COMMENT=11, DASH=12, DEC=13, FORWARD_SLASH=14, 
		IP_ADDRESS=15, IP_PREFIX=16, NEWLINE=17, WORD=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CODES", "GATEWAY", "IS_DIRECTLY_CONNECTED", "NAME", "VIA", "VRF", "BRACKET_LEFT", 
			"BRACKET_RIGHT", "COLON", "COMMA", "COMMENT", "DASH", "DEC", "FORWARD_SLASH", 
			"IP_ADDRESS", "IP_PREFIX", "NEWLINE", "WORD", "WS", "F_Byte", "F_Digit", 
			"F_IpAddress", "F_Newline", "F_NonNewline", "F_Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Codes'", "'Gateway'", "'is directly connected'", "'name'", "'via'", 
			"'VRF'", "'['", "']'", "':'", "','", null, "'-'", null, "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CODES", "GATEWAY", "IS_DIRECTLY_CONNECTED", "NAME", "VIA", "VRF", 
			"BRACKET_LEFT", "BRACKET_RIGHT", "COLON", "COMMA", "COMMENT", "DASH", 
			"DEC", "FORWARD_SLASH", "IP_ADDRESS", "IP_PREFIX", "NEWLINE", "WORD", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	private int lastTokenType = -1;

	@Override
	public void emit(Token token) {
	    super.emit(token);
	    if (token.getChannel() != HIDDEN) {
	       lastTokenType = token.getType();
	    }
	}

	public String printStateVariables() {
	   StringBuilder sb = new StringBuilder();
	   return sb.toString();
	}



	public EosRoutingTableLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EosRoutingTableLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\6\fq\n\f\r\f\16\fr\3\f\6"+
		"\fv\n\f\r\f\16\fw\3\f\3\f\3\r\3\r\3\16\6\16\177\n\16\r\16\16\16\u0080"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\6\22\u008c\n\22\r\22\16"+
		"\22\u008d\3\23\6\23\u0091\n\23\r\23\16\23\u0092\3\24\6\24\u0096\n\24\r"+
		"\24\16\24\u0097\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00a4\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63\2"+
		"\3\2\6\5\2\62;C\\c|\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\2\u00b6\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\3\65\3\2\2\2\5;\3\2\2\2\7C\3\2\2\2\tY\3\2\2\2\13"+
		"^\3\2\2\2\rb\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27"+
		"n\3\2\2\2\31{\3\2\2\2\33~\3\2\2\2\35\u0082\3\2\2\2\37\u0084\3\2\2\2!\u0086"+
		"\3\2\2\2#\u008b\3\2\2\2%\u0090\3\2\2\2\'\u0095\3\2\2\2)\u00a3\3\2\2\2"+
		"+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00af\3\2\2\2\61\u00b1\3\2\2\2\63\u00b3"+
		"\3\2\2\2\65\66\7E\2\2\66\67\7q\2\2\678\7f\2\289\7g\2\29:\7u\2\2:\4\3\2"+
		"\2\2;<\7I\2\2<=\7c\2\2=>\7v\2\2>?\7g\2\2?@\7y\2\2@A\7c\2\2AB\7{\2\2B\6"+
		"\3\2\2\2CD\7k\2\2DE\7u\2\2EF\7\"\2\2FG\7f\2\2GH\7k\2\2HI\7t\2\2IJ\7g\2"+
		"\2JK\7e\2\2KL\7v\2\2LM\7n\2\2MN\7{\2\2NO\7\"\2\2OP\7e\2\2PQ\7q\2\2QR\7"+
		"p\2\2RS\7p\2\2ST\7g\2\2TU\7e\2\2UV\7v\2\2VW\7g\2\2WX\7f\2\2X\b\3\2\2\2"+
		"YZ\7p\2\2Z[\7c\2\2[\\\7o\2\2\\]\7g\2\2]\n\3\2\2\2^_\7x\2\2_`\7k\2\2`a"+
		"\7c\2\2a\f\3\2\2\2bc\7X\2\2cd\7T\2\2de\7H\2\2e\16\3\2\2\2fg\7]\2\2g\20"+
		"\3\2\2\2hi\7_\2\2i\22\3\2\2\2jk\7<\2\2k\24\3\2\2\2lm\7.\2\2m\26\3\2\2"+
		"\2np\7#\2\2oq\5\61\31\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2"+
		"\2\2tv\5/\30\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\f"+
		"\2\2z\30\3\2\2\2{|\7/\2\2|\32\3\2\2\2}\177\5+\26\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\34\3\2\2\2\u0082\u0083"+
		"\7\61\2\2\u0083\36\3\2\2\2\u0084\u0085\5-\27\2\u0085 \3\2\2\2\u0086\u0087"+
		"\5-\27\2\u0087\u0088\7\61\2\2\u0088\u0089\5)\25\2\u0089\"\3\2\2\2\u008a"+
		"\u008c\5/\30\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e$\3\2\2\2\u008f\u0091\t\2\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"&\3\2\2\2\u0094\u0096\5\63\32\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2"+
		"\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\b\24\2\2\u009a(\3\2\2\2\u009b\u009c\5+\26\2\u009c\u009d\5+\26\2\u009d"+
		"\u009e\5+\26\2\u009e\u00a4\3\2\2\2\u009f\u00a0\5+\26\2\u00a0\u00a1\5+"+
		"\26\2\u00a1\u00a4\3\2\2\2\u00a2\u00a4\5+\26\2\u00a3\u009b\3\2\2\2\u00a3"+
		"\u009f\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4*\3\2\2\2\u00a5\u00a6\t\3\2\2"+
		"\u00a6,\3\2\2\2\u00a7\u00a8\5)\25\2\u00a8\u00a9\7\60\2\2\u00a9\u00aa\5"+
		")\25\2\u00aa\u00ab\7\60\2\2\u00ab\u00ac\5)\25\2\u00ac\u00ad\7\60\2\2\u00ad"+
		"\u00ae\5)\25\2\u00ae.\3\2\2\2\u00af\u00b0\t\4\2\2\u00b0\60\3\2\2\2\u00b1"+
		"\u00b2\n\4\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\t\5\2\2\u00b4\64\3\2\2\2\n"+
		"\2rw\u0080\u008d\u0092\u0097\u00a3\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}