grammar Cflat;
@header {
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
}

@parser::members {
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
        String s = stringValue(image);
        if (s.length() != 1) {
            throw new Error("must not happen: character length > 1");
        }
        return (long)s.charAt(0);
    }

   private String stringValue(String _image) throws ParseException {
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
}

compilation_unit returns [AST ast]
    : iss=import_stmts tds=top_defs
    {
        Declarations decls = $tds.decls;
        decls.add($iss.impdecls);
        $ast =  new AST(decls);
    }
    ;

declaration_file returns [Declarations decls]
    @init {
        $decls = new Declarations();
    }
    : iss=import_stmts
        {
            $decls.add($iss.impdecls);
        }
    ( fd=funcdecl
        {
            $decls.addFuncdecl($fd.undefinedFunction);
        }
    | vd=vardecl
        {
            $decls.addVardecl($vd.undefinedVariable);
        }
    | dc=defconst
        {
            $decls.addConstant($dc.contant);
        }
    | ds=defstruct
        {
            $decls.addDefstruct($ds.structNode);
        }
    | du=defunion
        {
            $decls.addDefunion($du.unionNode);
        }
    | td=typedef
        {
            $decls.addTypedef($td.typedefNode);
        }
    )*
    ;

import_stmts returns [Declarations impdecls]
    @init {
        $impdecls = new Declarations();
    }
    : (is=import_stmt
        {
            Declarations decls = loader.loadLibrary($is.impdecl);
            if (decls != null) {
              $impdecls.add(decls);
              addKnownTypedefs(decls.typedefs());
            }
        }
    )*
    ;
    catch[RecognitionException ex] {
        throw new Error(ex.getMessage());
    }
    catch[CompileException ex1] {
        throw new Error(ex1.getMessage());
    }

import_stmt returns[String impdecl]
    @init {
        StringBuffer buf = new StringBuffer();
    }
    @after {
        $impdecl = buf.toString();
    }
    : IMPORT n=IDENTIFIER
        {
            buf.append($n.text);
        }
    ('.' n1=IDENTIFIER
        {
            buf.append("."); buf.append($n1.text);
        }
    )* ';'
    ;

top_defs returns[Declarations decls]
    @init {
        $decls = new Declarations();
    }
    :( df=defun
        {
            $decls.addDefun($df.definedFunction);
        }
    | dvs=defvars
        {
            $decls.addDefvars($dvs.defs);
        }
    | dc=defconst
        {
            $decls.addConstant($dc.contant);
        }
    | ds=defstruct
        {
            $decls.addDefstruct($ds.structNode);
        }
    | du=defunion
        {
            $decls.addDefunion($du.unionNode);
        }
    | td=typedef
        {
            $decls.addTypedef($td.typedefNode);
        }
    )*
    ;

defvars returns[List<DefinedVariable> defs]
    @init {
        $defs = new ArrayList<DefinedVariable>();
    }
    : s=storage t=type n=IDENTIFIER ('=' e=expr)?
    {
        $defs.add(new DefinedVariable($s.bool, $t.typeNode, $n.text, $e.exprNode));
    }
    ( ',' n1=IDENTIFIER ('=' e1=expr)?
        {
               $defs.add(new DefinedVariable($s.bool, $t.typeNode, $n1.text, $e1.exprNode));
        }
    )* ';'
    ;

defconst returns[Constant contant]
    @after {
        $contant = new Constant($t.typeNode, $n.text, $e.exprNode);
    }
    : CONST t=type n=IDENTIFIER '=' e=expr ';'
    ;

defun returns[DefinedFunction definedFunction]
    @after{
        TypeRef t = new FunctionTypeRef($t.typeRef, $p.parameters.parametersTypeRef());
        $definedFunction = new DefinedFunction($s.bool, new TypeNode(t),$n.text, $p.parameters, $b.blockNode);
    }
    : s=storage t=typeref n=IDENTIFIER '(' p=params ')' b=block
    ;

storage returns[boolean bool]
    @after {
        $bool =  $t == null ? false : true ;
    }
    :(t=STATIC)?
    ;

