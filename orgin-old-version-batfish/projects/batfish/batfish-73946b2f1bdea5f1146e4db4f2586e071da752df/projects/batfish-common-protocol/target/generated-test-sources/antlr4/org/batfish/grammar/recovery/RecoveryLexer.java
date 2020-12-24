// Generated from org/batfish/grammar/recovery/RecoveryLexer.g4 by ANTLR 4.7.1
package org.batfish.grammar.recovery;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RecoveryLexer extends org.batfish.grammar.BatfishLexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCK=1, INNER=2, SIMPLE=3, BLANK_LINE=4, COMMENT_LINE=5, COMMENT_TAIL=6, 
		NEWLINE=7, WS=8, ENTER_BAD_MODE=9, M_BadMode_nonexistent=10;
	public static final int
		M_BadMode=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "M_BadMode"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLOCK", "INNER", "SIMPLE", "BLANK_LINE", "COMMENT_LINE", "COMMENT_TAIL", 
			"NEWLINE", "WS", "F_Newline", "F_NonNewline", "F_Whitespace", "ENTER_BAD_MODE", 
			"M_BadMode_nonexistent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'block'", "'inner'", "'simple'", null, null, null, null, null, 
			"'enter-bad-mode'", "'nonexistent'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLOCK", "INNER", "SIMPLE", "BLANK_LINE", "COMMENT_LINE", "COMMENT_TAIL", 
			"NEWLINE", "WS", "ENTER_BAD_MODE", "M_BadMode_nonexistent"
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


	public RecoveryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RecoveryLexer.g4"; }

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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return BLANK_LINE_sempred((RuleContext)_localctx, predIndex);
		case 4:
			return COMMENT_LINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean BLANK_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return lastTokenType == NEWLINE;
		}
		return true;
	}
	private boolean COMMENT_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return lastTokenType == NEWLINE || lastTokenType == EOF;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u008e\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\7\5\63\n\5\f\5\16\5\66"+
		"\13\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\3\5\3\6\7\6C\n\6\f\6\16"+
		"\6F\13\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\6\6Q\n\6\r\6\16\6R\3"+
		"\6\3\6\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\3\b\6\ba\n\b\r\b\16\b"+
		"b\3\t\6\tf\n\t\r\t\16\tg\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\2\2\17\4\3\6\4\b\5\n\6\f"+
		"\7\16\b\20\t\22\n\24\2\26\2\30\2\32\13\34\f\4\2\3\4\4\2\f\f\17\17\4\2"+
		"\13\13\"\"\2\u0091\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f"+
		"\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\32\3\2\2\2\3\34\3\2"+
		"\2\2\4\36\3\2\2\2\6$\3\2\2\2\b*\3\2\2\2\n\64\3\2\2\2\fD\3\2\2\2\16V\3"+
		"\2\2\2\20`\3\2\2\2\22e\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30o\3\2\2\2\32"+
		"q\3\2\2\2\34\u0082\3\2\2\2\36\37\7d\2\2\37 \7n\2\2 !\7q\2\2!\"\7e\2\2"+
		"\"#\7m\2\2#\5\3\2\2\2$%\7k\2\2%&\7p\2\2&\'\7p\2\2\'(\7g\2\2()\7t\2\2)"+
		"\7\3\2\2\2*+\7u\2\2+,\7k\2\2,-\7o\2\2-.\7r\2\2./\7n\2\2/\60\7g\2\2\60"+
		"\t\3\2\2\2\61\63\5\30\f\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\5\24\n\28<\6\5\2\29;\5\24"+
		"\n\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\b\5"+
		"\2\2@\13\3\2\2\2AC\5\30\f\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG"+
		"\3\2\2\2FD\3\2\2\2GH\7%\2\2HL\6\6\3\2IK\5\26\13\2JI\3\2\2\2KN\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2OQ\5\24\n\2PO\3\2\2\2QR\3\2\2"+
		"\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\b\6\2\2U\r\3\2\2\2VZ\7%\2\2WY\5\26"+
		"\13\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^"+
		"\b\7\2\2^\17\3\2\2\2_a\5\24\n\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2"+
		"\2c\21\3\2\2\2df\5\30\f\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3"+
		"\2\2\2ij\b\t\2\2j\23\3\2\2\2kl\t\2\2\2l\25\3\2\2\2mn\n\2\2\2n\27\3\2\2"+
		"\2op\t\3\2\2p\31\3\2\2\2qr\7g\2\2rs\7p\2\2st\7v\2\2tu\7g\2\2uv\7t\2\2"+
		"vw\7/\2\2wx\7d\2\2xy\7c\2\2yz\7f\2\2z{\7/\2\2{|\7o\2\2|}\7q\2\2}~\7f\2"+
		"\2~\177\7g\2\2\177\u0080\3\2\2\2\u0080\u0081\b\r\3\2\u0081\33\3\2\2\2"+
		"\u0082\u0083\7p\2\2\u0083\u0084\7q\2\2\u0084\u0085\7p\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7z\2\2\u0087\u0088\7k\2\2\u0088\u0089\7u\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b\u008c\7p\2\2\u008c\u008d\7v\2\2"+
		"\u008d\35\3\2\2\2\f\2\3\64<DLRZbg\4\2\3\2\7\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}