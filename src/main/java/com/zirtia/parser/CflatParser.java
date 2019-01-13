// Generated from D:/iworkspace/cflat-parser-master/src/main/java/com/zirtia/parser\Cflat.g4 by ANTLR 4.7.2
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
		RULE_typeref_base = 41, RULE_typedef = 42, RULE_expr = 43, RULE_expr10 = 44, 
		RULE_expr9 = 45, RULE_expr8 = 46, RULE_expr7 = 47, RULE_expr6 = 48, RULE_expr5 = 49, 
		RULE_expr4 = 50, RULE_expr3 = 51, RULE_expr2 = 52, RULE_expr1 = 53, RULE_opassign_op = 54, 
		RULE_term = 55, RULE_unary = 56, RULE_postfix = 57, RULE_args = 58, RULE_primary = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "declaration_file", "import_stmts", "import_stmt", 
			"top_defs", "defvars", "defconst", "defun", "storage", "params", "fixedparams", 
			"param", "block", "defvar_list", "defstruct", "defunion", "member_list", 
			"slot", "funcdecl", "vardecl", "stmts", "stmt", "labeled_stmt", "if_stmt", 
			"while_stmt", "dowhile_stmt", "for_stmt", "switch_stmt", "case_clauses", 
			"case_clause", "cases", "default_clause", "case_body", "goto_stmt", "break_stmt", 
			"continue_stmt", "return_stmt", "type", "typeref", "param_typerefs", 
			"fixedparam_typerefs", "typeref_base", "typedef", "expr", "expr10", "expr9", 
			"expr8", "expr7", "expr6", "expr5", "expr4", "expr3", "expr2", "expr1", 
			"opassign_op", "term", "unary", "postfix", "args", "primary"
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
	        String s = stringValue(image);
	        if (s.length() != 1) {
	            throw new Error("must not happen: character length > 1");
	        }
	        return (long)s.charAt(0);
	    }

	   private String stringValue(String _image) {
	       int pos = 0;
	       int idx;
	       StringBuffer buf = new StringBuffer();
	       String image = _image.substring(1, _image.length() - 1);

	       while ((idx = image.indexOf("\\", pos)) >= 0) {
	           buf.append(image.substring(pos, idx));
	           if (image.length() >= idx + 4
	                   && Character.isDigit(image.charAt(idx+1))
	                   && Character.isDigit(image.charAt(idx+2))
	                   && Character.isDigit(image.charAt(idx+3))) {
	               buf.append(unescapeOctal(image.substring(idx+1, idx+4)));
	               pos = idx + 4;
	           }
	           else {
	               buf.append(unescapeSeq(image.charAt(idx+1)));
	               pos = idx + 2;
	           }
	       }
	       if (pos < image.length()) {
	           buf.append(image.substring(pos, image.length()));
	       }
	       return buf.toString();
	   }

	    private static final int charMax = 255;

	    private char unescapeOctal(String digits){
	        int i = Integer.parseInt(digits, 8);
	        if (i > charMax) {
	            throw new Error(
	                "octal character sequence too big: \\" + digits);
	        }
	        return (char)i;
	    }

	    private static final char bell = 7;
	    private static final char backspace = 8;
	    private static final char escape = 27;
	    private static final char vt = 11;

	    private char unescapeSeq(char c) {
	        switch (c) {
	             case '0': return '\0';
	             case '"': return '"';
	             case '\'': return '\'';
	             case 'a': return bell;
	             case 'b': return backspace;
	             case 'e': return escape;
	             case 'f': return '\f';
	             case 'n': return '\n';
	             case 'r': return '\r';
	             case 't': return '\t';
	             case 'v': return vt;
	             default:  throw new Error("unknown escape sequence: \"\\" + c);
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
		public Import_stmtsContext iss;
		public Top_defsContext tds;
		public Import_stmtsContext import_stmts() {
			return getRuleContext(Import_stmtsContext.class,0);
		}
		public Top_defsContext top_defs() {
			return getRuleContext(Top_defsContext.class,0);
		}
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
			setState(120);
			((Compilation_unitContext)_localctx).iss = import_stmts();
			setState(121);
			((Compilation_unitContext)_localctx).tds = top_defs();

			        Declarations decls = ((Compilation_unitContext)_localctx).tds.decls;
			        decls.add(((Compilation_unitContext)_localctx).iss.impdecls);
			        ((Compilation_unitContext)_localctx).ast =   new AST(location((((Compilation_unitContext)_localctx).iss!=null?(((Compilation_unitContext)_localctx).iss.start):null)),decls);
			    
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
		public Import_stmtsContext iss;
		public FuncdeclContext fd;
		public VardeclContext vd;
		public DefconstContext dc;
		public DefstructContext ds;
		public DefunionContext du;
		public TypedefContext td;
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
			setState(124);
			((Declaration_fileContext)_localctx).iss = import_stmts();

			            _localctx.decls.add(((Declaration_fileContext)_localctx).iss.impdecls);
			        
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (STRUCT - 52)) | (1L << (UNION - 52)) | (1L << (EXTERN - 52)) | (1L << (CONST - 52)) | (1L << (TYPEDEF - 52)))) != 0)) {
				{
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(126);
					((Declaration_fileContext)_localctx).fd = funcdecl();

					            _localctx.decls.addFuncdecl(((Declaration_fileContext)_localctx).fd.undefinedFunction);
					        
					}
					break;
				case 2:
					{
					setState(129);
					((Declaration_fileContext)_localctx).vd = vardecl();

					            _localctx.decls.addVardecl(((Declaration_fileContext)_localctx).vd.undefinedVariable);
					        
					}
					break;
				case 3:
					{
					setState(132);
					((Declaration_fileContext)_localctx).dc = defconst();

					            _localctx.decls.addConstant(((Declaration_fileContext)_localctx).dc.contant);
					        
					}
					break;
				case 4:
					{
					setState(135);
					((Declaration_fileContext)_localctx).ds = defstruct();

					            _localctx.decls.addDefstruct(((Declaration_fileContext)_localctx).ds.structNode);
					        
					}
					break;
				case 5:
					{
					setState(138);
					((Declaration_fileContext)_localctx).du = defunion();

					            _localctx.decls.addDefunion(((Declaration_fileContext)_localctx).du.unionNode);
					        
					}
					break;
				case 6:
					{
					setState(141);
					((Declaration_fileContext)_localctx).td = typedef();

					            _localctx.decls.addTypedef(((Declaration_fileContext)_localctx).td.typedefNode);
					        
					}
					break;
				}
				}
				setState(148);
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
		public Import_stmtContext is;
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
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(149);
				((Import_stmtsContext)_localctx).is = import_stmt();

				            Declarations decls = loader.loadLibrary(((Import_stmtsContext)_localctx).is.impdecl);
				            if (decls != null) {
				              _localctx.impdecls.add(decls);
				              addKnownTypedefs(decls.typedefs());
				            }
				        
				}
				}
				setState(156);
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
			setState(157);
			match(IMPORT);
			setState(158);
			((Import_stmtContext)_localctx).n = match(IDENTIFIER);

			            buf.append((((Import_stmtContext)_localctx).n!=null?((Import_stmtContext)_localctx).n.getText():null));
			        
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(160);
				match(T__0);
				setState(161);
				((Import_stmtContext)_localctx).n1 = match(IDENTIFIER);

				            buf.append("."); buf.append((((Import_stmtContext)_localctx).n1!=null?((Import_stmtContext)_localctx).n1.getText():null));
				        
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
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
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (VOID - 47)) | (1L << (CHAR - 47)) | (1L << (SHORT - 47)) | (1L << (INT - 47)) | (1L << (LONG - 47)) | (1L << (STRUCT - 47)) | (1L << (UNION - 47)) | (1L << (STATIC - 47)) | (1L << (CONST - 47)) | (1L << (UNSIGNED - 47)) | (1L << (TYPEDEF - 47)) | (1L << (IDENTIFIER - 47)))) != 0)) {
				{
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(170);
					((Top_defsContext)_localctx).df = defun();

					            _localctx.decls.addDefun(((Top_defsContext)_localctx).df.definedFunction);
					        
					}
					break;
				case 2:
					{
					setState(173);
					((Top_defsContext)_localctx).dvs = defvars();

					            _localctx.decls.addDefvars(((Top_defsContext)_localctx).dvs.defs);
					        
					}
					break;
				case 3:
					{
					setState(176);
					((Top_defsContext)_localctx).dc = defconst();

					            _localctx.decls.addConstant(((Top_defsContext)_localctx).dc.contant);
					        
					}
					break;
				case 4:
					{
					setState(179);
					((Top_defsContext)_localctx).ds = defstruct();

					            _localctx.decls.addDefstruct(((Top_defsContext)_localctx).ds.structNode);
					        
					}
					break;
				case 5:
					{
					setState(182);
					((Top_defsContext)_localctx).du = defunion();

					            _localctx.decls.addDefunion(((Top_defsContext)_localctx).du.unionNode);
					        
					}
					break;
				case 6:
					{
					setState(185);
					((Top_defsContext)_localctx).td = typedef();

					            _localctx.decls.addTypedef(((Top_defsContext)_localctx).td.typedefNode);
					        
					}
					break;
				}
				}
				setState(192);
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
			setState(193);
			((DefvarsContext)_localctx).s = storage();
			setState(194);
			((DefvarsContext)_localctx).t = type();
			setState(195);
			((DefvarsContext)_localctx).n = match(IDENTIFIER);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(196);
				match(T__2);
				setState(197);
				((DefvarsContext)_localctx).e = expr();
				}
			}


			        _localctx.defs.add(new DefinedVariable(((DefvarsContext)_localctx).s.bool, ((DefvarsContext)_localctx).t.typeNode, (((DefvarsContext)_localctx).n!=null?((DefvarsContext)_localctx).n.getText():null), ((DefvarsContext)_localctx).e.exprNode));
			    
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(201);
				match(T__3);
				setState(202);
				((DefvarsContext)_localctx).n1 = match(IDENTIFIER);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(203);
					match(T__2);
					setState(204);
					((DefvarsContext)_localctx).e1 = expr();
					}
				}


				               _localctx.defs.add(new DefinedVariable(((DefvarsContext)_localctx).s.bool, ((DefvarsContext)_localctx).t.typeNode, (((DefvarsContext)_localctx).n1!=null?((DefvarsContext)_localctx).n1.getText():null), ((DefvarsContext)_localctx).e1.exprNode));
				        
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
			setState(215);
			match(CONST);
			setState(216);
			((DefconstContext)_localctx).t = type();
			setState(217);
			((DefconstContext)_localctx).n = match(IDENTIFIER);
			setState(218);
			match(T__2);
			setState(219);
			((DefconstContext)_localctx).e = expr();
			setState(220);
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
			setState(222);
			((DefunContext)_localctx).s = storage();
			setState(223);
			((DefunContext)_localctx).t = typeref();
			setState(224);
			((DefunContext)_localctx).n = match(IDENTIFIER);
			setState(225);
			match(T__4);
			setState(226);
			((DefunContext)_localctx).p = params();
			setState(227);
			match(T__5);
			setState(228);
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
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(230);
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				((ParamsContext)_localctx).t = match(VOID);

				            ((ParamsContext)_localctx).parameters =  new Params(location(((ParamsContext)_localctx).t),new ArrayList<Parameter>());
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				((ParamsContext)_localctx).fps = fixedparams();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(236);
					match(T__3);
					setState(237);
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
			setState(245);
			((FixedparamsContext)_localctx).p = param();

			            parameters1.add(((FixedparamsContext)_localctx).p.parameter);
			        
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					match(T__3);
					setState(248);
					((FixedparamsContext)_localctx).p1 = param();

					            parameters1.add(((FixedparamsContext)_localctx).p1.parameter);
					        
					}
					} 
				}
				setState(255);
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
			setState(256);
			((ParamContext)_localctx).t = type();
			setState(257);
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
			setState(259);
			((BlockContext)_localctx).t = match(T__7);
			setState(260);
			((BlockContext)_localctx).dvl = defvar_list();
			setState(261);
			((BlockContext)_localctx).ss = stmts();
			setState(262);
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
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					((Defvar_listContext)_localctx).dvs = defvars();

					            _localctx.result.addAll(((Defvar_listContext)_localctx).dvs.defs);
					        
					}
					} 
				}
				setState(272);
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
			setState(273);
			((DefstructContext)_localctx).t = match(STRUCT);
			setState(274);
			((DefstructContext)_localctx).n = match(IDENTIFIER);
			setState(275);
			((DefstructContext)_localctx).ml = member_list();
			setState(276);
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
			setState(279);
			((DefunionContext)_localctx).t = match(UNION);
			setState(280);
			((DefunionContext)_localctx).n = match(IDENTIFIER);
			setState(281);
			((DefunionContext)_localctx).ml = member_list();
			setState(282);
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
			setState(285);
			match(T__7);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (VOID - 47)) | (1L << (CHAR - 47)) | (1L << (SHORT - 47)) | (1L << (INT - 47)) | (1L << (LONG - 47)) | (1L << (STRUCT - 47)) | (1L << (UNION - 47)) | (1L << (UNSIGNED - 47)) | (1L << (IDENTIFIER - 47)))) != 0)) {
				{
				{
				setState(286);
				((Member_listContext)_localctx).s = slot();
				setState(287);
				match(T__1);

				            _localctx.membs.add(((Member_listContext)_localctx).s.slod);
				         
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
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
			setState(297);
			((SlotContext)_localctx).t = type();
			setState(298);
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
			setState(301);
			match(EXTERN);
			setState(302);
			((FuncdeclContext)_localctx).t = typeref();
			setState(303);
			((FuncdeclContext)_localctx).n = match(IDENTIFIER);
			setState(304);
			match(T__4);
			setState(305);
			((FuncdeclContext)_localctx).p = params();
			setState(306);
			match(T__5);
			setState(307);
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
			setState(310);
			match(EXTERN);
			setState(311);
			((VardeclContext)_localctx).t = type();
			setState(312);
			((VardeclContext)_localctx).n = match(IDENTIFIER);
			setState(313);
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
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__7) | (1L << T__12) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << IF) | (1L << SWITCH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (DO - 65)) | (1L << (FOR - 65)) | (1L << (RETURN - 65)) | (1L << (BREAK - 65)) | (1L << (CONTINUE - 65)) | (1L << (GOTO - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (CHARACTER - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (INTEGER - 65)))) != 0)) {
				{
				{
				setState(316);
				((StmtsContext)_localctx).s = stmt();

				            if (stmt().stmtNode != null) _localctx.ss.add(((StmtsContext)_localctx).s.stmtNode);
				        
				}
				}
				setState(323);
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
		public Labeled_stmtContext ls;
		public ExprContext e;
		public BlockContext b;
		public If_stmtContext is;
		public While_stmtContext ws;
		public Dowhile_stmtContext ds;
		public For_stmtContext fs;
		public Switch_stmtContext ss;
		public Break_stmtContext bs;
		public Continue_stmtContext cs;
		public Goto_stmtContext gs;
		public Return_stmtContext rs;
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
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(324);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(325);
				((StmtContext)_localctx).ls = labeled_stmt();

				            ((StmtContext)_localctx).stmtNode =  ((StmtContext)_localctx).ls.labelNode;
				        
				}
				break;
			case 3:
				{
				setState(328);
				((StmtContext)_localctx).e = expr();
				setState(329);
				match(T__1);

				            ((StmtContext)_localctx).stmtNode =  new ExprStmtNode(((StmtContext)_localctx).e.exprNode.location(),((StmtContext)_localctx).e.exprNode);
				        
				}
				break;
			case 4:
				{
				setState(332);
				((StmtContext)_localctx).b = block();

				            ((StmtContext)_localctx).stmtNode = ((StmtContext)_localctx).b.blockNode;
				        
				}
				break;
			case 5:
				{
				setState(335);
				((StmtContext)_localctx).is = if_stmt();

				            ((StmtContext)_localctx).stmtNode = ((StmtContext)_localctx).is.ifNode;
				        
				}
				break;
			case 6:
				{
				setState(338);
				((StmtContext)_localctx).ws = while_stmt();

				            ((StmtContext)_localctx).stmtNode =  ((StmtContext)_localctx).ws.whileNode;
				        
				}
				break;
			case 7:
				{
				setState(341);
				((StmtContext)_localctx).ds = dowhile_stmt();

				            ((StmtContext)_localctx).stmtNode =  ((StmtContext)_localctx).ds.doWhileNode;
				        
				}
				break;
			case 8:
				{
				setState(344);
				((StmtContext)_localctx).fs = for_stmt();

				            ((StmtContext)_localctx).stmtNode = ((StmtContext)_localctx).fs.forNode;
				        
				}
				break;
			case 9:
				{
				setState(347);
				((StmtContext)_localctx).ss = switch_stmt();

				            ((StmtContext)_localctx).stmtNode = ((StmtContext)_localctx).ss.switchNode;
				        
				}
				break;
			case 10:
				{
				setState(350);
				((StmtContext)_localctx).bs = break_stmt();

				            ((StmtContext)_localctx).stmtNode = ((StmtContext)_localctx).bs.breakNode;
				        
				}
				break;
			case 11:
				{
				setState(353);
				((StmtContext)_localctx).cs = continue_stmt();

				            ((StmtContext)_localctx).stmtNode =  ((StmtContext)_localctx).cs.continueNode;
				        
				}
				break;
			case 12:
				{
				setState(356);
				((StmtContext)_localctx).gs = goto_stmt();

				            ((StmtContext)_localctx).stmtNode =  ((StmtContext)_localctx).gs.gotoNode;
				        
				}
				break;
			case 13:
				{
				setState(359);
				((StmtContext)_localctx).rs = return_stmt();

				            ((StmtContext)_localctx).stmtNode =   ((StmtContext)_localctx).rs.returnNode;
				        
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
			setState(364);
			((Labeled_stmtContext)_localctx).t = match(IDENTIFIER);
			setState(365);
			match(T__9);
			setState(366);
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
		public Token t;
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
			setState(369);
			((If_stmtContext)_localctx).t = match(IF);
			setState(370);
			match(T__4);
			setState(371);
			((If_stmtContext)_localctx).cond = expr();
			setState(372);
			match(T__5);
			setState(373);
			((If_stmtContext)_localctx).thenBody = stmt();
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(374);
				match(ELSE);
				setState(375);
				((If_stmtContext)_localctx).elseBody = stmt();
				}
				break;
			}

			            ((If_stmtContext)_localctx).ifNode =   new IfNode(location(((If_stmtContext)_localctx).t),((If_stmtContext)_localctx).cond.exprNode, ((If_stmtContext)_localctx).thenBody.stmtNode, ((If_stmtContext)_localctx).elseBody.stmtNode);
			        
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
		public Token t;
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
			setState(380);
			((While_stmtContext)_localctx).t = match(WHILE);
			setState(381);
			match(T__4);
			setState(382);
			((While_stmtContext)_localctx).cond = expr();
			setState(383);
			match(T__5);
			setState(384);
			((While_stmtContext)_localctx).body = stmt();

			            ((While_stmtContext)_localctx).whileNode =  new WhileNode(location(((While_stmtContext)_localctx).t),((While_stmtContext)_localctx).cond.exprNode, ((While_stmtContext)_localctx).body.stmtNode);
			        
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
		public Token t;
		public StmtContext body;
		public ExprContext cond;
		public TerminalNode WHILE() { return getToken(CflatParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(CflatParser.DO, 0); }
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
			setState(387);
			((Dowhile_stmtContext)_localctx).t = match(DO);
			setState(388);
			((Dowhile_stmtContext)_localctx).body = stmt();
			setState(389);
			match(WHILE);
			setState(390);
			match(T__4);
			setState(391);
			((Dowhile_stmtContext)_localctx).cond = expr();
			setState(392);
			match(T__5);
			setState(393);
			match(T__1);

			            ((Dowhile_stmtContext)_localctx).doWhileNode =  new DoWhileNode( location(((Dowhile_stmtContext)_localctx).t),((Dowhile_stmtContext)_localctx).body.stmtNode, ((Dowhile_stmtContext)_localctx).cond.exprNode);
			        
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
		public Token t;
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
			setState(396);
			((For_stmtContext)_localctx).t = match(FOR);
			setState(397);
			match(T__4);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__12) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(398);
				((For_stmtContext)_localctx).init = expr();
				}
			}

			setState(401);
			match(T__1);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__12) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(402);
				((For_stmtContext)_localctx).cond = expr();
				}
			}

			setState(405);
			match(T__1);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__12) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(406);
				((For_stmtContext)_localctx).incr = expr();
				}
			}

			setState(409);
			match(T__5);
			setState(410);
			((For_stmtContext)_localctx).body = stmt();

			            ((For_stmtContext)_localctx).forNode =  new ForNode(location(((For_stmtContext)_localctx).t),((For_stmtContext)_localctx).init.exprNode, ((For_stmtContext)_localctx).cond.exprNode, ((For_stmtContext)_localctx).incr.exprNode, ((For_stmtContext)_localctx).body.stmtNode);
			        
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
		public Token t;
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
			setState(413);
			((Switch_stmtContext)_localctx).t = match(SWITCH);
			setState(414);
			match(T__4);
			setState(415);
			((Switch_stmtContext)_localctx).cond = expr();
			setState(416);
			match(T__5);
			setState(417);
			match(T__7);
			setState(418);
			((Switch_stmtContext)_localctx).bodies = case_clauses();
			setState(419);
			match(T__8);

			            ((Switch_stmtContext)_localctx).switchNode =  new SwitchNode(location(((Switch_stmtContext)_localctx).t),((Switch_stmtContext)_localctx).cond.exprNode, ((Switch_stmtContext)_localctx).bodies.clauses);
			        
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
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(422);
				case_clause();

				            _localctx.clauses.add(case_clause().caseNode);
				        
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(430);
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
		enterRule(_localctx, 58, RULE_case_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			((Case_clauseContext)_localctx).values = cases();
			setState(436);
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
		public PrimaryContext p;
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
			setState(444); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(439);
				match(CASE);
				setState(440);
				((CasesContext)_localctx).p = primary();
				setState(441);
				match(T__9);

				            _localctx.values.add(((CasesContext)_localctx).p.exprNode);
				        
				}
				}
				setState(446); 
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
			setState(448);
			match(DEFAULT);
			setState(449);
			match(T__9);
			setState(450);
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
			setState(456); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(453);
				((Case_bodyContext)_localctx).s = stmt();

				            if (((Case_bodyContext)_localctx).s.stmtNode != null) stmts.add(((Case_bodyContext)_localctx).s.stmtNode);
				        
				}
				}
				setState(458); 
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
			setState(460);
			((Goto_stmtContext)_localctx).t = match(GOTO);
			setState(461);
			((Goto_stmtContext)_localctx).n = match(IDENTIFIER);
			setState(462);
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
			setState(464);
			((Break_stmtContext)_localctx).t = match(BREAK);
			setState(465);
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
			setState(467);
			((Continue_stmtContext)_localctx).t = match(CONTINUE);
			setState(468);
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
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				((Return_stmtContext)_localctx).t = match(RETURN);
				setState(471);
				match(T__1);

				            ((Return_stmtContext)_localctx).returnNode =   new ReturnNode(location(((Return_stmtContext)_localctx).t),null);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				((Return_stmtContext)_localctx).t = match(RETURN);
				setState(474);
				((Return_stmtContext)_localctx).expr0 = expr();
				setState(475);
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
			setState(480);
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
			setState(483);
			((TyperefContext)_localctx).tb = typeref_base();

			            ((TyperefContext)_localctx).typeRef =  ((TyperefContext)_localctx).tb.typeRef;
			        
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__10) | (1L << T__12))) != 0)) {
				{
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(485);
					match(T__10);
					setState(486);
					match(T__11);

					            ((TyperefContext)_localctx).typeRef =  new ArrayTypeRef(_localctx.typeRef);
					        
					}
					break;
				case 2:
					{
					setState(488);
					match(T__10);
					setState(489);
					((TyperefContext)_localctx).t = match(INTEGER);
					setState(490);
					match(T__11);

					            ((TyperefContext)_localctx).typeRef =  new ArrayTypeRef(_localctx.typeRef, integerValue((((TyperefContext)_localctx).t!=null?((TyperefContext)_localctx).t.getText():null)));
					        
					}
					break;
				case 3:
					{
					setState(492);
					match(T__12);

					            ((TyperefContext)_localctx).typeRef =  new PointerTypeRef(_localctx.typeRef);
					        
					}
					break;
				case 4:
					{
					setState(494);
					match(T__4);
					setState(495);
					((TyperefContext)_localctx).pts = param_typerefs();
					setState(496);
					match(T__5);

					            ((TyperefContext)_localctx).typeRef =  new FunctionTypeRef(_localctx.typeRef, ((TyperefContext)_localctx).pts.paramTypeRefs);
					        
					}
					break;
				}
				}
				setState(503);
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
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(VOID);

				            ((Param_typerefsContext)_localctx).paramTypeRefs =   new ParamTypeRefs(new ArrayList<TypeRef>());
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				((Param_typerefsContext)_localctx).fts = fixedparam_typerefs();
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(507);
					match(T__3);
					setState(508);
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
			setState(516);
			((Fixedparam_typerefsContext)_localctx).ref = typeref();

			            refs.add(((Fixedparam_typerefsContext)_localctx).ref.typeRef);
			        
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(518);
					match(T__3);
					setState(519);
					((Fixedparam_typerefsContext)_localctx).ref2 = typeref();

					            refs.add(((Fixedparam_typerefsContext)_localctx).ref2.typeRef);
					        
					}
					} 
				}
				setState(526);
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
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				((Typeref_baseContext)_localctx).t = match(VOID);

				            ((Typeref_baseContext)_localctx).typeRef =   new VoidTypeRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				((Typeref_baseContext)_localctx).t = match(CHAR);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.charRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				((Typeref_baseContext)_localctx).t = match(SHORT);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.shortRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				((Typeref_baseContext)_localctx).t = match(INT);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.intRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(535);
				((Typeref_baseContext)_localctx).t = match(LONG);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.longRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(537);
				((Typeref_baseContext)_localctx).t = match(UNSIGNED);
				setState(538);
				match(CHAR);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.ucharRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(540);
				((Typeref_baseContext)_localctx).t = match(UNSIGNED);
				setState(541);
				match(SHORT);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.ushortRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(543);
				((Typeref_baseContext)_localctx).t = match(UNSIGNED);
				setState(544);
				match(INT);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.uintRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(546);
				((Typeref_baseContext)_localctx).t = match(UNSIGNED);
				setState(547);
				match(LONG);

				            ((Typeref_baseContext)_localctx).typeRef =   IntegerTypeRef.ulongRef(location(((Typeref_baseContext)_localctx).t));
				        
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(549);
				((Typeref_baseContext)_localctx).t = match(STRUCT);
				setState(550);
				((Typeref_baseContext)_localctx).n = match(IDENTIFIER);

				            ((Typeref_baseContext)_localctx).typeRef =   new StructTypeRef(location(((Typeref_baseContext)_localctx).t),(((Typeref_baseContext)_localctx).n!=null?((Typeref_baseContext)_localctx).n.getText():null));
				        
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(552);
				((Typeref_baseContext)_localctx).t = match(UNION);
				setState(553);
				((Typeref_baseContext)_localctx).n = match(IDENTIFIER);

				            ((Typeref_baseContext)_localctx).typeRef =   new UnionTypeRef(location(((Typeref_baseContext)_localctx).t),(((Typeref_baseContext)_localctx).n!=null?((Typeref_baseContext)_localctx).n.getText():null));
				        
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(555);
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
			setState(559);
			((TypedefContext)_localctx).td = match(TYPEDEF);
			setState(560);
			((TypedefContext)_localctx).t = typeref();
			setState(561);
			((TypedefContext)_localctx).n = match(IDENTIFIER);
			setState(562);
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
		public TermContext lhs;
		public ExprContext rhs;
		public TermContext lhs1;
		public Opassign_opContext op;
		public ExprContext rhs1;
		public Expr10Context e;
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
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				((ExprContext)_localctx).lhs = term();
				setState(566);
				match(T__2);
				setState(567);
				((ExprContext)_localctx).rhs = expr();

				            ((ExprContext)_localctx).exprNode =  new AssignNode(((ExprContext)_localctx).lhs.exprNode, ((ExprContext)_localctx).rhs.exprNode);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				((ExprContext)_localctx).lhs1 = term();
				setState(571);
				((ExprContext)_localctx).op = opassign_op();
				setState(572);
				((ExprContext)_localctx).rhs1 = expr();

				            ((ExprContext)_localctx).exprNode =  new OpAssignNode(((ExprContext)_localctx).lhs1.exprNode, ((ExprContext)_localctx).op.op, ((ExprContext)_localctx).rhs1.exprNode);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				((ExprContext)_localctx).e = expr10();

				            ((ExprContext)_localctx).exprNode =  ((ExprContext)_localctx).e.exprNode;
				        
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
			setState(580);
			((Expr10Context)_localctx).c = expr9();

			            ((Expr10Context)_localctx).exprNode =  ((Expr10Context)_localctx).c.exprNode;
			        
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(582);
				match(T__13);
				setState(583);
				((Expr10Context)_localctx).t = expr();
				setState(584);
				match(T__9);
				setState(585);
				((Expr10Context)_localctx).e = expr10();

				            ((Expr10Context)_localctx).exprNode =   new CondExprNode(_localctx.exprNode, ((Expr10Context)_localctx).t.exprNode, ((Expr10Context)_localctx).e.exprNode);
				        
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
			setState(590);
			((Expr9Context)_localctx).l = expr8();

			            ((Expr9Context)_localctx).exprNode =  ((Expr9Context)_localctx).l.exprNode;
			        
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(592);
				match(T__14);
				setState(593);
				((Expr9Context)_localctx).r = expr8();

				            ((Expr9Context)_localctx).exprNode =  new LogicalOrNode(_localctx.exprNode, ((Expr9Context)_localctx).r.exprNode);
				        
				}
				}
				setState(600);
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
			setState(601);
			((Expr8Context)_localctx).l = expr7();

			            ((Expr8Context)_localctx).exprNode =  ((Expr8Context)_localctx).l.exprNode;
			        
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(603);
				match(T__15);
				setState(604);
				((Expr8Context)_localctx).r = expr7();

				            ((Expr8Context)_localctx).exprNode =  new LogicalAndNode(_localctx.exprNode, ((Expr8Context)_localctx).r.exprNode);
				        
				}
				}
				setState(611);
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
		public Expr6Context r1;
		public Expr6Context r2;
		public Expr6Context r3;
		public Expr6Context r4;
		public Expr6Context r5;
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
			setState(612);
			((Expr7Context)_localctx).l = expr6();

			            ((Expr7Context)_localctx).exprNode =  ((Expr7Context)_localctx).l.exprNode;
			        
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				setState(638);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(614);
					match(T__16);
					setState(615);
					((Expr7Context)_localctx).r = expr6();

					            ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, ">", ((Expr7Context)_localctx).r.exprNode);
					        
					}
					break;
				case T__17:
					{
					setState(618);
					match(T__17);
					setState(619);
					((Expr7Context)_localctx).r1 = expr6();

					            ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "<", ((Expr7Context)_localctx).r1.exprNode);
					        
					}
					break;
				case T__18:
					{
					setState(622);
					match(T__18);
					setState(623);
					((Expr7Context)_localctx).r2 = expr6();

					            ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, ">=", ((Expr7Context)_localctx).r2.exprNode);
					        
					}
					break;
				case T__19:
					{
					setState(626);
					match(T__19);
					setState(627);
					((Expr7Context)_localctx).r3 = expr6();

					            ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "<=", ((Expr7Context)_localctx).r3.exprNode);
					        
					}
					break;
				case T__20:
					{
					setState(630);
					match(T__20);
					setState(631);
					((Expr7Context)_localctx).r4 = expr6();

					            ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "==", ((Expr7Context)_localctx).r4.exprNode);
					        
					}
					break;
				case T__21:
					{
					setState(634);
					match(T__21);
					setState(635);
					((Expr7Context)_localctx).r5 = expr6();

					            ((Expr7Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "!=", ((Expr7Context)_localctx).r5.exprNode);
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(642);
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
			setState(643);
			((Expr6Context)_localctx).l = expr5();

			            ((Expr6Context)_localctx).exprNode =  ((Expr6Context)_localctx).l.exprNode;
			        
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(645);
				match(T__22);
				setState(646);
				((Expr6Context)_localctx).r = expr5();

				            ((Expr6Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "|", ((Expr6Context)_localctx).r.exprNode);
				        
				}
				}
				setState(653);
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
			setState(654);
			((Expr5Context)_localctx).l = expr4();

			            ((Expr5Context)_localctx).exprNode =  ((Expr5Context)_localctx).l.exprNode;
			        
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(656);
				match(T__23);
				setState(657);
				((Expr5Context)_localctx).r = expr4();

				            ((Expr5Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "^", ((Expr5Context)_localctx).r.exprNode);
				        
				}
				}
				setState(664);
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
			setState(665);
			((Expr4Context)_localctx).l = expr3();

			                ((Expr4Context)_localctx).exprNode =  ((Expr4Context)_localctx).l.exprNode;
			            
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(667);
				match(T__24);
				setState(668);
				((Expr4Context)_localctx).r = expr3();

				            ((Expr4Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "&", ((Expr4Context)_localctx).r.exprNode);
				        
				}
				}
				setState(675);
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
		public Expr2Context r1;
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
			setState(676);
			((Expr3Context)_localctx).l = expr2();

			                ((Expr3Context)_localctx).exprNode =  ((Expr3Context)_localctx).l.exprNode;
			            
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25 || _la==T__26) {
				{
				setState(686);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(678);
					match(T__25);
					setState(679);
					((Expr3Context)_localctx).r = expr2();

					            ((Expr3Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, ">>", ((Expr3Context)_localctx).r.exprNode);
					        
					}
					break;
				case T__26:
					{
					setState(682);
					match(T__26);
					setState(683);
					((Expr3Context)_localctx).r1 = expr2();

					            ((Expr3Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "<<", ((Expr3Context)_localctx).r1.exprNode);
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(690);
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
		public Expr1Context r1;
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
			setState(691);
			((Expr2Context)_localctx).l = expr1();

			            ((Expr2Context)_localctx).exprNode =  ((Expr2Context)_localctx).l.exprNode;
			        
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==T__28) {
				{
				setState(701);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(693);
					match(T__27);
					setState(694);
					((Expr2Context)_localctx).r = expr1();

					            ((Expr2Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "+", ((Expr2Context)_localctx).r.exprNode);
					         
					}
					break;
				case T__28:
					{
					setState(697);
					match(T__28);
					setState(698);
					((Expr2Context)_localctx).r1 = expr1();

					            ((Expr2Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "-", ((Expr2Context)_localctx).r1.exprNode);
					         
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(705);
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
		public TermContext r1;
		public TermContext r2;
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
			setState(706);
			((Expr1Context)_localctx).l = term();

			             ((Expr1Context)_localctx).exprNode =  ((Expr1Context)_localctx).l.exprNode;
			         
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				setState(720);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(708);
					match(T__12);
					setState(709);
					((Expr1Context)_localctx).r = term();

					            ((Expr1Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "*", ((Expr1Context)_localctx).r.exprNode);
					         
					}
					break;
				case T__29:
					{
					setState(712);
					match(T__29);
					setState(713);
					((Expr1Context)_localctx).r1 = term();

					            ((Expr1Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "/", ((Expr1Context)_localctx).r1.exprNode);
					         
					}
					break;
				case T__30:
					{
					setState(716);
					match(T__30);
					setState(717);
					((Expr1Context)_localctx).r2 = term();

					            ((Expr1Context)_localctx).exprNode =  new BinaryOpNode(_localctx.exprNode, "%", ((Expr1Context)_localctx).r2.exprNode);
					         
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(724);
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
			setState(745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				{
				setState(725);
				match(T__31);
				 ((Opassign_opContext)_localctx).op =   "+"; 
				}
				break;
			case T__32:
				{
				setState(727);
				match(T__32);
				 ((Opassign_opContext)_localctx).op =   "-"; 
				}
				break;
			case T__33:
				{
				setState(729);
				match(T__33);
				 ((Opassign_opContext)_localctx).op =   "*"; 
				}
				break;
			case T__34:
				{
				setState(731);
				match(T__34);
				 ((Opassign_opContext)_localctx).op =   "/"; 
				}
				break;
			case T__35:
				{
				setState(733);
				match(T__35);
				 ((Opassign_opContext)_localctx).op =   "%"; 
				}
				break;
			case T__36:
				{
				setState(735);
				match(T__36);
				 ((Opassign_opContext)_localctx).op =   "&"; 
				}
				break;
			case T__37:
				{
				setState(737);
				match(T__37);
				 ((Opassign_opContext)_localctx).op =   "|"; 
				}
				break;
			case T__38:
				{
				setState(739);
				match(T__38);
				 ((Opassign_opContext)_localctx).op =   "^"; 
				}
				break;
			case T__39:
				{
				setState(741);
				match(T__39);
				 ((Opassign_opContext)_localctx).op =   "<<"; 
				}
				break;
			case T__40:
				{
				setState(743);
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
		public UnaryContext u;
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
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				match(T__4);
				setState(748);
				((TermContext)_localctx).t = type();
				setState(749);
				match(T__5);
				setState(750);
				((TermContext)_localctx).n = term();

				            ((TermContext)_localctx).exprNode =   new CastNode(((TermContext)_localctx).t.typeNode, ((TermContext)_localctx).n.exprNode);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				((TermContext)_localctx).u = unary();

				            ((TermContext)_localctx).exprNode =  ((TermContext)_localctx).u.exprNode ;
				        
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
		public UnaryContext u;
		public UnaryContext u1;
		public TermContext t;
		public TermContext t1;
		public TermContext t2;
		public TermContext t3;
		public TermContext t4;
		public TermContext t5;
		public TypeContext ty;
		public PostfixContext p;
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
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(T__41);
				setState(759);
				((UnaryContext)_localctx).u = unary();

				            ((UnaryContext)_localctx).exprNode =  new PrefixOpNode("++", ((UnaryContext)_localctx).u.exprNode);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				match(T__42);
				setState(763);
				((UnaryContext)_localctx).u1 = unary();

				            ((UnaryContext)_localctx).exprNode =  new PrefixOpNode("--", ((UnaryContext)_localctx).u1.exprNode);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				match(T__27);
				setState(767);
				((UnaryContext)_localctx).t = term();

				            ((UnaryContext)_localctx).exprNode =  new UnaryOpNode("+", ((UnaryContext)_localctx).t.exprNode);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(770);
				match(T__28);
				setState(771);
				((UnaryContext)_localctx).t1 = term();

				            ((UnaryContext)_localctx).exprNode =  new UnaryOpNode("-", ((UnaryContext)_localctx).t1.exprNode);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(774);
				match(T__43);
				setState(775);
				((UnaryContext)_localctx).t2 = term();

				            ((UnaryContext)_localctx).exprNode =  new UnaryOpNode("!", ((UnaryContext)_localctx).t2.exprNode);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(778);
				match(T__44);
				setState(779);
				((UnaryContext)_localctx).t3 = term();

				            ((UnaryContext)_localctx).exprNode =  new UnaryOpNode("~", ((UnaryContext)_localctx).t3.exprNode);
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(782);
				match(T__12);
				setState(783);
				((UnaryContext)_localctx).t4 = term();

				            ((UnaryContext)_localctx).exprNode =  new DereferenceNode(((UnaryContext)_localctx).t4.exprNode);
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(786);
				match(T__24);
				setState(787);
				((UnaryContext)_localctx).t5 = term();

				            ((UnaryContext)_localctx).exprNode =  new AddressNode(((UnaryContext)_localctx).t5.exprNode);
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(790);
				match(SIZEOF);
				setState(791);
				match(T__4);
				setState(792);
				((UnaryContext)_localctx).ty = type();
				setState(793);
				match(T__5);

				            ((UnaryContext)_localctx).exprNode =  new SizeofTypeNode(((UnaryContext)_localctx).ty.typeNode, size_t());
				         
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(796);
				match(SIZEOF);
				setState(797);
				((UnaryContext)_localctx).u = unary();

				             ((UnaryContext)_localctx).exprNode =  new SizeofExprNode(((UnaryContext)_localctx).u.exprNode, size_t());
				         
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(800);
				((UnaryContext)_localctx).p = postfix();

				             ((UnaryContext)_localctx).exprNode =  ((UnaryContext)_localctx).p.exprNode;
				         
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
		enterRule(_localctx, 114, RULE_postfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			((PostfixContext)_localctx).expr0 = primary();

			            ((PostfixContext)_localctx).exprNode =  ((PostfixContext)_localctx).expr0.exprNode;
			        
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << T__41) | (1L << T__42) | (1L << T__45))) != 0)) {
				{
				setState(827);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__41:
					{
					setState(807);
					match(T__41);

					            ((PostfixContext)_localctx).exprNode =  new SuffixOpNode("++", _localctx.exprNode);
					        
					}
					break;
				case T__42:
					{
					setState(809);
					match(T__42);

					            ((PostfixContext)_localctx).exprNode =  new SuffixOpNode("--", _localctx.exprNode);
					        
					}
					break;
				case T__10:
					{
					setState(811);
					match(T__10);
					setState(812);
					((PostfixContext)_localctx).e = expr();
					setState(813);
					match(T__11);

					            ((PostfixContext)_localctx).exprNode =  new ArefNode(_localctx.exprNode, ((PostfixContext)_localctx).e.exprNode);
					        
					}
					break;
				case T__0:
					{
					setState(816);
					match(T__0);
					setState(817);
					((PostfixContext)_localctx).IDENTIFIER = match(IDENTIFIER);

					            ((PostfixContext)_localctx).exprNode =  new MemberNode(_localctx.exprNode, (((PostfixContext)_localctx).IDENTIFIER!=null?((PostfixContext)_localctx).IDENTIFIER.getText():null));
					        
					}
					break;
				case T__45:
					{
					setState(819);
					match(T__45);
					setState(820);
					((PostfixContext)_localctx).IDENTIFIER = match(IDENTIFIER);

					            ((PostfixContext)_localctx).exprNode =  new PtrMemberNode(_localctx.exprNode, (((PostfixContext)_localctx).IDENTIFIER!=null?((PostfixContext)_localctx).IDENTIFIER.getText():null));
					        
					}
					break;
				case T__4:
					{
					setState(822);
					match(T__4);
					setState(823);
					((PostfixContext)_localctx).a = args();
					setState(824);
					match(T__5);

					            ((PostfixContext)_localctx).exprNode =  new FuncallNode(_localctx.exprNode, ((PostfixContext)_localctx).a.arguments);
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(831);
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
		enterRule(_localctx, 116, RULE_args);

		        ((ArgsContext)_localctx).arguments =  new ArrayList<ExprNode>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__12) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIZEOF - 74)) | (1L << (STRING - 74)) | (1L << (CHARACTER - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER - 74)))) != 0)) {
				{
				setState(832);
				((ArgsContext)_localctx).e = expr();

				            _localctx.arguments.add(((ArgsContext)_localctx).e.exprNode);
				        
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(834);
					match(T__3);
					setState(835);
					((ArgsContext)_localctx).e1 = expr();

					                _localctx.arguments.add(((ArgsContext)_localctx).e1.exprNode);
					            
					}
					}
					setState(842);
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
		public ExprContext e;
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
		enterRule(_localctx, 118, RULE_primary);
		try {
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				((PrimaryContext)_localctx).t = match(INTEGER);

				            ((PrimaryContext)_localctx).exprNode =  integerNode(location(((PrimaryContext)_localctx).t),(((PrimaryContext)_localctx).t!=null?((PrimaryContext)_localctx).t.getText():null));
				        
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				((PrimaryContext)_localctx).t = match(CHARACTER);

				            ((PrimaryContext)_localctx).exprNode =  new IntegerLiteralNode(location(((PrimaryContext)_localctx).t),IntegerTypeRef.charRef(),characterCode((((PrimaryContext)_localctx).t!=null?((PrimaryContext)_localctx).t.getText():null)));
				        
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(849);
				((PrimaryContext)_localctx).t = match(STRING);

				            ((PrimaryContext)_localctx).exprNode =  new StringLiteralNode(location(((PrimaryContext)_localctx).t),new PointerTypeRef(IntegerTypeRef.charRef()),stringValue((((PrimaryContext)_localctx).t!=null?((PrimaryContext)_localctx).t.getText():null)));
				        
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(851);
				((PrimaryContext)_localctx).t = match(IDENTIFIER);

				            ((PrimaryContext)_localctx).exprNode =  new VariableNode(location(((PrimaryContext)_localctx).t),(((PrimaryContext)_localctx).t!=null?((PrimaryContext)_localctx).t.getText():null));
				        
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(853);
				match(T__4);
				setState(854);
				((PrimaryContext)_localctx).e = expr();
				setState(855);
				match(T__5);

				             ((PrimaryContext)_localctx).exprNode =  ((PrimaryContext)_localctx).e.exprNode;
				        
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u035f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0093\n\3\f\3\16\3\u0096\13\3\3\4\3\4\3"+
		"\4\7\4\u009b\n\4\f\4\16\4\u009e\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00a6"+
		"\n\5\f\5\16\5\u00a9\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00bf\n\6\f\6\16\6\u00c2\13\6\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00c9\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d0\n\7\3\7"+
		"\7\7\u00d3\n\7\f\7\16\7\u00d6\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\5\n\u00ea\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00f2\n\13\3\13\3\13\5\13\u00f6\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00fe\n\f\f\f\16\f\u0101\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\7\17\u010f\n\17\f\17\16\17\u0112\13\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u0125\n\22\f\22\16\22\u0128\13\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u0142\n\26\f\26\16\26\u0145\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u016d\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u017b"+
		"\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0192\n\34\3\34\3\34\5\34"+
		"\u0196\n\34\3\34\3\34\5\34\u019a\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u01ac\n\36\f\36"+
		"\16\36\u01af\13\36\3\36\3\36\3\36\5\36\u01b4\n\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \6 \u01bf\n \r \16 \u01c0\3!\3!\3!\3!\3!\3\"\3\"\3\"\6"+
		"\"\u01cb\n\"\r\"\16\"\u01cc\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\5&\u01e1\n&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\7(\u01f6\n(\f(\16(\u01f9\13(\3)\3)\3)\3)\3)\3)\5)\u0201"+
		"\n)\3)\3)\5)\u0205\n)\3*\3*\3*\3*\3*\3*\7*\u020d\n*\f*\16*\u0210\13*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\5+\u0230\n+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\5-\u0245\n-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u024f\n.\3"+
		"/\3/\3/\3/\3/\3/\7/\u0257\n/\f/\16/\u025a\13/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u0262\n\60\f\60\16\60\u0265\13\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0281\n\61\f\61\16\61\u0284\13"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u028c\n\62\f\62\16\62\u028f\13"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0297\n\63\f\63\16\63\u029a\13"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u02a2\n\64\f\64\16\64\u02a5\13"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u02b1\n\65"+
		"\f\65\16\65\u02b4\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\7\66\u02c0\n\66\f\66\16\66\u02c3\13\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u02d3\n\67\f\67\16\67"+
		"\u02d6\13\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\58\u02ec\n8\39\39\39\39\39\39\39\39\39\59\u02f7\n9\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0326\n:\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\7;\u033e"+
		"\n;\f;\16;\u0341\13;\3<\3<\3<\3<\3<\3<\7<\u0349\n<\f<\16<\u034c\13<\5"+
		"<\u034e\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u035d\n=\3=\2\2>"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvx\2\2\2\u0396\2z\3\2\2\2\4~\3\2\2\2\6\u009c\3"+
		"\2\2\2\b\u009f\3\2\2\2\n\u00c0\3\2\2\2\f\u00c3\3\2\2\2\16\u00d9\3\2\2"+
		"\2\20\u00e0\3\2\2\2\22\u00e9\3\2\2\2\24\u00f5\3\2\2\2\26\u00f7\3\2\2\2"+
		"\30\u0102\3\2\2\2\32\u0105\3\2\2\2\34\u0110\3\2\2\2\36\u0113\3\2\2\2 "+
		"\u0119\3\2\2\2\"\u011f\3\2\2\2$\u012b\3\2\2\2&\u012f\3\2\2\2(\u0138\3"+
		"\2\2\2*\u0143\3\2\2\2,\u016c\3\2\2\2.\u016e\3\2\2\2\60\u0173\3\2\2\2\62"+
		"\u017e\3\2\2\2\64\u0185\3\2\2\2\66\u018e\3\2\2\28\u019f\3\2\2\2:\u01ad"+
		"\3\2\2\2<\u01b5\3\2\2\2>\u01be\3\2\2\2@\u01c2\3\2\2\2B\u01ca\3\2\2\2D"+
		"\u01ce\3\2\2\2F\u01d2\3\2\2\2H\u01d5\3\2\2\2J\u01e0\3\2\2\2L\u01e2\3\2"+
		"\2\2N\u01e5\3\2\2\2P\u0204\3\2\2\2R\u0206\3\2\2\2T\u022f\3\2\2\2V\u0231"+
		"\3\2\2\2X\u0244\3\2\2\2Z\u0246\3\2\2\2\\\u0250\3\2\2\2^\u025b\3\2\2\2"+
		"`\u0266\3\2\2\2b\u0285\3\2\2\2d\u0290\3\2\2\2f\u029b\3\2\2\2h\u02a6\3"+
		"\2\2\2j\u02b5\3\2\2\2l\u02c4\3\2\2\2n\u02eb\3\2\2\2p\u02f6\3\2\2\2r\u0325"+
		"\3\2\2\2t\u0327\3\2\2\2v\u034d\3\2\2\2x\u035c\3\2\2\2z{\5\6\4\2{|\5\n"+
		"\6\2|}\b\2\1\2}\3\3\2\2\2~\177\5\6\4\2\177\u0094\b\3\1\2\u0080\u0081\5"+
		"&\24\2\u0081\u0082\b\3\1\2\u0082\u0093\3\2\2\2\u0083\u0084\5(\25\2\u0084"+
		"\u0085\b\3\1\2\u0085\u0093\3\2\2\2\u0086\u0087\5\16\b\2\u0087\u0088\b"+
		"\3\1\2\u0088\u0093\3\2\2\2\u0089\u008a\5\36\20\2\u008a\u008b\b\3\1\2\u008b"+
		"\u0093\3\2\2\2\u008c\u008d\5 \21\2\u008d\u008e\b\3\1\2\u008e\u0093\3\2"+
		"\2\2\u008f\u0090\5V,\2\u0090\u0091\b\3\1\2\u0091\u0093\3\2\2\2\u0092\u0080"+
		"\3\2\2\2\u0092\u0083\3\2\2\2\u0092\u0086\3\2\2\2\u0092\u0089\3\2\2\2\u0092"+
		"\u008c\3\2\2\2\u0092\u008f\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\5\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098"+
		"\5\b\5\2\u0098\u0099\b\4\1\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\7\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009f\u00a0\7K\2\2\u00a0\u00a1\7R\2\2\u00a1\u00a7"+
		"\b\5\1\2\u00a2\u00a3\7\3\2\2\u00a3\u00a4\7R\2\2\u00a4\u00a6\b\5\1\2\u00a5"+
		"\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\4\2\2\u00ab"+
		"\t\3\2\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\b\6\1\2\u00ae\u00bf\3\2\2"+
		"\2\u00af\u00b0\5\f\7\2\u00b0\u00b1\b\6\1\2\u00b1\u00bf\3\2\2\2\u00b2\u00b3"+
		"\5\16\b\2\u00b3\u00b4\b\6\1\2\u00b4\u00bf\3\2\2\2\u00b5\u00b6\5\36\20"+
		"\2\u00b6\u00b7\b\6\1\2\u00b7\u00bf\3\2\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba"+
		"\b\6\1\2\u00ba\u00bf\3\2\2\2\u00bb\u00bc\5V,\2\u00bc\u00bd\b\6\1\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00ac\3\2\2\2\u00be\u00af\3\2\2\2\u00be\u00b2\3\2"+
		"\2\2\u00be\u00b5\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\13\3\2\2"+
		"\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\5\22\n\2\u00c4\u00c5\5L\'\2\u00c5\u00c8"+
		"\7R\2\2\u00c6\u00c7\7\5\2\2\u00c7\u00c9\5X-\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d4\b\7\1\2\u00cb\u00cc\7\6"+
		"\2\2\u00cc\u00cf\7R\2\2\u00cd\u00ce\7\5\2\2\u00ce\u00d0\5X-\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\b\7\1\2\u00d2"+
		"\u00cb\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\4\2\2\u00d8"+
		"\r\3\2\2\2\u00d9\u00da\7;\2\2\u00da\u00db\5L\'\2\u00db\u00dc\7R\2\2\u00dc"+
		"\u00dd\7\5\2\2\u00dd\u00de\5X-\2\u00de\u00df\7\4\2\2\u00df\17\3\2\2\2"+
		"\u00e0\u00e1\5\22\n\2\u00e1\u00e2\5N(\2\u00e2\u00e3\7R\2\2\u00e3\u00e4"+
		"\7\7\2\2\u00e4\u00e5\5\24\13\2\u00e5\u00e6\7\b\2\2\u00e6\u00e7\5\32\16"+
		"\2\u00e7\21\3\2\2\2\u00e8\u00ea\79\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\23\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00f6\b\13\1\2\u00ed"+
		"\u00f1\5\26\f\2\u00ee\u00ef\7\6\2\2\u00ef\u00f0\7\t\2\2\u00f0\u00f2\b"+
		"\13\1\2\u00f1\u00ee\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\b\13\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00ed\3"+
		"\2\2\2\u00f6\25\3\2\2\2\u00f7\u00f8\5\30\r\2\u00f8\u00ff\b\f\1\2\u00f9"+
		"\u00fa\7\6\2\2\u00fa\u00fb\5\30\r\2\u00fb\u00fc\b\f\1\2\u00fc\u00fe\3"+
		"\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\27\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\5L\'\2"+
		"\u0103\u0104\7R\2\2\u0104\31\3\2\2\2\u0105\u0106\7\n\2\2\u0106\u0107\5"+
		"\34\17\2\u0107\u0108\5*\26\2\u0108\u0109\7\13\2\2\u0109\u010a\b\16\1\2"+
		"\u010a\33\3\2\2\2\u010b\u010c\5\f\7\2\u010c\u010d\b\17\1\2\u010d\u010f"+
		"\3\2\2\2\u010e\u010b\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\35\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\66\2"+
		"\2\u0114\u0115\7R\2\2\u0115\u0116\5\"\22\2\u0116\u0117\7\4\2\2\u0117\u0118"+
		"\b\20\1\2\u0118\37\3\2\2\2\u0119\u011a\7\67\2\2\u011a\u011b\7R\2\2\u011b"+
		"\u011c\5\"\22\2\u011c\u011d\7\4\2\2\u011d\u011e\b\21\1\2\u011e!\3\2\2"+
		"\2\u011f\u0126\7\n\2\2\u0120\u0121\5$\23\2\u0121\u0122\7\4\2\2\u0122\u0123"+
		"\b\22\1\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2\2\2\u0125\u0128\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012a\7\13\2\2\u012a#\3\2\2\2\u012b\u012c\5L\'\2\u012c"+
		"\u012d\7R\2\2\u012d\u012e\b\23\1\2\u012e%\3\2\2\2\u012f\u0130\7:\2\2\u0130"+
		"\u0131\5N(\2\u0131\u0132\7R\2\2\u0132\u0133\7\7\2\2\u0133\u0134\5\24\13"+
		"\2\u0134\u0135\7\b\2\2\u0135\u0136\7\4\2\2\u0136\u0137\b\24\1\2\u0137"+
		"\'\3\2\2\2\u0138\u0139\7:\2\2\u0139\u013a\5L\'\2\u013a\u013b\7R\2\2\u013b"+
		"\u013c\7\4\2\2\u013c\u013d\b\25\1\2\u013d)\3\2\2\2\u013e\u013f\5,\27\2"+
		"\u013f\u0140\b\26\1\2\u0140\u0142\3\2\2\2\u0141\u013e\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144+\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u016d\7\4\2\2\u0147\u0148\5.\30\2\u0148\u0149\b\27"+
		"\1\2\u0149\u016d\3\2\2\2\u014a\u014b\5X-\2\u014b\u014c\7\4\2\2\u014c\u014d"+
		"\b\27\1\2\u014d\u016d\3\2\2\2\u014e\u014f\5\32\16\2\u014f\u0150\b\27\1"+
		"\2\u0150\u016d\3\2\2\2\u0151\u0152\5\60\31\2\u0152\u0153\b\27\1\2\u0153"+
		"\u016d\3\2\2\2\u0154\u0155\5\62\32\2\u0155\u0156\b\27\1\2\u0156\u016d"+
		"\3\2\2\2\u0157\u0158\5\64\33\2\u0158\u0159\b\27\1\2\u0159\u016d\3\2\2"+
		"\2\u015a\u015b\5\66\34\2\u015b\u015c\b\27\1\2\u015c\u016d\3\2\2\2\u015d"+
		"\u015e\58\35\2\u015e\u015f\b\27\1\2\u015f\u016d\3\2\2\2\u0160\u0161\5"+
		"F$\2\u0161\u0162\b\27\1\2\u0162\u016d\3\2\2\2\u0163\u0164\5H%\2\u0164"+
		"\u0165\b\27\1\2\u0165\u016d\3\2\2\2\u0166\u0167\5D#\2\u0167\u0168\b\27"+
		"\1\2\u0168\u016d\3\2\2\2\u0169\u016a\5J&\2\u016a\u016b\b\27\1\2\u016b"+
		"\u016d\3\2\2\2\u016c\u0146\3\2\2\2\u016c\u0147\3\2\2\2\u016c\u014a\3\2"+
		"\2\2\u016c\u014e\3\2\2\2\u016c\u0151\3\2\2\2\u016c\u0154\3\2\2\2\u016c"+
		"\u0157\3\2\2\2\u016c\u015a\3\2\2\2\u016c\u015d\3\2\2\2\u016c\u0160\3\2"+
		"\2\2\u016c\u0163\3\2\2\2\u016c\u0166\3\2\2\2\u016c\u0169\3\2\2\2\u016d"+
		"-\3\2\2\2\u016e\u016f\7R\2\2\u016f\u0170\7\f\2\2\u0170\u0171\5,\27\2\u0171"+
		"\u0172\b\30\1\2\u0172/\3\2\2\2\u0173\u0174\7>\2\2\u0174\u0175\7\7\2\2"+
		"\u0175\u0176\5X-\2\u0176\u0177\7\b\2\2\u0177\u017a\5,\27\2\u0178\u0179"+
		"\7?\2\2\u0179\u017b\5,\27\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\b\31\1\2\u017d\61\3\2\2\2\u017e\u017f\7C\2"+
		"\2\u017f\u0180\7\7\2\2\u0180\u0181\5X-\2\u0181\u0182\7\b\2\2\u0182\u0183"+
		"\5,\27\2\u0183\u0184\b\32\1\2\u0184\63\3\2\2\2\u0185\u0186\7D\2\2\u0186"+
		"\u0187\5,\27\2\u0187\u0188\7C\2\2\u0188\u0189\7\7\2\2\u0189\u018a\5X-"+
		"\2\u018a\u018b\7\b\2\2\u018b\u018c\7\4\2\2\u018c\u018d\b\33\1\2\u018d"+
		"\65\3\2\2\2\u018e\u018f\7E\2\2\u018f\u0191\7\7\2\2\u0190\u0192\5X-\2\u0191"+
		"\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\7\4"+
		"\2\2\u0194\u0196\5X-\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u0199\7\4\2\2\u0198\u019a\5X-\2\u0199\u0198\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\7\b\2\2\u019c\u019d\5,"+
		"\27\2\u019d\u019e\b\34\1\2\u019e\67\3\2\2\2\u019f\u01a0\7@\2\2\u01a0\u01a1"+
		"\7\7\2\2\u01a1\u01a2\5X-\2\u01a2\u01a3\7\b\2\2\u01a3\u01a4\7\n\2\2\u01a4"+
		"\u01a5\5:\36\2\u01a5\u01a6\7\13\2\2\u01a6\u01a7\b\35\1\2\u01a79\3\2\2"+
		"\2\u01a8\u01a9\5<\37\2\u01a9\u01aa\b\36\1\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u01a8\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01ae\u01b3\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\5@!\2\u01b1\u01b2"+
		"\b\36\1\2\u01b2\u01b4\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b4\3\2\2\2"+
		"\u01b4;\3\2\2\2\u01b5\u01b6\5> \2\u01b6\u01b7\5B\"\2\u01b7\u01b8\b\37"+
		"\1\2\u01b8=\3\2\2\2\u01b9\u01ba\7A\2\2\u01ba\u01bb\5x=\2\u01bb\u01bc\7"+
		"\f\2\2\u01bc\u01bd\b \1\2\u01bd\u01bf\3\2\2\2\u01be\u01b9\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1?\3\2\2\2"+
		"\u01c2\u01c3\7B\2\2\u01c3\u01c4\7\f\2\2\u01c4\u01c5\5B\"\2\u01c5\u01c6"+
		"\b!\1\2\u01c6A\3\2\2\2\u01c7\u01c8\5,\27\2\u01c8\u01c9\b\"\1\2\u01c9\u01cb"+
		"\3\2\2\2\u01ca\u01c7\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cdC\3\2\2\2\u01ce\u01cf\7I\2\2\u01cf\u01d0\7R\2\2\u01d0"+
		"\u01d1\7\4\2\2\u01d1E\3\2\2\2\u01d2\u01d3\7G\2\2\u01d3\u01d4\7\4\2\2\u01d4"+
		"G\3\2\2\2\u01d5\u01d6\7H\2\2\u01d6\u01d7\7\4\2\2\u01d7I\3\2\2\2\u01d8"+
		"\u01d9\7F\2\2\u01d9\u01da\7\4\2\2\u01da\u01e1\b&\1\2\u01db\u01dc\7F\2"+
		"\2\u01dc\u01dd\5X-\2\u01dd\u01de\7\4\2\2\u01de\u01df\b&\1\2\u01df\u01e1"+
		"\3\2\2\2\u01e0\u01d8\3\2\2\2\u01e0\u01db\3\2\2\2\u01e1K\3\2\2\2\u01e2"+
		"\u01e3\5N(\2\u01e3\u01e4\b\'\1\2\u01e4M\3\2\2\2\u01e5\u01e6\5T+\2\u01e6"+
		"\u01f7\b(\1\2\u01e7\u01e8\7\r\2\2\u01e8\u01e9\7\16\2\2\u01e9\u01f6\b("+
		"\1\2\u01ea\u01eb\7\r\2\2\u01eb\u01ec\7S\2\2\u01ec\u01ed\7\16\2\2\u01ed"+
		"\u01f6\b(\1\2\u01ee\u01ef\7\17\2\2\u01ef\u01f6\b(\1\2\u01f0\u01f1\7\7"+
		"\2\2\u01f1\u01f2\5P)\2\u01f2\u01f3\7\b\2\2\u01f3\u01f4\b(\1\2\u01f4\u01f6"+
		"\3\2\2\2\u01f5\u01e7\3\2\2\2\u01f5\u01ea\3\2\2\2\u01f5\u01ee\3\2\2\2\u01f5"+
		"\u01f0\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8O\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\7\61\2\2\u01fb\u0205"+
		"\b)\1\2\u01fc\u0200\5R*\2\u01fd\u01fe\7\6\2\2\u01fe\u01ff\7\t\2\2\u01ff"+
		"\u0201\b)\1\2\u0200\u01fd\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0203\b)\1\2\u0203\u0205\3\2\2\2\u0204\u01fa\3\2\2\2\u0204"+
		"\u01fc\3\2\2\2\u0205Q\3\2\2\2\u0206\u0207\5N(\2\u0207\u020e\b*\1\2\u0208"+
		"\u0209\7\6\2\2\u0209\u020a\5N(\2\u020a\u020b\b*\1\2\u020b\u020d\3\2\2"+
		"\2\u020c\u0208\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020fS\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\7\61\2\2\u0212"+
		"\u0230\b+\1\2\u0213\u0214\7\62\2\2\u0214\u0230\b+\1\2\u0215\u0216\7\63"+
		"\2\2\u0216\u0230\b+\1\2\u0217\u0218\7\64\2\2\u0218\u0230\b+\1\2\u0219"+
		"\u021a\7\65\2\2\u021a\u0230\b+\1\2\u021b\u021c\7=\2\2\u021c\u021d\7\62"+
		"\2\2\u021d\u0230\b+\1\2\u021e\u021f\7=\2\2\u021f\u0220\7\63\2\2\u0220"+
		"\u0230\b+\1\2\u0221\u0222\7=\2\2\u0222\u0223\7\64\2\2\u0223\u0230\b+\1"+
		"\2\u0224\u0225\7=\2\2\u0225\u0226\7\65\2\2\u0226\u0230\b+\1\2\u0227\u0228"+
		"\7\66\2\2\u0228\u0229\7R\2\2\u0229\u0230\b+\1\2\u022a\u022b\7\67\2\2\u022b"+
		"\u022c\7R\2\2\u022c\u0230\b+\1\2\u022d\u022e\7R\2\2\u022e\u0230\b+\1\2"+
		"\u022f\u0211\3\2\2\2\u022f\u0213\3\2\2\2\u022f\u0215\3\2\2\2\u022f\u0217"+
		"\3\2\2\2\u022f\u0219\3\2\2\2\u022f\u021b\3\2\2\2\u022f\u021e\3\2\2\2\u022f"+
		"\u0221\3\2\2\2\u022f\u0224\3\2\2\2\u022f\u0227\3\2\2\2\u022f\u022a\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u0230U\3\2\2\2\u0231\u0232\7J\2\2\u0232\u0233"+
		"\5N(\2\u0233\u0234\7R\2\2\u0234\u0235\7\4\2\2\u0235\u0236\b,\1\2\u0236"+
		"W\3\2\2\2\u0237\u0238\5p9\2\u0238\u0239\7\5\2\2\u0239\u023a\5X-\2\u023a"+
		"\u023b\b-\1\2\u023b\u0245\3\2\2\2\u023c\u023d\5p9\2\u023d\u023e\5n8\2"+
		"\u023e\u023f\5X-\2\u023f\u0240\b-\1\2\u0240\u0245\3\2\2\2\u0241\u0242"+
		"\5Z.\2\u0242\u0243\b-\1\2\u0243\u0245\3\2\2\2\u0244\u0237\3\2\2\2\u0244"+
		"\u023c\3\2\2\2\u0244\u0241\3\2\2\2\u0245Y\3\2\2\2\u0246\u0247\5\\/\2\u0247"+
		"\u024e\b.\1\2\u0248\u0249\7\20\2\2\u0249\u024a\5X-\2\u024a\u024b\7\f\2"+
		"\2\u024b\u024c\5Z.\2\u024c\u024d\b.\1\2\u024d\u024f\3\2\2\2\u024e\u0248"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f[\3\2\2\2\u0250\u0251\5^\60\2\u0251"+
		"\u0258\b/\1\2\u0252\u0253\7\21\2\2\u0253\u0254\5^\60\2\u0254\u0255\b/"+
		"\1\2\u0255\u0257\3\2\2\2\u0256\u0252\3\2\2\2\u0257\u025a\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259]\3\2\2\2\u025a\u0258\3\2\2\2"+
		"\u025b\u025c\5`\61\2\u025c\u0263\b\60\1\2\u025d\u025e\7\22\2\2\u025e\u025f"+
		"\5`\61\2\u025f\u0260\b\60\1\2\u0260\u0262\3\2\2\2\u0261\u025d\3\2\2\2"+
		"\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264_\3"+
		"\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\5b\62\2\u0267\u0282\b\61\1\2\u0268"+
		"\u0269\7\23\2\2\u0269\u026a\5b\62\2\u026a\u026b\b\61\1\2\u026b\u0281\3"+
		"\2\2\2\u026c\u026d\7\24\2\2\u026d\u026e\5b\62\2\u026e\u026f\b\61\1\2\u026f"+
		"\u0281\3\2\2\2\u0270\u0271\7\25\2\2\u0271\u0272\5b\62\2\u0272\u0273\b"+
		"\61\1\2\u0273\u0281\3\2\2\2\u0274\u0275\7\26\2\2\u0275\u0276\5b\62\2\u0276"+
		"\u0277\b\61\1\2\u0277\u0281\3\2\2\2\u0278\u0279\7\27\2\2\u0279\u027a\5"+
		"b\62\2\u027a\u027b\b\61\1\2\u027b\u0281\3\2\2\2\u027c\u027d\7\30\2\2\u027d"+
		"\u027e\5b\62\2\u027e\u027f\b\61\1\2\u027f\u0281\3\2\2\2\u0280\u0268\3"+
		"\2\2\2\u0280\u026c\3\2\2\2\u0280\u0270\3\2\2\2\u0280\u0274\3\2\2\2\u0280"+
		"\u0278\3\2\2\2\u0280\u027c\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2"+
		"\2\2\u0282\u0283\3\2\2\2\u0283a\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0286"+
		"\5d\63\2\u0286\u028d\b\62\1\2\u0287\u0288\7\31\2\2\u0288\u0289\5d\63\2"+
		"\u0289\u028a\b\62\1\2\u028a\u028c\3\2\2\2\u028b\u0287\3\2\2\2\u028c\u028f"+
		"\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028ec\3\2\2\2\u028f"+
		"\u028d\3\2\2\2\u0290\u0291\5f\64\2\u0291\u0298\b\63\1\2\u0292\u0293\7"+
		"\32\2\2\u0293\u0294\5f\64\2\u0294\u0295\b\63\1\2\u0295\u0297\3\2\2\2\u0296"+
		"\u0292\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2"+
		"\2\2\u0299e\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029c\5h\65\2\u029c\u02a3"+
		"\b\64\1\2\u029d\u029e\7\33\2\2\u029e\u029f\5h\65\2\u029f\u02a0\b\64\1"+
		"\2\u02a0\u02a2\3\2\2\2\u02a1\u029d\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1"+
		"\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4g\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6"+
		"\u02a7\5j\66\2\u02a7\u02b2\b\65\1\2\u02a8\u02a9\7\34\2\2\u02a9\u02aa\5"+
		"j\66\2\u02aa\u02ab\b\65\1\2\u02ab\u02b1\3\2\2\2\u02ac\u02ad\7\35\2\2\u02ad"+
		"\u02ae\5j\66\2\u02ae\u02af\b\65\1\2\u02af\u02b1\3\2\2\2\u02b0\u02a8\3"+
		"\2\2\2\u02b0\u02ac\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3i\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\5l\67\2"+
		"\u02b6\u02c1\b\66\1\2\u02b7\u02b8\7\36\2\2\u02b8\u02b9\5l\67\2\u02b9\u02ba"+
		"\b\66\1\2\u02ba\u02c0\3\2\2\2\u02bb\u02bc\7\37\2\2\u02bc\u02bd\5l\67\2"+
		"\u02bd\u02be\b\66\1\2\u02be\u02c0\3\2\2\2\u02bf\u02b7\3\2\2\2\u02bf\u02bb"+
		"\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"k\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c5\5p9\2\u02c5\u02d4\b\67\1\2\u02c6"+
		"\u02c7\7\17\2\2\u02c7\u02c8\5p9\2\u02c8\u02c9\b\67\1\2\u02c9\u02d3\3\2"+
		"\2\2\u02ca\u02cb\7 \2\2\u02cb\u02cc\5p9\2\u02cc\u02cd\b\67\1\2\u02cd\u02d3"+
		"\3\2\2\2\u02ce\u02cf\7!\2\2\u02cf\u02d0\5p9\2\u02d0\u02d1\b\67\1\2\u02d1"+
		"\u02d3\3\2\2\2\u02d2\u02c6\3\2\2\2\u02d2\u02ca\3\2\2\2\u02d2\u02ce\3\2"+
		"\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"m\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d8\7\"\2\2\u02d8\u02ec\b8\1\2\u02d9"+
		"\u02da\7#\2\2\u02da\u02ec\b8\1\2\u02db\u02dc\7$\2\2\u02dc\u02ec\b8\1\2"+
		"\u02dd\u02de\7%\2\2\u02de\u02ec\b8\1\2\u02df\u02e0\7&\2\2\u02e0\u02ec"+
		"\b8\1\2\u02e1\u02e2\7\'\2\2\u02e2\u02ec\b8\1\2\u02e3\u02e4\7(\2\2\u02e4"+
		"\u02ec\b8\1\2\u02e5\u02e6\7)\2\2\u02e6\u02ec\b8\1\2\u02e7\u02e8\7*\2\2"+
		"\u02e8\u02ec\b8\1\2\u02e9\u02ea\7+\2\2\u02ea\u02ec\b8\1\2\u02eb\u02d7"+
		"\3\2\2\2\u02eb\u02d9\3\2\2\2\u02eb\u02db\3\2\2\2\u02eb\u02dd\3\2\2\2\u02eb"+
		"\u02df\3\2\2\2\u02eb\u02e1\3\2\2\2\u02eb\u02e3\3\2\2\2\u02eb\u02e5\3\2"+
		"\2\2\u02eb\u02e7\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eco\3\2\2\2\u02ed\u02ee"+
		"\7\7\2\2\u02ee\u02ef\5L\'\2\u02ef\u02f0\7\b\2\2\u02f0\u02f1\5p9\2\u02f1"+
		"\u02f2\b9\1\2\u02f2\u02f7\3\2\2\2\u02f3\u02f4\5r:\2\u02f4\u02f5\b9\1\2"+
		"\u02f5\u02f7\3\2\2\2\u02f6\u02ed\3\2\2\2\u02f6\u02f3\3\2\2\2\u02f7q\3"+
		"\2\2\2\u02f8\u02f9\7,\2\2\u02f9\u02fa\5r:\2\u02fa\u02fb\b:\1\2\u02fb\u0326"+
		"\3\2\2\2\u02fc\u02fd\7-\2\2\u02fd\u02fe\5r:\2\u02fe\u02ff\b:\1\2\u02ff"+
		"\u0326\3\2\2\2\u0300\u0301\7\36\2\2\u0301\u0302\5p9\2\u0302\u0303\b:\1"+
		"\2\u0303\u0326\3\2\2\2\u0304\u0305\7\37\2\2\u0305\u0306\5p9\2\u0306\u0307"+
		"\b:\1\2\u0307\u0326\3\2\2\2\u0308\u0309\7.\2\2\u0309\u030a\5p9\2\u030a"+
		"\u030b\b:\1\2\u030b\u0326\3\2\2\2\u030c\u030d\7/\2\2\u030d\u030e\5p9\2"+
		"\u030e\u030f\b:\1\2\u030f\u0326\3\2\2\2\u0310\u0311\7\17\2\2\u0311\u0312"+
		"\5p9\2\u0312\u0313\b:\1\2\u0313\u0326\3\2\2\2\u0314\u0315\7\33\2\2\u0315"+
		"\u0316\5p9\2\u0316\u0317\b:\1\2\u0317\u0326\3\2\2\2\u0318\u0319\7L\2\2"+
		"\u0319\u031a\7\7\2\2\u031a\u031b\5L\'\2\u031b\u031c\7\b\2\2\u031c\u031d"+
		"\b:\1\2\u031d\u0326\3\2\2\2\u031e\u031f\7L\2\2\u031f\u0320\5r:\2\u0320"+
		"\u0321\b:\1\2\u0321\u0326\3\2\2\2\u0322\u0323\5t;\2\u0323\u0324\b:\1\2"+
		"\u0324\u0326\3\2\2\2\u0325\u02f8\3\2\2\2\u0325\u02fc\3\2\2\2\u0325\u0300"+
		"\3\2\2\2\u0325\u0304\3\2\2\2\u0325\u0308\3\2\2\2\u0325\u030c\3\2\2\2\u0325"+
		"\u0310\3\2\2\2\u0325\u0314\3\2\2\2\u0325\u0318\3\2\2\2\u0325\u031e\3\2"+
		"\2\2\u0325\u0322\3\2\2\2\u0326s\3\2\2\2\u0327\u0328\5x=\2\u0328\u033f"+
		"\b;\1\2\u0329\u032a\7,\2\2\u032a\u033e\b;\1\2\u032b\u032c\7-\2\2\u032c"+
		"\u033e\b;\1\2\u032d\u032e\7\r\2\2\u032e\u032f\5X-\2\u032f\u0330\7\16\2"+
		"\2\u0330\u0331\b;\1\2\u0331\u033e\3\2\2\2\u0332\u0333\7\3\2\2\u0333\u0334"+
		"\7R\2\2\u0334\u033e\b;\1\2\u0335\u0336\7\60\2\2\u0336\u0337\7R\2\2\u0337"+
		"\u033e\b;\1\2\u0338\u0339\7\7\2\2\u0339\u033a\5v<\2\u033a\u033b\7\b\2"+
		"\2\u033b\u033c\b;\1\2\u033c\u033e\3\2\2\2\u033d\u0329\3\2\2\2\u033d\u032b"+
		"\3\2\2\2\u033d\u032d\3\2\2\2\u033d\u0332\3\2\2\2\u033d\u0335\3\2\2\2\u033d"+
		"\u0338\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2"+
		"\2\2\u0340u\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0343\5X-\2\u0343\u034a"+
		"\b<\1\2\u0344\u0345\7\6\2\2\u0345\u0346\5X-\2\u0346\u0347\b<\1\2\u0347"+
		"\u0349\3\2\2\2\u0348\u0344\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2"+
		"\2\2\u034a\u034b\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034d"+
		"\u0342\3\2\2\2\u034d\u034e\3\2\2\2\u034ew\3\2\2\2\u034f\u0350\7S\2\2\u0350"+
		"\u035d\b=\1\2\u0351\u0352\7Q\2\2\u0352\u035d\b=\1\2\u0353\u0354\7P\2\2"+
		"\u0354\u035d\b=\1\2\u0355\u0356\7R\2\2\u0356\u035d\b=\1\2\u0357\u0358"+
		"\7\7\2\2\u0358\u0359\5X-\2\u0359\u035a\7\b\2\2\u035a\u035b\b=\1\2\u035b"+
		"\u035d\3\2\2\2\u035c\u034f\3\2\2\2\u035c\u0351\3\2\2\2\u035c\u0353\3\2"+
		"\2\2\u035c\u0355\3\2\2\2\u035c\u0357\3\2\2\2\u035dy\3\2\2\29\u0092\u0094"+
		"\u009c\u00a7\u00be\u00c0\u00c8\u00cf\u00d4\u00e9\u00f1\u00f5\u00ff\u0110"+
		"\u0126\u0143\u016c\u017a\u0191\u0195\u0199\u01ad\u01b3\u01c0\u01cc\u01e0"+
		"\u01f5\u01f7\u0200\u0204\u020e\u022f\u0244\u024e\u0258\u0263\u0280\u0282"+
		"\u028d\u0298\u02a3\u02b0\u02b2\u02bf\u02c1\u02d2\u02d4\u02eb\u02f6\u0325"+
		"\u033d\u033f\u034a\u034d\u035c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}