params returns[Params parameters]
    : VOID
        {
            $parameters = new Params(new ArrayList<Parameter>());
        }
    | fps=fixedparams (',' '...'
                            {
                                $fps.parameters.acceptVarargs();
                            }
                          )?
        {
            $parameters = $fps.parameters ;
        }
    ;

fixedparams returns [Params parameters]
    @init {
        List<Parameter> parameters1 = new ArrayList<Parameter>();
    }
    @after {
        $parameters = new Params(parameters1);
    }
    : p=param
        {
            parameters1.add($p.parameter);
        }

    (',' p1=param
        {
            parameters1.add($p1.parameter);
        }
    )*
    ;

param returns[Parameter parameter]
    @after {
        $parameter = new Parameter($t.typeNode, $n.text);
    }
    : t=type n=IDENTIFIER
    ;

block returns [BlockNode blockNode]
     : '{' dvl=defvar_list ss=stmts '}'
        {
            $blockNode = new BlockNode($dvl.result,$ss.ss);
        }
     ;


defvar_list returns[List<DefinedVariable> result]
    @init{
        $result = new ArrayList<DefinedVariable>();
    }
    :( dvs=defvars
        {
            $result.addAll($dvs.defs);
        }
    )*
    ;

defstruct returns[StructNode structNode]
    : STRUCT n=IDENTIFIER ml=member_list ';'
     {
         $structNode = new StructNode(new StructTypeRef($n.text), $n.text, $ml.membs);
     }
    ;


defunion returns [UnionNode unionNode]
    : UNION n=IDENTIFIER ml=member_list ';'
     {
         $unionNode = new UnionNode(new UnionTypeRef($n.text), $n.text, $ml.membs);
     }
    ;

member_list returns [List<Slot> membs]
    @init{
        $membs = new ArrayList<Slot>();
    }
     : '{' (s=slot ';'
         {
            $membs.add($s.slod);
         }
     )* '}'
     ;

slot returns[Slot slod]
    :t=type n=IDENTIFIER
        {
            $slod = new Slot($t.typeNode, $n.text);
        }
    ;

funcdecl returns[UndefinedFunction undefinedFunction]
    : EXTERN t=typeref n=IDENTIFIER '(' p=params ')' ';'
    {
        TypeRef t = new FunctionTypeRef($t.typeRef, $p.parameters.parametersTypeRef());
        $undefinedFunction =  new UndefinedFunction(new TypeNode(t), $n.text, $p.parameters);
    }
    ;

 vardecl returns[UndefinedVariable undefinedVariable]
    :  EXTERN t=type n=IDENTIFIER ';'
        {
            $undefinedVariable = new UndefinedVariable($t.typeNode, $n.text);
        }
    ;


stmts returns [List<StmtNode>  ss]
    @init{
        $ss = new ArrayList<StmtNode>();
    }
    : (s=stmt
        {
            if (stmt().stmtNode != null) $ss.add($s.stmtNode);
        }
    )*
    ;

 stmt returns[StmtNode stmtNode]
    : ( ';'
    | ls=labeled_stmt
        {
            $stmtNode = $ls.labelNode;
        }
    | e=expr ';'
        {
            $stmtNode = new ExprStmtNode($e.exprNode);
        }
    | b=block
        {
            $stmtNode =$b.blockNode;
        }
    | is=if_stmt
        {
            $stmtNode =$is.ifNode;
        }
    | ws=while_stmt
        {
            $stmtNode = $ws.whileNode;
        }
    | ds=dowhile_stmt
        {
            $stmtNode = $ds.doWhileNode;
        }
    | fs=for_stmt
        {
            $stmtNode =$fs.forNode;
        }
    | ss=switch_stmt
        {
            $stmtNode =$ss.switchNode;
        }
    | bs=break_stmt
        {
            $stmtNode =$bs.breakNode;
        }
    | cs=continue_stmt
        {
            $stmtNode = $cs.continueNode;
        }
    | gs=goto_stmt
        {
            $stmtNode = $gs.gotoNode;
        }
    | rs=return_stmt
        {
            $stmtNode =  $rs.returnNode;
        }
    )
    ;

