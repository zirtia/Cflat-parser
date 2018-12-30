// Generated from D:/iworkspace/cflat/src/main/java/com/zirtia/parser\Cflat.g4 by ANTLR 4.7.2
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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CflatParser extends Parser {
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
		BREAK=69, CONTINUE=70, GOTO=71, TYPEDEF=72, IMPORT=73, SIZEOF=74, STRING=75, 
		CHARACTER=76, IDENTIFIER=77, INTEGER=78, WS=79, LINE_COMMENT=80, COMMENT=81;
	public static final int
		RULE_compilation_unit = 0, RULE_declaration_file = 1, RULE_import_stmts = 2, 
		RULE_import_stmt = 3, RULE_top_defs = 4, RULE_defvars = 5, RULE_defconst = 6, 
		RULE_defun = 7, RULE_storage = 8, RULE_params = 9, RULE_fixedparams = 10, 
		RULE_param = 11, RULE_block = 12, RULE_defvar_list = 13, RULE_defstruct = 14, 
		RULE_defunion = 15, RULE_member_list = 16, RULE_slot = 17, RULE_funcdecl = 18, 
		RULE_vardecl = 19, RULE_type = 20, RULE_typeref = 21, RULE_param_typerefs = 22, 
		RULE_fixedparam_typerefs = 23, RULE_typeref_base = 24, RULE_typedef = 25, 
		RULE_stmts = 26, RULE_stmt = 27, RULE_labeled_stmt = 28, RULE_if_stmt = 29, 
		RULE_while_stmt = 30, RULE_dowhile_stmt = 31, RULE_for_stmt = 32, RULE_switch_stmt = 33, 
		RULE_case_clauses = 34, RULE_case_clause = 35, RULE_cases = 36, RULE_default_clause = 37, 
		RULE_case_body = 38, RULE_goto_stmt = 39, RULE_break_stmt = 40, RULE_continue_stmt = 41, 
		RULE_return_stmt = 42, RULE_expr = 43, RULE_expr10 = 44, RULE_expr9 = 45, 
		RULE_expr8 = 46, RULE_expr7 = 47, RULE_expr6 = 48, RULE_expr5 = 49, RULE_expr4 = 50, 
		RULE_expr3 = 51, RULE_expr2 = 52, RULE_expr1 = 53, RULE_opassign_op = 54, 
		RULE_term = 55, RULE_unary = 56, RULE_postfix = 57, RULE_name = 58, RULE_args = 59, 
		RULE_primary = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "declaration_file", "import_stmts", "import_stmt", 
			"top_defs", "defvars", "defconst", "defun", "storage", "params", "fixedparams", 
			"param", "block", "defvar_list", "defstruct", "defunion", "member_list", 
			"slot", "funcdecl", "vardecl", "type", "typeref", "param_typerefs", "fixedparam_typerefs", 
			"typeref_base", "typedef", "stmts", "stmt", "labeled_stmt", "if_stmt", 
			"while_stmt", "dowhile_stmt", "for_stmt", "switch_stmt", "case_clauses", 
			"case_clause", "cases", "default_clause", "case_body", "goto_stmt", "break_stmt", 
			"continue_stmt", "return_stmt", "expr", "expr10", "expr9", "expr8", "expr7", 
			"expr6", "expr5", "expr4", "expr3", "expr2", "expr1", "opassign_op", 
			"term", "unary", "postfix", "name", "args", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'='", "','", "'('", "')'", "'...'", "'{'", "'}'", 
			"'['", "']'", "'*'", "':'", "'?'", "'||'", "'&&'", "'>'", "'<'", "'>='", 
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
			"TYPEDEF", "IMPORT", "SIZEOF", "STRING", "CHARACTER", "IDENTIFIER", "INTEGER", 
			"WS", "LINE_COMMENT", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "Cflat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private LibraryLoader loader;
	    private Set<String> knownTypedefs;

	    public CflatParser(TokenStream token,LibraryLoader loader) {
	        this(token);
	        this.loader = loader;
	        this.knownTypedefs = new HashSet<String>();
	    }

	    public AST parse() {
	            return this.compilation_unit().ast;
	    }
	    public Declarations parseDecls() {
	            return this.declaration_file().decls;
	    }


	    private void addKnownTypedefs(List<TypedefNode> typedefs) {
	        for (TypedefNode n : typedefs) {
	            addType(n.name());
	        }
	    }

	    private void addType(String name) {
	        knownTypedefs.add(name);
	    }

	    private boolean isType(String name) {
	        return knownTypedefs.contains(name);
	    }

	    private TypeRef size_t() {
	        return IntegerTypeRef.ulongRef();
	    }


	    private IntegerLiteralNode integerNode(String image) {
	        long i = integerValue(image);
	        if (image.endsWith("UL")) {
	            return new IntegerLiteralNode(IntegerTypeRef.ulongRef(), i);
	        }
	        else if (image.endsWith("L")) {
	            return new IntegerLiteralNode(IntegerTypeRef.longRef(), i);
	        }
	        else if (image.endsWith("U")) {
	            return new IntegerLiteralNode(IntegerTypeRef.uintRef(), i);
	        }
	        else {
	            return new IntegerLiteralNode(IntegerTypeRef.intRef(), i);
	        }
	    }

	    private long integerValue(String image) {
	        String s = image.replaceFirst("[UL]+", "");
	        if (s.startsWith("0x") || s.startsWith("0X")) {
	            return Long.parseLong(s.substring(2), 16);
	        }
	        else if (s.startsWith("0") && !s.equals("0")) {
	            return Long.parseLong(s.substring(1), 8);
	        }
	        else {
	            return Long.parseLong(s, 10);
	        }
	    }

	    private long characterCode(String image) {
	        String s = image;
	        if (s.length() != 1) {
	            throw new Error("must not happen: character length > 1");
	        }
	        return (long)s.charAt(0);
	    }

	public CflatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Compilation_unitContext extends ParserRuleContext {
		public AST ast;
		public Import_stmtsContext import_stmts() {
			return getRuleContext(Import_stmtsContext.class,0);
		}
		public Top_defsContext top_defs() {
			return getRuleContext(Top_defsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CflatParser.EOF, 0); }
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);

		    Declarations decls = top_defs().decls;

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			import_stmts();
			setState(123);
			top_defs();
			setState(124);
			match(EOF);
			}
			_ctx.stop = _input.LT(-1);

			     decls.add(import_stmts().impdecls);
			     ((Compilation_unitContext)_localctx).ast =   new AST(decls);
			 
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

	public static class Declaration_fileContext extends ParserRuleContext {
		public Declarations decls;
		public Import_stmtsContext import_stmts() {
			return getRuleContext(Import_stmtsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CflatParser.EOF, 0); }
		public List<FuncdeclContext> funcdecl() {
			return getRuleContexts(FuncdeclContext.class);
		}
		public FuncdeclContext funcdecl(int i) {
			return getRuleContext(FuncdeclContext.class,i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<DefconstContext> defconst() {
			return getRuleContexts(DefconstContext.class);
		}
		public DefconstContext defconst(int i) {
			return getRuleContext(DefconstContext.class,i);
		}
		public List<DefstructContext> defstruct() {
			return getRuleContexts(DefstructContext.class);
		}
		public DefstructContext defstruct(int i) {
			return getRuleContext(DefstructContext.class,i);
		}
		public List<DefunionContext> defunion() {
			return getRuleContexts(DefunionContext.class);
		}
		public DefunionContext defunion(int i) {
			return getRuleContext(DefunionContext.class,i);
		}
		public List<TypedefContext> typedef() {
			return getRuleContexts(TypedefContext.class);
		}
		public TypedefContext typedef(int i) {
			return getRuleContext(TypedefContext.class,i);
		}
		public Declaration_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_file; }
	}

	public final Declaration_fileContext declaration_file() throws RecognitionException {
		Declaration_fileContext _localctx = new Declaration_fileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration_file);

		    ((Declaration_fileContext)_localctx).decls =  new Declarations();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			import_stmts();
			 _localctx.decls.add(import_stmts().impdecls); 
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (STRUCT - 52)) | (1L << (UNION - 52)) | (1L << (EXTERN - 52)) | (1L << (CONST - 52)) | (1L << (TYPEDEF - 52)))) != 0)) {
				{
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(128);
					funcdecl();
					 _localctx.decls.addFuncdecl(funcdecl().undefinedFunction); 
					}
					break;
				case 2:
					{
					setState(131);
					vardecl();
					 _localctx.decls.addVardecl(vardecl().undefinedVariable); 
					}
					break;
				case 3:
					{
					setState(134);
					defconst();
					 _localctx.decls.addConstant(defconst().contant); 
					}
					break;
				case 4:
					{
					setState(137);
					defstruct();
					 _localctx.decls.addDefstruct(defstruct().structNode); 
					}
					break;
				case 5:
					{
					setState(140);
					defunion();
					 _localctx.decls.addDefunion(defunion().unionNode); 
					}
					break;
				case 6:
					{
					setState(143);
					typedef();
					 _localctx.decls.addTypedef(typedef().typedefNode); 
					}
					break;
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(EOF);
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

	public static class Import_stmtsContext extends ParserRuleContext {
		public Declarations impdecls;
		public List<Import_stmtContext> import_stmt() {
			return getRuleContexts(Import_stmtContext.class);
		}
		public Import_stmtContext import_stmt(int i) {
			return getRuleContext(Import_stmtContext.class,i);
		}
		public Import_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmts; }
	}

	public final Import_stmtsContext import_stmts() throws RecognitionException {
		Import_stmtsContext _localctx = new Import_stmtsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_stmts);

		    ((Import_stmtsContext)_localctx).impdecls =  new Declarations();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(153);
				import_stmt();

				        Declarations decls = loader.loadLibrary(import_stmt().impdecl);
				        if (decls != null) {
				          _localctx.impdecls.add(decls);
				          addKnownTypedefs(decls.typedefs());
				        }
				    
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException ex) {

			    throw new Error(ex.getMessage());

		}
		catch (CompileException ex1) {

			    throw new Error(ex1.getMessage());

		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_stmtContext extends ParserRuleContext {
		public String impdecl;
		public TerminalNode IMPORT() { return getToken(CflatParser.IMPORT, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_stmt);

		    StringBuffer buf = new StringBuffer();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IMPORT);
			setState(162);
			name();
			 buf.append(name().text); 
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(164);
				match(T__0);
				setState(165);
				name();
				 buf.append("."); buf.append((name().text)); 
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			    ((Import_stmtContext)_localctx).impdecl =  buf.toString();

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

	public static class Top_defsContext extends ParserRuleContext {
		public Declarations decls;
		public List<DefunContext> defun() {
			return getRuleContexts(DefunContext.class);
		}
		public DefunContext defun(int i) {
			return getRuleContext(DefunContext.class,i);
		}
		public List<DefvarsContext> defvars() {
			return getRuleContexts(DefvarsContext.class);
		}
		public DefvarsContext defvars(int i) {
			return getRuleContext(DefvarsContext.class,i);
		}
		public List<DefconstContext> defconst() {
			return getRuleContexts(DefconstContext.class);
		}
		public DefconstContext defconst(int i) {
			return getRuleContext(DefconstContext.class,i);
		}
		public List<DefstructContext> defstruct() {
			return getRuleContexts(DefstructContext.class);
		}
		public DefstructContext defstruct(int i) {
			return getRuleContext(DefstructContext.class,i);
		}
		public List<DefunionContext> defunion() {
			return getRuleContexts(DefunionContext.class);
		}
		public DefunionContext defunion(int i) {
			return getRuleContext(DefunionContext.class,i);
		}
		public List<TypedefContext> typedef() {
			return getRuleContexts(TypedefContext.class);
		}
		public TypedefContext typedef(int i) {
			return getRuleContext(TypedefContext.class,i);
		}
		public Top_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_defs; }
	}

	public final Top_defsContext top_defs() throws RecognitionException {
		Top_defsContext _localctx = new Top_defsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_top_defs);

		    ((Top_defsContext)_localctx).decls =  new Declarations();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (VOID - 47)) | (1L << (CHAR - 47)) | (1L << (SHORT - 47)) | (1L << (INT - 47)) | (1L << (LONG - 47)) | (1L << (STRUCT - 47)) | (1L << (UNION - 47)) | (1L << (STATIC - 47)) | (1L << (CONST - 47)) | (1L << (UNSIGNED - 47)) | (1L << (TYPEDEF - 47)) | (1L << (IDENTIFIER - 47)))) != 0)) {
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(175);
					defun();
					 _localctx.decls.addDefun(defun().definedFunction); 
					}
					break;
				case 2:
					{
					setState(178);
					defvars();
					 _localctx.decls.addDefvars(defvars().defs); 
					}
					break;
				case 3:
					{
					setState(181);
					defconst();
					 _localctx.decls.addConstant(defconst().contant); 
					}
					break;
				case 4:
					{
					setState(184);
					defstruct();
					 _localctx.decls.addDefstruct(defstruct().structNode); 
					}
					break;
				case 5:
					{
					setState(187);
					defunion();
					 _localctx.decls.addDefunion(defunion().unionNode); 
					}
					break;
				case 6:
					{
					setState(190);
					typedef();
					 _localctx.decls.addTypedef(typedef().typedefNode); 
					}
					break;
				}
				}
				setState(197);
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

	public static class DefvarsContext extends ParserRuleContext {
		public List<DefinedVariable> defs;
		public StorageContext storage() {
			return getRuleContext(StorageContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DefvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvars; }
	}

	public final DefvarsContext defvars() throws RecognitionException {
		DefvarsContext _localctx = new DefvarsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defvars);

		    ((DefvarsContext)_localctx).defs =  new ArrayList<DefinedVariable>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			storage();
			setState(199);
			type();
			setState(200);
			name();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(201);
				match(T__2);
				setState(202);
				expr();
				}
			}


			           _localctx.defs.add(new DefinedVariable(storage().bool, type().typeNode, name().text, expr().exprNode));
			        
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(206);
				match(T__3);
				setState(207);
				name();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(208);
					match(T__2);
					setState(209);
					expr();
					}
				}


				           _localctx.defs.add(new DefinedVariable(storage().bool, type().typeNode, name().text, expr().exprNode));
				       
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
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

	public static class DefconstContext extends ParserRuleContext {
		public Constant contant;
		public TerminalNode CONST() { return getToken(CflatParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defconst; }
	}

	public final DefconstContext defconst() throws RecognitionException {
		DefconstContext _localctx = new DefconstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(CONST);
			setState(222);
			type();
			setState(223);
			name();
			setState(224);
			match(T__2);
			setState(225);
			expr();
			setState(226);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			    ((DefconstContext)_localctx).contant =  new Constant(type().typeNode, name().text, expr().exprNode);

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

	public static class DefunContext extends ParserRuleContext {
		public DefinedFunction definedFunction;
		public StorageContext storage() {
			return getRuleContext(StorageContext.class,0);
		}
		public TyperefContext typeref() {
			return getRuleContext(TyperefContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defun; }
	}

	public final DefunContext defun() throws RecognitionException {
		DefunContext _localctx = new DefunContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			storage();
			setState(229);
			typeref();
			setState(230);
			name();
			setState(231);
			match(T__4);
			setState(232);
			params();
			setState(233);
			match(T__5);
			setState(234);
			block();
			}
			_ctx.stop = _input.LT(-1);

			    TypeRef t = new FunctionTypeRef(typeref().typeRef, params().paramz.parametersTypeRef());
			    ((DefunContext)_localctx).definedFunction =  new DefinedFunction(storage().bool, new TypeNode(t),
			                name().text, params().paramz, block().blockNode);

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

	public static class StorageContext extends ParserRuleContext {
		public boolean bool;
		public Token t;
		public TerminalNode STATIC() { return getToken(CflatParser.STATIC, 0); }
		public StorageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage; }
	}

	public final StorageContext storage() throws RecognitionException {
		StorageContext _localctx = new StorageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_storage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(236);
				((StorageContext)_localctx).t = match(STATIC);
				}
			}

			}
			_ctx.stop = _input.LT(-1);

			    ((StorageContext)_localctx).bool =   ((StorageContext)_localctx).t == null ? false : true ;

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

	public static class ParamsContext extends ParserRuleContext {
		public Params paramz;
		public FixedparamsContext params1;
		public TerminalNode VOID() { return getToken(CflatParser.VOID, 0); }
		public FixedparamsContext fixedparams() {
			return getRuleContext(FixedparamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_params);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(VOID);
				 ((ParamsContext)_localctx).paramz =  new Params(new ArrayList<Parameter>());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				((ParamsContext)_localctx).params1 = fixedparams();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(242);
					match(T__3);
					setState(243);
					match(T__6);
					 fixedparams().paramz.acceptVarargs(); 
					}
				}

				((ParamsContext)_localctx).paramz =  fixedparams().paramz ;
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

	public static class FixedparamsContext extends ParserRuleContext {
		public Params paramz;
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public FixedparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedparams; }
	}

	public final FixedparamsContext fixedparams() throws RecognitionException {
		FixedparamsContext _localctx = new FixedparamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fixedparams);

		    List<Parameter> parameters = new ArrayList<Parameter>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			param();
			 parameters.add(param().parameter); 
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (VOID - 47)) | (1L << (CHAR - 47)) | (1L << (SHORT - 47)) | (1L << (INT - 47)) | (1L << (LONG - 47)) | (1L << (STRUCT - 47)) | (1L << (UNION - 47)) | (1L << (UNSIGNED - 47)) | (1L << (IDENTIFIER - 47)))) != 0)) {
				{
				{
				setState(253);
				param();
				 parameters.add(param().parameter); 
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);

			    ((FixedparamsContext)_localctx).paramz =  new Params(parameters);

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
		public Parameter parameter;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			type();
			setState(262);
			name();
			}
			_ctx.stop = _input.LT(-1);

			    ((ParamContext)_localctx).parameter =  new Parameter(type().typeNode, name().text);

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
		public BlockNode blockNode;
		public Defvar_listContext defvar_list() {
			return getRuleContext(Defvar_listContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__7);
			setState(265);
			defvar_list();
			setState(266);
			stmts();
			setState(267);
			match(T__8);
			}
			_ctx.stop = _input.LT(-1);

			    ((BlockContext)_localctx).blockNode =  new BlockNode(defvar_list().result,stmts().ss);
			 
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

	public static class Defvar_listContext extends ParserRuleContext {
		public List<DefinedVariable> result;
		public List<DefvarsContext> defvars() {
			return getRuleContexts(DefvarsContext.class);
		}
		public DefvarsContext defvars(int i) {
			return getRuleContext(DefvarsContext.class,i);
		}
		public Defvar_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar_list; }
	}

	public final Defvar_listContext defvar_list() throws RecognitionException {
		Defvar_listContext _localctx = new Defvar_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defvar_list);

		    ((Defvar_listContext)_localctx).result =  new ArrayList<DefinedVariable>();
		 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					defvars();
					 _localctx.result.addAll(defvars().defs); 
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class DefstructContext extends ParserRuleContext {
		public StructNode structNode;
		public NameContext n;
		public Member_listContext membs;
		public TerminalNode STRUCT() { return getToken(CflatParser.STRUCT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public DefstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defstruct; }
	}

	public final DefstructContext defstruct() throws RecognitionException {
		DefstructContext _localctx = new DefstructContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(STRUCT);
			setState(278);
			((DefstructContext)_localctx).n = name();
			setState(279);
			((DefstructContext)_localctx).membs = member_list();
			setState(280);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			    ((DefstructContext)_localctx).structNode =  new StructNode(new StructTypeRef(name().text), name().text, member_list().membs);
			 
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

	public static class DefunionContext extends ParserRuleContext {
		public UnionNode unionNode;
		public TerminalNode UNION() { return getToken(CflatParser.UNION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public DefunionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defunion; }
	}

	public final DefunionContext defunion() throws RecognitionException {
		DefunionContext _localctx = new DefunionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_defunion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(UNION);
			setState(283);
			name();
			setState(284);
			member_list();
			setState(285);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			    ((DefunionContext)_localctx).unionNode =  new UnionNode(new UnionTypeRef(name().text), name().text, member_list().membs);
			 
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

	public static class Member_listContext extends ParserRuleContext {
		public List<Slot> membs;
		public List<SlotContext> slot() {
			return getRuleContexts(SlotContext.class);
		}
		public SlotContext slot(int i) {
			return getRuleContext(SlotContext.class,i);
		}
		public Member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_list; }
	}

	public final Member_listContext member_list() throws RecognitionException {
		Member_listContext _localctx = new Member_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_member_list);

		    ((Member_listContext)_localctx).membs =  new ArrayList<Slot>();
		 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__7);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (VOID - 47)) | (1L << (CHAR - 47)) | (1L << (SHORT - 47)) | (1L << (INT - 47)) | (1L << (LONG - 47)) | (1L << (STRUCT - 47)) | (1L << (UNION - 47)) | (1L << (UNSIGNED - 47)) | (1L << (IDENTIFIER - 47)))) != 0)) {
				{
				{
				setState(288);
				slot();
				setState(289);
				match(T__1);
				 _localctx.membs.add(slot().slod); 
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(T__8);
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

	public static class SlotContext extends ParserRuleContext {
		public Slot slod;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SlotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slot; }
	}

	public final SlotContext slot() throws RecognitionException {
		SlotContext _localctx = new SlotContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_slot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			type();
			setState(300);
			name();
			}
			_ctx.stop = _input.LT(-1);

			    ((SlotContext)_localctx).slod =  new Slot(type().typeNode, name().text);

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

	public static class FuncdeclContext extends ParserRuleContext {
		public UndefinedFunction undefinedFunction;
		public TerminalNode EXTERN() { return getToken(CflatParser.EXTERN, 0); }
		public TyperefContext typeref() {
			return getRuleContext(TyperefContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl; }
	}

	public final FuncdeclContext funcdecl() throws RecognitionException {
		FuncdeclContext _localctx = new FuncdeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(EXTERN);
			setState(303);
			typeref();
			setState(304);
			name();
			setState(305);
			match(T__4);
			setState(306);
			params();
			setState(307);
			match(T__5);
			setState(308);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			    TypeRef t = new FunctionTypeRef(typeref().typeRef, params().paramz.parametersTypeRef());
			    ((FuncdeclContext)_localctx).undefinedFunction =   new UndefinedFunction(new TypeNode(t), name().text, params().paramz);

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

	public static class VardeclContext extends ParserRuleContext {
		public UndefinedVariable undefinedVariable;
		public TerminalNode EXTERN() { return getToken(CflatParser.EXTERN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(EXTERN);
			setState(311);
			type();
			setState(312);
			name();
			setState(313);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			((VardeclContext)_localctx).undefinedVariable =  new UndefinedVariable(type().typeNode, name().text);

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

	public static class TypeContext extends ParserRuleContext {
		public TypeNode typeNode;
		public TyperefContext typeref() {
			return getRuleContext(TyperefContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			typeref();
			}
			_ctx.stop = _input.LT(-1);

			((TypeContext)_localctx).typeNode =  new TypeNode(typeref().typeRef);

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

	public static class TyperefContext extends ParserRuleContext {
		public TypeRef typeRef;
		public Token t;
		public Typeref_baseContext typeref_base() {
			return getRuleContext(Typeref_baseContext.class,0);
		}
		public List<Param_typerefsContext> param_typerefs() {
			return getRuleContexts(Param_typerefsContext.class);
		}
		public Param_typerefsContext param_typerefs(int i) {
			return getRuleContext(Param_typerefsContext.class,i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(CflatParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(CflatParser.INTEGER, i);
		}
		public TyperefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeref; }
	}

	public final TyperefContext typeref() throws RecognitionException {
		TyperefContext _localctx = new TyperefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			typeref_base();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__9) | (1L << T__11))) != 0)) {
				{
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(318);
					match(T__9);
					setState(319);
					match(T__10);

					            ((TyperefContext)_localctx).typeRef =  new ArrayTypeRef(typeref_base().typeRef);
					        
					}
					break;
				case 2:
					{
					setState(321);
					match(T__9);
					setState(322);
					((TyperefContext)_localctx).t = match(INTEGER);
					setState(323);
					match(T__10);

					            ((TyperefContext)_localctx).typeRef =  new ArrayTypeRef(typeref_base().typeRef, integerValue(((TyperefContext)_localctx).t.getText()));
					        
					}
					break;
				case 3:
					{
					setState(325);
					match(T__11);

					            ((TyperefContext)_localctx).typeRef =  new PointerTypeRef(typeref_base().typeRef);
					        
					}
					break;
				case 4:
					{
					setState(327);
					match(T__4);
					setState(328);
					param_typerefs();
					setState(329);
					match(T__5);

					            ((TyperefContext)_localctx).typeRef =  new FunctionTypeRef(typeref_base().typeRef, param_typerefs().paramTypeRefs);
					        
					}
					break;
				}
				}
				setState(336);
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

	public static class Param_typerefsContext extends ParserRuleContext {
		public ParamTypeRefs paramTypeRefs;
		public TerminalNode VOID() { return getToken(CflatParser.VOID, 0); }
		public Fixedparam_typerefsContext fixedparam_typerefs() {
			return getRuleContext(Fixedparam_typerefsContext.class,0);
		}
		public Param_typerefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_typerefs; }
	}

	public final Param_typerefsContext param_typerefs() throws RecognitionException {
		Param_typerefsContext _localctx = new Param_typerefsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_param_typerefs);
		int _la;
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(VOID);

				            ((Param_typerefsContext)_localctx).paramTypeRefs =   new ParamTypeRefs(new ArrayList<TypeRef>());
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				fixedparam_typerefs();
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(340);
					match(T__3);
					setState(341);
					match(T__6);
					 fixedparam_typerefs().paramTypeRefs.acceptVarargs(); 
					}
				}

				((Param_typerefsContext)_localctx).paramTypeRefs =  fixedparam_typerefs().paramTypeRefs;
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

	public static class Fixedparam_typerefsContext extends ParserRuleContext {
		public ParamTypeRefs paramTypeRefs;
		public TyperefContext ref;
		public List<TyperefContext> typeref() {
			return getRuleContexts(TyperefContext.class);
		}
		public TyperefContext typeref(int i) {
			return getRuleContext(TyperefContext.class,i);
		}
		public Fixedparam_typerefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedparam_typerefs; }
	}

	public final Fixedparam_typerefsContext fixedparam_typerefs() throws RecognitionException {
		Fixedparam_typerefsContext _localctx = new Fixedparam_typerefsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fixedparam_typerefs);

		 List<TypeRef> refs = new ArrayList<TypeRef>();
		 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((Fixedparam_typerefsContext)_localctx).ref = typeref();
			 refs.add(((Fixedparam_typerefsContext)_localctx).ref.typeRef); 
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(351);
					match(T__3);
					setState(352);
					((Fixedparam_typerefsContext)_localctx).ref = typeref();
					 refs.add(((Fixedparam_typerefsContext)_localctx).ref.typeRef); 
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);

			 ((Fixedparam_typerefsContext)_localctx).paramTypeRefs =   new ParamTypeRefs(refs);
			 
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

	public static class Typeref_baseContext extends ParserRuleContext {
		public TypeRef typeRef;
		public Token n;
		public TerminalNode VOID() { return getToken(CflatParser.VOID, 0); }
		public TerminalNode CHAR() { return getToken(CflatParser.CHAR, 0); }
		public TerminalNode SHORT() { return getToken(CflatParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(CflatParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CflatParser.LONG, 0); }
		public TerminalNode UNSIGNED() { return getToken(CflatParser.UNSIGNED, 0); }
		public TerminalNode STRUCT() { return getToken(CflatParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
		public TerminalNode UNION() { return getToken(CflatParser.UNION, 0); }
		public Typeref_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeref_base; }
	}

	public final Typeref_baseContext typeref_base() throws RecognitionException {
		Typeref_baseContext _localctx = new Typeref_baseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeref_base);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(VOID);
				 ((Typeref_baseContext)_localctx).typeRef =   new VoidTypeRef(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(CHAR);
				 ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.charRef(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(SHORT);
				 ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.shortRef(); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(INT);
				 ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.intRef(); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				match(LONG);
				 ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.longRef(); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(370);
				match(UNSIGNED);
				setState(371);
				match(CHAR);
				 ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.ucharRef(); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(373);
				match(UNSIGNED);
				setState(374);
				match(SHORT);
				 ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.ushortRef(); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(376);
				match(UNSIGNED);
				setState(377);
				match(INT);
				 ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.uintRef(); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(379);
				match(UNSIGNED);
				setState(380);
				match(LONG);
				 ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.ulongRef(); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(382);
				match(STRUCT);
				setState(383);
				((Typeref_baseContext)_localctx).n = match(IDENTIFIER);
				 ((Typeref_baseContext)_localctx).typeRef =   new StructTypeRef(((Typeref_baseContext)_localctx).n.getText()); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(385);
				match(UNION);
				setState(386);
				((Typeref_baseContext)_localctx).n = match(IDENTIFIER);
				 ((Typeref_baseContext)_localctx).typeRef =   new UnionTypeRef(((Typeref_baseContext)_localctx).n.getText()); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(388);
				((Typeref_baseContext)_localctx).n = match(IDENTIFIER);
				 ((Typeref_baseContext)_localctx).typeRef =   new UserTypeRef(((Typeref_baseContext)_localctx).n.getText()); 
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

	public static class TypedefContext extends ParserRuleContext {
		public TypedefNode typedefNode;
		public Token newname;
		public TerminalNode TYPEDEF() { return getToken(CflatParser.TYPEDEF, 0); }
		public TyperefContext typeref() {
			return getRuleContext(TyperefContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(TYPEDEF);
			setState(393);
			typeref();
			setState(394);
			((TypedefContext)_localctx).newname = match(IDENTIFIER);
			setState(395);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			    addType(((TypedefContext)_localctx).newname.getText());
			    ((TypedefContext)_localctx).typedefNode =   new TypedefNode(typeref().typeRef, ((TypedefContext)_localctx).newname.getText());

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

	public static class StmtsContext extends ParserRuleContext {
		public List<StmtNode> ss;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_stmts);

		((StmtsContext)_localctx).ss =  new ArrayList<StmtNode>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << IF) | (1L << SWITCH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (DO - 65)) | (1L << (FOR - 65)) | (1L << (RETURN - 65)) | (1L << (BREAK - 65)) | (1L << (CONTINUE - 65)) | (1L << (GOTO - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (CHARACTER - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (INTEGER - 65)))) != 0)) {
				{
				{
				setState(397);
				stmt();
				 if (stmt().stmtNode != null) _localctx.ss.add(stmt().stmtNode); 
				}
				}
				setState(404);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtNode stmtNode;
		public Labeled_stmtContext labeled_stmt() {
			return getRuleContext(Labeled_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Dowhile_stmtContext dowhile_stmt() {
			return getRuleContext(Dowhile_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Goto_stmtContext goto_stmt() {
			return getRuleContext(Goto_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(405);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(406);
				labeled_stmt();
				 ((StmtContext)_localctx).stmtNode =  labeled_stmt().labelNode;
				}
				break;
			case 3:
				{
				setState(409);
				expr();
				setState(410);
				match(T__1);
				 ((StmtContext)_localctx).stmtNode =  new ExprStmtNode(expr().exprNode); 
				}
				break;
			case 4:
				{
				setState(413);
				block();
				 ((StmtContext)_localctx).stmtNode =  block().blockNode;
				}
				break;
			case 5:
				{
				setState(416);
				if_stmt();
				 ((StmtContext)_localctx).stmtNode = if_stmt().ifNode;
				}
				break;
			case 6:
				{
				setState(419);
				while_stmt();
				 ((StmtContext)_localctx).stmtNode = while_stmt().whileNode;
				}
				break;
			case 7:
				{
				setState(422);
				dowhile_stmt();
				 ((StmtContext)_localctx).stmtNode =  dowhile_stmt().doWhileNode;
				}
				break;
			case 8:
				{
				setState(425);
				for_stmt();
				 ((StmtContext)_localctx).stmtNode = for_stmt().forNode;
				}
				break;
			case 9:
				{
				setState(428);
				switch_stmt();
				 ((StmtContext)_localctx).stmtNode = switch_stmt().switchNode;
				}
				break;
			case 10:
				{
				setState(431);
				break_stmt();
				 ((StmtContext)_localctx).stmtNode = break_stmt().breakNode;
				}
				break;
			case 11:
				{
				setState(434);
				continue_stmt();
				 ((StmtContext)_localctx).stmtNode = continue_stmt().continueNode;
				}
				break;
			case 12:
				{
				setState(437);
				goto_stmt();
				 ((StmtContext)_localctx).stmtNode =  goto_stmt().gotoNode;
				}
				break;
			case 13:
				{
				setState(440);
				return_stmt();
				 ((StmtContext)_localctx).stmtNode =   return_stmt().returnNode;
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

	public static class Labeled_stmtContext extends ParserRuleContext {
		public LabelNode labelNode;
		public Token t;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
		public Labeled_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_stmt; }
	}

	public final Labeled_stmtContext labeled_stmt() throws RecognitionException {
		Labeled_stmtContext _localctx = new Labeled_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_labeled_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			((Labeled_stmtContext)_localctx).t = match(IDENTIFIER);
			setState(446);
			match(T__12);
			setState(447);
			stmt();
			}
			_ctx.stop = _input.LT(-1);

			((Labeled_stmtContext)_localctx).labelNode =  new LabelNode(((Labeled_stmtContext)_localctx).t.getText(), stmt().stmtNode);

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

	public static class If_stmtContext extends ParserRuleContext {
		public IfNode ifNode;
		public ExprContext cond;
		public StmtContext thenBody;
		public StmtContext elseBody;
		public TerminalNode IF() { return getToken(CflatParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CflatParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(IF);
			setState(450);
			match(T__4);
			setState(451);
			((If_stmtContext)_localctx).cond = expr();
			setState(452);
			match(T__5);
			setState(453);
			((If_stmtContext)_localctx).thenBody = stmt();
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(454);
				match(ELSE);
				setState(455);
				((If_stmtContext)_localctx).elseBody = stmt();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);

			 ((If_stmtContext)_localctx).ifNode =   new IfNode(((If_stmtContext)_localctx).cond.exprNode, ((If_stmtContext)_localctx).thenBody.stmtNode, ((If_stmtContext)_localctx).elseBody.stmtNode);

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

	public static class While_stmtContext extends ParserRuleContext {
		public WhileNode whileNode;
		public ExprContext cond;
		public StmtContext body;
		public TerminalNode WHILE() { return getToken(CflatParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(WHILE);
			setState(459);
			match(T__4);
			setState(460);
			((While_stmtContext)_localctx).cond = expr();
			setState(461);
			match(T__5);
			setState(462);
			((While_stmtContext)_localctx).body = stmt();
			}
			_ctx.stop = _input.LT(-1);

			((While_stmtContext)_localctx).whileNode =  new WhileNode(((While_stmtContext)_localctx).cond.exprNode, ((While_stmtContext)_localctx).body.stmtNode);

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

	public static class Dowhile_stmtContext extends ParserRuleContext {
		public DoWhileNode doWhileNode;
		public StmtContext body;
		public ExprContext cond;
		public TerminalNode DO() { return getToken(CflatParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(CflatParser.WHILE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dowhile_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile_stmt; }
	}

	public final Dowhile_stmtContext dowhile_stmt() throws RecognitionException {
		Dowhile_stmtContext _localctx = new Dowhile_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dowhile_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(DO);
			setState(465);
			((Dowhile_stmtContext)_localctx).body = stmt();
			setState(466);
			match(WHILE);
			setState(467);
			match(T__4);
			setState(468);
			((Dowhile_stmtContext)_localctx).cond = expr();
			setState(469);
			match(T__5);
			setState(470);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			((Dowhile_stmtContext)_localctx).doWhileNode =  new DoWhileNode( ((Dowhile_stmtContext)_localctx).body.stmtNode, ((Dowhile_stmtContext)_localctx).cond.exprNode);

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

	public static class For_stmtContext extends ParserRuleContext {
		public ForNode forNode;
		public ExprContext init;
		public ExprContext cond;
		public ExprContext incr;
		public StmtContext body;
		public TerminalNode FOR() { return getToken(CflatParser.FOR, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(FOR);
			setState(473);
			match(T__4);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(474);
				((For_stmtContext)_localctx).init = expr();
				}
			}

			setState(477);
			match(T__1);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(478);
				((For_stmtContext)_localctx).cond = expr();
				}
			}

			setState(481);
			match(T__1);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(482);
				((For_stmtContext)_localctx).incr = expr();
				}
			}

			setState(485);
			match(T__5);
			setState(486);
			((For_stmtContext)_localctx).body = stmt();
			}
			_ctx.stop = _input.LT(-1);

			((For_stmtContext)_localctx).forNode =  new ForNode(((For_stmtContext)_localctx).init.exprNode, ((For_stmtContext)_localctx).cond.exprNode, ((For_stmtContext)_localctx).incr.exprNode, ((For_stmtContext)_localctx).body.stmtNode);

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

	public static class Switch_stmtContext extends ParserRuleContext {
		public SwitchNode switchNode;
		public ExprContext cond;
		public Case_clausesContext bodies;
		public TerminalNode SWITCH() { return getToken(CflatParser.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Case_clausesContext case_clauses() {
			return getRuleContext(Case_clausesContext.class,0);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(SWITCH);
			setState(489);
			match(T__4);
			setState(490);
			((Switch_stmtContext)_localctx).cond = expr();
			setState(491);
			match(T__5);
			setState(492);
			match(T__7);
			setState(493);
			((Switch_stmtContext)_localctx).bodies = case_clauses();
			setState(494);
			match(T__8);
			}
			_ctx.stop = _input.LT(-1);

			((Switch_stmtContext)_localctx).switchNode =  new SwitchNode(((Switch_stmtContext)_localctx).cond.exprNode, ((Switch_stmtContext)_localctx).bodies.clauses);

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

	public static class Case_clausesContext extends ParserRuleContext {
		public List<CaseNode> clauses;
		public List<Case_clauseContext> case_clause() {
			return getRuleContexts(Case_clauseContext.class);
		}
		public Case_clauseContext case_clause(int i) {
			return getRuleContext(Case_clauseContext.class,i);
		}
		public Default_clauseContext default_clause() {
			return getRuleContext(Default_clauseContext.class,0);
		}
		public Case_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clauses; }
	}

	public final Case_clausesContext case_clauses() throws RecognitionException {
		Case_clausesContext _localctx = new Case_clausesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_case_clauses);

		((Case_clausesContext)_localctx).clauses =  new ArrayList<CaseNode>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(496);
				case_clause();
				 _localctx.clauses.add(case_clause().caseNode); 
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(504);
				default_clause();
				 _localctx.clauses.add(default_clause().caseNode); 
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

	public static class Case_clauseContext extends ParserRuleContext {
		public CaseNode caseNode;
		public CasesContext values;
		public Case_bodyContext body;
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public Case_bodyContext case_body() {
			return getRuleContext(Case_bodyContext.class,0);
		}
		public Case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause; }
	}

	public final Case_clauseContext case_clause() throws RecognitionException {
		Case_clauseContext _localctx = new Case_clauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_case_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			((Case_clauseContext)_localctx).values = cases();
			setState(510);
			((Case_clauseContext)_localctx).body = case_body();
			}
			_ctx.stop = _input.LT(-1);

			 ((Case_clauseContext)_localctx).caseNode =   new CaseNode(((Case_clauseContext)_localctx).values.values, ((Case_clauseContext)_localctx).body.blockNode);

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

	public static class CasesContext extends ParserRuleContext {
		public List<ExprNode> values;
		public List<TerminalNode> CASE() { return getTokens(CflatParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(CflatParser.CASE, i);
		}
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cases);

		((CasesContext)_localctx).values =  new ArrayList<ExprNode>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(512);
				match(CASE);
				setState(513);
				primary();
				setState(514);
				match(T__12);
				 _localctx.values.add(primary().exprNode); 
				}
				}
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
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

	public static class Default_clauseContext extends ParserRuleContext {
		public CaseNode caseNode;
		public Case_bodyContext body;
		public TerminalNode DEFAULT() { return getToken(CflatParser.DEFAULT, 0); }
		public Case_bodyContext case_body() {
			return getRuleContext(Case_bodyContext.class,0);
		}
		public Default_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_clause; }
	}

	public final Default_clauseContext default_clause() throws RecognitionException {
		Default_clauseContext _localctx = new Default_clauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_default_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(DEFAULT);
			setState(522);
			match(T__12);
			setState(523);
			((Default_clauseContext)_localctx).body = case_body();
			}
			_ctx.stop = _input.LT(-1);

			 ((Default_clauseContext)_localctx).caseNode =  new CaseNode(new ArrayList<ExprNode>(), ((Default_clauseContext)_localctx).body.blockNode);
			 
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

	public static class Case_bodyContext extends ParserRuleContext {
		public BlockNode blockNode;
		public StmtContext s;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Case_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_body; }
	}

	public final Case_bodyContext case_body() throws RecognitionException {
		Case_bodyContext _localctx = new Case_bodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_case_body);

		LinkedList<StmtNode> stmts = new LinkedList<StmtNode>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(525);
				((Case_bodyContext)_localctx).s = stmt();
				 if (((Case_bodyContext)_localctx).s.stmtNode != null) stmts.add(((Case_bodyContext)_localctx).s.stmtNode); 
				}
				}
				setState(530); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << IF) | (1L << SWITCH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (DO - 65)) | (1L << (FOR - 65)) | (1L << (RETURN - 65)) | (1L << (BREAK - 65)) | (1L << (CONTINUE - 65)) | (1L << (GOTO - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (CHARACTER - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (INTEGER - 65)))) != 0) );
			}
			_ctx.stop = _input.LT(-1);

			        if (! (stmts.getLast() instanceof BreakNode)) {
			            throw new Error("missing break statement at the last of case clause");
			        }
			         ((Case_bodyContext)_localctx).blockNode =   new BlockNode(
			                             new ArrayList<DefinedVariable>(),
			                             stmts);

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

	public static class Goto_stmtContext extends ParserRuleContext {
		public GotoNode gotoNode;
		public Token n;
		public TerminalNode GOTO() { return getToken(CflatParser.GOTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
		public Goto_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto_stmt; }
	}

	public final Goto_stmtContext goto_stmt() throws RecognitionException {
		Goto_stmtContext _localctx = new Goto_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_goto_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(GOTO);
			setState(533);
			((Goto_stmtContext)_localctx).n = match(IDENTIFIER);
			setState(534);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			((Goto_stmtContext)_localctx).gotoNode =  new GotoNode( ((Goto_stmtContext)_localctx).n.getText());

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

	public static class Break_stmtContext extends ParserRuleContext {
		public BreakNode breakNode;
		public TerminalNode BREAK() { return getToken(CflatParser.BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(BREAK);
			setState(537);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);
			((Break_stmtContext)_localctx).breakNode =  new BreakNode();
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

	public static class Continue_stmtContext extends ParserRuleContext {
		public ContinueNode continueNode;
		public TerminalNode CONTINUE() { return getToken(CflatParser.CONTINUE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(CONTINUE);
			setState(540);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);
			((Continue_stmtContext)_localctx).continueNode =  new ContinueNode();
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

	public static class Return_stmtContext extends ParserRuleContext {
		public ReturnNode returnNode;
		public ExprContext expr0;
		public TerminalNode RETURN() { return getToken(CflatParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_return_stmt);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(RETURN);
				setState(543);
				match(T__1);
				 ((Return_stmtContext)_localctx).returnNode =   new ReturnNode(null); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(RETURN);
				setState(546);
				((Return_stmtContext)_localctx).expr0 = expr();
				setState(547);
				match(T__1);
				 ((Return_stmtContext)_localctx).returnNode =   new ReturnNode(((Return_stmtContext)_localctx).expr0.exprNode); 
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

	public static class ExprContext extends ParserRuleContext {
		public ExprNode exprNode;
		public TermContext lhs;
		public ExprContext rhs;
		public Opassign_opContext op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Opassign_opContext opassign_op() {
			return getRuleContext(Opassign_opContext.class,0);
		}
		public Expr10Context expr10() {
			return getRuleContext(Expr10Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expr);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				((ExprContext)_localctx).lhs = term();
				setState(553);
				match(T__2);
				setState(554);
				((ExprContext)_localctx).rhs = expr();
				 ((ExprContext)_localctx).exprNode =   new AssignNode(((ExprContext)_localctx).lhs.exprNode, ((ExprContext)_localctx).rhs.exprNode);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				((ExprContext)_localctx).lhs = term();
				setState(558);
				((ExprContext)_localctx).op = opassign_op();
				setState(559);
				((ExprContext)_localctx).rhs = expr();
				 ((ExprContext)_localctx).exprNode =   new OpAssignNode(((ExprContext)_localctx).lhs.exprNode, ((ExprContext)_localctx).op.op, ((ExprContext)_localctx).rhs.exprNode);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				expr10();
				((ExprContext)_localctx).exprNode =  expr10().exprNode;
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

	public static class Expr10Context extends ParserRuleContext {
		public ExprNode exprNode;
		public Expr9Context c;
		public ExprContext t;
		public Expr10Context e;
		public Expr9Context expr9() {
			return getRuleContext(Expr9Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr10Context expr10() {
			return getRuleContext(Expr10Context.class,0);
		}
		public Expr10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr10; }
	}

	public final Expr10Context expr10() throws RecognitionException {
		Expr10Context _localctx = new Expr10Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_expr10);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			((Expr10Context)_localctx).c = expr9();
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(568);
				match(T__13);
				setState(569);
				((Expr10Context)_localctx).t = expr();
				setState(570);
				match(T__12);
				setState(571);
				((Expr10Context)_localctx).e = expr10();
				 ((Expr10Context)_localctx).exprNode =   new CondExprNode(((Expr10Context)_localctx).c.exprNode, ((Expr10Context)_localctx).t.exprNode, ((Expr10Context)_localctx).e.exprNode); 
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

	public static class Expr9Context extends ParserRuleContext {
		public ExprNode exprNode;
		public Expr8Context l;
		public Expr8Context r;
		public List<Expr8Context> expr8() {
			return getRuleContexts(Expr8Context.class);
		}
		public Expr8Context expr8(int i) {
			return getRuleContext(Expr8Context.class,i);
		}
		public Expr9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr9; }
	}

	public final Expr9Context expr9() throws RecognitionException {
		Expr9Context _localctx = new Expr9Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_expr9);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			((Expr9Context)_localctx).l = expr8();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(577);
				match(T__14);
				setState(578);
				((Expr9Context)_localctx).r = expr8();
				 ((Expr9Context)_localctx).exprNode =  new LogicalOrNode(((Expr9Context)_localctx).l.exprNode, ((Expr9Context)_localctx).r.exprNode); 
				}
				}
				setState(585);
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

	public static class Expr8Context extends ParserRuleContext {
		public ExprNode exprNode;
		public Expr7Context l;
		public Expr7Context r;
		public List<Expr7Context> expr7() {
			return getRuleContexts(Expr7Context.class);
		}
		public Expr7Context expr7(int i) {
			return getRuleContext(Expr7Context.class,i);
		}
		public Expr8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr8; }
	}

	public final Expr8Context expr8() throws RecognitionException {
		Expr8Context _localctx = new Expr8Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr8);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			((Expr8Context)_localctx).l = expr7();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(587);
				match(T__15);
				setState(588);
				((Expr8Context)_localctx).r = expr7();
				 ((Expr8Context)_localctx).exprNode =  new LogicalAndNode(((Expr8Context)_localctx).l.exprNode, ((Expr8Context)_localctx).r.exprNode); 
				}
				}
				setState(595);
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

	public static class Expr7Context extends ParserRuleContext {
		public ExprNode exprNode;
		public Expr6Context l;
		public Expr6Context r;
		public List<Expr6Context> expr6() {
			return getRuleContexts(Expr6Context.class);
		}
		public Expr6Context expr6(int i) {
			return getRuleContext(Expr6Context.class,i);
		}
		public Expr7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr7; }
	}

	public final Expr7Context expr7() throws RecognitionException {
		Expr7Context _localctx = new Expr7Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_expr7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			((Expr7Context)_localctx).l = expr6();
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				setState(621);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(597);
					match(T__16);
					setState(598);
					((Expr7Context)_localctx).r = expr6();
					 ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(((Expr7Context)_localctx).l.exprNode, ">", ((Expr7Context)_localctx).r.exprNode); 
					}
					break;
				case T__17:
					{
					setState(601);
					match(T__17);
					setState(602);
					((Expr7Context)_localctx).r = expr6();
					 ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(((Expr7Context)_localctx).l.exprNode, "<", ((Expr7Context)_localctx).r.exprNode); 
					}
					break;
				case T__18:
					{
					setState(605);
					match(T__18);
					setState(606);
					((Expr7Context)_localctx).r = expr6();
					 ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(((Expr7Context)_localctx).l.exprNode, ">=", ((Expr7Context)_localctx).r.exprNode); 
					}
					break;
				case T__19:
					{
					setState(609);
					match(T__19);
					setState(610);
					((Expr7Context)_localctx).r = expr6();
					 ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(((Expr7Context)_localctx).l.exprNode, "<=", ((Expr7Context)_localctx).r.exprNode); 
					}
					break;
				case T__20:
					{
					setState(613);
					match(T__20);
					setState(614);
					((Expr7Context)_localctx).r = expr6();
					 ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(((Expr7Context)_localctx).l.exprNode, "==", ((Expr7Context)_localctx).r.exprNode); 
					}
					break;
				case T__21:
					{
					setState(617);
					match(T__21);
					setState(618);
					((Expr7Context)_localctx).r = expr6();
					 ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(((Expr7Context)_localctx).l.exprNode, "!=", ((Expr7Context)_localctx).r.exprNode); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(625);
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

	public static class Expr6Context extends ParserRuleContext {
		public ExprNode exprNode;
		public Expr5Context l;
		public Expr5Context r;
		public List<Expr5Context> expr5() {
			return getRuleContexts(Expr5Context.class);
		}
		public Expr5Context expr5(int i) {
			return getRuleContext(Expr5Context.class,i);
		}
		public Expr6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr6; }
	}

	public final Expr6Context expr6() throws RecognitionException {
		Expr6Context _localctx = new Expr6Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_expr6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			((Expr6Context)_localctx).l = expr5();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(627);
				match(T__22);
				setState(628);
				((Expr6Context)_localctx).r = expr5();
				 ((Expr6Context)_localctx).exprNode =  new BinaryOpNode(((Expr6Context)_localctx).l.exprNode, "|", ((Expr6Context)_localctx).r.exprNode); 
				}
				}
				setState(635);
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

	public static class Expr5Context extends ParserRuleContext {
		public ExprNode exprNode;
		public Expr4Context l;
		public Expr4Context r;
		public List<Expr4Context> expr4() {
			return getRuleContexts(Expr4Context.class);
		}
		public Expr4Context expr4(int i) {
			return getRuleContext(Expr4Context.class,i);
		}
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }
	}

	public final Expr5Context expr5() throws RecognitionException {
		Expr5Context _localctx = new Expr5Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_expr5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			((Expr5Context)_localctx).l = expr4();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(637);
				match(T__23);
				setState(638);
				((Expr5Context)_localctx).r = expr4();
				 ((Expr5Context)_localctx).exprNode =  new BinaryOpNode(((Expr5Context)_localctx).l.exprNode, "^", ((Expr5Context)_localctx).r.exprNode); 
				}
				}
				setState(645);
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

	public static class Expr4Context extends ParserRuleContext {
		public ExprNode exprNode;
		public Expr3Context l;
		public Expr3Context r;
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_expr4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			((Expr4Context)_localctx).l = expr3();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(647);
				match(T__24);
				setState(648);
				((Expr4Context)_localctx).r = expr3();
				 ((Expr4Context)_localctx).exprNode =  new BinaryOpNode(((Expr4Context)_localctx).l.exprNode, "&", ((Expr4Context)_localctx).r.exprNode); 
				}
				}
				setState(655);
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

	public static class Expr3Context extends ParserRuleContext {
		public ExprNode exprNode;
		public Expr2Context l;
		public Expr2Context r;
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_expr3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			((Expr3Context)_localctx).l = expr2();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25 || _la==T__26) {
				{
				setState(665);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(657);
					match(T__25);
					setState(658);
					((Expr3Context)_localctx).r = expr2();
					 ((Expr3Context)_localctx).exprNode =  new BinaryOpNode(((Expr3Context)_localctx).l.exprNode, ">>", ((Expr3Context)_localctx).r.exprNode); 
					}
					break;
				case T__26:
					{
					setState(661);
					match(T__26);
					setState(662);
					((Expr3Context)_localctx).r = expr2();
					 ((Expr3Context)_localctx).exprNode =  new BinaryOpNode(((Expr3Context)_localctx).l.exprNode, "<<", ((Expr3Context)_localctx).r.exprNode); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(669);
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

	public static class Expr2Context extends ParserRuleContext {
		public ExprNode exprNode;
		public Expr1Context l;
		public Expr1Context r;
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_expr2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			((Expr2Context)_localctx).l = expr1();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==T__28) {
				{
				setState(679);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(671);
					match(T__27);
					setState(672);
					((Expr2Context)_localctx).r = expr1();
					 ((Expr2Context)_localctx).exprNode =  new BinaryOpNode(((Expr2Context)_localctx).l.exprNode, "+", ((Expr2Context)_localctx).r.exprNode); 
					}
					break;
				case T__28:
					{
					setState(675);
					match(T__28);
					setState(676);
					((Expr2Context)_localctx).r = expr1();
					 ((Expr2Context)_localctx).exprNode =  new BinaryOpNode(((Expr2Context)_localctx).l.exprNode, "-", ((Expr2Context)_localctx).r.exprNode); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(683);
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

	public static class Expr1Context extends ParserRuleContext {
		public ExprNode exprNode;
		public TermContext l;
		public TermContext r;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_expr1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			((Expr1Context)_localctx).l = term();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				setState(697);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(685);
					match(T__11);
					setState(686);
					((Expr1Context)_localctx).r = term();
					 ((Expr1Context)_localctx).exprNode =  new BinaryOpNode(((Expr1Context)_localctx).l.exprNode, "*", ((Expr1Context)_localctx).r.exprNode); 
					}
					break;
				case T__29:
					{
					setState(689);
					match(T__29);
					setState(690);
					((Expr1Context)_localctx).r = term();
					 ((Expr1Context)_localctx).exprNode =  new BinaryOpNode(((Expr1Context)_localctx).l.exprNode, "/", ((Expr1Context)_localctx).r.exprNode); 
					}
					break;
				case T__30:
					{
					setState(693);
					match(T__30);
					setState(694);
					((Expr1Context)_localctx).r = term();
					 ((Expr1Context)_localctx).exprNode =  new BinaryOpNode(((Expr1Context)_localctx).l.exprNode, "%", ((Expr1Context)_localctx).r.exprNode); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(701);
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

	public static class Opassign_opContext extends ParserRuleContext {
		public String op;
		public Opassign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opassign_op; }
	}

	public final Opassign_opContext opassign_op() throws RecognitionException {
		Opassign_opContext _localctx = new Opassign_opContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_opassign_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				{
				setState(702);
				match(T__31);
				 ((Opassign_opContext)_localctx).op =   "+"; 
				}
				break;
			case T__32:
				{
				setState(704);
				match(T__32);
				 ((Opassign_opContext)_localctx).op =   "-"; 
				}
				break;
			case T__33:
				{
				setState(706);
				match(T__33);
				 ((Opassign_opContext)_localctx).op =   "*"; 
				}
				break;
			case T__34:
				{
				setState(708);
				match(T__34);
				 ((Opassign_opContext)_localctx).op =   "/"; 
				}
				break;
			case T__35:
				{
				setState(710);
				match(T__35);
				 ((Opassign_opContext)_localctx).op =   "%"; 
				}
				break;
			case T__36:
				{
				setState(712);
				match(T__36);
				 ((Opassign_opContext)_localctx).op =   "&"; 
				}
				break;
			case T__37:
				{
				setState(714);
				match(T__37);
				 ((Opassign_opContext)_localctx).op =   "|"; 
				}
				break;
			case T__38:
				{
				setState(716);
				match(T__38);
				 ((Opassign_opContext)_localctx).op =   "^"; 
				}
				break;
			case T__39:
				{
				setState(718);
				match(T__39);
				 ((Opassign_opContext)_localctx).op =   "<<"; 
				}
				break;
			case T__40:
				{
				setState(720);
				match(T__40);
				 ((Opassign_opContext)_localctx).op =   ">>"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TermContext extends ParserRuleContext {
		public ExprNode exprNode;
		public TypeContext t;
		public TermContext n;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_term);
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				match(T__4);
				setState(725);
				((TermContext)_localctx).t = type();
				setState(726);
				match(T__5);
				setState(727);
				((TermContext)_localctx).n = term();
				 ((TermContext)_localctx).exprNode =   new CastNode(((TermContext)_localctx).t.typeNode, ((TermContext)_localctx).n.exprNode); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				unary();
				((TermContext)_localctx).exprNode =  unary().exprNode ;
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

	public static class UnaryContext extends ParserRuleContext {
		public ExprNode exprNode;
		public TypeContext t;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(CflatParser.SIZEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unary);
		try {
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(T__41);
				setState(736);
				unary();
				 ((UnaryContext)_localctx).exprNode =  new PrefixOpNode("++", unary().exprNode); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(T__42);
				setState(740);
				unary();
				 ((UnaryContext)_localctx).exprNode =  new PrefixOpNode("--", unary().exprNode); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				match(T__27);
				setState(744);
				term();
				 ((UnaryContext)_localctx).exprNode =  new UnaryOpNode("+", term().exprNode); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(747);
				match(T__28);
				setState(748);
				term();
				 ((UnaryContext)_localctx).exprNode =  new UnaryOpNode("-", term().exprNode); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(751);
				match(T__43);
				setState(752);
				term();
				 ((UnaryContext)_localctx).exprNode =  new UnaryOpNode("!", term().exprNode); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(755);
				match(T__44);
				setState(756);
				term();
				 ((UnaryContext)_localctx).exprNode =  new UnaryOpNode("~", term().exprNode); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(759);
				match(T__11);
				setState(760);
				term();
				 ((UnaryContext)_localctx).exprNode =  new DereferenceNode(term().exprNode); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(763);
				match(T__24);
				setState(764);
				term();
				 ((UnaryContext)_localctx).exprNode =  new AddressNode(term().exprNode); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(767);
				match(SIZEOF);
				setState(768);
				match(T__4);
				setState(769);
				((UnaryContext)_localctx).t = type();
				setState(770);
				match(T__5);

				            ((UnaryContext)_localctx).exprNode =  new SizeofTypeNode(((UnaryContext)_localctx).t.typeNode, size_t());
				         
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(773);
				match(SIZEOF);
				setState(774);
				unary();

				             ((UnaryContext)_localctx).exprNode =  new SizeofExprNode(unary().exprNode, size_t());
				         
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(777);
				postfix();
				 ((UnaryContext)_localctx).exprNode =  postfix().exprNode;
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

	public static class PostfixContext extends ParserRuleContext {
		public ExprNode exprNode;
		public PrimaryContext expr0;
		public ExprContext idx;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_postfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			((PostfixContext)_localctx).expr0 = primary();
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__9) | (1L << T__41) | (1L << T__42) | (1L << T__45))) != 0)) {
				{
				setState(805);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__41:
					{
					setState(783);
					match(T__41);
					((PostfixContext)_localctx).exprNode =  new SuffixOpNode("++", ((PostfixContext)_localctx).expr0.exprNode); 
					}
					break;
				case T__42:
					{
					setState(785);
					match(T__42);
					((PostfixContext)_localctx).exprNode =  new SuffixOpNode("--", ((PostfixContext)_localctx).expr0.exprNode); 
					}
					break;
				case T__9:
					{
					setState(787);
					match(T__9);
					setState(788);
					((PostfixContext)_localctx).idx = expr();
					setState(789);
					match(T__10);
					 ((PostfixContext)_localctx).exprNode =  new ArefNode(((PostfixContext)_localctx).expr0.exprNode, ((PostfixContext)_localctx).idx.exprNode); 
					}
					break;
				case T__0:
					{
					setState(792);
					match(T__0);
					setState(793);
					name();
					 ((PostfixContext)_localctx).exprNode =  new MemberNode(((PostfixContext)_localctx).expr0.exprNode, name().text); 
					}
					break;
				case T__45:
					{
					setState(796);
					match(T__45);
					setState(797);
					name();
					 ((PostfixContext)_localctx).exprNode =  new PtrMemberNode(((PostfixContext)_localctx).expr0.exprNode, name().text); 
					}
					break;
				case T__4:
					{
					setState(800);
					match(T__4);
					setState(801);
					args();
					setState(802);
					match(T__5);
					 ((PostfixContext)_localctx).exprNode =  new FuncallNode(((PostfixContext)_localctx).expr0.exprNode, args().argz); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(809);
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

	public static class NameContext extends ParserRuleContext {
		public String text;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			((NameContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((NameContext)_localctx).text =   (((NameContext)_localctx).IDENTIFIER!=null?((NameContext)_localctx).IDENTIFIER.getText():null) ;
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprNode> argz;
		public ExprContext arg;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_args);

		((ArgsContext)_localctx).argz =  new ArrayList<ExprNode>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(813);
				((ArgsContext)_localctx).arg = expr();
				 _localctx.argz.add(((ArgsContext)_localctx).arg.exprNode); 
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(815);
					match(T__3);
					setState(816);
					((ArgsContext)_localctx).arg = expr();
					 _localctx.argz.add(((ArgsContext)_localctx).arg.exprNode); 
					}
					}
					setState(823);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExprNode exprNode;
		public Token t;
		public TerminalNode INTEGER() { return getToken(CflatParser.INTEGER, 0); }
		public TerminalNode CHARACTER() { return getToken(CflatParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(CflatParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_primary);
		try {
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				((PrimaryContext)_localctx).t = match(INTEGER);
				 ((PrimaryContext)_localctx).exprNode =  integerNode(((PrimaryContext)_localctx).t.getText()); 
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				((PrimaryContext)_localctx).t = match(CHARACTER);
				((PrimaryContext)_localctx).exprNode =  new IntegerLiteralNode(IntegerTypeRef.charRef(),characterCode(((PrimaryContext)_localctx).t.getText()));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(830);
				((PrimaryContext)_localctx).t = match(STRING);
				 ((PrimaryContext)_localctx).exprNode =  new StringLiteralNode(new PointerTypeRef(IntegerTypeRef.charRef()),((PrimaryContext)_localctx).t.getText());
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(832);
				((PrimaryContext)_localctx).t = match(IDENTIFIER);
				 ((PrimaryContext)_localctx).exprNode =  new VariableNode(((PrimaryContext)_localctx).t.getText());
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(834);
				match(T__4);
				setState(835);
				expr();
				setState(836);
				match(T__5);
				((PrimaryContext)_localctx).exprNode =  expr().exprNode;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u034c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0095\n\3\f\3\16\3\u0098\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\7\4\u009f\n\4\f\4\16\4\u00a2\13\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5\u00ab\n\5\f\5\16\5\u00ae\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00c4\n\6\f\6"+
		"\16\6\u00c7\13\6\3\7\3\7\3\7\3\7\3\7\5\7\u00ce\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00d5\n\7\3\7\3\7\7\7\u00d9\n\7\f\7\16\7\u00dc\13\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\5\n\u00f0\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f8\n\13\3\13\3\13\5\13\u00fc"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u0103\n\f\f\f\16\f\u0106\13\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u0113\n\17\f\17\16\17"+
		"\u0116\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\7\22\u0127\n\22\f\22\16\22\u012a\13\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\7\27\u014f\n\27\f\27\16\27\u0152\13\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u015a\n\30\3\30\3\30\5\30\u015e\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u0166\n\31\f\31\16\31\u0169\13\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0189\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u0193"+
		"\n\34\f\34\16\34\u0196\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u01be\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u01cb\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\5\"\u01de\n\"\3\"\3\"\5\"\u01e2\n\"\3\"\3\"\5\"\u01e6\n\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\7$\u01f6\n$\f$\16$\u01f9\13"+
		"$\3$\3$\3$\5$\u01fe\n$\3%\3%\3%\3&\3&\3&\3&\3&\6&\u0208\n&\r&\16&\u0209"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\6(\u0213\n(\r(\16(\u0214\3)\3)\3)\3)\3*\3*\3"+
		"*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0229\n,\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\5-\u0238\n-\3.\3.\3.\3.\3.\3.\3.\5.\u0241\n.\3/\3/\3"+
		"/\3/\3/\7/\u0248\n/\f/\16/\u024b\13/\3\60\3\60\3\60\3\60\3\60\7\60\u0252"+
		"\n\60\f\60\16\60\u0255\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\7\61\u0270\n\61\f\61\16\61\u0273\13\61\3\62\3\62\3\62\3"+
		"\62\3\62\7\62\u027a\n\62\f\62\16\62\u027d\13\62\3\63\3\63\3\63\3\63\3"+
		"\63\7\63\u0284\n\63\f\63\16\63\u0287\13\63\3\64\3\64\3\64\3\64\3\64\7"+
		"\64\u028e\n\64\f\64\16\64\u0291\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\7\65\u029c\n\65\f\65\16\65\u029f\13\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\7\66\u02aa\n\66\f\66\16\66\u02ad\13\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u02bc"+
		"\n\67\f\67\16\67\u02bf\13\67\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\58\u02d5\n8\39\39\39\39\39\39\39\39\39\59\u02e0\n"+
		"9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5"+
		":\u030f\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\7;\u0328\n;\f;\16;\u032b\13;\3<\3<\3<\3=\3=\3=\3=\3=\3=\7="+
		"\u0336\n=\f=\16=\u0339\13=\5=\u033b\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\5>\u034a\n>\3>\2\2?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\2\2\u0382\2|\3"+
		"\2\2\2\4\u0080\3\2\2\2\6\u00a0\3\2\2\2\b\u00a3\3\2\2\2\n\u00c5\3\2\2\2"+
		"\f\u00c8\3\2\2\2\16\u00df\3\2\2\2\20\u00e6\3\2\2\2\22\u00ef\3\2\2\2\24"+
		"\u00fb\3\2\2\2\26\u00fd\3\2\2\2\30\u0107\3\2\2\2\32\u010a\3\2\2\2\34\u0114"+
		"\3\2\2\2\36\u0117\3\2\2\2 \u011c\3\2\2\2\"\u0121\3\2\2\2$\u012d\3\2\2"+
		"\2&\u0130\3\2\2\2(\u0138\3\2\2\2*\u013d\3\2\2\2,\u013f\3\2\2\2.\u015d"+
		"\3\2\2\2\60\u015f\3\2\2\2\62\u0188\3\2\2\2\64\u018a\3\2\2\2\66\u0194\3"+
		"\2\2\28\u01bd\3\2\2\2:\u01bf\3\2\2\2<\u01c3\3\2\2\2>\u01cc\3\2\2\2@\u01d2"+
		"\3\2\2\2B\u01da\3\2\2\2D\u01ea\3\2\2\2F\u01f7\3\2\2\2H\u01ff\3\2\2\2J"+
		"\u0207\3\2\2\2L\u020b\3\2\2\2N\u0212\3\2\2\2P\u0216\3\2\2\2R\u021a\3\2"+
		"\2\2T\u021d\3\2\2\2V\u0228\3\2\2\2X\u0237\3\2\2\2Z\u0239\3\2\2\2\\\u0242"+
		"\3\2\2\2^\u024c\3\2\2\2`\u0256\3\2\2\2b\u0274\3\2\2\2d\u027e\3\2\2\2f"+
		"\u0288\3\2\2\2h\u0292\3\2\2\2j\u02a0\3\2\2\2l\u02ae\3\2\2\2n\u02d4\3\2"+
		"\2\2p\u02df\3\2\2\2r\u030e\3\2\2\2t\u0310\3\2\2\2v\u032c\3\2\2\2x\u033a"+
		"\3\2\2\2z\u0349\3\2\2\2|}\5\6\4\2}~\5\n\6\2~\177\7\2\2\3\177\3\3\2\2\2"+
		"\u0080\u0081\5\6\4\2\u0081\u0096\b\3\1\2\u0082\u0083\5&\24\2\u0083\u0084"+
		"\b\3\1\2\u0084\u0095\3\2\2\2\u0085\u0086\5(\25\2\u0086\u0087\b\3\1\2\u0087"+
		"\u0095\3\2\2\2\u0088\u0089\5\16\b\2\u0089\u008a\b\3\1\2\u008a\u0095\3"+
		"\2\2\2\u008b\u008c\5\36\20\2\u008c\u008d\b\3\1\2\u008d\u0095\3\2\2\2\u008e"+
		"\u008f\5 \21\2\u008f\u0090\b\3\1\2\u0090\u0095\3\2\2\2\u0091\u0092\5\64"+
		"\33\2\u0092\u0093\b\3\1\2\u0093\u0095\3\2\2\2\u0094\u0082\3\2\2\2\u0094"+
		"\u0085\3\2\2\2\u0094\u0088\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008e\3\2"+
		"\2\2\u0094\u0091\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\2"+
		"\2\3\u009a\5\3\2\2\2\u009b\u009c\5\b\5\2\u009c\u009d\b\4\1\2\u009d\u009f"+
		"\3\2\2\2\u009e\u009b\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\7\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7K\2\2"+
		"\u00a4\u00a5\5v<\2\u00a5\u00ac\b\5\1\2\u00a6\u00a7\7\3\2\2\u00a7\u00a8"+
		"\5v<\2\u00a8\u00a9\b\5\1\2\u00a9\u00ab\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\4\2\2\u00b0\t\3\2\2\2\u00b1\u00b2"+
		"\5\20\t\2\u00b2\u00b3\b\6\1\2\u00b3\u00c4\3\2\2\2\u00b4\u00b5\5\f\7\2"+
		"\u00b5\u00b6\b\6\1\2\u00b6\u00c4\3\2\2\2\u00b7\u00b8\5\16\b\2\u00b8\u00b9"+
		"\b\6\1\2\u00b9\u00c4\3\2\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00bc\b\6\1\2"+
		"\u00bc\u00c4\3\2\2\2\u00bd\u00be\5 \21\2\u00be\u00bf\b\6\1\2\u00bf\u00c4"+
		"\3\2\2\2\u00c0\u00c1\5\64\33\2\u00c1\u00c2\b\6\1\2\u00c2\u00c4\3\2\2\2"+
		"\u00c3\u00b1\3\2\2\2\u00c3\u00b4\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00ba"+
		"\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\13\3\2\2\2\u00c7\u00c5\3\2\2"+
		"\2\u00c8\u00c9\5\22\n\2\u00c9\u00ca\5*\26\2\u00ca\u00cd\5v<\2\u00cb\u00cc"+
		"\7\5\2\2\u00cc\u00ce\5X-\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00da\b\7\1\2\u00d0\u00d1\7\6\2\2\u00d1\u00d4\5v"+
		"<\2\u00d2\u00d3\7\5\2\2\u00d3\u00d5\5X-\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\7\1\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d0\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\4\2\2\u00de"+
		"\r\3\2\2\2\u00df\u00e0\7;\2\2\u00e0\u00e1\5*\26\2\u00e1\u00e2\5v<\2\u00e2"+
		"\u00e3\7\5\2\2\u00e3\u00e4\5X-\2\u00e4\u00e5\7\4\2\2\u00e5\17\3\2\2\2"+
		"\u00e6\u00e7\5\22\n\2\u00e7\u00e8\5,\27\2\u00e8\u00e9\5v<\2\u00e9\u00ea"+
		"\7\7\2\2\u00ea\u00eb\5\24\13\2\u00eb\u00ec\7\b\2\2\u00ec\u00ed\5\32\16"+
		"\2\u00ed\21\3\2\2\2\u00ee\u00f0\79\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\23\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00fc\b\13\1\2\u00f3"+
		"\u00f7\5\26\f\2\u00f4\u00f5\7\6\2\2\u00f5\u00f6\7\t\2\2\u00f6\u00f8\b"+
		"\13\1\2\u00f7\u00f4\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\b\13\1\2\u00fa\u00fc\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f3\3"+
		"\2\2\2\u00fc\25\3\2\2\2\u00fd\u00fe\5\30\r\2\u00fe\u0104\b\f\1\2\u00ff"+
		"\u0100\5\30\r\2\u0100\u0101\b\f\1\2\u0101\u0103\3\2\2\2\u0102\u00ff\3"+
		"\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\27\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\5*\26\2\u0108\u0109\5v<\2"+
		"\u0109\31\3\2\2\2\u010a\u010b\7\n\2\2\u010b\u010c\5\34\17\2\u010c\u010d"+
		"\5\66\34\2\u010d\u010e\7\13\2\2\u010e\33\3\2\2\2\u010f\u0110\5\f\7\2\u0110"+
		"\u0111\b\17\1\2\u0111\u0113\3\2\2\2\u0112\u010f\3\2\2\2\u0113\u0116\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\35\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\7\66\2\2\u0118\u0119\5v<\2\u0119\u011a\5\""+
		"\22\2\u011a\u011b\7\4\2\2\u011b\37\3\2\2\2\u011c\u011d\7\67\2\2\u011d"+
		"\u011e\5v<\2\u011e\u011f\5\"\22\2\u011f\u0120\7\4\2\2\u0120!\3\2\2\2\u0121"+
		"\u0128\7\n\2\2\u0122\u0123\5$\23\2\u0123\u0124\7\4\2\2\u0124\u0125\b\22"+
		"\1\2\u0125\u0127\3\2\2\2\u0126\u0122\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012c\7\13\2\2\u012c#\3\2\2\2\u012d\u012e\5*\26\2\u012e\u012f"+
		"\5v<\2\u012f%\3\2\2\2\u0130\u0131\7:\2\2\u0131\u0132\5,\27\2\u0132\u0133"+
		"\5v<\2\u0133\u0134\7\7\2\2\u0134\u0135\5\24\13\2\u0135\u0136\7\b\2\2\u0136"+
		"\u0137\7\4\2\2\u0137\'\3\2\2\2\u0138\u0139\7:\2\2\u0139\u013a\5*\26\2"+
		"\u013a\u013b\5v<\2\u013b\u013c\7\4\2\2\u013c)\3\2\2\2\u013d\u013e\5,\27"+
		"\2\u013e+\3\2\2\2\u013f\u0150\5\62\32\2\u0140\u0141\7\f\2\2\u0141\u0142"+
		"\7\r\2\2\u0142\u014f\b\27\1\2\u0143\u0144\7\f\2\2\u0144\u0145\7P\2\2\u0145"+
		"\u0146\7\r\2\2\u0146\u014f\b\27\1\2\u0147\u0148\7\16\2\2\u0148\u014f\b"+
		"\27\1\2\u0149\u014a\7\7\2\2\u014a\u014b\5.\30\2\u014b\u014c\7\b\2\2\u014c"+
		"\u014d\b\27\1\2\u014d\u014f\3\2\2\2\u014e\u0140\3\2\2\2\u014e\u0143\3"+
		"\2\2\2\u014e\u0147\3\2\2\2\u014e\u0149\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151-\3\2\2\2\u0152\u0150\3\2\2\2"+
		"\u0153\u0154\7\61\2\2\u0154\u015e\b\30\1\2\u0155\u0159\5\60\31\2\u0156"+
		"\u0157\7\6\2\2\u0157\u0158\7\t\2\2\u0158\u015a\b\30\1\2\u0159\u0156\3"+
		"\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b\30\1\2\u015c"+
		"\u015e\3\2\2\2\u015d\u0153\3\2\2\2\u015d\u0155\3\2\2\2\u015e/\3\2\2\2"+
		"\u015f\u0160\5,\27\2\u0160\u0167\b\31\1\2\u0161\u0162\7\6\2\2\u0162\u0163"+
		"\5,\27\2\u0163\u0164\b\31\1\2\u0164\u0166\3\2\2\2\u0165\u0161\3\2\2\2"+
		"\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\61"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7\61\2\2\u016b\u0189\b\32\1\2"+
		"\u016c\u016d\7\62\2\2\u016d\u0189\b\32\1\2\u016e\u016f\7\63\2\2\u016f"+
		"\u0189\b\32\1\2\u0170\u0171\7\64\2\2\u0171\u0189\b\32\1\2\u0172\u0173"+
		"\7\65\2\2\u0173\u0189\b\32\1\2\u0174\u0175\7=\2\2\u0175\u0176\7\62\2\2"+
		"\u0176\u0189\b\32\1\2\u0177\u0178\7=\2\2\u0178\u0179\7\63\2\2\u0179\u0189"+
		"\b\32\1\2\u017a\u017b\7=\2\2\u017b\u017c\7\64\2\2\u017c\u0189\b\32\1\2"+
		"\u017d\u017e\7=\2\2\u017e\u017f\7\65\2\2\u017f\u0189\b\32\1\2\u0180\u0181"+
		"\7\66\2\2\u0181\u0182\7O\2\2\u0182\u0189\b\32\1\2\u0183\u0184\7\67\2\2"+
		"\u0184\u0185\7O\2\2\u0185\u0189\b\32\1\2\u0186\u0187\7O\2\2\u0187\u0189"+
		"\b\32\1\2\u0188\u016a\3\2\2\2\u0188\u016c\3\2\2\2\u0188\u016e\3\2\2\2"+
		"\u0188\u0170\3\2\2\2\u0188\u0172\3\2\2\2\u0188\u0174\3\2\2\2\u0188\u0177"+
		"\3\2\2\2\u0188\u017a\3\2\2\2\u0188\u017d\3\2\2\2\u0188\u0180\3\2\2\2\u0188"+
		"\u0183\3\2\2\2\u0188\u0186\3\2\2\2\u0189\63\3\2\2\2\u018a\u018b\7J\2\2"+
		"\u018b\u018c\5,\27\2\u018c\u018d\7O\2\2\u018d\u018e\7\4\2\2\u018e\65\3"+
		"\2\2\2\u018f\u0190\58\35\2\u0190\u0191\b\34\1\2\u0191\u0193\3\2\2\2\u0192"+
		"\u018f\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\67\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u01be\7\4\2\2\u0198\u0199"+
		"\5:\36\2\u0199\u019a\b\35\1\2\u019a\u01be\3\2\2\2\u019b\u019c\5X-\2\u019c"+
		"\u019d\7\4\2\2\u019d\u019e\b\35\1\2\u019e\u01be\3\2\2\2\u019f\u01a0\5"+
		"\32\16\2\u01a0\u01a1\b\35\1\2\u01a1\u01be\3\2\2\2\u01a2\u01a3\5<\37\2"+
		"\u01a3\u01a4\b\35\1\2\u01a4\u01be\3\2\2\2\u01a5\u01a6\5> \2\u01a6\u01a7"+
		"\b\35\1\2\u01a7\u01be\3\2\2\2\u01a8\u01a9\5@!\2\u01a9\u01aa\b\35\1\2\u01aa"+
		"\u01be\3\2\2\2\u01ab\u01ac\5B\"\2\u01ac\u01ad\b\35\1\2\u01ad\u01be\3\2"+
		"\2\2\u01ae\u01af\5D#\2\u01af\u01b0\b\35\1\2\u01b0\u01be\3\2\2\2\u01b1"+
		"\u01b2\5R*\2\u01b2\u01b3\b\35\1\2\u01b3\u01be\3\2\2\2\u01b4\u01b5\5T+"+
		"\2\u01b5\u01b6\b\35\1\2\u01b6\u01be\3\2\2\2\u01b7\u01b8\5P)\2\u01b8\u01b9"+
		"\b\35\1\2\u01b9\u01be\3\2\2\2\u01ba\u01bb\5V,\2\u01bb\u01bc\b\35\1\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u0197\3\2\2\2\u01bd\u0198\3\2\2\2\u01bd\u019b\3\2"+
		"\2\2\u01bd\u019f\3\2\2\2\u01bd\u01a2\3\2\2\2\u01bd\u01a5\3\2\2\2\u01bd"+
		"\u01a8\3\2\2\2\u01bd\u01ab\3\2\2\2\u01bd\u01ae\3\2\2\2\u01bd\u01b1\3\2"+
		"\2\2\u01bd\u01b4\3\2\2\2\u01bd\u01b7\3\2\2\2\u01bd\u01ba\3\2\2\2\u01be"+
		"9\3\2\2\2\u01bf\u01c0\7O\2\2\u01c0\u01c1\7\17\2\2\u01c1\u01c2\58\35\2"+
		"\u01c2;\3\2\2\2\u01c3\u01c4\7>\2\2\u01c4\u01c5\7\7\2\2\u01c5\u01c6\5X"+
		"-\2\u01c6\u01c7\7\b\2\2\u01c7\u01ca\58\35\2\u01c8\u01c9\7?\2\2\u01c9\u01cb"+
		"\58\35\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb=\3\2\2\2\u01cc"+
		"\u01cd\7C\2\2\u01cd\u01ce\7\7\2\2\u01ce\u01cf\5X-\2\u01cf\u01d0\7\b\2"+
		"\2\u01d0\u01d1\58\35\2\u01d1?\3\2\2\2\u01d2\u01d3\7D\2\2\u01d3\u01d4\5"+
		"8\35\2\u01d4\u01d5\7C\2\2\u01d5\u01d6\7\7\2\2\u01d6\u01d7\5X-\2\u01d7"+
		"\u01d8\7\b\2\2\u01d8\u01d9\7\4\2\2\u01d9A\3\2\2\2\u01da\u01db\7E\2\2\u01db"+
		"\u01dd\7\7\2\2\u01dc\u01de\5X-\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2"+
		"\2\u01de\u01df\3\2\2\2\u01df\u01e1\7\4\2\2\u01e0\u01e2\5X-\2\u01e1\u01e0"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\7\4\2\2\u01e4"+
		"\u01e6\5X-\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2"+
		"\2\u01e7\u01e8\7\b\2\2\u01e8\u01e9\58\35\2\u01e9C\3\2\2\2\u01ea\u01eb"+
		"\7@\2\2\u01eb\u01ec\7\7\2\2\u01ec\u01ed\5X-\2\u01ed\u01ee\7\b\2\2\u01ee"+
		"\u01ef\7\n\2\2\u01ef\u01f0\5F$\2\u01f0\u01f1\7\13\2\2\u01f1E\3\2\2\2\u01f2"+
		"\u01f3\5H%\2\u01f3\u01f4\b$\1\2\u01f4\u01f6\3\2\2\2\u01f5\u01f2\3\2\2"+
		"\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fd"+
		"\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\5L\'\2\u01fb\u01fc\b$\1\2\u01fc"+
		"\u01fe\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fe\3\2\2\2\u01feG\3\2\2\2"+
		"\u01ff\u0200\5J&\2\u0200\u0201\5N(\2\u0201I\3\2\2\2\u0202\u0203\7A\2\2"+
		"\u0203\u0204\5z>\2\u0204\u0205\7\17\2\2\u0205\u0206\b&\1\2\u0206\u0208"+
		"\3\2\2\2\u0207\u0202\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020aK\3\2\2\2\u020b\u020c\7B\2\2\u020c\u020d\7\17\2\2"+
		"\u020d\u020e\5N(\2\u020eM\3\2\2\2\u020f\u0210\58\35\2\u0210\u0211\b(\1"+
		"\2\u0211\u0213\3\2\2\2\u0212\u020f\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0212"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215O\3\2\2\2\u0216\u0217\7I\2\2\u0217\u0218"+
		"\7O\2\2\u0218\u0219\7\4\2\2\u0219Q\3\2\2\2\u021a\u021b\7G\2\2\u021b\u021c"+
		"\7\4\2\2\u021cS\3\2\2\2\u021d\u021e\7H\2\2\u021e\u021f\7\4\2\2\u021fU"+
		"\3\2\2\2\u0220\u0221\7F\2\2\u0221\u0222\7\4\2\2\u0222\u0229\b,\1\2\u0223"+
		"\u0224\7F\2\2\u0224\u0225\5X-\2\u0225\u0226\7\4\2\2\u0226\u0227\b,\1\2"+
		"\u0227\u0229\3\2\2\2\u0228\u0220\3\2\2\2\u0228\u0223\3\2\2\2\u0229W\3"+
		"\2\2\2\u022a\u022b\5p9\2\u022b\u022c\7\5\2\2\u022c\u022d\5X-\2\u022d\u022e"+
		"\b-\1\2\u022e\u0238\3\2\2\2\u022f\u0230\5p9\2\u0230\u0231\5n8\2\u0231"+
		"\u0232\5X-\2\u0232\u0233\b-\1\2\u0233\u0238\3\2\2\2\u0234\u0235\5Z.\2"+
		"\u0235\u0236\b-\1\2\u0236\u0238\3\2\2\2\u0237\u022a\3\2\2\2\u0237\u022f"+
		"\3\2\2\2\u0237\u0234\3\2\2\2\u0238Y\3\2\2\2\u0239\u0240\5\\/\2\u023a\u023b"+
		"\7\20\2\2\u023b\u023c\5X-\2\u023c\u023d\7\17\2\2\u023d\u023e\5Z.\2\u023e"+
		"\u023f\b.\1\2\u023f\u0241\3\2\2\2\u0240\u023a\3\2\2\2\u0240\u0241\3\2"+
		"\2\2\u0241[\3\2\2\2\u0242\u0249\5^\60\2\u0243\u0244\7\21\2\2\u0244\u0245"+
		"\5^\60\2\u0245\u0246\b/\1\2\u0246\u0248\3\2\2\2\u0247\u0243\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a]\3\2\2\2"+
		"\u024b\u0249\3\2\2\2\u024c\u0253\5`\61\2\u024d\u024e\7\22\2\2\u024e\u024f"+
		"\5`\61\2\u024f\u0250\b\60\1\2\u0250\u0252\3\2\2\2\u0251\u024d\3\2\2\2"+
		"\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254_\3"+
		"\2\2\2\u0255\u0253\3\2\2\2\u0256\u0271\5b\62\2\u0257\u0258\7\23\2\2\u0258"+
		"\u0259\5b\62\2\u0259\u025a\b\61\1\2\u025a\u0270\3\2\2\2\u025b\u025c\7"+
		"\24\2\2\u025c\u025d\5b\62\2\u025d\u025e\b\61\1\2\u025e\u0270\3\2\2\2\u025f"+
		"\u0260\7\25\2\2\u0260\u0261\5b\62\2\u0261\u0262\b\61\1\2\u0262\u0270\3"+
		"\2\2\2\u0263\u0264\7\26\2\2\u0264\u0265\5b\62\2\u0265\u0266\b\61\1\2\u0266"+
		"\u0270\3\2\2\2\u0267\u0268\7\27\2\2\u0268\u0269\5b\62\2\u0269\u026a\b"+
		"\61\1\2\u026a\u0270\3\2\2\2\u026b\u026c\7\30\2\2\u026c\u026d\5b\62\2\u026d"+
		"\u026e\b\61\1\2\u026e\u0270\3\2\2\2\u026f\u0257\3\2\2\2\u026f\u025b\3"+
		"\2\2\2\u026f\u025f\3\2\2\2\u026f\u0263\3\2\2\2\u026f\u0267\3\2\2\2\u026f"+
		"\u026b\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272a\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u027b\5d\63\2\u0275\u0276"+
		"\7\31\2\2\u0276\u0277\5d\63\2\u0277\u0278\b\62\1\2\u0278\u027a\3\2\2\2"+
		"\u0279\u0275\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c"+
		"\3\2\2\2\u027cc\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0285\5f\64\2\u027f"+
		"\u0280\7\32\2\2\u0280\u0281\5f\64\2\u0281\u0282\b\63\1\2\u0282\u0284\3"+
		"\2\2\2\u0283\u027f\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286e\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028f\5h\65\2"+
		"\u0289\u028a\7\33\2\2\u028a\u028b\5h\65\2\u028b\u028c\b\64\1\2\u028c\u028e"+
		"\3\2\2\2\u028d\u0289\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290g\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u029d\5j\66\2"+
		"\u0293\u0294\7\34\2\2\u0294\u0295\5j\66\2\u0295\u0296\b\65\1\2\u0296\u029c"+
		"\3\2\2\2\u0297\u0298\7\35\2\2\u0298\u0299\5j\66\2\u0299\u029a\b\65\1\2"+
		"\u029a\u029c\3\2\2\2\u029b\u0293\3\2\2\2\u029b\u0297\3\2\2\2\u029c\u029f"+
		"\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029ei\3\2\2\2\u029f"+
		"\u029d\3\2\2\2\u02a0\u02ab\5l\67\2\u02a1\u02a2\7\36\2\2\u02a2\u02a3\5"+
		"l\67\2\u02a3\u02a4\b\66\1\2\u02a4\u02aa\3\2\2\2\u02a5\u02a6\7\37\2\2\u02a6"+
		"\u02a7\5l\67\2\u02a7\u02a8\b\66\1\2\u02a8\u02aa\3\2\2\2\u02a9\u02a1\3"+
		"\2\2\2\u02a9\u02a5\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ack\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02bd\5p9\2\u02af"+
		"\u02b0\7\16\2\2\u02b0\u02b1\5p9\2\u02b1\u02b2\b\67\1\2\u02b2\u02bc\3\2"+
		"\2\2\u02b3\u02b4\7 \2\2\u02b4\u02b5\5p9\2\u02b5\u02b6\b\67\1\2\u02b6\u02bc"+
		"\3\2\2\2\u02b7\u02b8\7!\2\2\u02b8\u02b9\5p9\2\u02b9\u02ba\b\67\1\2\u02ba"+
		"\u02bc\3\2\2\2\u02bb\u02af\3\2\2\2\u02bb\u02b3\3\2\2\2\u02bb\u02b7\3\2"+
		"\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"m\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\7\"\2\2\u02c1\u02d5\b8\1\2\u02c2"+
		"\u02c3\7#\2\2\u02c3\u02d5\b8\1\2\u02c4\u02c5\7$\2\2\u02c5\u02d5\b8\1\2"+
		"\u02c6\u02c7\7%\2\2\u02c7\u02d5\b8\1\2\u02c8\u02c9\7&\2\2\u02c9\u02d5"+
		"\b8\1\2\u02ca\u02cb\7\'\2\2\u02cb\u02d5\b8\1\2\u02cc\u02cd\7(\2\2\u02cd"+
		"\u02d5\b8\1\2\u02ce\u02cf\7)\2\2\u02cf\u02d5\b8\1\2\u02d0\u02d1\7*\2\2"+
		"\u02d1\u02d5\b8\1\2\u02d2\u02d3\7+\2\2\u02d3\u02d5\b8\1\2\u02d4\u02c0"+
		"\3\2\2\2\u02d4\u02c2\3\2\2\2\u02d4\u02c4\3\2\2\2\u02d4\u02c6\3\2\2\2\u02d4"+
		"\u02c8\3\2\2\2\u02d4\u02ca\3\2\2\2\u02d4\u02cc\3\2\2\2\u02d4\u02ce\3\2"+
		"\2\2\u02d4\u02d0\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5o\3\2\2\2\u02d6\u02d7"+
		"\7\7\2\2\u02d7\u02d8\5*\26\2\u02d8\u02d9\7\b\2\2\u02d9\u02da\5p9\2\u02da"+
		"\u02db\b9\1\2\u02db\u02e0\3\2\2\2\u02dc\u02dd\5r:\2\u02dd\u02de\b9\1\2"+
		"\u02de\u02e0\3\2\2\2\u02df\u02d6\3\2\2\2\u02df\u02dc\3\2\2\2\u02e0q\3"+
		"\2\2\2\u02e1\u02e2\7,\2\2\u02e2\u02e3\5r:\2\u02e3\u02e4\b:\1\2\u02e4\u030f"+
		"\3\2\2\2\u02e5\u02e6\7-\2\2\u02e6\u02e7\5r:\2\u02e7\u02e8\b:\1\2\u02e8"+
		"\u030f\3\2\2\2\u02e9\u02ea\7\36\2\2\u02ea\u02eb\5p9\2\u02eb\u02ec\b:\1"+
		"\2\u02ec\u030f\3\2\2\2\u02ed\u02ee\7\37\2\2\u02ee\u02ef\5p9\2\u02ef\u02f0"+
		"\b:\1\2\u02f0\u030f\3\2\2\2\u02f1\u02f2\7.\2\2\u02f2\u02f3\5p9\2\u02f3"+
		"\u02f4\b:\1\2\u02f4\u030f\3\2\2\2\u02f5\u02f6\7/\2\2\u02f6\u02f7\5p9\2"+
		"\u02f7\u02f8\b:\1\2\u02f8\u030f\3\2\2\2\u02f9\u02fa\7\16\2\2\u02fa\u02fb"+
		"\5p9\2\u02fb\u02fc\b:\1\2\u02fc\u030f\3\2\2\2\u02fd\u02fe\7\33\2\2\u02fe"+
		"\u02ff\5p9\2\u02ff\u0300\b:\1\2\u0300\u030f\3\2\2\2\u0301\u0302\7L\2\2"+
		"\u0302\u0303\7\7\2\2\u0303\u0304\5*\26\2\u0304\u0305\7\b\2\2\u0305\u0306"+
		"\b:\1\2\u0306\u030f\3\2\2\2\u0307\u0308\7L\2\2\u0308\u0309\5r:\2\u0309"+
		"\u030a\b:\1\2\u030a\u030f\3\2\2\2\u030b\u030c\5t;\2\u030c\u030d\b:\1\2"+
		"\u030d\u030f\3\2\2\2\u030e\u02e1\3\2\2\2\u030e\u02e5\3\2\2\2\u030e\u02e9"+
		"\3\2\2\2\u030e\u02ed\3\2\2\2\u030e\u02f1\3\2\2\2\u030e\u02f5\3\2\2\2\u030e"+
		"\u02f9\3\2\2\2\u030e\u02fd\3\2\2\2\u030e\u0301\3\2\2\2\u030e\u0307\3\2"+
		"\2\2\u030e\u030b\3\2\2\2\u030fs\3\2\2\2\u0310\u0329\5z>\2\u0311\u0312"+
		"\7,\2\2\u0312\u0328\b;\1\2\u0313\u0314\7-\2\2\u0314\u0328\b;\1\2\u0315"+
		"\u0316\7\f\2\2\u0316\u0317\5X-\2\u0317\u0318\7\r\2\2\u0318\u0319\b;\1"+
		"\2\u0319\u0328\3\2\2\2\u031a\u031b\7\3\2\2\u031b\u031c\5v<\2\u031c\u031d"+
		"\b;\1\2\u031d\u0328\3\2\2\2\u031e\u031f\7\60\2\2\u031f\u0320\5v<\2\u0320"+
		"\u0321\b;\1\2\u0321\u0328\3\2\2\2\u0322\u0323\7\7\2\2\u0323\u0324\5x="+
		"\2\u0324\u0325\7\b\2\2\u0325\u0326\b;\1\2\u0326\u0328\3\2\2\2\u0327\u0311"+
		"\3\2\2\2\u0327\u0313\3\2\2\2\u0327\u0315\3\2\2\2\u0327\u031a\3\2\2\2\u0327"+
		"\u031e\3\2\2\2\u0327\u0322\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2"+
		"\2\2\u0329\u032a\3\2\2\2\u032au\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032d"+
		"\7O\2\2\u032d\u032e\b<\1\2\u032ew\3\2\2\2\u032f\u0330\5X-\2\u0330\u0337"+
		"\b=\1\2\u0331\u0332\7\6\2\2\u0332\u0333\5X-\2\u0333\u0334\b=\1\2\u0334"+
		"\u0336\3\2\2\2\u0335\u0331\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2"+
		"\2\2\u0337\u0338\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u033a"+
		"\u032f\3\2\2\2\u033a\u033b\3\2\2\2\u033by\3\2\2\2\u033c\u033d\7P\2\2\u033d"+
		"\u034a\b>\1\2\u033e\u033f\7N\2\2\u033f\u034a\b>\1\2\u0340\u0341\7M\2\2"+
		"\u0341\u034a\b>\1\2\u0342\u0343\7O\2\2\u0343\u034a\b>\1\2\u0344\u0345"+
		"\7\7\2\2\u0345\u0346\5X-\2\u0346\u0347\7\b\2\2\u0347\u0348\b>\1\2\u0348"+
		"\u034a\3\2\2\2\u0349\u033c\3\2\2\2\u0349\u033e\3\2\2\2\u0349\u0340\3\2"+
		"\2\2\u0349\u0342\3\2\2\2\u0349\u0344\3\2\2\2\u034a{\3\2\2\29\u0094\u0096"+
		"\u00a0\u00ac\u00c3\u00c5\u00cd\u00d4\u00da\u00ef\u00f7\u00fb\u0104\u0114"+
		"\u0128\u014e\u0150\u0159\u015d\u0167\u0188\u0194\u01bd\u01ca\u01dd\u01e1"+
		"\u01e5\u01f7\u01fd\u0209\u0214\u0228\u0237\u0240\u0249\u0253\u026f\u0271"+
		"\u027b\u0285\u028f\u029b\u029d\u02a9\u02ab\u02bb\u02bd\u02d4\u02df\u030e"+
		"\u0327\u0329\u0337\u033a\u0349";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}