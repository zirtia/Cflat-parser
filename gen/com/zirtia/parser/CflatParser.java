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
		BREAK=69, CONTINUE=70, GOTO=71, TYPEDEF=72, IMPORT=73, SIZEOF=74, WS=75, 
		LINE_COMMENT=76, COMMENT=77, STRING=78, CHARACTER=79, IDENTIFIER=80, INTEGER=81;
	public static final int
		RULE_compilation_unit = 0, RULE_declaration_file = 1, RULE_import_stmts = 2, 
		RULE_import_stmt = 3, RULE_top_defs = 4, RULE_defvars = 5, RULE_defconst = 6, 
		RULE_defun = 7, RULE_storage = 8, RULE_params = 9, RULE_fixedparams = 10, 
		RULE_param = 11, RULE_block = 12, RULE_defvar_list = 13, RULE_defstruct = 14, 
		RULE_defunion = 15, RULE_member_list = 16, RULE_slot = 17, RULE_funcdecl = 18, 
		RULE_vardecl = 19, RULE_stmts = 20, RULE_stmt = 21, RULE_labeled_stmt = 22, 
		RULE_if_stmt = 23, RULE_while_stmt = 24, RULE_dowhile_stmt = 25, RULE_for_stmt = 26, 
		RULE_switch_stmt = 27, RULE_case_clauses = 28, RULE_case_clause = 29, 
		RULE_cases = 30, RULE_default_clause = 31, RULE_case_body = 32, RULE_goto_stmt = 33, 
		RULE_break_stmt = 34, RULE_continue_stmt = 35, RULE_return_stmt = 36, 
		RULE_type = 37, RULE_typeref = 38, RULE_param_typerefs = 39, RULE_fixedparam_typerefs = 40, 
		RULE_typeref_base = 41, RULE_typedef = 42, RULE_expr = 43, RULE_opassign_op = 44, 
		RULE_term = 45, RULE_postfix = 46, RULE_args = 47, RULE_primary = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "declaration_file", "import_stmts", "import_stmt", 
			"top_defs", "defvars", "defconst", "defun", "storage", "params", "fixedparams", 
			"param", "block", "defvar_list", "defstruct", "defunion", "member_list", 
			"slot", "funcdecl", "vardecl", "stmts", "stmt", "labeled_stmt", "if_stmt", 
			"while_stmt", "dowhile_stmt", "for_stmt", "switch_stmt", "case_clauses", 
			"case_clause", "cases", "default_clause", "case_body", "goto_stmt", "break_stmt", 
			"continue_stmt", "return_stmt", "type", "typeref", "param_typerefs", 
			"fixedparam_typerefs", "typeref_base", "typedef", "expr", "opassign_op", 
			"term", "postfix", "args", "primary"
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
	    private String sourceName;

	    public CflatParser(String name,TokenStream token,LibraryLoader loader) {
	        this(token);
	        sourceName = name;
	        this.loader = loader;
	        this.knownTypedefs = new HashSet<String>();
	    }

	    public AST parse() {
	            return this.compilation_unit().ast;
	    }
	    public Declarations parseDecls() {
	            return this.declaration_file().decls;
	    }

	    private TypeRef size_t() {
	        return IntegerTypeRef.ulongRef();
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

	    private IntegerLiteralNode integerNode(Location loc,String image) {
	        long i = integerValue(image);
	        if (image.endsWith("UL")) {
	            return new IntegerLiteralNode(loc,IntegerTypeRef.ulongRef(), i);
	        }
	        else if (image.endsWith("L")) {
	            return new IntegerLiteralNode(loc,IntegerTypeRef.longRef(), i);
	        }
	        else if (image.endsWith("U")) {
	            return new IntegerLiteralNode(loc,IntegerTypeRef.uintRef(), i);
	        }
	        else {
	            return new IntegerLiteralNode(loc,IntegerTypeRef.intRef(), i);
	        }
	    }

	    private Location location(Token t) {
	        return new Location(sourceName, t);
	    }

	public CflatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Compilation_unitContext extends ParserRuleContext {
		public AST ast;
		public Import_stmtsContext import_stmts;
		public Top_defsContext top_defs;
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((Compilation_unitContext)_localctx).import_stmts = import_stmts();
			setState(99);
			((Compilation_unitContext)_localctx).top_defs = top_defs();
			setState(100);
			match(EOF);

			        Declarations decls = ((Compilation_unitContext)_localctx).top_defs.decls;
			        decls.add(((Compilation_unitContext)_localctx).import_stmts.impdecls);
			        ((Compilation_unitContext)_localctx).ast =  new AST(location((((Compilation_unitContext)_localctx).import_stmts!=null?(((Compilation_unitContext)_localctx).import_stmts.start):null)),decls);
			    
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

	public static class Declaration_fileContext extends ParserRuleContext {
		public Declarations decls;
		public Import_stmtsContext import_stmts;
		public FuncdeclContext funcdecl;
		public VardeclContext vardecl;
		public DefconstContext defconst;
		public DefstructContext defstruct;
		public DefunionContext defunion;
		public TypedefContext typedef;
		public Import_stmtsContext import_stmts() {
			return getRuleContext(Import_stmtsContext.class,0);
		}
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
			setState(103);
			((Declaration_fileContext)_localctx).import_stmts = import_stmts();

			            _localctx.decls.add(((Declaration_fileContext)_localctx).import_stmts.impdecls);
			        
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (STRUCT - 52)) | (1L << (UNION - 52)) | (1L << (EXTERN - 52)) | (1L << (CONST - 52)) | (1L << (TYPEDEF - 52)))) != 0)) {
				{
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(105);
					((Declaration_fileContext)_localctx).funcdecl = funcdecl();

					            _localctx.decls.addFuncdecl(((Declaration_fileContext)_localctx).funcdecl.undefinedFunction);
					        
					}
					break;
				case 2:
					{
					setState(108);
					((Declaration_fileContext)_localctx).vardecl = vardecl();

					            _localctx.decls.addVardecl(((Declaration_fileContext)_localctx).vardecl.undefinedVariable);
					        
					}
					break;
				case 3:
					{
					setState(111);
					((Declaration_fileContext)_localctx).defconst = defconst();

					            _localctx.decls.addConstant(((Declaration_fileContext)_localctx).defconst.contant);
					        
					}
					break;
				case 4:
					{
					setState(114);
					((Declaration_fileContext)_localctx).defstruct = defstruct();

					            _localctx.decls.addDefstruct(((Declaration_fileContext)_localctx).defstruct.structNode);
					        
					}
					break;
				case 5:
					{
					setState(117);
					((Declaration_fileContext)_localctx).defunion = defunion();

					            _localctx.decls.addDefunion(((Declaration_fileContext)_localctx).defunion.unionNode);
					        
					}
					break;
				case 6:
					{
					setState(120);
					((Declaration_fileContext)_localctx).typedef = typedef();

					            _localctx.decls.addTypedef(((Declaration_fileContext)_localctx).typedef.typedefNode);
					        
					}
					break;
				}
				}
				setState(127);
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

	public static class Import_stmtsContext extends ParserRuleContext {
		public Declarations impdecls;
		public Import_stmtContext import_stmt;
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
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(128);
				((Import_stmtsContext)_localctx).import_stmt = import_stmt();

				            Declarations decls = loader.loadLibrary(((Import_stmtsContext)_localctx).import_stmt.impdecl);
				            if (decls != null) {
				              _localctx.impdecls.add(decls);
				              addKnownTypedefs(decls.typedefs());
				            }
				        
				}
				}
				setState(135);
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
		public Token n;
		public Token n1;
		public TerminalNode IMPORT() { return getToken(CflatParser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CflatParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CflatParser.IDENTIFIER, i);
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
			setState(136);
			match(IMPORT);
			setState(137);
			((Import_stmtContext)_localctx).n = match(IDENTIFIER);

			            buf.append((((Import_stmtContext)_localctx).n!=null?((Import_stmtContext)_localctx).n.getText():null));
			        
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(139);
				match(T__0);
				setState(140);
				((Import_stmtContext)_localctx).n1 = match(IDENTIFIER);

				            buf.append("."); buf.append((((Import_stmtContext)_localctx).n1!=null?((Import_stmtContext)_localctx).n1.getText():null));
				        
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
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
		public DefunContext df;
		public DefvarsContext dvs;
		public DefconstContext dc;
		public DefstructContext ds;
		public DefunionContext du;
		public TypedefContext td;
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
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (VOID - 47)) | (1L << (CHAR - 47)) | (1L << (SHORT - 47)) | (1L << (INT - 47)) | (1L << (LONG - 47)) | (1L << (STRUCT - 47)) | (1L << (UNION - 47)) | (1L << (STATIC - 47)) | (1L << (CONST - 47)) | (1L << (UNSIGNED - 47)) | (1L << (TYPEDEF - 47)) | (1L << (IDENTIFIER - 47)))) != 0)) {
				{
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(149);
					((Top_defsContext)_localctx).df = defun();

					            _localctx.decls.addDefun(((Top_defsContext)_localctx).df.definedFunction);
					        
					}
					break;
				case 2:
					{
					setState(152);
					((Top_defsContext)_localctx).dvs = defvars();

					            _localctx.decls.addDefvars(((Top_defsContext)_localctx).dvs.defs);
					        
					}
					break;
				case 3:
					{
					setState(155);
					((Top_defsContext)_localctx).dc = defconst();

					            _localctx.decls.addConstant(((Top_defsContext)_localctx).dc.contant);
					        
					}
					break;
				case 4:
					{
					setState(158);
					((Top_defsContext)_localctx).ds = defstruct();

					            _localctx.decls.addDefstruct(((Top_defsContext)_localctx).ds.structNode);
					        
					}
					break;
				case 5:
					{
					setState(161);
					((Top_defsContext)_localctx).du = defunion();

					            _localctx.decls.addDefunion(((Top_defsContext)_localctx).du.unionNode);
					        
					}
					break;
				case 6:
					{
					setState(164);
					((Top_defsContext)_localctx).td = typedef();

					            _localctx.decls.addTypedef(((Top_defsContext)_localctx).td.typedefNode);
					        
					}
					break;
				}
				}
				setState(171);
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
		public StorageContext s;
		public TypeContext t;
		public Token n;
		public ExprContext e;
		public Token n1;
		public ExprContext e1;
		public StorageContext storage() {
			return getRuleContext(StorageContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CflatParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CflatParser.IDENTIFIER, i);
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
			setState(172);
			((DefvarsContext)_localctx).s = storage();
			setState(173);
			((DefvarsContext)_localctx).t = type();
			setState(174);
			((DefvarsContext)_localctx).n = match(IDENTIFIER);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(175);
				match(T__2);
				setState(176);
				((DefvarsContext)_localctx).e = expr(0);
				}
			}


			        _localctx.defs.add(new DefinedVariable(((DefvarsContext)_localctx).s.bool, ((DefvarsContext)_localctx).t.typeNode, (((DefvarsContext)_localctx).n!=null?((DefvarsContext)_localctx).n.getText():null), ((DefvarsContext)_localctx).e != null ? ((DefvarsContext)_localctx).e.exprNode : null));
			    
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(180);
				match(T__3);
				setState(181);
				((DefvarsContext)_localctx).n1 = match(IDENTIFIER);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(182);
					match(T__2);
					setState(183);
					((DefvarsContext)_localctx).e1 = expr(0);
					}
				}


				               _localctx.defs.add(new DefinedVariable(((DefvarsContext)_localctx).s.bool, ((DefvarsContext)_localctx).t.typeNode, (((DefvarsContext)_localctx).n1!=null?((DefvarsContext)_localctx).n1.getText():null),  ((DefvarsContext)_localctx).e1 != null ? ((DefvarsContext)_localctx).e1.exprNode : null));
				        
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
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
		public TypeContext t;
		public Token n;
		public ExprContext e;
		public TerminalNode CONST() { return getToken(CflatParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
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
			setState(194);
			match(CONST);
			setState(195);
			((DefconstContext)_localctx).t = type();
			setState(196);
			((DefconstContext)_localctx).n = match(IDENTIFIER);
			setState(197);
			match(T__2);
			setState(198);
			((DefconstContext)_localctx).e = expr(0);
			setState(199);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			        ((DefconstContext)_localctx).contant =  new Constant(((DefconstContext)_localctx).t.typeNode, (((DefconstContext)_localctx).n!=null?((DefconstContext)_localctx).n.getText():null), ((DefconstContext)_localctx).e.exprNode);
			    
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
		public StorageContext s;
		public TyperefContext t;
		public Token n;
		public ParamsContext p;
		public BlockContext b;
		public StorageContext storage() {
			return getRuleContext(StorageContext.class,0);
		}
		public TyperefContext typeref() {
			return getRuleContext(TyperefContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
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
			setState(201);
			((DefunContext)_localctx).s = storage();
			setState(202);
			((DefunContext)_localctx).t = typeref();
			setState(203);
			((DefunContext)_localctx).n = match(IDENTIFIER);
			setState(204);
			match(T__4);
			setState(205);
			((DefunContext)_localctx).p = params();
			setState(206);
			match(T__5);
			setState(207);
			((DefunContext)_localctx).b = block();
			}
			_ctx.stop = _input.LT(-1);

			        TypeRef t = new FunctionTypeRef(((DefunContext)_localctx).t.typeRef, ((DefunContext)_localctx).p.parameters.parametersTypeRef());
			        ((DefunContext)_localctx).definedFunction =  new DefinedFunction(((DefunContext)_localctx).s.bool, new TypeNode(t),(((DefunContext)_localctx).n!=null?((DefunContext)_localctx).n.getText():null), ((DefunContext)_localctx).p.parameters, ((DefunContext)_localctx).b.blockNode);
			    
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
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(209);
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
		public Params parameters;
		public Token t;
		public FixedparamsContext fps;
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				((ParamsContext)_localctx).t = match(VOID);

				            ((ParamsContext)_localctx).parameters =  new Params(location(((ParamsContext)_localctx).t),new ArrayList<Parameter>());
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((ParamsContext)_localctx).fps = fixedparams();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(215);
					match(T__3);
					setState(216);
					match(T__6);

					                                ((ParamsContext)_localctx).fps.parameters.acceptVarargs();
					                            
					}
				}


				            ((ParamsContext)_localctx).parameters =  ((ParamsContext)_localctx).fps.parameters ;
				        
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
		public Params parameters;
		public ParamContext p;
		public ParamContext p1;
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

		        List<Parameter> parameters1 = new ArrayList<Parameter>();
		    
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((FixedparamsContext)_localctx).p = param();

			            parameters1.add(((FixedparamsContext)_localctx).p.parameter);
			        
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					match(T__3);
					setState(227);
					((FixedparamsContext)_localctx).p1 = param();

					            parameters1.add(((FixedparamsContext)_localctx).p1.parameter);
					        
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);

			        ((FixedparamsContext)_localctx).parameters =  new Params(((FixedparamsContext)_localctx).p.parameter.location(),parameters1);
			    
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
		public TypeContext t;
		public Token n;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
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
			setState(235);
			((ParamContext)_localctx).t = type();
			setState(236);
			((ParamContext)_localctx).n = match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);

			        ((ParamContext)_localctx).parameter =  new Parameter(((ParamContext)_localctx).t.typeNode, (((ParamContext)_localctx).n!=null?((ParamContext)_localctx).n.getText():null));
			    
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
		public Token t;
		public Defvar_listContext dvl;
		public StmtsContext ss;
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
			setState(238);
			((BlockContext)_localctx).t = match(T__7);
			setState(239);
			((BlockContext)_localctx).dvl = defvar_list();
			setState(240);
			((BlockContext)_localctx).ss = stmts();
			setState(241);
			match(T__8);

			            ((BlockContext)_localctx).blockNode =  new BlockNode(location(((BlockContext)_localctx).t),((BlockContext)_localctx).dvl.result,((BlockContext)_localctx).ss.ss);
			        
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

	public static class Defvar_listContext extends ParserRuleContext {
		public List<DefinedVariable> result;
		public DefvarsContext dvs;
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
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					((Defvar_listContext)_localctx).dvs = defvars();

					            _localctx.result.addAll(((Defvar_listContext)_localctx).dvs.defs);
					        
					}
					} 
				}
				setState(251);
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
		public Token t;
		public Token n;
		public Member_listContext ml;
		public TerminalNode STRUCT() { return getToken(CflatParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
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
			setState(252);
			((DefstructContext)_localctx).t = match(STRUCT);
			setState(253);
			((DefstructContext)_localctx).n = match(IDENTIFIER);
			setState(254);
			((DefstructContext)_localctx).ml = member_list();
			setState(255);
			match(T__1);

			         ((DefstructContext)_localctx).structNode =  new StructNode(location(((DefstructContext)_localctx).t),new StructTypeRef((((DefstructContext)_localctx).n!=null?((DefstructContext)_localctx).n.getText():null)), (((DefstructContext)_localctx).n!=null?((DefstructContext)_localctx).n.getText():null), ((DefstructContext)_localctx).ml.membs);
			     
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

	public static class DefunionContext extends ParserRuleContext {
		public UnionNode unionNode;
		public Token t;
		public Token n;
		public Member_listContext ml;
		public TerminalNode UNION() { return getToken(CflatParser.UNION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
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
			setState(258);
			((DefunionContext)_localctx).t = match(UNION);
			setState(259);
			((DefunionContext)_localctx).n = match(IDENTIFIER);
			setState(260);
			((DefunionContext)_localctx).ml = member_list();
			setState(261);
			match(T__1);

			         ((DefunionContext)_localctx).unionNode =  new UnionNode(location(((DefunionContext)_localctx).t),new UnionTypeRef((((DefunionContext)_localctx).n!=null?((DefunionContext)_localctx).n.getText():null)), (((DefunionContext)_localctx).n!=null?((DefunionContext)_localctx).n.getText():null), ((DefunionContext)_localctx).ml.membs);
			     
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

	public static class Member_listContext extends ParserRuleContext {
		public List<Slot> membs;
		public SlotContext s;
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
			setState(264);
			match(T__7);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (VOID - 47)) | (1L << (CHAR - 47)) | (1L << (SHORT - 47)) | (1L << (INT - 47)) | (1L << (LONG - 47)) | (1L << (STRUCT - 47)) | (1L << (UNION - 47)) | (1L << (UNSIGNED - 47)) | (1L << (IDENTIFIER - 47)))) != 0)) {
				{
				{
				setState(265);
				((Member_listContext)_localctx).s = slot();
				setState(266);
				match(T__1);

				            _localctx.membs.add(((Member_listContext)_localctx).s.slod);
				         
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
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
		public TypeContext t;
		public Token n;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
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
			setState(276);
			((SlotContext)_localctx).t = type();
			setState(277);
			((SlotContext)_localctx).n = match(IDENTIFIER);

			            ((SlotContext)_localctx).slod =  new Slot(((SlotContext)_localctx).t.typeNode, (((SlotContext)_localctx).n!=null?((SlotContext)_localctx).n.getText():null));
			        
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

	public static class FuncdeclContext extends ParserRuleContext {
		public UndefinedFunction undefinedFunction;
		public TyperefContext t;
		public Token n;
		public ParamsContext p;
		public TerminalNode EXTERN() { return getToken(CflatParser.EXTERN, 0); }
		public TyperefContext typeref() {
			return getRuleContext(TyperefContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
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
			setState(280);
			match(EXTERN);
			setState(281);
			((FuncdeclContext)_localctx).t = typeref();
			setState(282);
			((FuncdeclContext)_localctx).n = match(IDENTIFIER);
			setState(283);
			match(T__4);
			setState(284);
			((FuncdeclContext)_localctx).p = params();
			setState(285);
			match(T__5);
			setState(286);
			match(T__1);

			        TypeRef t = new FunctionTypeRef(((FuncdeclContext)_localctx).t.typeRef, ((FuncdeclContext)_localctx).p.parameters.parametersTypeRef());
			        ((FuncdeclContext)_localctx).undefinedFunction =   new UndefinedFunction(new TypeNode(t), (((FuncdeclContext)_localctx).n!=null?((FuncdeclContext)_localctx).n.getText():null), ((FuncdeclContext)_localctx).p.parameters);
			    
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

	public static class VardeclContext extends ParserRuleContext {
		public UndefinedVariable undefinedVariable;
		public TypeContext t;
		public Token n;
		public TerminalNode EXTERN() { return getToken(CflatParser.EXTERN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
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
			setState(289);
			match(EXTERN);
			setState(290);
			((VardeclContext)_localctx).t = type();
			setState(291);
			((VardeclContext)_localctx).n = match(IDENTIFIER);
			setState(292);
			match(T__1);

			            ((VardeclContext)_localctx).undefinedVariable =  new UndefinedVariable(((VardeclContext)_localctx).t.typeNode, (((VardeclContext)_localctx).n!=null?((VardeclContext)_localctx).n.getText():null));
			        
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

	public static class StmtsContext extends ParserRuleContext {
		public List<StmtNode> ss;
		public StmtContext s;
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
		enterRule(_localctx, 40, RULE_stmts);

		        ((StmtsContext)_localctx).ss =  new ArrayList<StmtNode>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__7) | (1L << T__12) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << IF) | (1L << SWITCH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (DO - 65)) | (1L << (FOR - 65)) | (1L << (RETURN - 65)) | (1L << (BREAK - 65)) | (1L << (CONTINUE - 65)) | (1L << (GOTO - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (CHARACTER - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (INTEGER - 65)))) != 0)) {
				{
				{
				setState(295);
				((StmtsContext)_localctx).s = stmt();

				            if (((StmtsContext)_localctx).s.stmtNode != null) _localctx.ss.add(((StmtsContext)_localctx).s.stmtNode);
				        
				}
				}
				setState(302);
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
		public Labeled_stmtContext labeled_stmt;
		public ExprContext expr;
		public BlockContext block;
		public If_stmtContext if_stmt;
		public While_stmtContext while_stmt;
		public Dowhile_stmtContext dowhile_stmt;
		public For_stmtContext for_stmt;
		public Switch_stmtContext switch_stmt;
		public Break_stmtContext break_stmt;
		public Continue_stmtContext continue_stmt;
		public Goto_stmtContext goto_stmt;
		public Return_stmtContext return_stmt;
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
		enterRule(_localctx, 42, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(303);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(304);
				((StmtContext)_localctx).labeled_stmt = labeled_stmt();

				            ((StmtContext)_localctx).stmtNode =  ((StmtContext)_localctx).labeled_stmt.labelNode;
				        
				}
				break;
			case 3:
				{
				setState(307);
				((StmtContext)_localctx).expr = expr(0);
				setState(308);
				match(T__1);

				            ((StmtContext)_localctx).stmtNode =  new ExprStmtNode(((StmtContext)_localctx).expr.exprNode.location(),((StmtContext)_localctx).expr.exprNode);
				        
				}
				break;
			case 4:
				{
				setState(311);
				((StmtContext)_localctx).block = block();

				            ((StmtContext)_localctx).stmtNode = ((StmtContext)_localctx).block.blockNode;
				        
				}
				break;
			case 5:
				{
				setState(314);
				((StmtContext)_localctx).if_stmt = if_stmt();

				            ((StmtContext)_localctx).stmtNode = ((StmtContext)_localctx).if_stmt.ifNode;
				        
				}
				break;
			case 6:
				{
				setState(317);
				((StmtContext)_localctx).while_stmt = while_stmt();

				            ((StmtContext)_localctx).stmtNode =  ((StmtContext)_localctx).while_stmt.whileNode;
				        
				}
				break;
			case 7:
				{
				setState(320);
				((StmtContext)_localctx).dowhile_stmt = dowhile_stmt();

				            ((StmtContext)_localctx).stmtNode =  ((StmtContext)_localctx).dowhile_stmt.doWhileNode;
				        
				}
				break;
			case 8:
				{
				setState(323);
				((StmtContext)_localctx).for_stmt = for_stmt();

				            ((StmtContext)_localctx).stmtNode = ((StmtContext)_localctx).for_stmt.forNode;
				        
				}
				break;
			case 9:
				{
				setState(326);
				((StmtContext)_localctx).switch_stmt = switch_stmt();

				            ((StmtContext)_localctx).stmtNode = ((StmtContext)_localctx).switch_stmt.switchNode;
				        
				}
				break;
			case 10:
				{
				setState(329);
				((StmtContext)_localctx).break_stmt = break_stmt();

				            ((StmtContext)_localctx).stmtNode = ((StmtContext)_localctx).break_stmt.breakNode;
				        
				}
				break;
			case 11:
				{
				setState(332);
				((StmtContext)_localctx).continue_stmt = continue_stmt();

				            ((StmtContext)_localctx).stmtNode =  ((StmtContext)_localctx).continue_stmt.continueNode;
				        
				}
				break;
			case 12:
				{
				setState(335);
				((StmtContext)_localctx).goto_stmt = goto_stmt();

				            ((StmtContext)_localctx).stmtNode =  ((StmtContext)_localctx).goto_stmt.gotoNode;
				        
				}
				break;
			case 13:
				{
				setState(338);
				((StmtContext)_localctx).return_stmt = return_stmt();

				            ((StmtContext)_localctx).stmtNode =  ((StmtContext)_localctx).return_stmt.returnNode;
				        
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
		public StmtContext s;
		public TerminalNode IDENTIFIER() { return getToken(CflatParser.IDENTIFIER, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Labeled_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_stmt; }
	}

	public final Labeled_stmtContext labeled_stmt() throws RecognitionException {
		Labeled_stmtContext _localctx = new Labeled_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_labeled_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			((Labeled_stmtContext)_localctx).t = match(IDENTIFIER);
			setState(344);
			match(T__9);
			setState(345);
			((Labeled_stmtContext)_localctx).s = stmt();

			            ((Labeled_stmtContext)_localctx).labelNode =  new LabelNode(location(((Labeled_stmtContext)_localctx).t),(((Labeled_stmtContext)_localctx).t!=null?((Labeled_stmtContext)_localctx).t.getText():null), ((Labeled_stmtContext)_localctx).s.stmtNode);
			        
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

	public static class If_stmtContext extends ParserRuleContext {
		public IfNode ifNode;
		public Token IF;
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
		enterRule(_localctx, 46, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			((If_stmtContext)_localctx).IF = match(IF);
			setState(349);
			match(T__4);
			setState(350);
			((If_stmtContext)_localctx).cond = expr(0);
			setState(351);
			match(T__5);
			setState(352);
			((If_stmtContext)_localctx).thenBody = stmt();
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(353);
				match(ELSE);
				setState(354);
				((If_stmtContext)_localctx).elseBody = stmt();
				}
				break;
			}

			            ((If_stmtContext)_localctx).ifNode =  new IfNode(location(((If_stmtContext)_localctx).IF),((If_stmtContext)_localctx).cond.exprNode, ((If_stmtContext)_localctx).thenBody.stmtNode, ((If_stmtContext)_localctx).elseBody != null ? ((If_stmtContext)_localctx).elseBody.stmtNode : null);
			        
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

	public static class While_stmtContext extends ParserRuleContext {
		public WhileNode whileNode;
		public Token WHILE;
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
		enterRule(_localctx, 48, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((While_stmtContext)_localctx).WHILE = match(WHILE);
			setState(360);
			match(T__4);
			setState(361);
			((While_stmtContext)_localctx).cond = expr(0);
			setState(362);
			match(T__5);
			setState(363);
			((While_stmtContext)_localctx).body = stmt();

			            ((While_stmtContext)_localctx).whileNode =  new WhileNode(location(((While_stmtContext)_localctx).WHILE),((While_stmtContext)_localctx).cond.exprNode, ((While_stmtContext)_localctx).body.stmtNode);
			        
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

	public static class Dowhile_stmtContext extends ParserRuleContext {
		public DoWhileNode doWhileNode;
		public Token DO;
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
		enterRule(_localctx, 50, RULE_dowhile_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((Dowhile_stmtContext)_localctx).DO = match(DO);
			setState(367);
			((Dowhile_stmtContext)_localctx).body = stmt();
			setState(368);
			match(WHILE);
			setState(369);
			match(T__4);
			setState(370);
			((Dowhile_stmtContext)_localctx).cond = expr(0);
			setState(371);
			match(T__5);
			setState(372);
			match(T__1);

			            ((Dowhile_stmtContext)_localctx).doWhileNode =  new DoWhileNode( location(((Dowhile_stmtContext)_localctx).DO),((Dowhile_stmtContext)_localctx).body.stmtNode, ((Dowhile_stmtContext)_localctx).cond.exprNode);
			        
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

	public static class For_stmtContext extends ParserRuleContext {
		public ForNode forNode;
		public Token FOR;
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
		enterRule(_localctx, 52, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			((For_stmtContext)_localctx).FOR = match(FOR);
			setState(376);
			match(T__4);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__12) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(377);
				((For_stmtContext)_localctx).init = expr(0);
				}
			}

			setState(380);
			match(T__1);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__12) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(381);
				((For_stmtContext)_localctx).cond = expr(0);
				}
			}

			setState(384);
			match(T__1);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__12) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(385);
				((For_stmtContext)_localctx).incr = expr(0);
				}
			}

			setState(388);
			match(T__5);
			setState(389);
			((For_stmtContext)_localctx).body = stmt();

			            ((For_stmtContext)_localctx).forNode =  new ForNode(location(((For_stmtContext)_localctx).FOR),((For_stmtContext)_localctx).init != null ? ((For_stmtContext)_localctx).init.exprNode : null , ((For_stmtContext)_localctx).cond != null ? ((For_stmtContext)_localctx).cond.exprNode : null ,  ((For_stmtContext)_localctx).incr != null ? ((For_stmtContext)_localctx).incr.exprNode : null, ((For_stmtContext)_localctx).body.stmtNode);
			        
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

	public static class Switch_stmtContext extends ParserRuleContext {
		public SwitchNode switchNode;
		public Token SWITCH;
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
		enterRule(_localctx, 54, RULE_switch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			((Switch_stmtContext)_localctx).SWITCH = match(SWITCH);
			setState(393);
			match(T__4);
			setState(394);
			((Switch_stmtContext)_localctx).cond = expr(0);
			setState(395);
			match(T__5);
			setState(396);
			match(T__7);
			setState(397);
			((Switch_stmtContext)_localctx).bodies = case_clauses();
			setState(398);
			match(T__8);

			            ((Switch_stmtContext)_localctx).switchNode =  new SwitchNode(location(((Switch_stmtContext)_localctx).SWITCH),((Switch_stmtContext)_localctx).cond.exprNode, ((Switch_stmtContext)_localctx).bodies.clauses);
			        
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

	public static class Case_clausesContext extends ParserRuleContext {
		public List<CaseNode> clauses;
		public Case_clauseContext case_clause;
		public Default_clauseContext default_clause;
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
		enterRule(_localctx, 56, RULE_case_clauses);

		        ((Case_clausesContext)_localctx).clauses =  new ArrayList<CaseNode>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(401);
				((Case_clausesContext)_localctx).case_clause = case_clause();

				            _localctx.clauses.add(((Case_clausesContext)_localctx).case_clause.caseNode);
				        
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(409);
				((Case_clausesContext)_localctx).default_clause = default_clause();

				            _localctx.clauses.add(((Case_clausesContext)_localctx).default_clause.caseNode);
				        
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
		enterRule(_localctx, 58, RULE_case_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			((Case_clauseContext)_localctx).values = cases();
			setState(415);
			((Case_clauseContext)_localctx).body = case_body();

			         ((Case_clauseContext)_localctx).caseNode =   new CaseNode(((Case_clauseContext)_localctx).body.blockNode.location(),((Case_clauseContext)_localctx).values.values, ((Case_clauseContext)_localctx).body.blockNode);
			        
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

	public static class CasesContext extends ParserRuleContext {
		public List<ExprNode> values;
		public PrimaryContext primary;
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
		enterRule(_localctx, 60, RULE_cases);

		        ((CasesContext)_localctx).values =  new ArrayList<ExprNode>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(418);
				match(CASE);
				setState(419);
				((CasesContext)_localctx).primary = primary();
				setState(420);
				match(T__9);

				            _localctx.values.add(((CasesContext)_localctx).primary.exprNode);
				        
				}
				}
				setState(425); 
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
		enterRule(_localctx, 62, RULE_default_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(DEFAULT);
			setState(428);
			match(T__9);
			setState(429);
			((Default_clauseContext)_localctx).body = case_body();

			            ((Default_clauseContext)_localctx).caseNode =  new CaseNode(((Default_clauseContext)_localctx).body.blockNode.location(),new ArrayList<ExprNode>(), ((Default_clauseContext)_localctx).body.blockNode);
			        
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
		enterRule(_localctx, 64, RULE_case_body);

		        LinkedList<StmtNode> stmts = new LinkedList<StmtNode>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(432);
				((Case_bodyContext)_localctx).s = stmt();

				            if (((Case_bodyContext)_localctx).s.stmtNode != null) stmts.add(((Case_bodyContext)_localctx).s.stmtNode);
				        
				}
				}
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__7) | (1L << T__12) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << IF) | (1L << SWITCH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (DO - 65)) | (1L << (FOR - 65)) | (1L << (RETURN - 65)) | (1L << (BREAK - 65)) | (1L << (CONTINUE - 65)) | (1L << (GOTO - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (CHARACTER - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (INTEGER - 65)))) != 0) );
			}
			_ctx.stop = _input.LT(-1);

			            if (! (stmts.getLast() instanceof BreakNode)) {
			                throw new Error("missing break statement at the last of case clause");
			            }
			             ((Case_bodyContext)_localctx).blockNode =   new BlockNode(stmts.get(0).location(),new ArrayList<DefinedVariable>(),stmts);
			    
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
		public Token t;
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
		enterRule(_localctx, 66, RULE_goto_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			((Goto_stmtContext)_localctx).t = match(GOTO);
			setState(440);
			((Goto_stmtContext)_localctx).n = match(IDENTIFIER);
			setState(441);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			        ((Goto_stmtContext)_localctx).gotoNode =  new GotoNode(location(((Goto_stmtContext)_localctx).t),(((Goto_stmtContext)_localctx).n!=null?((Goto_stmtContext)_localctx).n.getText():null));
			    
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
		public Token t;
		public TerminalNode BREAK() { return getToken(CflatParser.BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			((Break_stmtContext)_localctx).t = match(BREAK);
			setState(444);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			        ((Break_stmtContext)_localctx).breakNode =  new BreakNode(location(((Break_stmtContext)_localctx).t));
			    
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
		public Token t;
		public TerminalNode CONTINUE() { return getToken(CflatParser.CONTINUE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			((Continue_stmtContext)_localctx).t = match(CONTINUE);
			setState(447);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);

			        ((Continue_stmtContext)_localctx).continueNode =  new ContinueNode(location(((Continue_stmtContext)_localctx).t));
			    
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
		public Token t;
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
		enterRule(_localctx, 72, RULE_return_stmt);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				((Return_stmtContext)_localctx).t = match(RETURN);
				setState(450);
				match(T__1);

				            ((Return_stmtContext)_localctx).returnNode =   new ReturnNode(location(((Return_stmtContext)_localctx).t),null);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				((Return_stmtContext)_localctx).t = match(RETURN);
				setState(453);
				((Return_stmtContext)_localctx).expr0 = expr(0);
				setState(454);
				match(T__1);

				            ((Return_stmtContext)_localctx).returnNode =   new ReturnNode(location(((Return_stmtContext)_localctx).t),((Return_stmtContext)_localctx).expr0.exprNode);
				        
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

	public static class TypeContext extends ParserRuleContext {
		public TypeNode typeNode;
		public TyperefContext t;
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
		enterRule(_localctx, 74, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			((TypeContext)_localctx).t = typeref();

			            ((TypeContext)_localctx).typeNode =  new TypeNode(((TypeContext)_localctx).t.typeRef);
			        
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

	public static class TyperefContext extends ParserRuleContext {
		public TypeRef typeRef;
		public Typeref_baseContext tb;
		public Token t;
		public Param_typerefsContext pts;
		public Typeref_baseContext typeref_base() {
			return getRuleContext(Typeref_baseContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(CflatParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(CflatParser.INTEGER, i);
		}
		public List<Param_typerefsContext> param_typerefs() {
			return getRuleContexts(Param_typerefsContext.class);
		}
		public Param_typerefsContext param_typerefs(int i) {
			return getRuleContext(Param_typerefsContext.class,i);
		}
		public TyperefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeref; }
	}

	public final TyperefContext typeref() throws RecognitionException {
		TyperefContext _localctx = new TyperefContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			((TyperefContext)_localctx).tb = typeref_base();

			            ((TyperefContext)_localctx).typeRef =  ((TyperefContext)_localctx).tb.typeRef;
			        
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__10) | (1L << T__12))) != 0)) {
				{
				setState(478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(464);
					match(T__10);
					setState(465);
					match(T__11);

					            ((TyperefContext)_localctx).typeRef =  new ArrayTypeRef(_localctx.typeRef);
					        
					}
					break;
				case 2:
					{
					setState(467);
					match(T__10);
					setState(468);
					((TyperefContext)_localctx).t = match(INTEGER);
					setState(469);
					match(T__11);

					            ((TyperefContext)_localctx).typeRef =  new ArrayTypeRef(_localctx.typeRef, integerValue((((TyperefContext)_localctx).t!=null?((TyperefContext)_localctx).t.getText():null)));
					        
					}
					break;
				case 3:
					{
					setState(471);
					match(T__12);

					            ((TyperefContext)_localctx).typeRef =  new PointerTypeRef(_localctx.typeRef);
					        
					}
					break;
				case 4:
					{
					setState(473);
					match(T__4);
					setState(474);
					((TyperefContext)_localctx).pts = param_typerefs();
					setState(475);
					match(T__5);

					            ((TyperefContext)_localctx).typeRef =  new FunctionTypeRef(_localctx.typeRef, ((TyperefContext)_localctx).pts.paramTypeRefs);
					        
					}
					break;
				}
				}
				setState(482);
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
		public Fixedparam_typerefsContext fts;
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
		enterRule(_localctx, 78, RULE_param_typerefs);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(VOID);

				            ((Param_typerefsContext)_localctx).paramTypeRefs =   new ParamTypeRefs(new ArrayList<TypeRef>());
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				((Param_typerefsContext)_localctx).fts = fixedparam_typerefs();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(486);
					match(T__3);
					setState(487);
					match(T__6);

					                                ((Param_typerefsContext)_localctx).fts.paramTypeRefs.acceptVarargs();
					                              
					}
				}


				            ((Param_typerefsContext)_localctx).paramTypeRefs =  ((Param_typerefsContext)_localctx).fts.paramTypeRefs;
				        
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
		public TyperefContext ref2;
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
		enterRule(_localctx, 80, RULE_fixedparam_typerefs);

		        List<TypeRef> refs = new ArrayList<TypeRef>();
		    
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			((Fixedparam_typerefsContext)_localctx).ref = typeref();

			            refs.add(((Fixedparam_typerefsContext)_localctx).ref.typeRef);
			        
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(497);
					match(T__3);
					setState(498);
					((Fixedparam_typerefsContext)_localctx).ref2 = typeref();

					            refs.add(((Fixedparam_typerefsContext)_localctx).ref2.typeRef);
					        
					}
					} 
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public Token t;
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
		enterRule(_localctx, 82, RULE_typeref_base);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				((Typeref_baseContext)_localctx).t = match(VOID);

				            ((Typeref_baseContext)_localctx).typeRef =   new VoidTypeRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				((Typeref_baseContext)_localctx).t = match(CHAR);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.charRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				((Typeref_baseContext)_localctx).t = match(SHORT);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.shortRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				((Typeref_baseContext)_localctx).t = match(INT);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.intRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(514);
				((Typeref_baseContext)_localctx).t = match(LONG);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.longRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(516);
				((Typeref_baseContext)_localctx).t = match(UNSIGNED);
				setState(517);
				match(CHAR);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.ucharRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(519);
				((Typeref_baseContext)_localctx).t = match(UNSIGNED);
				setState(520);
				match(SHORT);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.ushortRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(522);
				((Typeref_baseContext)_localctx).t = match(UNSIGNED);
				setState(523);
				match(INT);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.uintRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(525);
				((Typeref_baseContext)_localctx).t = match(UNSIGNED);
				setState(526);
				match(LONG);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.ulongRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(528);
				((Typeref_baseContext)_localctx).t = match(STRUCT);
				setState(529);
				((Typeref_baseContext)_localctx).n = match(IDENTIFIER);

				            ((Typeref_baseContext)_localctx).typeRef =   new StructTypeRef(location(((Typeref_baseContext)_localctx).t),(((Typeref_baseContext)_localctx).n!=null?((Typeref_baseContext)_localctx).n.getText():null));
				        
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(531);
				((Typeref_baseContext)_localctx).t = match(UNION);
				setState(532);
				((Typeref_baseContext)_localctx).n = match(IDENTIFIER);

				            ((Typeref_baseContext)_localctx).typeRef =   new UnionTypeRef(location(((Typeref_baseContext)_localctx).t),(((Typeref_baseContext)_localctx).n!=null?((Typeref_baseContext)_localctx).n.getText():null));
				        
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(534);
				((Typeref_baseContext)_localctx).n = match(IDENTIFIER);

				           if (isType((((Typeref_baseContext)_localctx).n!=null?((Typeref_baseContext)_localctx).n.getText():null))){
				                ((Typeref_baseContext)_localctx).typeRef =   new UserTypeRef(location(((Typeref_baseContext)_localctx).n),(((Typeref_baseContext)_localctx).n!=null?((Typeref_baseContext)_localctx).n.getText():null));
				           }
				        
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
		public Token td;
		public TyperefContext t;
		public Token n;
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
		enterRule(_localctx, 84, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			((TypedefContext)_localctx).td = match(TYPEDEF);
			setState(539);
			((TypedefContext)_localctx).t = typeref();
			setState(540);
			((TypedefContext)_localctx).n = match(IDENTIFIER);
			setState(541);
			match(T__1);
			   addType((((TypedefContext)_localctx).n!=null?((TypedefContext)_localctx).n.getText():null));
			        ((TypedefContext)_localctx).typedefNode =   new TypedefNode(location(((TypedefContext)_localctx).td),((TypedefContext)_localctx).t.typeRef, (((TypedefContext)_localctx).n!=null?((TypedefContext)_localctx).n.getText():null));
			    
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
		public ExprContext c;
		public ExprContext l;
		public TermContext lhs;
		public ExprContext rhs;
		public Opassign_opContext op;
		public TermContext tl;
		public TermContext tr;
		public ExprContext t;
		public ExprContext e;
		public ExprContext r;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Opassign_opContext opassign_op() {
			return getRuleContext(Opassign_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(545);
				((ExprContext)_localctx).lhs = term();
				setState(546);
				match(T__2);
				setState(547);
				((ExprContext)_localctx).rhs = expr(21);

				                ((ExprContext)_localctx).exprNode =  new AssignNode(((ExprContext)_localctx).lhs.exprNode, ((ExprContext)_localctx).rhs.exprNode);
				            
				}
				break;
			case 2:
				{
				setState(550);
				((ExprContext)_localctx).lhs = term();
				setState(551);
				((ExprContext)_localctx).op = opassign_op();
				setState(552);
				((ExprContext)_localctx).rhs = expr(20);

				                ((ExprContext)_localctx).exprNode =  new OpAssignNode(((ExprContext)_localctx).lhs.exprNode, ((ExprContext)_localctx).op.op, ((ExprContext)_localctx).rhs.exprNode);
				            
				}
				break;
			case 3:
				{
				setState(555);
				((ExprContext)_localctx).tl = term();
				setState(556);
				match(T__12);
				setState(557);
				((ExprContext)_localctx).tr = term();

				                ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "*",((ExprContext)_localctx).r.exprNode);
				            
				}
				break;
			case 4:
				{
				setState(560);
				((ExprContext)_localctx).tl = term();
				setState(561);
				match(T__29);
				setState(562);
				((ExprContext)_localctx).tr = term();

				                ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "/",((ExprContext)_localctx).r.exprNode);
				            
				}
				break;
			case 5:
				{
				setState(565);
				((ExprContext)_localctx).tl = term();
				setState(566);
				match(T__30);
				setState(567);
				((ExprContext)_localctx).tr = term();

				                ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "%",((ExprContext)_localctx).r.exprNode);
				            
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(656);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(654);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.c = _prevctx;
						_localctx.c = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(572);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(573);
						match(T__13);
						setState(574);
						((ExprContext)_localctx).t = expr(0);
						setState(575);
						match(T__9);
						setState(576);
						((ExprContext)_localctx).e = expr(20);

						                          ((ExprContext)_localctx).exprNode =   new CondExprNode(_localctx.exprNode, ((ExprContext)_localctx).t.exprNode, ((ExprContext)_localctx).e.exprNode);
						                      
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(579);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(580);
						match(T__14);
						setState(581);
						((ExprContext)_localctx).r = expr(19);

						                          ((ExprContext)_localctx).exprNode =  new LogicalOrNode(_localctx.exprNode, ((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(584);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(585);
						match(T__15);
						setState(586);
						((ExprContext)_localctx).r = expr(18);

						                          ((ExprContext)_localctx).exprNode =  new LogicalAndNode(_localctx.exprNode,((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(589);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(590);
						match(T__16);
						setState(591);
						((ExprContext)_localctx).r = expr(17);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, ">",((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(594);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(595);
						match(T__17);
						setState(596);
						((ExprContext)_localctx).r = expr(16);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "<",((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(599);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(600);
						match(T__18);
						setState(601);
						((ExprContext)_localctx).r = expr(15);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode,">=" ,((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(604);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(605);
						match(T__19);
						setState(606);
						((ExprContext)_localctx).r = expr(14);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "<=",((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(609);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(610);
						match(T__20);
						setState(611);
						((ExprContext)_localctx).r = expr(13);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "==",((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(614);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(615);
						match(T__21);
						setState(616);
						((ExprContext)_localctx).r = expr(12);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "!=",((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(619);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(620);
						match(T__22);
						setState(621);
						((ExprContext)_localctx).r = expr(11);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "|",((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(624);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(625);
						match(T__23);
						setState(626);
						((ExprContext)_localctx).r = expr(10);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "^",((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(629);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(630);
						match(T__24);
						setState(631);
						((ExprContext)_localctx).r = expr(9);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode,"&" ,((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(634);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(635);
						match(T__25);
						setState(636);
						((ExprContext)_localctx).r = expr(8);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, ">>",((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(639);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(640);
						match(T__26);
						setState(641);
						((ExprContext)_localctx).r = expr(7);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "<<",((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(644);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(645);
						match(T__27);
						setState(646);
						((ExprContext)_localctx).r = expr(6);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "+",((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(649);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(650);
						match(T__28);
						setState(651);
						((ExprContext)_localctx).r = expr(5);

						                          ((ExprContext)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode,"-", ((ExprContext)_localctx).r.exprNode);
						                      
						}
						break;
					}
					} 
				}
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class Opassign_opContext extends ParserRuleContext {
		public String op;
		public Opassign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opassign_op; }
	}

	public final Opassign_opContext opassign_op() throws RecognitionException {
		Opassign_opContext _localctx = new Opassign_opContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_opassign_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				{
				setState(659);
				match(T__31);
				 ((Opassign_opContext)_localctx).op =   "+"; 
				}
				break;
			case T__32:
				{
				setState(661);
				match(T__32);
				 ((Opassign_opContext)_localctx).op =   "-"; 
				}
				break;
			case T__33:
				{
				setState(663);
				match(T__33);
				 ((Opassign_opContext)_localctx).op =   "*"; 
				}
				break;
			case T__34:
				{
				setState(665);
				match(T__34);
				 ((Opassign_opContext)_localctx).op =   "/"; 
				}
				break;
			case T__35:
				{
				setState(667);
				match(T__35);
				 ((Opassign_opContext)_localctx).op =   "%"; 
				}
				break;
			case T__36:
				{
				setState(669);
				match(T__36);
				 ((Opassign_opContext)_localctx).op =   "&"; 
				}
				break;
			case T__37:
				{
				setState(671);
				match(T__37);
				 ((Opassign_opContext)_localctx).op =   "|"; 
				}
				break;
			case T__38:
				{
				setState(673);
				match(T__38);
				 ((Opassign_opContext)_localctx).op =   "^"; 
				}
				break;
			case T__39:
				{
				setState(675);
				match(T__39);
				 ((Opassign_opContext)_localctx).op =   "<<"; 
				}
				break;
			case T__40:
				{
				setState(677);
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
		public TypeContext type;
		public TermContext term;
		public TermContext u;
		public TermContext u1;
		public TermContext t;
		public TermContext t1;
		public TermContext t2;
		public TermContext t3;
		public TermContext t4;
		public TermContext t5;
		public TypeContext ty;
		public PostfixContext p;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(CflatParser.SIZEOF, 0); }
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_term);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(T__4);
				setState(682);
				((TermContext)_localctx).type = type();
				setState(683);
				match(T__5);
				setState(684);
				((TermContext)_localctx).term = term();

				            ((TermContext)_localctx).exprNode =   new CastNode(((TermContext)_localctx).type.typeNode, ((TermContext)_localctx).term.exprNode);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				match(T__41);
				setState(688);
				((TermContext)_localctx).u = term();

				            ((TermContext)_localctx).exprNode =  new PrefixOpNode("++", ((TermContext)_localctx).u.exprNode);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(691);
				match(T__42);
				setState(692);
				((TermContext)_localctx).u1 = term();

				            ((TermContext)_localctx).exprNode =  new PrefixOpNode("--", ((TermContext)_localctx).u1.exprNode);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(695);
				match(T__27);
				setState(696);
				((TermContext)_localctx).t = term();

				            ((TermContext)_localctx).exprNode =  new UnaryOpNode("+", ((TermContext)_localctx).t.exprNode);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(699);
				match(T__28);
				setState(700);
				((TermContext)_localctx).t1 = term();

				            ((TermContext)_localctx).exprNode =  new UnaryOpNode("-", ((TermContext)_localctx).t1.exprNode);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(703);
				match(T__43);
				setState(704);
				((TermContext)_localctx).t2 = term();

				            ((TermContext)_localctx).exprNode =  new UnaryOpNode("!", ((TermContext)_localctx).t2.exprNode);
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(707);
				match(T__44);
				setState(708);
				((TermContext)_localctx).t3 = term();

				            ((TermContext)_localctx).exprNode =  new UnaryOpNode("~", ((TermContext)_localctx).t3.exprNode);
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(711);
				match(T__12);
				setState(712);
				((TermContext)_localctx).t4 = term();

				            ((TermContext)_localctx).exprNode =  new DereferenceNode(((TermContext)_localctx).t4.exprNode);
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(715);
				match(T__24);
				setState(716);
				((TermContext)_localctx).t5 = term();

				            ((TermContext)_localctx).exprNode =  new AddressNode(((TermContext)_localctx).t5.exprNode);
				        
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(719);
				match(SIZEOF);
				setState(720);
				match(T__4);
				setState(721);
				((TermContext)_localctx).ty = type();
				setState(722);
				match(T__5);

				            ((TermContext)_localctx).exprNode =  new SizeofTypeNode(((TermContext)_localctx).ty.typeNode, size_t());
				         
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(725);
				match(SIZEOF);
				setState(726);
				((TermContext)_localctx).u = term();

				             ((TermContext)_localctx).exprNode =  new SizeofExprNode(((TermContext)_localctx).u.exprNode, size_t());
				         
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(729);
				((TermContext)_localctx).p = postfix();

				             ((TermContext)_localctx).exprNode =  ((TermContext)_localctx).p.exprNode;
				         
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
		public PrimaryContext primary;
		public ExprContext e;
		public Token IDENTIFIER;
		public ArgsContext a;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CflatParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CflatParser.IDENTIFIER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_postfix);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			((PostfixContext)_localctx).primary = primary();

			            ((PostfixContext)_localctx).exprNode =  ((PostfixContext)_localctx).primary.exprNode;
			        
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(756);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__41:
						{
						setState(736);
						match(T__41);

						            ((PostfixContext)_localctx).exprNode =  new SuffixOpNode("++", _localctx.exprNode);
						        
						}
						break;
					case T__42:
						{
						setState(738);
						match(T__42);

						            ((PostfixContext)_localctx).exprNode =  new SuffixOpNode("--", _localctx.exprNode);
						        
						}
						break;
					case T__10:
						{
						setState(740);
						match(T__10);
						setState(741);
						((PostfixContext)_localctx).e = expr(0);
						setState(742);
						match(T__11);

						            ((PostfixContext)_localctx).exprNode =  new ArefNode(_localctx.exprNode, ((PostfixContext)_localctx).e.exprNode);
						        
						}
						break;
					case T__0:
						{
						setState(745);
						match(T__0);
						setState(746);
						((PostfixContext)_localctx).IDENTIFIER = match(IDENTIFIER);

						            ((PostfixContext)_localctx).exprNode =  new MemberNode(_localctx.exprNode, (((PostfixContext)_localctx).IDENTIFIER!=null?((PostfixContext)_localctx).IDENTIFIER.getText():null));
						        
						}
						break;
					case T__45:
						{
						setState(748);
						match(T__45);
						setState(749);
						((PostfixContext)_localctx).IDENTIFIER = match(IDENTIFIER);

						            ((PostfixContext)_localctx).exprNode =  new PtrMemberNode(_localctx.exprNode, (((PostfixContext)_localctx).IDENTIFIER!=null?((PostfixContext)_localctx).IDENTIFIER.getText():null));
						        
						}
						break;
					case T__4:
						{
						setState(751);
						match(T__4);
						setState(752);
						((PostfixContext)_localctx).a = args();
						setState(753);
						match(T__5);

						            ((PostfixContext)_localctx).exprNode =  new FuncallNode(_localctx.exprNode, ((PostfixContext)_localctx).a.arguments);
						        
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprNode> arguments;
		public ExprContext e;
		public ExprContext e1;
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
		enterRule(_localctx, 94, RULE_args);

		        ((ArgsContext)_localctx).arguments =  new ArrayList<ExprNode>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__12) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(761);
				((ArgsContext)_localctx).e = expr(0);

				            _localctx.arguments.add(((ArgsContext)_localctx).e.exprNode);
				        
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(763);
					match(T__3);
					setState(764);
					((ArgsContext)_localctx).e1 = expr(0);

					                _localctx.arguments.add(((ArgsContext)_localctx).e1.exprNode);
					            
					}
					}
					setState(771);
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
		public ExprContext expr;
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
		enterRule(_localctx, 96, RULE_primary);
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				((PrimaryContext)_localctx).t = match(INTEGER);

				            ((PrimaryContext)_localctx).exprNode =  integerNode(location(((PrimaryContext)_localctx).t),(((PrimaryContext)_localctx).t!=null?((PrimaryContext)_localctx).t.getText():null));
				        
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				((PrimaryContext)_localctx).t = match(CHARACTER);

				            ((PrimaryContext)_localctx).exprNode =  new IntegerLiteralNode(location(((PrimaryContext)_localctx).t),IntegerTypeRef.charRef(),characterCode((((PrimaryContext)_localctx).t!=null?((PrimaryContext)_localctx).t.getText():null)));
				        
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				((PrimaryContext)_localctx).t = match(STRING);

				            ((PrimaryContext)_localctx).exprNode =  new StringLiteralNode(location(((PrimaryContext)_localctx).t),new PointerTypeRef(IntegerTypeRef.charRef()),stringValue((((PrimaryContext)_localctx).t!=null?((PrimaryContext)_localctx).t.getText():null)));
				        
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(780);
				((PrimaryContext)_localctx).t = match(IDENTIFIER);

				            ((PrimaryContext)_localctx).exprNode =  new VariableNode(location(((PrimaryContext)_localctx).t),(((PrimaryContext)_localctx).t!=null?((PrimaryContext)_localctx).t.getText():null));
				        
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(782);
				match(T__4);
				setState(783);
				((PrimaryContext)_localctx).expr = expr(0);
				setState(784);
				match(T__5);

				             ((PrimaryContext)_localctx).exprNode =  ((PrimaryContext)_localctx).expr.exprNode;
				        
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 43:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u0318\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3~\n\3\f\3\16\3\u0081\13\3\3\4\3\4\3\4\7\4\u0086\n\4\f"+
		"\4\16\4\u0089\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0091\n\5\f\5\16\5\u0094"+
		"\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u00aa\n\6\f\6\16\6\u00ad\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00b4\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bb\n\7\3\7\7\7\u00be\n\7\f\7"+
		"\16\7\u00c1\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\5\n\u00d5\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00dd"+
		"\n\13\3\13\3\13\5\13\u00e1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e9\n\f"+
		"\f\f\16\f\u00ec\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\7\17\u00fa\n\17\f\17\16\17\u00fd\13\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u0110"+
		"\n\22\f\22\16\22\u0113\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\7\26\u012d\n\26\f\26\16\26\u0130\13\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u0158\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0166\n\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\5\34\u017d\n\34\3\34\3\34\5\34\u0181\n\34\3\34\3\34\5"+
		"\34\u0185\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\7\36\u0197\n\36\f\36\16\36\u019a\13\36\3\36"+
		"\3\36\3\36\5\36\u019f\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \6 \u01aa"+
		"\n \r \16 \u01ab\3!\3!\3!\3!\3!\3\"\3\"\3\"\6\"\u01b6\n\"\r\"\16\"\u01b7"+
		"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01cc\n&\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u01e1\n(\f"+
		"(\16(\u01e4\13(\3)\3)\3)\3)\3)\3)\5)\u01ec\n)\3)\3)\5)\u01f0\n)\3*\3*"+
		"\3*\3*\3*\3*\7*\u01f8\n*\f*\16*\u01fb\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u021b"+
		"\n+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u023d\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\7-\u0291\n-\f-\16-\u0294\13-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02aa\n.\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02df\n"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u02f7\n\60\f\60\16\60\u02fa"+
		"\13\60\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0302\n\61\f\61\16\61\u0305"+
		"\13\61\5\61\u0307\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u0316\n\62\3\62\2\3X\63\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\2\2\u0359"+
		"\2d\3\2\2\2\4i\3\2\2\2\6\u0087\3\2\2\2\b\u008a\3\2\2\2\n\u00ab\3\2\2\2"+
		"\f\u00ae\3\2\2\2\16\u00c4\3\2\2\2\20\u00cb\3\2\2\2\22\u00d4\3\2\2\2\24"+
		"\u00e0\3\2\2\2\26\u00e2\3\2\2\2\30\u00ed\3\2\2\2\32\u00f0\3\2\2\2\34\u00fb"+
		"\3\2\2\2\36\u00fe\3\2\2\2 \u0104\3\2\2\2\"\u010a\3\2\2\2$\u0116\3\2\2"+
		"\2&\u011a\3\2\2\2(\u0123\3\2\2\2*\u012e\3\2\2\2,\u0157\3\2\2\2.\u0159"+
		"\3\2\2\2\60\u015e\3\2\2\2\62\u0169\3\2\2\2\64\u0170\3\2\2\2\66\u0179\3"+
		"\2\2\28\u018a\3\2\2\2:\u0198\3\2\2\2<\u01a0\3\2\2\2>\u01a9\3\2\2\2@\u01ad"+
		"\3\2\2\2B\u01b5\3\2\2\2D\u01b9\3\2\2\2F\u01bd\3\2\2\2H\u01c0\3\2\2\2J"+
		"\u01cb\3\2\2\2L\u01cd\3\2\2\2N\u01d0\3\2\2\2P\u01ef\3\2\2\2R\u01f1\3\2"+
		"\2\2T\u021a\3\2\2\2V\u021c\3\2\2\2X\u023c\3\2\2\2Z\u02a9\3\2\2\2\\\u02de"+
		"\3\2\2\2^\u02e0\3\2\2\2`\u0306\3\2\2\2b\u0315\3\2\2\2de\5\6\4\2ef\5\n"+
		"\6\2fg\7\2\2\3gh\b\2\1\2h\3\3\2\2\2ij\5\6\4\2j\177\b\3\1\2kl\5&\24\2l"+
		"m\b\3\1\2m~\3\2\2\2no\5(\25\2op\b\3\1\2p~\3\2\2\2qr\5\16\b\2rs\b\3\1\2"+
		"s~\3\2\2\2tu\5\36\20\2uv\b\3\1\2v~\3\2\2\2wx\5 \21\2xy\b\3\1\2y~\3\2\2"+
		"\2z{\5V,\2{|\b\3\1\2|~\3\2\2\2}k\3\2\2\2}n\3\2\2\2}q\3\2\2\2}t\3\2\2\2"+
		"}w\3\2\2\2}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\5\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5\b\5\2\u0083\u0084\b\4\1\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\7\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b"+
		"\7K\2\2\u008b\u008c\7R\2\2\u008c\u0092\b\5\1\2\u008d\u008e\7\3\2\2\u008e"+
		"\u008f\7R\2\2\u008f\u0091\b\5\1\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7\4\2\2\u0096\t\3\2\2\2\u0097\u0098\5\20\t"+
		"\2\u0098\u0099\b\6\1\2\u0099\u00aa\3\2\2\2\u009a\u009b\5\f\7\2\u009b\u009c"+
		"\b\6\1\2\u009c\u00aa\3\2\2\2\u009d\u009e\5\16\b\2\u009e\u009f\b\6\1\2"+
		"\u009f\u00aa\3\2\2\2\u00a0\u00a1\5\36\20\2\u00a1\u00a2\b\6\1\2\u00a2\u00aa"+
		"\3\2\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\b\6\1\2\u00a5\u00aa\3\2\2\2\u00a6"+
		"\u00a7\5V,\2\u00a7\u00a8\b\6\1\2\u00a8\u00aa\3\2\2\2\u00a9\u0097\3\2\2"+
		"\2\u00a9\u009a\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a3"+
		"\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\13\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\5\22\n"+
		"\2\u00af\u00b0\5L\'\2\u00b0\u00b3\7R\2\2\u00b1\u00b2\7\5\2\2\u00b2\u00b4"+
		"\5X-\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00bf\b\7\1\2\u00b6\u00b7\7\6\2\2\u00b7\u00ba\7R\2\2\u00b8\u00b9\7\5"+
		"\2\2\u00b9\u00bb\5X-\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00be\b\7\1\2\u00bd\u00b6\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00c3\7\4\2\2\u00c3\r\3\2\2\2\u00c4\u00c5\7;\2\2\u00c5\u00c6"+
		"\5L\'\2\u00c6\u00c7\7R\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9\5X-\2\u00c9"+
		"\u00ca\7\4\2\2\u00ca\17\3\2\2\2\u00cb\u00cc\5\22\n\2\u00cc\u00cd\5N(\2"+
		"\u00cd\u00ce\7R\2\2\u00ce\u00cf\7\7\2\2\u00cf\u00d0\5\24\13\2\u00d0\u00d1"+
		"\7\b\2\2\u00d1\u00d2\5\32\16\2\u00d2\21\3\2\2\2\u00d3\u00d5\79\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\23\3\2\2\2\u00d6\u00d7\7\61\2"+
		"\2\u00d7\u00e1\b\13\1\2\u00d8\u00dc\5\26\f\2\u00d9\u00da\7\6\2\2\u00da"+
		"\u00db\7\t\2\2\u00db\u00dd\b\13\1\2\u00dc\u00d9\3\2\2\2\u00dc\u00dd\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b\13\1\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00d6\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e1\25\3\2\2\2\u00e2\u00e3\5\30\r"+
		"\2\u00e3\u00ea\b\f\1\2\u00e4\u00e5\7\6\2\2\u00e5\u00e6\5\30\r\2\u00e6"+
		"\u00e7\b\f\1\2\u00e7\u00e9\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\27\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ed\u00ee\5L\'\2\u00ee\u00ef\7R\2\2\u00ef\31\3\2\2\2\u00f0"+
		"\u00f1\7\n\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\5*\26\2\u00f3\u00f4\7"+
		"\13\2\2\u00f4\u00f5\b\16\1\2\u00f5\33\3\2\2\2\u00f6\u00f7\5\f\7\2\u00f7"+
		"\u00f8\b\17\1\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\35\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\7\66\2\2\u00ff\u0100\7R\2\2\u0100\u0101\5\""+
		"\22\2\u0101\u0102\7\4\2\2\u0102\u0103\b\20\1\2\u0103\37\3\2\2\2\u0104"+
		"\u0105\7\67\2\2\u0105\u0106\7R\2\2\u0106\u0107\5\"\22\2\u0107\u0108\7"+
		"\4\2\2\u0108\u0109\b\21\1\2\u0109!\3\2\2\2\u010a\u0111\7\n\2\2\u010b\u010c"+
		"\5$\23\2\u010c\u010d\7\4\2\2\u010d\u010e\b\22\1\2\u010e\u0110\3\2\2\2"+
		"\u010f\u010b\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\13\2\2"+
		"\u0115#\3\2\2\2\u0116\u0117\5L\'\2\u0117\u0118\7R\2\2\u0118\u0119\b\23"+
		"\1\2\u0119%\3\2\2\2\u011a\u011b\7:\2\2\u011b\u011c\5N(\2\u011c\u011d\7"+
		"R\2\2\u011d\u011e\7\7\2\2\u011e\u011f\5\24\13\2\u011f\u0120\7\b\2\2\u0120"+
		"\u0121\7\4\2\2\u0121\u0122\b\24\1\2\u0122\'\3\2\2\2\u0123\u0124\7:\2\2"+
		"\u0124\u0125\5L\'\2\u0125\u0126\7R\2\2\u0126\u0127\7\4\2\2\u0127\u0128"+
		"\b\25\1\2\u0128)\3\2\2\2\u0129\u012a\5,\27\2\u012a\u012b\b\26\1\2\u012b"+
		"\u012d\3\2\2\2\u012c\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f+\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0158"+
		"\7\4\2\2\u0132\u0133\5.\30\2\u0133\u0134\b\27\1\2\u0134\u0158\3\2\2\2"+
		"\u0135\u0136\5X-\2\u0136\u0137\7\4\2\2\u0137\u0138\b\27\1\2\u0138\u0158"+
		"\3\2\2\2\u0139\u013a\5\32\16\2\u013a\u013b\b\27\1\2\u013b\u0158\3\2\2"+
		"\2\u013c\u013d\5\60\31\2\u013d\u013e\b\27\1\2\u013e\u0158\3\2\2\2\u013f"+
		"\u0140\5\62\32\2\u0140\u0141\b\27\1\2\u0141\u0158\3\2\2\2\u0142\u0143"+
		"\5\64\33\2\u0143\u0144\b\27\1\2\u0144\u0158\3\2\2\2\u0145\u0146\5\66\34"+
		"\2\u0146\u0147\b\27\1\2\u0147\u0158\3\2\2\2\u0148\u0149\58\35\2\u0149"+
		"\u014a\b\27\1\2\u014a\u0158\3\2\2\2\u014b\u014c\5F$\2\u014c\u014d\b\27"+
		"\1\2\u014d\u0158\3\2\2\2\u014e\u014f\5H%\2\u014f\u0150\b\27\1\2\u0150"+
		"\u0158\3\2\2\2\u0151\u0152\5D#\2\u0152\u0153\b\27\1\2\u0153\u0158\3\2"+
		"\2\2\u0154\u0155\5J&\2\u0155\u0156\b\27\1\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0131\3\2\2\2\u0157\u0132\3\2\2\2\u0157\u0135\3\2\2\2\u0157\u0139\3\2"+
		"\2\2\u0157\u013c\3\2\2\2\u0157\u013f\3\2\2\2\u0157\u0142\3\2\2\2\u0157"+
		"\u0145\3\2\2\2\u0157\u0148\3\2\2\2\u0157\u014b\3\2\2\2\u0157\u014e\3\2"+
		"\2\2\u0157\u0151\3\2\2\2\u0157\u0154\3\2\2\2\u0158-\3\2\2\2\u0159\u015a"+
		"\7R\2\2\u015a\u015b\7\f\2\2\u015b\u015c\5,\27\2\u015c\u015d\b\30\1\2\u015d"+
		"/\3\2\2\2\u015e\u015f\7>\2\2\u015f\u0160\7\7\2\2\u0160\u0161\5X-\2\u0161"+
		"\u0162\7\b\2\2\u0162\u0165\5,\27\2\u0163\u0164\7?\2\2\u0164\u0166\5,\27"+
		"\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168"+
		"\b\31\1\2\u0168\61\3\2\2\2\u0169\u016a\7C\2\2\u016a\u016b\7\7\2\2\u016b"+
		"\u016c\5X-\2\u016c\u016d\7\b\2\2\u016d\u016e\5,\27\2\u016e\u016f\b\32"+
		"\1\2\u016f\63\3\2\2\2\u0170\u0171\7D\2\2\u0171\u0172\5,\27\2\u0172\u0173"+
		"\7C\2\2\u0173\u0174\7\7\2\2\u0174\u0175\5X-\2\u0175\u0176\7\b\2\2\u0176"+
		"\u0177\7\4\2\2\u0177\u0178\b\33\1\2\u0178\65\3\2\2\2\u0179\u017a\7E\2"+
		"\2\u017a\u017c\7\7\2\2\u017b\u017d\5X-\2\u017c\u017b\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\7\4\2\2\u017f\u0181\5X-\2\u0180"+
		"\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\7\4"+
		"\2\2\u0183\u0185\5X-\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0187\7\b\2\2\u0187\u0188\5,\27\2\u0188\u0189\b\34\1\2"+
		"\u0189\67\3\2\2\2\u018a\u018b\7@\2\2\u018b\u018c\7\7\2\2\u018c\u018d\5"+
		"X-\2\u018d\u018e\7\b\2\2\u018e\u018f\7\n\2\2\u018f\u0190\5:\36\2\u0190"+
		"\u0191\7\13\2\2\u0191\u0192\b\35\1\2\u01929\3\2\2\2\u0193\u0194\5<\37"+
		"\2\u0194\u0195\b\36\1\2\u0195\u0197\3\2\2\2\u0196\u0193\3\2\2\2\u0197"+
		"\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019e\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019b\u019c\5@!\2\u019c\u019d\b\36\1\2\u019d"+
		"\u019f\3\2\2\2\u019e\u019b\3\2\2\2\u019e\u019f\3\2\2\2\u019f;\3\2\2\2"+
		"\u01a0\u01a1\5> \2\u01a1\u01a2\5B\"\2\u01a2\u01a3\b\37\1\2\u01a3=\3\2"+
		"\2\2\u01a4\u01a5\7A\2\2\u01a5\u01a6\5b\62\2\u01a6\u01a7\7\f\2\2\u01a7"+
		"\u01a8\b \1\2\u01a8\u01aa\3\2\2\2\u01a9\u01a4\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac?\3\2\2\2\u01ad\u01ae"+
		"\7B\2\2\u01ae\u01af\7\f\2\2\u01af\u01b0\5B\"\2\u01b0\u01b1\b!\1\2\u01b1"+
		"A\3\2\2\2\u01b2\u01b3\5,\27\2\u01b3\u01b4\b\"\1\2\u01b4\u01b6\3\2\2\2"+
		"\u01b5\u01b2\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8C\3\2\2\2\u01b9\u01ba\7I\2\2\u01ba\u01bb\7R\2\2\u01bb\u01bc"+
		"\7\4\2\2\u01bcE\3\2\2\2\u01bd\u01be\7G\2\2\u01be\u01bf\7\4\2\2\u01bfG"+
		"\3\2\2\2\u01c0\u01c1\7H\2\2\u01c1\u01c2\7\4\2\2\u01c2I\3\2\2\2\u01c3\u01c4"+
		"\7F\2\2\u01c4\u01c5\7\4\2\2\u01c5\u01cc\b&\1\2\u01c6\u01c7\7F\2\2\u01c7"+
		"\u01c8\5X-\2\u01c8\u01c9\7\4\2\2\u01c9\u01ca\b&\1\2\u01ca\u01cc\3\2\2"+
		"\2\u01cb\u01c3\3\2\2\2\u01cb\u01c6\3\2\2\2\u01ccK\3\2\2\2\u01cd\u01ce"+
		"\5N(\2\u01ce\u01cf\b\'\1\2\u01cfM\3\2\2\2\u01d0\u01d1\5T+\2\u01d1\u01e2"+
		"\b(\1\2\u01d2\u01d3\7\r\2\2\u01d3\u01d4\7\16\2\2\u01d4\u01e1\b(\1\2\u01d5"+
		"\u01d6\7\r\2\2\u01d6\u01d7\7S\2\2\u01d7\u01d8\7\16\2\2\u01d8\u01e1\b("+
		"\1\2\u01d9\u01da\7\17\2\2\u01da\u01e1\b(\1\2\u01db\u01dc\7\7\2\2\u01dc"+
		"\u01dd\5P)\2\u01dd\u01de\7\b\2\2\u01de\u01df\b(\1\2\u01df\u01e1\3\2\2"+
		"\2\u01e0\u01d2\3\2\2\2\u01e0\u01d5\3\2\2\2\u01e0\u01d9\3\2\2\2\u01e0\u01db"+
		"\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"O\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\7\61\2\2\u01e6\u01f0\b)\1\2"+
		"\u01e7\u01eb\5R*\2\u01e8\u01e9\7\6\2\2\u01e9\u01ea\7\t\2\2\u01ea\u01ec"+
		"\b)\1\2\u01eb\u01e8\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ee\b)\1\2\u01ee\u01f0\3\2\2\2\u01ef\u01e5\3\2\2\2\u01ef\u01e7\3\2"+
		"\2\2\u01f0Q\3\2\2\2\u01f1\u01f2\5N(\2\u01f2\u01f9\b*\1\2\u01f3\u01f4\7"+
		"\6\2\2\u01f4\u01f5\5N(\2\u01f5\u01f6\b*\1\2\u01f6\u01f8\3\2\2\2\u01f7"+
		"\u01f3\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01faS\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\7\61\2\2\u01fd\u021b"+
		"\b+\1\2\u01fe\u01ff\7\62\2\2\u01ff\u021b\b+\1\2\u0200\u0201\7\63\2\2\u0201"+
		"\u021b\b+\1\2\u0202\u0203\7\64\2\2\u0203\u021b\b+\1\2\u0204\u0205\7\65"+
		"\2\2\u0205\u021b\b+\1\2\u0206\u0207\7=\2\2\u0207\u0208\7\62\2\2\u0208"+
		"\u021b\b+\1\2\u0209\u020a\7=\2\2\u020a\u020b\7\63\2\2\u020b\u021b\b+\1"+
		"\2\u020c\u020d\7=\2\2\u020d\u020e\7\64\2\2\u020e\u021b\b+\1\2\u020f\u0210"+
		"\7=\2\2\u0210\u0211\7\65\2\2\u0211\u021b\b+\1\2\u0212\u0213\7\66\2\2\u0213"+
		"\u0214\7R\2\2\u0214\u021b\b+\1\2\u0215\u0216\7\67\2\2\u0216\u0217\7R\2"+
		"\2\u0217\u021b\b+\1\2\u0218\u0219\7R\2\2\u0219\u021b\b+\1\2\u021a\u01fc"+
		"\3\2\2\2\u021a\u01fe\3\2\2\2\u021a\u0200\3\2\2\2\u021a\u0202\3\2\2\2\u021a"+
		"\u0204\3\2\2\2\u021a\u0206\3\2\2\2\u021a\u0209\3\2\2\2\u021a\u020c\3\2"+
		"\2\2\u021a\u020f\3\2\2\2\u021a\u0212\3\2\2\2\u021a\u0215\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021bU\3\2\2\2\u021c\u021d\7J\2\2\u021d\u021e\5N(\2\u021e"+
		"\u021f\7R\2\2\u021f\u0220\7\4\2\2\u0220\u0221\b,\1\2\u0221W\3\2\2\2\u0222"+
		"\u0223\b-\1\2\u0223\u0224\5\\/\2\u0224\u0225\7\5\2\2\u0225\u0226\5X-\27"+
		"\u0226\u0227\b-\1\2\u0227\u023d\3\2\2\2\u0228\u0229\5\\/\2\u0229\u022a"+
		"\5Z.\2\u022a\u022b\5X-\26\u022b\u022c\b-\1\2\u022c\u023d\3\2\2\2\u022d"+
		"\u022e\5\\/\2\u022e\u022f\7\17\2\2\u022f\u0230\5\\/\2\u0230\u0231\b-\1"+
		"\2\u0231\u023d\3\2\2\2\u0232\u0233\5\\/\2\u0233\u0234\7 \2\2\u0234\u0235"+
		"\5\\/\2\u0235\u0236\b-\1\2\u0236\u023d\3\2\2\2\u0237\u0238\5\\/\2\u0238"+
		"\u0239\7!\2\2\u0239\u023a\5\\/\2\u023a\u023b\b-\1\2\u023b\u023d\3\2\2"+
		"\2\u023c\u0222\3\2\2\2\u023c\u0228\3\2\2\2\u023c\u022d\3\2\2\2\u023c\u0232"+
		"\3\2\2\2\u023c\u0237\3\2\2\2\u023d\u0292\3\2\2\2\u023e\u023f\f\25\2\2"+
		"\u023f\u0240\7\20\2\2\u0240\u0241\5X-\2\u0241\u0242\7\f\2\2\u0242\u0243"+
		"\5X-\26\u0243\u0244\b-\1\2\u0244\u0291\3\2\2\2\u0245\u0246\f\24\2\2\u0246"+
		"\u0247\7\21\2\2\u0247\u0248\5X-\25\u0248\u0249\b-\1\2\u0249\u0291\3\2"+
		"\2\2\u024a\u024b\f\23\2\2\u024b\u024c\7\22\2\2\u024c\u024d\5X-\24\u024d"+
		"\u024e\b-\1\2\u024e\u0291\3\2\2\2\u024f\u0250\f\22\2\2\u0250\u0251\7\23"+
		"\2\2\u0251\u0252\5X-\23\u0252\u0253\b-\1\2\u0253\u0291\3\2\2\2\u0254\u0255"+
		"\f\21\2\2\u0255\u0256\7\24\2\2\u0256\u0257\5X-\22\u0257\u0258\b-\1\2\u0258"+
		"\u0291\3\2\2\2\u0259\u025a\f\20\2\2\u025a\u025b\7\25\2\2\u025b\u025c\5"+
		"X-\21\u025c\u025d\b-\1\2\u025d\u0291\3\2\2\2\u025e\u025f\f\17\2\2\u025f"+
		"\u0260\7\26\2\2\u0260\u0261\5X-\20\u0261\u0262\b-\1\2\u0262\u0291\3\2"+
		"\2\2\u0263\u0264\f\16\2\2\u0264\u0265\7\27\2\2\u0265\u0266\5X-\17\u0266"+
		"\u0267\b-\1\2\u0267\u0291\3\2\2\2\u0268\u0269\f\r\2\2\u0269\u026a\7\30"+
		"\2\2\u026a\u026b\5X-\16\u026b\u026c\b-\1\2\u026c\u0291\3\2\2\2\u026d\u026e"+
		"\f\f\2\2\u026e\u026f\7\31\2\2\u026f\u0270\5X-\r\u0270\u0271\b-\1\2\u0271"+
		"\u0291\3\2\2\2\u0272\u0273\f\13\2\2\u0273\u0274\7\32\2\2\u0274\u0275\5"+
		"X-\f\u0275\u0276\b-\1\2\u0276\u0291\3\2\2\2\u0277\u0278\f\n\2\2\u0278"+
		"\u0279\7\33\2\2\u0279\u027a\5X-\13\u027a\u027b\b-\1\2\u027b\u0291\3\2"+
		"\2\2\u027c\u027d\f\t\2\2\u027d\u027e\7\34\2\2\u027e\u027f\5X-\n\u027f"+
		"\u0280\b-\1\2\u0280\u0291\3\2\2\2\u0281\u0282\f\b\2\2\u0282\u0283\7\35"+
		"\2\2\u0283\u0284\5X-\t\u0284\u0285\b-\1\2\u0285\u0291\3\2\2\2\u0286\u0287"+
		"\f\7\2\2\u0287\u0288\7\36\2\2\u0288\u0289\5X-\b\u0289\u028a\b-\1\2\u028a"+
		"\u0291\3\2\2\2\u028b\u028c\f\6\2\2\u028c\u028d\7\37\2\2\u028d\u028e\5"+
		"X-\7\u028e\u028f\b-\1\2\u028f\u0291\3\2\2\2\u0290\u023e\3\2\2\2\u0290"+
		"\u0245\3\2\2\2\u0290\u024a\3\2\2\2\u0290\u024f\3\2\2\2\u0290\u0254\3\2"+
		"\2\2\u0290\u0259\3\2\2\2\u0290\u025e\3\2\2\2\u0290\u0263\3\2\2\2\u0290"+
		"\u0268\3\2\2\2\u0290\u026d\3\2\2\2\u0290\u0272\3\2\2\2\u0290\u0277\3\2"+
		"\2\2\u0290\u027c\3\2\2\2\u0290\u0281\3\2\2\2\u0290\u0286\3\2\2\2\u0290"+
		"\u028b\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293Y\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0296\7\"\2\2\u0296\u02aa"+
		"\b.\1\2\u0297\u0298\7#\2\2\u0298\u02aa\b.\1\2\u0299\u029a\7$\2\2\u029a"+
		"\u02aa\b.\1\2\u029b\u029c\7%\2\2\u029c\u02aa\b.\1\2\u029d\u029e\7&\2\2"+
		"\u029e\u02aa\b.\1\2\u029f\u02a0\7\'\2\2\u02a0\u02aa\b.\1\2\u02a1\u02a2"+
		"\7(\2\2\u02a2\u02aa\b.\1\2\u02a3\u02a4\7)\2\2\u02a4\u02aa\b.\1\2\u02a5"+
		"\u02a6\7*\2\2\u02a6\u02aa\b.\1\2\u02a7\u02a8\7+\2\2\u02a8\u02aa\b.\1\2"+
		"\u02a9\u0295\3\2\2\2\u02a9\u0297\3\2\2\2\u02a9\u0299\3\2\2\2\u02a9\u029b"+
		"\3\2\2\2\u02a9\u029d\3\2\2\2\u02a9\u029f\3\2\2\2\u02a9\u02a1\3\2\2\2\u02a9"+
		"\u02a3\3\2\2\2\u02a9\u02a5\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa[\3\2\2\2"+
		"\u02ab\u02ac\7\7\2\2\u02ac\u02ad\5L\'\2\u02ad\u02ae\7\b\2\2\u02ae\u02af"+
		"\5\\/\2\u02af\u02b0\b/\1\2\u02b0\u02df\3\2\2\2\u02b1\u02b2\7,\2\2\u02b2"+
		"\u02b3\5\\/\2\u02b3\u02b4\b/\1\2\u02b4\u02df\3\2\2\2\u02b5\u02b6\7-\2"+
		"\2\u02b6\u02b7\5\\/\2\u02b7\u02b8\b/\1\2\u02b8\u02df\3\2\2\2\u02b9\u02ba"+
		"\7\36\2\2\u02ba\u02bb\5\\/\2\u02bb\u02bc\b/\1\2\u02bc\u02df\3\2\2\2\u02bd"+
		"\u02be\7\37\2\2\u02be\u02bf\5\\/\2\u02bf\u02c0\b/\1\2\u02c0\u02df\3\2"+
		"\2\2\u02c1\u02c2\7.\2\2\u02c2\u02c3\5\\/\2\u02c3\u02c4\b/\1\2\u02c4\u02df"+
		"\3\2\2\2\u02c5\u02c6\7/\2\2\u02c6\u02c7\5\\/\2\u02c7\u02c8\b/\1\2\u02c8"+
		"\u02df\3\2\2\2\u02c9\u02ca\7\17\2\2\u02ca\u02cb\5\\/\2\u02cb\u02cc\b/"+
		"\1\2\u02cc\u02df\3\2\2\2\u02cd\u02ce\7\33\2\2\u02ce\u02cf\5\\/\2\u02cf"+
		"\u02d0\b/\1\2\u02d0\u02df\3\2\2\2\u02d1\u02d2\7L\2\2\u02d2\u02d3\7\7\2"+
		"\2\u02d3\u02d4\5L\'\2\u02d4\u02d5\7\b\2\2\u02d5\u02d6\b/\1\2\u02d6\u02df"+
		"\3\2\2\2\u02d7\u02d8\7L\2\2\u02d8\u02d9\5\\/\2\u02d9\u02da\b/\1\2\u02da"+
		"\u02df\3\2\2\2\u02db\u02dc\5^\60\2\u02dc\u02dd\b/\1\2\u02dd\u02df\3\2"+
		"\2\2\u02de\u02ab\3\2\2\2\u02de\u02b1\3\2\2\2\u02de\u02b5\3\2\2\2\u02de"+
		"\u02b9\3\2\2\2\u02de\u02bd\3\2\2\2\u02de\u02c1\3\2\2\2\u02de\u02c5\3\2"+
		"\2\2\u02de\u02c9\3\2\2\2\u02de\u02cd\3\2\2\2\u02de\u02d1\3\2\2\2\u02de"+
		"\u02d7\3\2\2\2\u02de\u02db\3\2\2\2\u02df]\3\2\2\2\u02e0\u02e1\5b\62\2"+
		"\u02e1\u02f8\b\60\1\2\u02e2\u02e3\7,\2\2\u02e3\u02f7\b\60\1\2\u02e4\u02e5"+
		"\7-\2\2\u02e5\u02f7\b\60\1\2\u02e6\u02e7\7\r\2\2\u02e7\u02e8\5X-\2\u02e8"+
		"\u02e9\7\16\2\2\u02e9\u02ea\b\60\1\2\u02ea\u02f7\3\2\2\2\u02eb\u02ec\7"+
		"\3\2\2\u02ec\u02ed\7R\2\2\u02ed\u02f7\b\60\1\2\u02ee\u02ef\7\60\2\2\u02ef"+
		"\u02f0\7R\2\2\u02f0\u02f7\b\60\1\2\u02f1\u02f2\7\7\2\2\u02f2\u02f3\5`"+
		"\61\2\u02f3\u02f4\7\b\2\2\u02f4\u02f5\b\60\1\2\u02f5\u02f7\3\2\2\2\u02f6"+
		"\u02e2\3\2\2\2\u02f6\u02e4\3\2\2\2\u02f6\u02e6\3\2\2\2\u02f6\u02eb\3\2"+
		"\2\2\u02f6\u02ee\3\2\2\2\u02f6\u02f1\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8"+
		"\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9_\3\2\2\2\u02fa\u02f8\3\2\2\2"+
		"\u02fb\u02fc\5X-\2\u02fc\u0303\b\61\1\2\u02fd\u02fe\7\6\2\2\u02fe\u02ff"+
		"\5X-\2\u02ff\u0300\b\61\1\2\u0300\u0302\3\2\2\2\u0301\u02fd\3\2\2\2\u0302"+
		"\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0307\3\2"+
		"\2\2\u0305\u0303\3\2\2\2\u0306\u02fb\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"a\3\2\2\2\u0308\u0309\7S\2\2\u0309\u0316\b\62\1\2\u030a\u030b\7Q\2\2\u030b"+
		"\u0316\b\62\1\2\u030c\u030d\7P\2\2\u030d\u0316\b\62\1\2\u030e\u030f\7"+
		"R\2\2\u030f\u0316\b\62\1\2\u0310\u0311\7\7\2\2\u0311\u0312\5X-\2\u0312"+
		"\u0313\7\b\2\2\u0313\u0314\b\62\1\2\u0314\u0316\3\2\2\2\u0315\u0308\3"+
		"\2\2\2\u0315\u030a\3\2\2\2\u0315\u030c\3\2\2\2\u0315\u030e\3\2\2\2\u0315"+
		"\u0310\3\2\2\2\u0316c\3\2\2\2,}\177\u0087\u0092\u00a9\u00ab\u00b3\u00ba"+
		"\u00bf\u00d4\u00dc\u00e0\u00ea\u00fb\u0111\u012e\u0157\u0165\u017c\u0180"+
		"\u0184\u0198\u019e\u01ab\u01b7\u01cb\u01e0\u01e2\u01eb\u01ef\u01f9\u021a"+
		"\u023c\u0290\u0292\u02a9\u02de\u02f6\u02f8\u0303\u0306\u0315";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}