labeled_stmt returns[LabelNode labelNode]
    : t=IDENTIFIER ':'s=stmt
        {
            $labelNode = new LabelNode($t.text, $s.stmtNode);
        }
    ;

if_stmt returns[IfNode ifNode]
    : IF '(' cond=expr ')' thenBody=stmt (ELSE elseBody=stmt)?
        {
            $ifNode =  new IfNode($cond.exprNode, $thenBody.stmtNode, $elseBody.stmtNode);
        }
    ;

while_stmt returns[WhileNode whileNode]
    : WHILE '(' cond=expr ')' body=stmt
        {
            $whileNode = new WhileNode($cond.exprNode, $body.stmtNode);
        }
    ;

dowhile_stmt returns[DoWhileNode doWhileNode]
    : DO body=stmt WHILE '(' cond=expr ')' ';'
        {
            $doWhileNode = new DoWhileNode( $body.stmtNode, $cond.exprNode);
        }
    ;

for_stmt returns[ForNode forNode]
    : FOR '(' (init=expr)? ';' (cond=expr)? ';' (incr=expr)? ')' body=stmt
        {
            $forNode = new ForNode($init.exprNode, $cond.exprNode, $incr.exprNode, $body.stmtNode);
        }
    ;

switch_stmt returns[SwitchNode switchNode]
    : SWITCH '(' cond=expr ')' '{' bodies=case_clauses '}'
        {
            $switchNode = new SwitchNode($cond.exprNode, $bodies.clauses);
        }
    ;


case_clauses returns [List<CaseNode> clauses]
    @init{
        $clauses = new ArrayList<CaseNode>();
    }
    :(case_clause
        {
            $clauses.add(case_clause().caseNode);
        }
    )*
    (default_clause
        {
            $clauses.add(default_clause().caseNode);
        }
    )?
    ;

case_clause returns[CaseNode caseNode]
    : values=cases body=case_body
        {
         $caseNode =  new CaseNode($values.values, $body.blockNode);
        }
    ;

cases returns[List<ExprNode> values]
    @init {
        $values = new ArrayList<ExprNode>();
    }
    : (CASE p=primary ':'
        {
            $values.add($p.exprNode);
        }
    )+
    ;

default_clause returns[CaseNode caseNode ]
    : DEFAULT ':' body=case_body
        {
            $caseNode = new CaseNode(new ArrayList<ExprNode>(), $body.blockNode);
        }
    ;

case_body returns[BlockNode blockNode]
    @init{
        LinkedList<StmtNode> stmts = new LinkedList<StmtNode>();
    }
    @after{
            if (! (stmts.getLast() instanceof BreakNode)) {
                throw new Error("missing break statement at the last of case clause");
            }
             $blockNode =  new BlockNode(new ArrayList<DefinedVariable>(),stmts);
    }
    : (s=stmt
        {
            if ($s.stmtNode != null) stmts.add($s.stmtNode);
        }
    )+
    ;

goto_stmt returns [GotoNode gotoNode]
    @after{
        $gotoNode = new GotoNode($n.text);
    }
    : GOTO n=IDENTIFIER ';'
    ;

break_stmt returns [BreakNode breakNode]
    @after {
        $breakNode = new BreakNode();
    }
    : BREAK ';'
    ;

continue_stmt returns [ContinueNode continueNode]
    @after {
        $continueNode = new ContinueNode();
    }
    : CONTINUE ';'
    ;

return_stmt returns [ReturnNode returnNode]
    : RETURN ';'
        {
            $returnNode =  new ReturnNode(null);
        }
    | RETURN expr0=expr ';'
        {
            $returnNode =  new ReturnNode($expr0.exprNode);
        }
    ;

 type returns[TypeNode typeNode]
    : t=typeref
        {
            $typeNode = new TypeNode($t.typeRef);
        }
    ;

 typeref returns[TypeRef typeRef]
    : tb=typeref_base
        {
            $typeRef = $tb.typeRef;
        }
    (
      '[' ']'
        {
            $typeRef = new ArrayTypeRef($typeRef);
        }
    | '[' t=INTEGER ']'
        {
            $typeRef = new ArrayTypeRef($typeRef, integerValue($t.text));
        }
    | '*'
        {
            $typeRef = new PointerTypeRef($typeRef);
        }
    | '(' pts=param_typerefs ')'
        {
            $typeRef = new FunctionTypeRef($typeRef, $pts.paramTypeRefs);
        }
    )*;


