// Generated from org/batfish/grammar/routing_table/nxos/NxosRoutingTableLexer.g4 by ANTLR 4.7.1
package org.batfish.grammar.routing_table.nxos;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NxosRoutingTableLexer extends org.batfish.grammar.BatfishLexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, ATTACHED=2, BGP=3, DIRECT=4, ETH=5, EXTERNAL=6, INTER=7, INTERNAL=8, 
		INTRA=9, LO=10, LOCAL=11, NULL=12, OSPF=13, STATIC=14, TAG=15, TYPE_1=16, 
		TYPE_2=17, VIA=18, VRF_HEADER=19, ASTERISK=20, BRACKET_LEFT=21, BRACKET_RIGHT=22, 
		COLON=23, COMMA=24, COMMENT=25, DASH=26, DEC=27, DOUBLE_QUOTE=28, ELAPSED_TIME=29, 
		FORWARD_SLASH=30, IP_ADDRESS=31, IP_PREFIX=32, NEWLINE=33, UNICAST_MULTICAST_COUNT=34, 
		WS=35;
	public static final int
		M_DoubleQuote=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "M_DoubleQuote"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ATTACHED", "BGP", "DIRECT", "ETH", "EXTERNAL", "INTER", "INTERNAL", 
			"INTRA", "LO", "LOCAL", "NULL", "OSPF", "STATIC", "TAG", "TYPE_1", "TYPE_2", 
			"VIA", "VRF_HEADER", "ASTERISK", "BRACKET_LEFT", "BRACKET_RIGHT", "COLON", 
			"COMMA", "COMMENT", "DASH", "DEC", "DOUBLE_QUOTE", "ELAPSED_TIME", "FORWARD_SLASH", 
			"IP_ADDRESS", "IP_PREFIX", "NEWLINE", "UNICAST_MULTICAST_COUNT", "WS", 
			"F_Byte", "F_Digit", "F_IpAddress", "F_Newline", "F_NonNewline", "F_Whitespace", 
			"M_DoubleQuote_ID", "M_DoubleQuote_DOUBLE_QUOTE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'attached'", "'bgp'", "'direct'", "'Eth'", "'external'", 
			"'inter'", "'internal'", "'intra'", "'Lo'", "'local'", "'Null'", "'ospf'", 
			"'static'", "'tag'", "'type-1'", "'type-2'", "'via'", "'IP Route Table for VRF'", 
			"'*'", "'['", "']'", "':'", "','", null, "'-'", null, null, null, "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "ATTACHED", "BGP", "DIRECT", "ETH", "EXTERNAL", "INTER", 
			"INTERNAL", "INTRA", "LO", "LOCAL", "NULL", "OSPF", "STATIC", "TAG", 
			"TYPE_1", "TYPE_2", "VIA", "VRF_HEADER", "ASTERISK", "BRACKET_LEFT", 
			"BRACKET_RIGHT", "COLON", "COMMA", "COMMENT", "DASH", "DEC", "DOUBLE_QUOTE", 
			"ELAPSED_TIME", "FORWARD_SLASH", "IP_ADDRESS", "IP_PREFIX", "NEWLINE", 
			"UNICAST_MULTICAST_COUNT", "WS"
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



	public NxosRoutingTableLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NxosRoutingTableLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0163\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\6\31\u00e2"+
		"\n\31\r\31\16\31\u00e3\3\31\3\31\3\31\3\31\3\32\3\32\3\33\6\33\u00ed\n"+
		"\33\r\33\16\33\u00ee\3\34\3\34\3\34\3\34\3\35\6\35\u00f6\n\35\r\35\16"+
		"\35\u00f7\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0102\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u010f\n\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3 \3!\6!\u011a\n!\r!\16!\u011b\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u012d\n\"\r\"\16\""+
		"\u012e\3\"\3\"\6\"\u0133\n\"\r\"\16\"\u0134\3#\6#\u0138\n#\r#\16#\u0139"+
		"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0146\n$\3%\3%\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3*\6*\u0159\n*\r*\16*\u015a\3*\3*\3+\3+\3+\3+"+
		"\3+\2\2,\4\4\6\5\b\6\n\7\f\b\16\t\20\n\22\13\24\f\26\r\30\16\32\17\34"+
		"\20\36\21 \22\"\23$\24&\25(\26*\27,\30.\31\60\32\62\33\64\34\66\358\36"+
		":\37< >!@\"B#D$F%H\2J\2L\2N\2P\2R\2T\2V\2\4\2\3\6\3\2\62;\4\2\f\f\17\17"+
		"\4\2\13\13\"\"\3\2$$\2\u0168\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3"+
		"\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2"+
		"\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3"+
		"\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2"+
		"\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\2"+
		"8\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3"+
		"\2\2\2\2F\3\2\2\2\3T\3\2\2\2\3V\3\2\2\2\4X\3\2\2\2\6a\3\2\2\2\be\3\2\2"+
		"\2\nl\3\2\2\2\fp\3\2\2\2\16y\3\2\2\2\20\177\3\2\2\2\22\u0088\3\2\2\2\24"+
		"\u008e\3\2\2\2\26\u0091\3\2\2\2\30\u0097\3\2\2\2\32\u009c\3\2\2\2\34\u00a1"+
		"\3\2\2\2\36\u00a8\3\2\2\2 \u00ac\3\2\2\2\"\u00b3\3\2\2\2$\u00ba\3\2\2"+
		"\2&\u00be\3\2\2\2(\u00d5\3\2\2\2*\u00d7\3\2\2\2,\u00d9\3\2\2\2.\u00db"+
		"\3\2\2\2\60\u00dd\3\2\2\2\62\u00df\3\2\2\2\64\u00e9\3\2\2\2\66\u00ec\3"+
		"\2\2\28\u00f0\3\2\2\2:\u010e\3\2\2\2<\u0110\3\2\2\2>\u0112\3\2\2\2@\u0114"+
		"\3\2\2\2B\u0119\3\2\2\2D\u011d\3\2\2\2F\u0137\3\2\2\2H\u0145\3\2\2\2J"+
		"\u0147\3\2\2\2L\u0149\3\2\2\2N\u0151\3\2\2\2P\u0153\3\2\2\2R\u0155\3\2"+
		"\2\2T\u0158\3\2\2\2V\u015e\3\2\2\2XY\7c\2\2YZ\7v\2\2Z[\7v\2\2[\\\7c\2"+
		"\2\\]\7e\2\2]^\7j\2\2^_\7g\2\2_`\7f\2\2`\5\3\2\2\2ab\7d\2\2bc\7i\2\2c"+
		"d\7r\2\2d\7\3\2\2\2ef\7f\2\2fg\7k\2\2gh\7t\2\2hi\7g\2\2ij\7e\2\2jk\7v"+
		"\2\2k\t\3\2\2\2lm\7G\2\2mn\7v\2\2no\7j\2\2o\13\3\2\2\2pq\7g\2\2qr\7z\2"+
		"\2rs\7v\2\2st\7g\2\2tu\7t\2\2uv\7p\2\2vw\7c\2\2wx\7n\2\2x\r\3\2\2\2yz"+
		"\7k\2\2z{\7p\2\2{|\7v\2\2|}\7g\2\2}~\7t\2\2~\17\3\2\2\2\177\u0080\7k\2"+
		"\2\u0080\u0081\7p\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\u0084"+
		"\7t\2\2\u0084\u0085\7p\2\2\u0085\u0086\7c\2\2\u0086\u0087\7n\2\2\u0087"+
		"\21\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a\u008b\7v\2\2\u008b"+
		"\u008c\7t\2\2\u008c\u008d\7c\2\2\u008d\23\3\2\2\2\u008e\u008f\7N\2\2\u008f"+
		"\u0090\7q\2\2\u0090\25\3\2\2\2\u0091\u0092\7n\2\2\u0092\u0093\7q\2\2\u0093"+
		"\u0094\7e\2\2\u0094\u0095\7c\2\2\u0095\u0096\7n\2\2\u0096\27\3\2\2\2\u0097"+
		"\u0098\7P\2\2\u0098\u0099\7w\2\2\u0099\u009a\7n\2\2\u009a\u009b\7n\2\2"+
		"\u009b\31\3\2\2\2\u009c\u009d\7q\2\2\u009d\u009e\7u\2\2\u009e\u009f\7"+
		"r\2\2\u009f\u00a0\7h\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3"+
		"\7v\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7e\2\2\u00a7\35\3\2\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7c\2\2\u00aa"+
		"\u00ab\7i\2\2\u00ab\37\3\2\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7{\2\2\u00ae"+
		"\u00af\7r\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\7\63\2"+
		"\2\u00b2!\3\2\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7{\2\2\u00b5\u00b6\7"+
		"r\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7/\2\2\u00b8\u00b9\7\64\2\2\u00b9"+
		"#\3\2\2\2\u00ba\u00bb\7x\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7c\2\2\u00bd"+
		"%\3\2\2\2\u00be\u00bf\7K\2\2\u00bf\u00c0\7R\2\2\u00c0\u00c1\7\"\2\2\u00c1"+
		"\u00c2\7T\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7v\2\2"+
		"\u00c5\u00c6\7g\2\2\u00c6\u00c7\7\"\2\2\u00c7\u00c8\7V\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\u00cd\7\"\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7t\2"+
		"\2\u00d0\u00d1\7\"\2\2\u00d1\u00d2\7X\2\2\u00d2\u00d3\7T\2\2\u00d3\u00d4"+
		"\7H\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6)\3\2\2\2\u00d7\u00d8"+
		"\7]\2\2\u00d8+\3\2\2\2\u00d9\u00da\7_\2\2\u00da-\3\2\2\2\u00db\u00dc\7"+
		"<\2\2\u00dc/\3\2\2\2\u00dd\u00de\7.\2\2\u00de\61\3\2\2\2\u00df\u00e1\7"+
		")\2\2\u00e0\u00e2\5P(\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5N"+
		"\'\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\31\2\2\u00e8\63\3\2\2\2\u00e9\u00ea"+
		"\7/\2\2\u00ea\65\3\2\2\2\u00eb\u00ed\5J%\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\67\3\2\2\2\u00f0"+
		"\u00f1\7$\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\34\3\2\u00f39\3\2\2\2"+
		"\u00f4\u00f6\5J%\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7y\2\2\u00fa"+
		"\u00fb\5J%\2\u00fb\u00fc\7f\2\2\u00fc\u010f\3\2\2\2\u00fd\u00fe\5J%\2"+
		"\u00fe\u00ff\7f\2\2\u00ff\u0101\5J%\2\u0100\u0102\5J%\2\u0101\u0100\3"+
		"\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7j\2\2\u0104"+
		"\u010f\3\2\2\2\u0105\u0106\5J%\2\u0106\u0107\5J%\2\u0107\u0108\7<\2\2"+
		"\u0108\u0109\5J%\2\u0109\u010a\5J%\2\u010a\u010b\7<\2\2\u010b\u010c\5"+
		"J%\2\u010c\u010d\5J%\2\u010d\u010f\3\2\2\2\u010e\u00f5\3\2\2\2\u010e\u00fd"+
		"\3\2\2\2\u010e\u0105\3\2\2\2\u010f;\3\2\2\2\u0110\u0111\7\61\2\2\u0111"+
		"=\3\2\2\2\u0112\u0113\5L&\2\u0113?\3\2\2\2\u0114\u0115\5L&\2\u0115\u0116"+
		"\7\61\2\2\u0116\u0117\5H$\2\u0117A\3\2\2\2\u0118\u011a\5N\'\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"C\3\2\2\2\u011d\u011e\7w\2\2\u011e\u011f\7d\2\2\u011f\u0120\7g\2\2\u0120"+
		"\u0121\7u\2\2\u0121\u0122\7v\2\2\u0122\u0123\7\61\2\2\u0123\u0124\7o\2"+
		"\2\u0124\u0125\7d\2\2\u0125\u0126\7g\2\2\u0126\u0127\7u\2\2\u0127\u0128"+
		"\7v\2\2\u0128\u0129\7<\2\2\u0129\u012a\7\"\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u012d\5J%\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2"+
		"\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\7\61\2\2\u0131"+
		"\u0133\5J%\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2"+
		"\2\u0134\u0135\3\2\2\2\u0135E\3\2\2\2\u0136\u0138\5R)\2\u0137\u0136\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\b#\2\2\u013cG\3\2\2\2\u013d\u013e\5J%\2\u013e"+
		"\u013f\5J%\2\u013f\u0140\5J%\2\u0140\u0146\3\2\2\2\u0141\u0142\5J%\2\u0142"+
		"\u0143\5J%\2\u0143\u0146\3\2\2\2\u0144\u0146\5J%\2\u0145\u013d\3\2\2\2"+
		"\u0145\u0141\3\2\2\2\u0145\u0144\3\2\2\2\u0146I\3\2\2\2\u0147\u0148\t"+
		"\2\2\2\u0148K\3\2\2\2\u0149\u014a\5H$\2\u014a\u014b\7\60\2\2\u014b\u014c"+
		"\5H$\2\u014c\u014d\7\60\2\2\u014d\u014e\5H$\2\u014e\u014f\7\60\2\2\u014f"+
		"\u0150\5H$\2\u0150M\3\2\2\2\u0151\u0152\t\3\2\2\u0152O\3\2\2\2\u0153\u0154"+
		"\n\3\2\2\u0154Q\3\2\2\2\u0155\u0156\t\4\2\2\u0156S\3\2\2\2\u0157\u0159"+
		"\n\5\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b*\4\2\u015dU\3\2\2\2\u015e"+
		"\u015f\7$\2\2\u015f\u0160\3\2\2\2\u0160\u0161\b+\5\2\u0161\u0162\b+\6"+
		"\2\u0162W\3\2\2\2\17\2\3\u00e3\u00ee\u00f7\u0101\u010e\u011b\u012e\u0134"+
		"\u0139\u0145\u015a\7\2\3\2\7\3\2\t\3\2\t\36\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}