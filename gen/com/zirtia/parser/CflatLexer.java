// Generated from D:/iworkspace/Cflat-parser/src/main/java/com/zirtia/parser\Cflat.g4 by ANTLR 4.7.2
package com.zirtia.parser;

    import com.zirtia.analyzer.LibraryLoader;
    import com.zirtia.ast.*;
    import com.zirtia.entity.*;
    import com.zirtia.type.*;
    import java.io.*;
    import java.util.HashSet;
    import java.util.List;
    import java.util.Set;
    import java.util.*;
    import com.zirtia.exception.*;
    import static com.zirtia.utils.ESCUtils.characterCode;
    import static com.zirtia.utils.ESCUtils.integerValue;
    import static com.zirtia.utils.ESCUtils.stringValue;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CflatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, VOID=47, CHAR=48, SHORT=49, INT=50, LONG=51, STRUCT=52, UNION=53, 
		ENUM=54, STATIC=55, EXTERN=56, CONST=57, SIGNED=58, UNSIGNED=59, IF=60, 
		ELSE=61, SWITCH=62, CASE=63, DEFAULT=64, WHILE=65, DO=66, FOR=67, RETURN=68, 
		BREAK=69, CONTINUE=70, GOTO=71, TYPEDEF=72, IMPORT=73, SIZEOF=74, WS=75, 
		LINE_COMMENT=76, COMMENT=77, STRING=78, CHARACTER=79, IDENTIFIER=80, INTEGER=81;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "VOID", "CHAR", "SHORT", 
			"INT", "LONG", "STRUCT", "UNION", "ENUM", "STATIC", "EXTERN", "CONST", 
			"SIGNED", "UNSIGNED", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "WHILE", 
			"DO", "FOR", "RETURN", "BREAK", "CONTINUE", "GOTO", "TYPEDEF", "IMPORT", 
			"SIZEOF", "WS", "LINE_COMMENT", "COMMENT", "STRING", "CHARACTER", "IDENTIFIER", 
			"INTEGER", "ID_LETTER", "DIGIT", "ESC", "UNICODE", "HEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'='", "','", "'('", "')'", "'...'", "'{'", "'}'", 
			"':'", "'['", "']'", "'*'", "'?'", "'||'", "'&&'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'|'", "'^'", "'&'", "'>>'", "'<<'", "'+'", "'-'", 
			"'/'", "'%'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", 
			"'^='", "'<<='", "'>>='", "'++'", "'--'", "'!'", "'~'", "'->'", "'void'", 
			"'char'", "'short'", "'int'", "'long'", "'struct'", "'union'", "'enum'", 
			"'static'", "'extern'", "'const'", "'signed'", "'unsigned'", "'if'", 
			"'else'", "'switch'", "'case'", "'default'", "'while'", "'do'", "'for'", 
			"'return'", "'break'", "'continue'", "'goto'", "'typedef'", "'import'", 
			"'sizeof'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "VOID", 
			"CHAR", "SHORT", "INT", "LONG", "STRUCT", "UNION", "ENUM", "STATIC", 
			"EXTERN", "CONST", "SIGNED", "UNSIGNED", "IF", "ELSE", "SWITCH", "CASE", 
			"DEFAULT", "WHILE", "DO", "FOR", "RETURN", "BREAK", "CONTINUE", "GOTO", 
			"TYPEDEF", "IMPORT", "SIZEOF", "WS", "LINE_COMMENT", "COMMENT", "STRING", 
			"CHARACTER", "IDENTIFIER", "INTEGER"
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


	public CflatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cflat.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u0245\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3"+
		";\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3"+
		">\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3"+
		"B\3B\3B\3B\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3"+
		"F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\6L\u01cf\nL\rL\16L\u01d0\3"+
		"L\3L\3M\3M\3M\3M\7M\u01d9\nM\fM\16M\u01dc\13M\3M\5M\u01df\nM\3M\3M\3M"+
		"\3M\3N\3N\3N\3N\7N\u01e9\nN\fN\16N\u01ec\13N\3N\3N\3N\3N\3N\3O\3O\3O\7"+
		"O\u01f6\nO\fO\16O\u01f9\13O\3O\3O\3P\3P\3P\5P\u0200\nP\3P\3P\3Q\3Q\3Q"+
		"\7Q\u0207\nQ\fQ\16Q\u020a\13Q\3R\3R\7R\u020e\nR\fR\16R\u0211\13R\3R\5"+
		"R\u0214\nR\3R\5R\u0217\nR\3R\3R\3R\6R\u021c\nR\rR\16R\u021d\3R\5R\u0221"+
		"\nR\3R\5R\u0224\nR\3R\3R\7R\u0228\nR\fR\16R\u022b\13R\3R\5R\u022e\nR\3"+
		"R\5R\u0231\nR\5R\u0233\nR\3S\3S\3T\3T\3U\3U\3U\5U\u023c\nU\3V\3V\3V\3"+
		"V\3V\3V\3W\3W\5\u01da\u01ea\u01f7\2X\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5\2\u00a7\2\u00a9\2\u00ab"+
		"\2\u00ad\2\3\2\b\5\2\13\f\17\17\"\"\4\2$$^^\4\2ZZzz\5\2\62;CHch\5\2C\\"+
		"aac|\n\2$$\61\61^^ddhhppttvv\2\u0254\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\3\u00af\3\2\2\2\5\u00b1\3\2\2\2\7\u00b3\3\2\2\2\t\u00b5\3\2\2\2\13"+
		"\u00b7\3\2\2\2\r\u00b9\3\2\2\2\17\u00bb\3\2\2\2\21\u00bf\3\2\2\2\23\u00c1"+
		"\3\2\2\2\25\u00c3\3\2\2\2\27\u00c5\3\2\2\2\31\u00c7\3\2\2\2\33\u00c9\3"+
		"\2\2\2\35\u00cb\3\2\2\2\37\u00cd\3\2\2\2!\u00d0\3\2\2\2#\u00d3\3\2\2\2"+
		"%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00da\3\2\2\2+\u00dd\3\2\2\2-\u00e0\3"+
		"\2\2\2/\u00e3\3\2\2\2\61\u00e5\3\2\2\2\63\u00e7\3\2\2\2\65\u00e9\3\2\2"+
		"\2\67\u00ec\3\2\2\29\u00ef\3\2\2\2;\u00f1\3\2\2\2=\u00f3\3\2\2\2?\u00f5"+
		"\3\2\2\2A\u00f7\3\2\2\2C\u00fa\3\2\2\2E\u00fd\3\2\2\2G\u0100\3\2\2\2I"+
		"\u0103\3\2\2\2K\u0106\3\2\2\2M\u0109\3\2\2\2O\u010c\3\2\2\2Q\u010f\3\2"+
		"\2\2S\u0113\3\2\2\2U\u0117\3\2\2\2W\u011a\3\2\2\2Y\u011d\3\2\2\2[\u011f"+
		"\3\2\2\2]\u0121\3\2\2\2_\u0124\3\2\2\2a\u0129\3\2\2\2c\u012e\3\2\2\2e"+
		"\u0134\3\2\2\2g\u0138\3\2\2\2i\u013d\3\2\2\2k\u0144\3\2\2\2m\u014a\3\2"+
		"\2\2o\u014f\3\2\2\2q\u0156\3\2\2\2s\u015d\3\2\2\2u\u0163\3\2\2\2w\u016a"+
		"\3\2\2\2y\u0173\3\2\2\2{\u0176\3\2\2\2}\u017b\3\2\2\2\177\u0182\3\2\2"+
		"\2\u0081\u0187\3\2\2\2\u0083\u018f\3\2\2\2\u0085\u0195\3\2\2\2\u0087\u0198"+
		"\3\2\2\2\u0089\u019c\3\2\2\2\u008b\u01a3\3\2\2\2\u008d\u01a9\3\2\2\2\u008f"+
		"\u01b2\3\2\2\2\u0091\u01b7\3\2\2\2\u0093\u01bf\3\2\2\2\u0095\u01c6\3\2"+
		"\2\2\u0097\u01ce\3\2\2\2\u0099\u01d4\3\2\2\2\u009b\u01e4\3\2\2\2\u009d"+
		"\u01f2\3\2\2\2\u009f\u01fc\3\2\2\2\u00a1\u0203\3\2\2\2\u00a3\u0232\3\2"+
		"\2\2\u00a5\u0234\3\2\2\2\u00a7\u0236\3\2\2\2\u00a9\u0238\3\2\2\2\u00ab"+
		"\u023d\3\2\2\2\u00ad\u0243\3\2\2\2\u00af\u00b0\7\60\2\2\u00b0\4\3\2\2"+
		"\2\u00b1\u00b2\7=\2\2\u00b2\6\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4\b\3\2\2"+
		"\2\u00b5\u00b6\7.\2\2\u00b6\n\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\f\3\2\2"+
		"\2\u00b9\u00ba\7+\2\2\u00ba\16\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc\u00bd"+
		"\7\60\2\2\u00bd\u00be\7\60\2\2\u00be\20\3\2\2\2\u00bf\u00c0\7}\2\2\u00c0"+
		"\22\3\2\2\2\u00c1\u00c2\7\177\2\2\u00c2\24\3\2\2\2\u00c3\u00c4\7<\2\2"+
		"\u00c4\26\3\2\2\2\u00c5\u00c6\7]\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7_\2"+
		"\2\u00c8\32\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7"+
		"A\2\2\u00cc\36\3\2\2\2\u00cd\u00ce\7~\2\2\u00ce\u00cf\7~\2\2\u00cf \3"+
		"\2\2\2\u00d0\u00d1\7(\2\2\u00d1\u00d2\7(\2\2\u00d2\"\3\2\2\2\u00d3\u00d4"+
		"\7@\2\2\u00d4$\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7"+
		"@\2\2\u00d8\u00d9\7?\2\2\u00d9(\3\2\2\2\u00da\u00db\7>\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc*\3\2\2\2\u00dd\u00de\7?\2\2\u00de\u00df\7?\2\2\u00df,\3"+
		"\2\2\2\u00e0\u00e1\7#\2\2\u00e1\u00e2\7?\2\2\u00e2.\3\2\2\2\u00e3\u00e4"+
		"\7~\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7`\2\2\u00e6\62\3\2\2\2\u00e7\u00e8"+
		"\7(\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\7@\2\2\u00ea\u00eb\7@\2\2\u00eb\66"+
		"\3\2\2\2\u00ec\u00ed\7>\2\2\u00ed\u00ee\7>\2\2\u00ee8\3\2\2\2\u00ef\u00f0"+
		"\7-\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7/\2\2\u00f2<\3\2\2\2\u00f3\u00f4\7"+
		"\61\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7\'\2\2\u00f6@\3\2\2\2\u00f7\u00f8"+
		"\7-\2\2\u00f8\u00f9\7?\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7/\2\2\u00fb\u00fc"+
		"\7?\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7,\2\2\u00fe\u00ff\7?\2\2\u00ffF\3"+
		"\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102\7?\2\2\u0102H\3\2\2\2\u0103\u0104"+
		"\7\'\2\2\u0104\u0105\7?\2\2\u0105J\3\2\2\2\u0106\u0107\7(\2\2\u0107\u0108"+
		"\7?\2\2\u0108L\3\2\2\2\u0109\u010a\7~\2\2\u010a\u010b\7?\2\2\u010bN\3"+
		"\2\2\2\u010c\u010d\7`\2\2\u010d\u010e\7?\2\2\u010eP\3\2\2\2\u010f\u0110"+
		"\7>\2\2\u0110\u0111\7>\2\2\u0111\u0112\7?\2\2\u0112R\3\2\2\2\u0113\u0114"+
		"\7@\2\2\u0114\u0115\7@\2\2\u0115\u0116\7?\2\2\u0116T\3\2\2\2\u0117\u0118"+
		"\7-\2\2\u0118\u0119\7-\2\2\u0119V\3\2\2\2\u011a\u011b\7/\2\2\u011b\u011c"+
		"\7/\2\2\u011cX\3\2\2\2\u011d\u011e\7#\2\2\u011eZ\3\2\2\2\u011f\u0120\7"+
		"\u0080\2\2\u0120\\\3\2\2\2\u0121\u0122\7/\2\2\u0122\u0123\7@\2\2\u0123"+
		"^\3\2\2\2\u0124\u0125\7x\2\2\u0125\u0126\7q\2\2\u0126\u0127\7k\2\2\u0127"+
		"\u0128\7f\2\2\u0128`\3\2\2\2\u0129\u012a\7e\2\2\u012a\u012b\7j\2\2\u012b"+
		"\u012c\7c\2\2\u012c\u012d\7t\2\2\u012db\3\2\2\2\u012e\u012f\7u\2\2\u012f"+
		"\u0130\7j\2\2\u0130\u0131\7q\2\2\u0131\u0132\7t\2\2\u0132\u0133\7v\2\2"+
		"\u0133d\3\2\2\2\u0134\u0135\7k\2\2\u0135\u0136\7p\2\2\u0136\u0137\7v\2"+
		"\2\u0137f\3\2\2\2\u0138\u0139\7n\2\2\u0139\u013a\7q\2\2\u013a\u013b\7"+
		"p\2\2\u013b\u013c\7i\2\2\u013ch\3\2\2\2\u013d\u013e\7u\2\2\u013e\u013f"+
		"\7v\2\2\u013f\u0140\7t\2\2\u0140\u0141\7w\2\2\u0141\u0142\7e\2\2\u0142"+
		"\u0143\7v\2\2\u0143j\3\2\2\2\u0144\u0145\7w\2\2\u0145\u0146\7p\2\2\u0146"+
		"\u0147\7k\2\2\u0147\u0148\7q\2\2\u0148\u0149\7p\2\2\u0149l\3\2\2\2\u014a"+
		"\u014b\7g\2\2\u014b\u014c\7p\2\2\u014c\u014d\7w\2\2\u014d\u014e\7o\2\2"+
		"\u014en\3\2\2\2\u014f\u0150\7u\2\2\u0150\u0151\7v\2\2\u0151\u0152\7c\2"+
		"\2\u0152\u0153\7v\2\2\u0153\u0154\7k\2\2\u0154\u0155\7e\2\2\u0155p\3\2"+
		"\2\2\u0156\u0157\7g\2\2\u0157\u0158\7z\2\2\u0158\u0159\7v\2\2\u0159\u015a"+
		"\7g\2\2\u015a\u015b\7t\2\2\u015b\u015c\7p\2\2\u015cr\3\2\2\2\u015d\u015e"+
		"\7e\2\2\u015e\u015f\7q\2\2\u015f\u0160\7p\2\2\u0160\u0161\7u\2\2\u0161"+
		"\u0162\7v\2\2\u0162t\3\2\2\2\u0163\u0164\7u\2\2\u0164\u0165\7k\2\2\u0165"+
		"\u0166\7i\2\2\u0166\u0167\7p\2\2\u0167\u0168\7g\2\2\u0168\u0169\7f\2\2"+
		"\u0169v\3\2\2\2\u016a\u016b\7w\2\2\u016b\u016c\7p\2\2\u016c\u016d\7u\2"+
		"\2\u016d\u016e\7k\2\2\u016e\u016f\7i\2\2\u016f\u0170\7p\2\2\u0170\u0171"+
		"\7g\2\2\u0171\u0172\7f\2\2\u0172x\3\2\2\2\u0173\u0174\7k\2\2\u0174\u0175"+
		"\7h\2\2\u0175z\3\2\2\2\u0176\u0177\7g\2\2\u0177\u0178\7n\2\2\u0178\u0179"+
		"\7u\2\2\u0179\u017a\7g\2\2\u017a|\3\2\2\2\u017b\u017c\7u\2\2\u017c\u017d"+
		"\7y\2\2\u017d\u017e\7k\2\2\u017e\u017f\7v\2\2\u017f\u0180\7e\2\2\u0180"+
		"\u0181\7j\2\2\u0181~\3\2\2\2\u0182\u0183\7e\2\2\u0183\u0184\7c\2\2\u0184"+
		"\u0185\7u\2\2\u0185\u0186\7g\2\2\u0186\u0080\3\2\2\2\u0187\u0188\7f\2"+
		"\2\u0188\u0189\7g\2\2\u0189\u018a\7h\2\2\u018a\u018b\7c\2\2\u018b\u018c"+
		"\7w\2\2\u018c\u018d\7n\2\2\u018d\u018e\7v\2\2\u018e\u0082\3\2\2\2\u018f"+
		"\u0190\7y\2\2\u0190\u0191\7j\2\2\u0191\u0192\7k\2\2\u0192\u0193\7n\2\2"+
		"\u0193\u0194\7g\2\2\u0194\u0084\3\2\2\2\u0195\u0196\7f\2\2\u0196\u0197"+
		"\7q\2\2\u0197\u0086\3\2\2\2\u0198\u0199\7h\2\2\u0199\u019a\7q\2\2\u019a"+
		"\u019b\7t\2\2\u019b\u0088\3\2\2\2\u019c\u019d\7t\2\2\u019d\u019e\7g\2"+
		"\2\u019e\u019f\7v\2\2\u019f\u01a0\7w\2\2\u01a0\u01a1\7t\2\2\u01a1\u01a2"+
		"\7p\2\2\u01a2\u008a\3\2\2\2\u01a3\u01a4\7d\2\2\u01a4\u01a5\7t\2\2\u01a5"+
		"\u01a6\7g\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8\7m\2\2\u01a8\u008c\3\2\2"+
		"\2\u01a9\u01aa\7e\2\2\u01aa\u01ab\7q\2\2\u01ab\u01ac\7p\2\2\u01ac\u01ad"+
		"\7v\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af\7p\2\2\u01af\u01b0\7w\2\2\u01b0"+
		"\u01b1\7g\2\2\u01b1\u008e\3\2\2\2\u01b2\u01b3\7i\2\2\u01b3\u01b4\7q\2"+
		"\2\u01b4\u01b5\7v\2\2\u01b5\u01b6\7q\2\2\u01b6\u0090\3\2\2\2\u01b7\u01b8"+
		"\7v\2\2\u01b8\u01b9\7{\2\2\u01b9\u01ba\7r\2\2\u01ba\u01bb\7g\2\2\u01bb"+
		"\u01bc\7f\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7h\2\2\u01be\u0092\3\2\2"+
		"\2\u01bf\u01c0\7k\2\2\u01c0\u01c1\7o\2\2\u01c1\u01c2\7r\2\2\u01c2\u01c3"+
		"\7q\2\2\u01c3\u01c4\7t\2\2\u01c4\u01c5\7v\2\2\u01c5\u0094\3\2\2\2\u01c6"+
		"\u01c7\7u\2\2\u01c7\u01c8\7k\2\2\u01c8\u01c9\7|\2\2\u01c9\u01ca\7g\2\2"+
		"\u01ca\u01cb\7q\2\2\u01cb\u01cc\7h\2\2\u01cc\u0096\3\2\2\2\u01cd\u01cf"+
		"\t\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\bL\2\2\u01d3\u0098\3\2"+
		"\2\2\u01d4\u01d5\7\61\2\2\u01d5\u01d6\7\61\2\2\u01d6\u01da\3\2\2\2\u01d7"+
		"\u01d9\13\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01db\3"+
		"\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd"+
		"\u01df\7\17\2\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3"+
		"\2\2\2\u01e0\u01e1\7\f\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\bM\2\2\u01e3"+
		"\u009a\3\2\2\2\u01e4\u01e5\7\61\2\2\u01e5\u01e6\7,\2\2\u01e6\u01ea\3\2"+
		"\2\2\u01e7\u01e9\13\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ed\u01ee\7,\2\2\u01ee\u01ef\7\61\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\bN\2\2\u01f1\u009c\3\2\2\2\u01f2\u01f7\7$\2\2\u01f3\u01f6\5\u00a9"+
		"U\2\u01f4\u01f6\n\3\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6"+
		"\u01f9\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fa\3\2"+
		"\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\7$\2\2\u01fb\u009e\3\2\2\2\u01fc"+
		"\u01ff\7)\2\2\u01fd\u0200\5\u00abV\2\u01fe\u0200\13\2\2\2\u01ff\u01fd"+
		"\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7)\2\2\u0202"+
		"\u00a0\3\2\2\2\u0203\u0208\5\u00a5S\2\u0204\u0207\5\u00a5S\2\u0205\u0207"+
		"\5\u00a7T\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2"+
		"\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u00a2\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020b\u020f\4\63;\2\u020c\u020e\5\u00a7T\2\u020d\u020c\3\2\2"+
		"\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0213"+
		"\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0214\7W\2\2\u0213\u0212\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0217\7N\2\2\u0216\u0215\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217\u0233\3\2\2\2\u0218\u0219\7\62\2\2\u0219"+
		"\u021b\t\4\2\2\u021a\u021c\t\5\2\2\u021b\u021a\3\2\2\2\u021c\u021d\3\2"+
		"\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f"+
		"\u0221\7W\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2"+
		"\2\2\u0222\u0224\7N\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0233\3\2\2\2\u0225\u0229\7\62\2\2\u0226\u0228\4\629\2\u0227\u0226\3"+
		"\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022e\7W\2\2\u022d\u022c\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u0231\7N\2\2\u0230"+
		"\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u020b\3\2"+
		"\2\2\u0232\u0218\3\2\2\2\u0232\u0225\3\2\2\2\u0233\u00a4\3\2\2\2\u0234"+
		"\u0235\t\6\2\2\u0235\u00a6\3\2\2\2\u0236\u0237\4\62;\2\u0237\u00a8\3\2"+
		"\2\2\u0238\u023b\7^\2\2\u0239\u023c\t\7\2\2\u023a\u023c\5\u00abV\2\u023b"+
		"\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c\u00aa\3\2\2\2\u023d\u023e\7w"+
		"\2\2\u023e\u023f\5\u00adW\2\u023f\u0240\5\u00adW\2\u0240\u0241\5\u00ad"+
		"W\2\u0241\u0242\5\u00adW\2\u0242\u00ac\3\2\2\2\u0243\u0244\t\5\2\2\u0244"+
		"\u00ae\3\2\2\2\27\2\u01d0\u01da\u01de\u01ea\u01f5\u01f7\u01ff\u0206\u0208"+
		"\u020f\u0213\u0216\u021d\u0220\u0223\u0229\u022d\u0230\u0232\u023b\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}