param_typerefs returns[ParamTypeRefs paramTypeRefs]
    : VOID
        {
            $paramTypeRefs =  new ParamTypeRefs(new ArrayList<TypeRef>());
        }
    | fts=fixedparam_typerefs ( ',' '...'
                              {
                                $fts.paramTypeRefs.acceptVarargs();
                              }
                          )?
        {
            $paramTypeRefs = $fts.paramTypeRefs;
        }
    ;

fixedparam_typerefs returns[ParamTypeRefs paramTypeRefs]
    @init {
        List<TypeRef> refs = new ArrayList<TypeRef>();
    }
    @after{
        $paramTypeRefs =  new ParamTypeRefs(refs);
    }
    : ref=typeref
        {
            refs.add($ref.typeRef);
        }
    ( ',' ref2=typeref
        {
            refs.add($ref2.typeRef);
        }
    )*
    ;

 typeref_base returns[TypeRef typeRef]
    : VOID
        {
            $typeRef =  new VoidTypeRef();
        }
    | CHAR
        {
            $typeRef =  IntegerTypeRef.charRef();
        }
    | SHORT
        {
            $typeRef =  IntegerTypeRef.shortRef();
        }
    | INT
        {
            $typeRef =  IntegerTypeRef.intRef();
        }
    | LONG
        {
            $typeRef =  IntegerTypeRef.longRef();
        }
    |UNSIGNED CHAR
        {
            $typeRef =  IntegerTypeRef.ucharRef();
        }
    | UNSIGNED SHORT
        {
            $typeRef =  IntegerTypeRef.ushortRef();
        }
    | UNSIGNED INT
        {
            $typeRef =  IntegerTypeRef.uintRef();
        }
    | UNSIGNED LONG
        {
            $typeRef =  IntegerTypeRef.ulongRef();
        }
    | STRUCT n=IDENTIFIER
        {
            $typeRef =  new StructTypeRef($n.text);
        }
    | UNION n=IDENTIFIER
        {
            $typeRef =  new UnionTypeRef($n.text);
        }
    | n=IDENTIFIER
        {
           if (isType($n.text)){
                $typeRef =  new UserTypeRef($n.text);
           }
        }
    ;

typedef returns[TypedefNode typedefNode]
    : TYPEDEF t=typeref n=IDENTIFIER ';'
    {   addType($n.text);
        $typedefNode =  new TypedefNode($t.typeRef, $n.text);
    }
    ;

expr returns[ExprNode exprNode]
    : lhs=term '=' rhs=expr
        {
            $exprNode = new AssignNode($lhs.exprNode, $rhs.exprNode);
        }
    | lhs1=term op=opassign_op rhs1=expr
        {
            $exprNode = new OpAssignNode($lhs1.exprNode, $op.op, $rhs1.exprNode);
        }
    | e=expr10
        {
            $exprNode = $e.exprNode;
        }
    ;

expr10 returns[ExprNode exprNode]
    : c=expr9
        {
            $exprNode = $c.exprNode;
        }
    ('?' t=expr  ':' e=expr10
        {
            $exprNode =  new CondExprNode($exprNode, $t.exprNode, $e.exprNode);
        }
    )?
    ;

expr9 returns[ExprNode exprNode]
    : l=expr8
        {
            $exprNode = $l.exprNode;
        }
    ('||' r=expr8
        {
            $exprNode = new LogicalOrNode($exprNode, $r.exprNode);
        }
    )*
    ;

expr8 returns[ExprNode exprNode]
    : l=expr7
        {
            $exprNode = $l.exprNode;
        }
    ('&&' r=expr7
        {
            $exprNode = new LogicalAndNode($exprNode, $r.exprNode);
        }
    )*
    ;

