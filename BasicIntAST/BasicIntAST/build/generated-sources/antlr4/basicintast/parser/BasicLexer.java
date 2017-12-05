// Generated from C:\Users\Adriani\Desktop\BasicIntAST (2)\BasicIntAST\BasicIntAST\grammar\basicintast\parser\Basic.g4 by ANTLR 4.6

package basicintast.parser;
import basicintast.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, EOL=3, IF=4, THEN=5, ELSE=6, WHILE=7, BEGIN=8, END=9, 
		WRITE=10, WRITELN=11, PROGRAM=12, VAR=13, STRING=14, INTEGER=15, FLOAT=16, 
		BOOLEAN=17, ARRAY=18, TRUE=19, FALSE=20, READ=21, OF=22, FOR=23, OR=24, 
		AND=25, DO=26, PROCEDURE=27, OPCOL=28, CLCOL=29, OPPAR=30, CLPAR=31, ATTR=32, 
		VARDEC=33, ID=34, EQ=35, STR=36, NUM=37, PLUS=38, MINUS=39, TIMES=40, 
		DIV=41, DF=42, LT=43, GT=44, LTE=45, GTE=46, WS=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z", "EOL", "IF", "THEN", "ELSE", "WHILE", "BEGIN", "END", "WRITE", "WRITELN", 
		"PROGRAM", "VAR", "STRING", "INTEGER", "FLOAT", "BOOLEAN", "ARRAY", "TRUE", 
		"FALSE", "READ", "OF", "FOR", "OR", "AND", "DO", "PROCEDURE", "OPCOL", 
		"CLCOL", "OPPAR", "CLPAR", "ATTR", "VARDEC", "ID", "EQ", "STR", "NUM", 
		"PLUS", "MINUS", "TIMES", "DIV", "DF", "LT", "GT", "LTE", "GTE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'..'", "';'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'['", "']'", "'('", "')'", "':='", "':'", 
		null, "'=='", null, null, "'+'", "'-'", "'*'", "'/'", "'!='", "'<'", "'>'", 
		"'<='", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "EOL", "IF", "THEN", "ELSE", "WHILE", "BEGIN", "END", 
		"WRITE", "WRITELN", "PROGRAM", "VAR", "STRING", "INTEGER", "FLOAT", "BOOLEAN", 
		"ARRAY", "TRUE", "FALSE", "READ", "OF", "FOR", "OR", "AND", "DO", "PROCEDURE", 
		"OPCOL", "CLCOL", "OPPAR", "CLPAR", "ATTR", "VARDEC", "ID", "EQ", "STR", 
		"NUM", "PLUS", "MINUS", "TIMES", "DIV", "DF", "LT", "GT", "LTE", "GTE", 
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


	String traducao = "";
	String aux = "";
	char open = '{';
	char close = '}';
	String num = "";
	String num2 = "";


	public BasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Basic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u01a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\7=\u0165\n=\f=\16=\u0168"+
		"\13=\3>\3>\3>\3?\3?\7?\u016f\n?\f?\16?\u0172\13?\3?\3?\3@\5@\u0177\n@"+
		"\3@\6@\u017a\n@\r@\16@\u017b\3@\3@\6@\u0180\n@\r@\16@\u0181\5@\u0184\n"+
		"@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3F\3G\3G\3H\3H\3H\3I\3I\3I\3J\6"+
		"J\u019c\nJ\rJ\16J\u019d\3J\3J\3\u0170\2K\3\3\5\4\7\2\t\2\13\2\r\2\17\2"+
		"\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2"+
		"\63\2\65\2\67\29\2;\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23"+
		"Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'"+
		"\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093"+
		"\61\3\2\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2"+
		"JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4"+
		"\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{"+
		"{\4\2\\\\||\4\2C\\c|\5\2\62;C\\c|\3\2$$\3\2//\3\2\62;\5\2\13\f\17\17\""+
		"\"\u018d\2\3\3\2\2\2\2\5\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\5\u0097\3\2\2\2\7\u009a\3\2\2\2\t\u009c"+
		"\3\2\2\2\13\u009e\3\2\2\2\r\u00a0\3\2\2\2\17\u00a2\3\2\2\2\21\u00a4\3"+
		"\2\2\2\23\u00a6\3\2\2\2\25\u00a8\3\2\2\2\27\u00aa\3\2\2\2\31\u00ac\3\2"+
		"\2\2\33\u00ae\3\2\2\2\35\u00b0\3\2\2\2\37\u00b2\3\2\2\2!\u00b4\3\2\2\2"+
		"#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bc\3\2\2\2+\u00be\3"+
		"\2\2\2-\u00c0\3\2\2\2/\u00c2\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2\2"+
		"\65\u00c8\3\2\2\2\67\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce\3\2\2\2=\u00d0"+
		"\3\2\2\2?\u00d3\3\2\2\2A\u00d8\3\2\2\2C\u00dd\3\2\2\2E\u00e3\3\2\2\2G"+
		"\u00e9\3\2\2\2I\u00ed\3\2\2\2K\u00f3\3\2\2\2M\u00fb\3\2\2\2O\u0103\3\2"+
		"\2\2Q\u0107\3\2\2\2S\u010e\3\2\2\2U\u0116\3\2\2\2W\u011c\3\2\2\2Y\u0124"+
		"\3\2\2\2[\u012a\3\2\2\2]\u012f\3\2\2\2_\u0135\3\2\2\2a\u013a\3\2\2\2c"+
		"\u013d\3\2\2\2e\u0141\3\2\2\2g\u0144\3\2\2\2i\u0148\3\2\2\2k\u014b\3\2"+
		"\2\2m\u0155\3\2\2\2o\u0157\3\2\2\2q\u0159\3\2\2\2s\u015b\3\2\2\2u\u015d"+
		"\3\2\2\2w\u0160\3\2\2\2y\u0162\3\2\2\2{\u0169\3\2\2\2}\u016c\3\2\2\2\177"+
		"\u0176\3\2\2\2\u0081\u0185\3\2\2\2\u0083\u0187\3\2\2\2\u0085\u0189\3\2"+
		"\2\2\u0087\u018b\3\2\2\2\u0089\u018d\3\2\2\2\u008b\u0190\3\2\2\2\u008d"+
		"\u0192\3\2\2\2\u008f\u0194\3\2\2\2\u0091\u0197\3\2\2\2\u0093\u019b\3\2"+
		"\2\2\u0095\u0096\7.\2\2\u0096\4\3\2\2\2\u0097\u0098\7\60\2\2\u0098\u0099"+
		"\7\60\2\2\u0099\6\3\2\2\2\u009a\u009b\t\2\2\2\u009b\b\3\2\2\2\u009c\u009d"+
		"\t\3\2\2\u009d\n\3\2\2\2\u009e\u009f\t\4\2\2\u009f\f\3\2\2\2\u00a0\u00a1"+
		"\t\5\2\2\u00a1\16\3\2\2\2\u00a2\u00a3\t\6\2\2\u00a3\20\3\2\2\2\u00a4\u00a5"+
		"\t\7\2\2\u00a5\22\3\2\2\2\u00a6\u00a7\t\b\2\2\u00a7\24\3\2\2\2\u00a8\u00a9"+
		"\t\t\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\t\n\2\2\u00ab\30\3\2\2\2\u00ac\u00ad"+
		"\t\13\2\2\u00ad\32\3\2\2\2\u00ae\u00af\t\f\2\2\u00af\34\3\2\2\2\u00b0"+
		"\u00b1\t\r\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\t\16\2\2\u00b3 \3\2\2\2\u00b4"+
		"\u00b5\t\17\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\t\20\2\2\u00b7$\3\2\2\2\u00b8"+
		"\u00b9\t\21\2\2\u00b9&\3\2\2\2\u00ba\u00bb\t\22\2\2\u00bb(\3\2\2\2\u00bc"+
		"\u00bd\t\23\2\2\u00bd*\3\2\2\2\u00be\u00bf\t\24\2\2\u00bf,\3\2\2\2\u00c0"+
		"\u00c1\t\25\2\2\u00c1.\3\2\2\2\u00c2\u00c3\t\26\2\2\u00c3\60\3\2\2\2\u00c4"+
		"\u00c5\t\27\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\t\30\2\2\u00c7\64\3\2\2\2"+
		"\u00c8\u00c9\t\31\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\t\32\2\2\u00cb8\3\2"+
		"\2\2\u00cc\u00cd\t\33\2\2\u00cd:\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf<\3\2"+
		"\2\2\u00d0\u00d1\5\27\f\2\u00d1\u00d2\5\21\t\2\u00d2>\3\2\2\2\u00d3\u00d4"+
		"\5-\27\2\u00d4\u00d5\5\25\13\2\u00d5\u00d6\5\17\b\2\u00d6\u00d7\5!\21"+
		"\2\u00d7@\3\2\2\2\u00d8\u00d9\5\17\b\2\u00d9\u00da\5\35\17\2\u00da\u00db"+
		"\5+\26\2\u00db\u00dc\5\17\b\2\u00dcB\3\2\2\2\u00dd\u00de\5\63\32\2\u00de"+
		"\u00df\5\25\13\2\u00df\u00e0\5\27\f\2\u00e0\u00e1\5\35\17\2\u00e1\u00e2"+
		"\5\17\b\2\u00e2D\3\2\2\2\u00e3\u00e4\5\t\5\2\u00e4\u00e5\5\17\b\2\u00e5"+
		"\u00e6\5\23\n\2\u00e6\u00e7\5\27\f\2\u00e7\u00e8\5!\21\2\u00e8F\3\2\2"+
		"\2\u00e9\u00ea\5\17\b\2\u00ea\u00eb\5!\21\2\u00eb\u00ec\5\r\7\2\u00ec"+
		"H\3\2\2\2\u00ed\u00ee\5\63\32\2\u00ee\u00ef\5)\25\2\u00ef\u00f0\5\27\f"+
		"\2\u00f0\u00f1\5-\27\2\u00f1\u00f2\5\17\b\2\u00f2J\3\2\2\2\u00f3\u00f4"+
		"\5\63\32\2\u00f4\u00f5\5)\25\2\u00f5\u00f6\5\27\f\2\u00f6\u00f7\5-\27"+
		"\2\u00f7\u00f8\5\17\b\2\u00f8\u00f9\5\35\17\2\u00f9\u00fa\5!\21\2\u00fa"+
		"L\3\2\2\2\u00fb\u00fc\5%\23\2\u00fc\u00fd\5)\25\2\u00fd\u00fe\5#\22\2"+
		"\u00fe\u00ff\5\23\n\2\u00ff\u0100\5)\25\2\u0100\u0101\5\7\4\2\u0101\u0102"+
		"\5\37\20\2\u0102N\3\2\2\2\u0103\u0104\5\61\31\2\u0104\u0105\5\7\4\2\u0105"+
		"\u0106\5)\25\2\u0106P\3\2\2\2\u0107\u0108\5+\26\2\u0108\u0109\5-\27\2"+
		"\u0109\u010a\5)\25\2\u010a\u010b\5\27\f\2\u010b\u010c\5!\21\2\u010c\u010d"+
		"\5\23\n\2\u010dR\3\2\2\2\u010e\u010f\5\27\f\2\u010f\u0110\5!\21\2\u0110"+
		"\u0111\5-\27\2\u0111\u0112\5\17\b\2\u0112\u0113\5\23\n\2\u0113\u0114\5"+
		"\17\b\2\u0114\u0115\5)\25\2\u0115T\3\2\2\2\u0116\u0117\5\21\t\2\u0117"+
		"\u0118\5\35\17\2\u0118\u0119\5#\22\2\u0119\u011a\5\7\4\2\u011a\u011b\5"+
		"-\27\2\u011bV\3\2\2\2\u011c\u011d\5\t\5\2\u011d\u011e\5#\22\2\u011e\u011f"+
		"\5#\22\2\u011f\u0120\5\35\17\2\u0120\u0121\5\17\b\2\u0121\u0122\5\7\4"+
		"\2\u0122\u0123\5!\21\2\u0123X\3\2\2\2\u0124\u0125\5\7\4\2\u0125\u0126"+
		"\5)\25\2\u0126\u0127\5)\25\2\u0127\u0128\5\7\4\2\u0128\u0129\5\67\34\2"+
		"\u0129Z\3\2\2\2\u012a\u012b\5-\27\2\u012b\u012c\5)\25\2\u012c\u012d\5"+
		"/\30\2\u012d\u012e\5\17\b\2\u012e\\\3\2\2\2\u012f\u0130\5\21\t\2\u0130"+
		"\u0131\5\7\4\2\u0131\u0132\5\35\17\2\u0132\u0133\5+\26\2\u0133\u0134\5"+
		"\17\b\2\u0134^\3\2\2\2\u0135\u0136\5)\25\2\u0136\u0137\5\17\b\2\u0137"+
		"\u0138\5\7\4\2\u0138\u0139\5\r\7\2\u0139`\3\2\2\2\u013a\u013b\5#\22\2"+
		"\u013b\u013c\5\21\t\2\u013cb\3\2\2\2\u013d\u013e\5\21\t\2\u013e\u013f"+
		"\5#\22\2\u013f\u0140\5)\25\2\u0140d\3\2\2\2\u0141\u0142\5#\22\2\u0142"+
		"\u0143\5)\25\2\u0143f\3\2\2\2\u0144\u0145\5\7\4\2\u0145\u0146\5!\21\2"+
		"\u0146\u0147\5\r\7\2\u0147h\3\2\2\2\u0148\u0149\5\r\7\2\u0149\u014a\5"+
		"#\22\2\u014aj\3\2\2\2\u014b\u014c\5%\23\2\u014c\u014d\5)\25\2\u014d\u014e"+
		"\5#\22\2\u014e\u014f\5\13\6\2\u014f\u0150\5\17\b\2\u0150\u0151\5\r\7\2"+
		"\u0151\u0152\5/\30\2\u0152\u0153\5)\25\2\u0153\u0154\5\17\b\2\u0154l\3"+
		"\2\2\2\u0155\u0156\7]\2\2\u0156n\3\2\2\2\u0157\u0158\7_\2\2\u0158p\3\2"+
		"\2\2\u0159\u015a\7*\2\2\u015ar\3\2\2\2\u015b\u015c\7+\2\2\u015ct\3\2\2"+
		"\2\u015d\u015e\7<\2\2\u015e\u015f\7?\2\2\u015fv\3\2\2\2\u0160\u0161\7"+
		"<\2\2\u0161x\3\2\2\2\u0162\u0166\t\34\2\2\u0163\u0165\t\35\2\2\u0164\u0163"+
		"\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"z\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7?\2\2\u016a\u016b\7?\2\2\u016b"+
		"|\3\2\2\2\u016c\u0170\t\36\2\2\u016d\u016f\13\2\2\2\u016e\u016d\3\2\2"+
		"\2\u016f\u0172\3\2\2\2\u0170\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\t\36\2\2\u0174~\3\2\2\2\u0175"+
		"\u0177\t\37\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3"+
		"\2\2\2\u0178\u017a\t \2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0183\3\2\2\2\u017d\u017f\13"+
		"\2\2\2\u017e\u0180\t \2\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u017d\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0080\3\2\2\2\u0185\u0186\7-\2\2\u0186"+
		"\u0082\3\2\2\2\u0187\u0188\7/\2\2\u0188\u0084\3\2\2\2\u0189\u018a\7,\2"+
		"\2\u018a\u0086\3\2\2\2\u018b\u018c\7\61\2\2\u018c\u0088\3\2\2\2\u018d"+
		"\u018e\7#\2\2\u018e\u018f\7?\2\2\u018f\u008a\3\2\2\2\u0190\u0191\7>\2"+
		"\2\u0191\u008c\3\2\2\2\u0192\u0193\7@\2\2\u0193\u008e\3\2\2\2\u0194\u0195"+
		"\7>\2\2\u0195\u0196\7?\2\2\u0196\u0090\3\2\2\2\u0197\u0198\7@\2\2\u0198"+
		"\u0199\7?\2\2\u0199\u0092\3\2\2\2\u019a\u019c\t!\2\2\u019b\u019a\3\2\2"+
		"\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a0\bJ\2\2\u01a0\u0094\3\2\2\2\n\2\u0166\u0170\u0176"+
		"\u017b\u0181\u0183\u019d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}