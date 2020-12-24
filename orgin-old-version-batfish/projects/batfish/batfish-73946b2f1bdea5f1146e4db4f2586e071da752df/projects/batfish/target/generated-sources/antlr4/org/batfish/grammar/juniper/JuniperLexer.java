// Generated from org/batfish/grammar/juniper/JuniperLexer.g4 by ANTLR 4.7.1
package org.batfish.grammar.juniper;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuniperLexer extends org.batfish.grammar.BatfishLexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLOSE_BRACE=1, CLOSE_BRACKET=2, CLOSE_PAREN=3, INACTIVE=4, LINE_COMMENT=5, 
		MULTILINE_COMMENT=6, OPEN_BRACE=7, OPEN_BRACKET=8, OPEN_PAREN=9, SEMICOLON=10, 
		WORD=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLOSE_BRACE", "CLOSE_BRACKET", "CLOSE_PAREN", "INACTIVE", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "OPEN_BRACE", "OPEN_BRACKET", "OPEN_PAREN", "SEMICOLON", 
			"WORD", "WS", "F_NewlineChar", "F_NonNewlineChar", "F_ParenString", "F_QuotedString", 
			"F_WhitespaceChar", "F_WordChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'}'", "']'", "')'", "'inactive:'", null, null, "'{'", "'['", "'('", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLOSE_BRACE", "CLOSE_BRACKET", "CLOSE_PAREN", "INACTIVE", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "OPEN_BRACE", "OPEN_BRACKET", "OPEN_PAREN", "SEMICOLON", 
			"WORD", "WS"
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


	boolean enableIPV6_ADDRESS = true;
	boolean enableIP_ADDRESS = true;
	boolean enableDEC = true;

	@Override
	public String printStateVariables() {
	   StringBuilder sb = new StringBuilder();
	   sb.append("enableIPV6_ADDRESS: " + enableIPV6_ADDRESS + "\n");
	   sb.append("enableIP_ADDRESS: " + enableIP_ADDRESS + "\n");
	   sb.append("enableDEC: " + enableDEC + "\n");
	   return sb.toString();
	}



	public JuniperLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JuniperLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\6\6\6@\n\6\r\6\16\6A\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\6\f_\n\f\r\f\16\f`\5\fc\n\f\3"+
		"\r\6\rf\n\r\r\r\16\rg\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20r\n\20"+
		"\f\20\16\20u\13\20\3\20\3\20\3\21\3\21\7\21{\n\21\f\21\16\21~\13\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3K\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\2\35\2\37\2!\2#\2%\2\3\2\b\4\2##%%\4\2\f\f"+
		"\17\17\3\2++\3\2$$\5\2\13\f\16\17\"\"\f\2\13\f\16\17\"\"$%*+==]]__}}\177"+
		"\177\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2"+
		"\13\67\3\2\2\2\rE\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23W\3\2\2\2\25Y\3\2"+
		"\2\2\27b\3\2\2\2\31e\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!x\3\2"+
		"\2\2#\u0081\3\2\2\2%\u0083\3\2\2\2\'(\7\177\2\2(\4\3\2\2\2)*\7_\2\2*\6"+
		"\3\2\2\2+,\7+\2\2,\b\3\2\2\2-.\7k\2\2./\7p\2\2/\60\7c\2\2\60\61\7e\2\2"+
		"\61\62\7v\2\2\62\63\7k\2\2\63\64\7x\2\2\64\65\7g\2\2\65\66\7<\2\2\66\n"+
		"\3\2\2\2\67;\t\2\2\28:\5\35\17\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2"+
		"\2<?\3\2\2\2=;\3\2\2\2>@\5\33\16\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2BC\3\2\2\2CD\b\6\2\2D\f\3\2\2\2EF\7\61\2\2FG\7,\2\2GK\3\2\2\2HJ\13"+
		"\2\2\2IH\3\2\2\2JM\3\2\2\2KL\3\2\2\2KI\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7"+
		",\2\2OP\7\61\2\2PQ\3\2\2\2QR\b\7\2\2R\16\3\2\2\2ST\7}\2\2T\20\3\2\2\2"+
		"UV\7]\2\2V\22\3\2\2\2WX\7*\2\2X\24\3\2\2\2YZ\7=\2\2Z\26\3\2\2\2[c\5!\21"+
		"\2\\c\5\37\20\2]_\5%\23\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3"+
		"\2\2\2b[\3\2\2\2b\\\3\2\2\2b^\3\2\2\2c\30\3\2\2\2df\5#\22\2ed\3\2\2\2"+
		"fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\r\2\2j\32\3\2\2\2kl\t\3\2"+
		"\2l\34\3\2\2\2mn\n\3\2\2n\36\3\2\2\2os\7*\2\2pr\n\4\2\2qp\3\2\2\2ru\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7+\2\2w \3\2\2\2x|\7"+
		"$\2\2y{\n\5\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~"+
		"|\3\2\2\2\177\u0080\7$\2\2\u0080\"\3\2\2\2\u0081\u0082\t\6\2\2\u0082$"+
		"\3\2\2\2\u0083\u0084\n\7\2\2\u0084&\3\2\2\2\13\2;AK`bgs|\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}