expr7 returns[ExprNode exprNode]
    : l=expr6
        {
            $exprNode = $l.exprNode;
        }
    ( '>' r=expr6
        {
            $exprNode = new BinaryOpNode($exprNode, ">", $r.exprNode);
        }
    | '<'  r1=expr6
        {
            $exprNode = new BinaryOpNode($exprNode, "<", $r1.exprNode);
        }
    | '>=' r2=expr6
        {
            $exprNode = new BinaryOpNode($exprNode, ">=", $r2.exprNode);
        }
    | '<=' r3=expr6
        {
            $exprNode = new BinaryOpNode($exprNode, "<=", $r3.exprNode);
        }
    | '==' r4=expr6
        {
            $exprNode = new BinaryOpNode($exprNode, "==", $r4.exprNode);
        }
    | '!=' r5=expr6
        {
            $exprNode = new BinaryOpNode($exprNode, "!=", $r5.exprNode);
        }
    )*
    ;

expr6 returns[ExprNode exprNode]
    : l=expr5
        {
            $exprNode = $l.exprNode;
        }
    ('|' r=expr5
        {
            $exprNode = new BinaryOpNode($exprNode, "|", $r.exprNode);
        }
    )*
    ;
expr5 returns[ExprNode exprNode]
    : l=expr4
        {
            $exprNode = $l.exprNode;
        }
    ('^' r=expr4
        {
            $exprNode = new BinaryOpNode($exprNode, "^", $r.exprNode);
        }
    )*
    ;

expr4 returns[ExprNode exprNode]
    : l=expr3
    {
                $exprNode = $l.exprNode;
            }
    ('&' r=expr3
        {
            $exprNode = new BinaryOpNode($exprNode, "&", $r.exprNode);
        }
    )*
    ;

expr3 returns[ExprNode exprNode]
    : l=expr2
    {
                $exprNode = $l.exprNode;
            }
    ('>>' r=expr2
        {
            $exprNode = new BinaryOpNode($exprNode, ">>", $r.exprNode);
        }
     | '<<' r1=expr2
        {
            $exprNode = new BinaryOpNode($exprNode, "<<", $r1.exprNode);
        }
     )*
     ;

expr2 returns[ExprNode exprNode]
     : l=expr1
        {
            $exprNode = $l.exprNode;
        }
     ( '+' r=expr1
         {
            $exprNode = new BinaryOpNode($exprNode, "+", $r.exprNode);
         }
     | '-' r1=expr1
         {
            $exprNode = new BinaryOpNode($exprNode, "-", $r1.exprNode);
         }
     )*
     ;

expr1 returns[ExprNode exprNode]
     : l=term
         {
             $exprNode = $l.exprNode;
         }
     ( '*' r=term
         {
            $exprNode = new BinaryOpNode($exprNode, "*", $r.exprNode);
         }
     | '/' r1=term
         {
            $exprNode = new BinaryOpNode($exprNode, "/", $r1.exprNode);
         }
     | '%' r2=term
         {
            $exprNode = new BinaryOpNode($exprNode, "%", $r2.exprNode);
         }
     )*
     ;

opassign_op returns[String op]
    : ( '+='  { $op =  "+"; }
    | '-='  { $op =  "-"; }
    | '*='  { $op =  "*"; }
    | '/='  { $op =  "/"; }
    | '%='  { $op =  "%"; }
    | '&='  { $op =  "&"; }
    | '|='  { $op =  "|"; }
    | '^='  { $op =  "^"; }
    | '<<=' { $op =  "<<"; }
    | '>>=' { $op =  ">>"; }
    )
    ;

term returns[ExprNode exprNode]
    :'(' t=type ')' n=term
        {
            $exprNode =  new CastNode($t.typeNode, $n.exprNode);
        }
    | u=unary
        {
            $exprNode = $u.exprNode ;
        }
    ;
unary returns [ExprNode exprNode]
     : '++' u=unary
        {
            $exprNode = new PrefixOpNode("++", $u.exprNode);
        }
     | '--' u1=unary
        {
            $exprNode= new PrefixOpNode("--", $u1.exprNode);
        }
     | '+' t=term
        {
            $exprNode= new UnaryOpNode("+", $t.exprNode);
        }
     | '-' t1=term
        {
            $exprNode= new UnaryOpNode("-", $t1.exprNode);
        }
     | '!' t2=term
        {
            $exprNode= new UnaryOpNode("!", $t2.exprNode);
        }
     | '~' t3=term
        {
            $exprNode= new UnaryOpNode("~", $t3.exprNode);
        }
     | '*' t4=term
        {
            $exprNode= new DereferenceNode($t4.exprNode);
        }
     | '&' t5=term
        {
            $exprNode= new AddressNode($t5.exprNode);
        }
     | SIZEOF '(' ty=type ')'
         {
            $exprNode = new SizeofTypeNode($ty.typeNode, size_t());
         }
     | SIZEOF u=unary
         {
             $exprNode= new SizeofExprNode($u.exprNode, size_t());
         }
     | p=postfix
         {
             $exprNode = $p.exprNode;
         }
     ;


postfix returns[ExprNode exprNode]
    : expr0=primary
        {
            $exprNode = $expr0.exprNode;
        }
     ( '++'
        {
            $exprNode= new SuffixOpNode("++", $exprNode);
        }
     | '--'
        {
            $exprNode= new SuffixOpNode("--", $exprNode);
        }
     | '[' e=expr ']'
        {
            $exprNode= new ArefNode($exprNode, $e.exprNode);
        }
     | '.' IDENTIFIER
        {
            $exprNode= new MemberNode($exprNode, $IDENTIFIER.text);
        }
     | '->' IDENTIFIER
        {
            $exprNode= new PtrMemberNode($exprNode, $IDENTIFIER.text);
        }
     | '(' a=args ')'
        {
            $exprNode= new FuncallNode($exprNode, $a.arguments);
        }
     )*;

args returns[ List<ExprNode> arguments]
    @init {
        $arguments = new ArrayList<ExprNode>();
    }
    : (e=expr
        {
            $arguments.add($e.exprNode);
        }
        (',' e1=expr
            {
                $arguments.add($e1.exprNode);
            }
        )*
    )?
    ;

primary returns [ExprNode exprNode]
    : t=INTEGER
        {
            $exprNode  = integerNode($t.text);
        }
    | t=CHARACTER
        {
            $exprNode  = new IntegerLiteralNode(IntegerTypeRef.charRef(),characterCode($t.text));
        }
    | t=STRING
        {
            $exprNode  = new StringLiteralNode(new PointerTypeRef(IntegerTypeRef.charRef()),stringValue($t.text));
        }
    | t=IDENTIFIER
        {
            $exprNode  = new VariableNode($t.text);
        }
    | '(' e=expr ')'
        {
             $exprNode  = $e.exprNode;
        }
    ;

VOID : 'void';
CHAR : 'char';
SHORT : 'short';
INT : 'int';
LONG : 'long';
STRUCT : 'struct';
UNION : 'union';
ENUM : 'enum';
STATIC : 'static';
EXTERN : 'extern';
CONST : 'const';
SIGNED : 'signed';
UNSIGNED : 'unsigned';
IF : 'if';
ELSE : 'else';
SWITCH : 'switch';
CASE : 'case';
DEFAULT : 'default';
WHILE : 'while';
DO : 'do';
FOR : 'for';
RETURN : 'return';
BREAK : 'break';
CONTINUE : 'continue';
GOTO : 'goto';
TYPEDEF : 'typedef';
IMPORT : 'import';
SIZEOF : 'sizeof';

WS: [ \t\r\n\u000C]+ -> skip;
LINE_COMMENT : '//' ~[\r\n]* ('\n'|'\r\n'|'\r')?  -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;

STRING:       '"'((~["\\\r\n])+ | . | ESCAPE )*?'"';
CHARACTER:    '\''(~['\\\r\n] | | . | ESCAPE )'\'';
IDENTIFIER :  ID_LETTER (ID_LETTER|DIGIT)* ;
INTEGER
    : '1'..'9' DIGIT* 'U'? 'L'?
    |'0' [xX] [0-9a-fA-F]+ 'U'? 'L'?
    |'0' ('0'..'7')* 'U'? 'L'?;

fragment ID_LETTER : 'a'..'z'|'A'..'Z'|'_' ;
fragment DIGIT : '0'..'9';
fragment ESCAPE : '\\' '0'..'7' '0'..'7' '0'..'7'
