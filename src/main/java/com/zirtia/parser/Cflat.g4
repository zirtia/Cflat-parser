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
}

compilation_unit returns [AST ast]
@init {
    Declarations decls = top_defs().decls;
}
@after {
     decls.add(import_stmts().impdecls);
     $ast =  new AST(decls);
 }
: import_stmts top_defs EOF ;

declaration_file returns [Declarations decls]
@init {
    $decls = new Declarations();
}
: import_stmts { $decls.add(import_stmts().impdecls); }
( funcdecl   { $decls.addFuncdecl(funcdecl().undefinedFunction); }
| vardecl     { $decls.addVardecl(vardecl().undefinedVariable); }
| defconst   { $decls.addConstant(defconst().contant); }
| defstruct { $decls.addDefstruct(defstruct().structNode); }
| defunion   { $decls.addDefunion(defunion().unionNode); }
| typedef     { $decls.addTypedef(typedef().typedefNode); }
)* EOF
;

import_stmts returns [Declarations impdecls] throws CompileException
@init {
    $impdecls = new Declarations();
}
: (import_stmt {
        Declarations decls = loader.loadLibrary(import_stmt().impdecl);
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
: IMPORT name { buf.append(name().text); }
('.' name { buf.append("."); buf.append((name().text)); } )* ';'
;

top_defs returns[Declarations decls]
@init {
    $decls = new Declarations();
}
:( defun       { $decls.addDefun(defun().definedFunction); }
 | defvars     { $decls.addDefvars(defvars().defs); }
 | defconst   { $decls.addConstant(defconst().contant); }
 | defstruct { $decls.addDefstruct(defstruct().structNode); }
 | defunion   { $decls.addDefunion(defunion().unionNode); }
 | typedef     { $decls.addTypedef(typedef().typedefNode); }
 )*
;

defvars returns[List<DefinedVariable> defs]
@init {
    $defs = new ArrayList<DefinedVariable>();
}
: storage type name ('=' expr)? {
           $defs.add(new DefinedVariable(storage().bool, type().typeNode, name().text, expr().exprNode));
        }
( ',' name ('=' expr)? {
           $defs.add(new DefinedVariable(storage().bool, type().typeNode, name().text, expr().exprNode));
       }
   )* ';'
;

defconst returns[Constant contant]
@after {
    $contant = new Constant(type().typeNode, name().text, expr().exprNode);
}
: CONST type name '=' expr ';' ;

defun returns[DefinedFunction definedFunction]
@after{
    TypeRef t = new FunctionTypeRef(typeref().typeRef, params().paramz.parametersTypeRef());
    $definedFunction = new DefinedFunction(storage().bool, new TypeNode(t),
                name().text, params().paramz, block().blockNode);
}
: storage typeref name '(' params ')' block ;

storage returns[boolean bool]
@after {
    $bool =  $t == null ? false : true ;
}
:(t=STATIC)?;

params returns[Params paramz]
: VOID { $paramz = new Params(new ArrayList<Parameter>());}
    | params1=fixedparams (',' '...' { fixedparams().paramz.acceptVarargs(); })? {$paramz = fixedparams().paramz ;}
;

fixedparams returns [Params paramz]
@init {
    List<Parameter> parameters = new ArrayList<Parameter>();
}
@after {
    $paramz = new Params(parameters);
}
:param { parameters.add(param().parameter); }
(param { parameters.add(param().parameter); } )*
;

 param returns[Parameter parameter]
@after {
    $parameter = new Parameter(type().typeNode, name().text);
}
:type name;

block returns [BlockNode blockNode]
 @after {
    $blockNode = new BlockNode(defvar_list().result,stmts().ss);
 }
 : '{' defvar_list stmts '}';


defvar_list returns[List<DefinedVariable> result]
 @init{
    $result = new ArrayList<DefinedVariable>();
 }
 : ( defvars { $result.addAll(defvars().defs); } )* ;

defstruct returns[StructNode structNode]
 @after {
    $structNode = new StructNode(new StructTypeRef(name().text), name().text, member_list().membs);
 }
 : STRUCT n=name membs=member_list ';';


defunion returns [UnionNode unionNode]
 @after {
    $unionNode = new UnionNode(new UnionTypeRef(name().text), name().text, member_list().membs);
 }
 : UNION name member_list ';';

member_list returns [List<Slot> membs]
 @init{
    $membs = new ArrayList<Slot>();
 }
 : '{' (slot ';' { $membs.add(slot().slod); })* '}';

slot returns[Slot slod]
@after{
    $slod = new Slot(type().typeNode, name().text);
}
:type name;

funcdecl returns[UndefinedFunction undefinedFunction]
@after {
    TypeRef t = new FunctionTypeRef(typeref().typeRef, params().paramz.parametersTypeRef());
    $undefinedFunction =  new UndefinedFunction(new TypeNode(t), name().text, params().paramz);
}
: EXTERN typeref name '(' params ')' ';' ;

 vardecl returns[UndefinedVariable undefinedVariable]
@after {
$undefinedVariable = new UndefinedVariable(type().typeNode, name().text);
}
:  EXTERN type name ';';

type returns[TypeNode typeNode]
@after{
$typeNode = new TypeNode(typeref().typeRef);
}
:typeref;

 typeref returns[TypeRef typeRef]
:
    typeref_base
    (
      '[' ']'
        {
            $typeRef = new ArrayTypeRef(typeref_base().typeRef);
        }
    | '[' t=INTEGER ']'
        {
            $typeRef = new ArrayTypeRef(typeref_base().typeRef, integerValue($t.getText()));
        }
    | '*'
        {
            $typeRef = new PointerTypeRef(typeref_base().typeRef);
        }
    | '(' param_typerefs ')'
        {
            $typeRef = new FunctionTypeRef(typeref_base().typeRef, param_typerefs().paramTypeRefs);
        }
    )*;


param_typerefs returns[ParamTypeRefs paramTypeRefs]
:
      VOID
        {
            $paramTypeRefs =  new ParamTypeRefs(new ArrayList<TypeRef>());
        }
    | fixedparam_typerefs
          ( ',' '...'   { fixedparam_typerefs().paramTypeRefs.acceptVarargs(); })? {$paramTypeRefs = fixedparam_typerefs().paramTypeRefs;}
;

 fixedparam_typerefs returns[ParamTypeRefs paramTypeRefs]
 @init {
 List<TypeRef> refs = new ArrayList<TypeRef>();
 }
 @after{
 $paramTypeRefs =  new ParamTypeRefs(refs);
 }
:
    ref=typeref { refs.add($ref.typeRef); }
    ( ',' ref=typeref { refs.add($ref.typeRef); } )*;

 typeref_base returns[TypeRef typeRef]
:
      VOID          { $typeRef =  new VoidTypeRef(); }
    | CHAR        { $typeRef =  IntegerTypeRef.charRef(); }
    | SHORT        { $typeRef =  IntegerTypeRef.shortRef(); }
    | INT           { $typeRef =  IntegerTypeRef.intRef(); }
    | LONG          { $typeRef =  IntegerTypeRef.longRef(); }
    |UNSIGNED CHAR
        { $typeRef =  IntegerTypeRef.ucharRef(); }
    | UNSIGNED SHORT
        { $typeRef =  IntegerTypeRef.ushortRef(); }
    | UNSIGNED INT
        { $typeRef =  IntegerTypeRef.uintRef(); }
    | UNSIGNED LONG
        { $typeRef =  IntegerTypeRef.ulongRef(); }
    | STRUCT n=IDENTIFIER
        { $typeRef =  new StructTypeRef($n.getText()); }
    | UNION n=IDENTIFIER
        { $typeRef =  new UnionTypeRef($n.getText()); }
    |  n=IDENTIFIER
        { $typeRef =  new UserTypeRef($n.getText()); }
;

 typedef returns[TypedefNode typedefNode]
@after {
    addType($newname.getText());
    $typedefNode =  new TypedefNode(typeref().typeRef, $newname.getText());
}
: TYPEDEF typeref newname=IDENTIFIER ';';

stmts returns [List<StmtNode>  ss]
@init{
$ss = new ArrayList<StmtNode>();
}
: (stmt { if (stmt().stmtNode != null) $ss.add(stmt().stmtNode); })*
;

 stmt returns[StmtNode stmtNode]
:
    ( ';'
    | labeled_stmt { $stmtNode = labeled_stmt().labelNode;}
    | expr ';' { $stmtNode = new ExprStmtNode(expr().exprNode); }
    | block  { $stmtNode = block().blockNode;}
    | if_stmt  { $stmtNode =if_stmt().ifNode;}
    | while_stmt  { $stmtNode =while_stmt().whileNode;}
    | dowhile_stmt   { $stmtNode = dowhile_stmt().doWhileNode;}
    | for_stmt  { $stmtNode =for_stmt().forNode;}
    | switch_stmt  { $stmtNode =switch_stmt().switchNode;}
    | break_stmt  { $stmtNode =break_stmt().breakNode;}
    | continue_stmt  { $stmtNode =continue_stmt().continueNode;}
    | goto_stmt  { $stmtNode = goto_stmt().gotoNode;}
    | return_stmt  { $stmtNode =  return_stmt().returnNode;}
    );

 labeled_stmt returns[LabelNode labelNode]
@after {
$labelNode = new LabelNode($t.getText(), stmt().stmtNode);
}
: t=IDENTIFIER ':'stmt;

if_stmt returns[IfNode ifNode]
@after {
 $ifNode =  new IfNode($cond.exprNode, $thenBody.stmtNode, $elseBody.stmtNode);
}
: IF '(' cond=expr ')' thenBody=stmt (ELSE elseBody=stmt)?;

 while_stmt returns[WhileNode whileNode]
@after{
$whileNode = new WhileNode($cond.exprNode, $body.stmtNode);
}
:
    WHILE '(' cond=expr ')' body=stmt;

 dowhile_stmt returns[DoWhileNode doWhileNode]
@after{
$doWhileNode = new DoWhileNode( $body.stmtNode, $cond.exprNode);
}
:
    DO body=stmt WHILE '(' cond=expr ')' ';';

 for_stmt returns[ForNode forNode]
@after {
$forNode = new ForNode($init.exprNode, $cond.exprNode, $incr.exprNode, $body.stmtNode);
}
: FOR '(' (init=expr)? ';'
              (cond=expr)? ';'
              (incr=expr)? ')' body=stmt;

 switch_stmt returns[SwitchNode switchNode]
@after{
$switchNode = new SwitchNode($cond.exprNode, $bodies.clauses);
}: SWITCH '(' cond=expr ')' '{' bodies=case_clauses '}';


 case_clauses returns [List<CaseNode> clauses]
@init{
$clauses = new ArrayList<CaseNode>();
}:(case_clause { $clauses.add(case_clause().caseNode); })* (default_clause { $clauses.add(default_clause().caseNode); })?

;

 case_clause returns[CaseNode caseNode]
@after {
 $caseNode =  new CaseNode($values.values, $body.blockNode);
}
:
    values=cases body=case_body;

 cases returns[List<ExprNode> values]
@init {
$values = new ArrayList<ExprNode>();
}
:
    (CASE primary ':' { $values.add(primary().exprNode); })+;

default_clause returns[CaseNode caseNode ]
 @after {
 $caseNode = new CaseNode(new ArrayList<ExprNode>(), $body.blockNode);
 }
:DEFAULT ':' body=case_body;

 case_body returns[BlockNode blockNode]
@init{
LinkedList<StmtNode> stmts = new LinkedList<StmtNode>();
}
@after{
        if (! (stmts.getLast() instanceof BreakNode)) {
            throw new Error("missing break statement at the last of case clause");
        }
         $blockNode =  new BlockNode(
                             new ArrayList<DefinedVariable>(),
                             stmts);
}
:
    (s=stmt { if ($s.stmtNode != null) stmts.add($s.stmtNode); })+;

 goto_stmt returns [GotoNode gotoNode]
@after{
$gotoNode = new GotoNode( $n.getText());
}
:GOTO n=IDENTIFIER ';';

break_stmt returns [BreakNode breakNode]
@after{$breakNode = new BreakNode();}
:BREAK ';' ;

continue_stmt returns [ContinueNode continueNode]
@after{$continueNode = new ContinueNode();}
:CONTINUE ';';

return_stmt returns [ReturnNode returnNode]
:
      RETURN ';' { $returnNode =  new ReturnNode(null); }
    | RETURN expr0=expr ';'  { $returnNode =  new ReturnNode($expr0.exprNode); }
;

expr returns[ExprNode exprNode]
    :lhs=term '=' rhs=expr { $exprNode =  new AssignNode($lhs.exprNode, $rhs.exprNode);}
    | lhs=term op=opassign_op rhs=expr { $exprNode =  new OpAssignNode($lhs.exprNode, $op.op, $rhs.exprNode);}
    | expr10 {$exprNode = expr10().exprNode;}
    ;

expr10 returns[ExprNode exprNode]
    : c=expr9 ('?' t=expr  ':' e=expr10 { $exprNode =  new CondExprNode($c.exprNode, $t.exprNode, $e.exprNode); })?
    ;
expr9 returns[ExprNode exprNode]
:
     l=expr8 ('||' r=expr8 { $exprNode = new LogicalOrNode($l.exprNode, $r.exprNode); })*
     ;
expr8 returns[ExprNode exprNode]
:
     l=expr7 ('&&' r=expr7 { $exprNode = new LogicalAndNode($l.exprNode, $r.exprNode); })*
    ;
    expr7 returns[ExprNode exprNode]
    :

     l=expr6 ( '>' r=expr6 { $exprNode = new BinaryOpNode($l.exprNode, ">", $r.exprNode); }
             | '<'  r=expr6 { $exprNode = new BinaryOpNode($l.exprNode, "<", $r.exprNode); }
             | '>=' r=expr6 { $exprNode = new BinaryOpNode($l.exprNode, ">=", $r.exprNode); }
             | '<=' r=expr6 { $exprNode = new BinaryOpNode($l.exprNode, "<=", $r.exprNode); }
             | '==' r=expr6 { $exprNode = new BinaryOpNode($l.exprNode, "==", $r.exprNode); }
             | '!=' r=expr6 { $exprNode = new BinaryOpNode($l.exprNode, "!=", $r.exprNode); } )*;
             expr6 returns[ExprNode exprNode]
             : l=expr5 ('|' r=expr5 { $exprNode = new BinaryOpNode($l.exprNode, "|", $r.exprNode); })*;
             expr5 returns[ExprNode exprNode]
             :
     l=expr4 ('^' r=expr4 { $exprNode = new BinaryOpNode($l.exprNode, "^", $r.exprNode); })*;
     expr4 returns[ExprNode exprNode]
     :
     l=expr3 ('&' r=expr3 { $exprNode = new BinaryOpNode($l.exprNode, "&", $r.exprNode); })*;
     expr3 returns[ExprNode exprNode]
     :
     l=expr2 ('>>' r=expr2 { $exprNode = new BinaryOpNode($l.exprNode, ">>", $r.exprNode); }
             | '<<' r=expr2 { $exprNode = new BinaryOpNode($l.exprNode, "<<", $r.exprNode); })*;
             expr2 returns[ExprNode exprNode]
             :
     l=expr1 ( '+' r=expr1 { $exprNode = new BinaryOpNode($l.exprNode, "+", $r.exprNode); }
             | '-' r=expr1 { $exprNode = new BinaryOpNode($l.exprNode, "-", $r.exprNode); })*;
expr1 returns[ExprNode exprNode]:
     l=term ( '*' r=term { $exprNode = new BinaryOpNode($l.exprNode, "*", $r.exprNode); }
             | '/' r=term { $exprNode = new BinaryOpNode($l.exprNode, "/", $r.exprNode); }
             | '%' r=term { $exprNode = new BinaryOpNode($l.exprNode, "%", $r.exprNode); })*
    ;

opassign_op returns[String op]
:
    ( '+='  { $op =  "+"; }
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
:
    '(' t=type ')' n=term    { $exprNode =  new CastNode($t.typeNode, $n.exprNode); }
    | unary {$exprNode = unary().exprNode ;}
;
 unary returns [ExprNode exprNode]
:    '++' unary    { $exprNode= new PrefixOpNode("++", unary().exprNode); }
     | '--' unary    { $exprNode= new PrefixOpNode("--", unary().exprNode); }
     | '+' term      { $exprNode= new UnaryOpNode("+", term().exprNode); }
     | '-' term      { $exprNode= new UnaryOpNode("-", term().exprNode); }
     | '!' term      { $exprNode= new UnaryOpNode("!", term().exprNode); }
     | '~' term      { $exprNode= new UnaryOpNode("~", term().exprNode); }
     | '*' term      { $exprNode= new DereferenceNode(term().exprNode); }
     | '&' term      { $exprNode= new AddressNode(term().exprNode); }
     | SIZEOF '(' t=type ')'
         {
            $exprNode = new SizeofTypeNode($t.typeNode, size_t());
         }
     | SIZEOF unary
         {
             $exprNode= new SizeofExprNode(unary().exprNode, size_t());
         }
     | postfix { $exprNode = postfix().exprNode;}   ;


postfix returns[ExprNode exprNode]
:
     expr0=primary
     ( '++'               {$exprNode= new SuffixOpNode("++", $expr0.exprNode); }
     | '--'               {$exprNode= new SuffixOpNode("--", $expr0.exprNode); }
     | '[' idx=expr ']'   { $exprNode= new ArefNode($expr0.exprNode, $idx.exprNode); }
     | '.' IDENTIFIER      { $exprNode= new MemberNode($expr0.exprNode, $IDENTIFIER.text); }
     | '->' IDENTIFIER     { $exprNode= new PtrMemberNode($expr0.exprNode, $IDENTIFIER.text); }
     | '(' args ')'  { $exprNode= new FuncallNode($expr0.exprNode, args().argz); }
     )*;

name returns[String text] :IDENTIFIER {$text = $IDENTIFIER.text ;} ;


args returns[ List<ExprNode> argz]

@init {
$argz = new ArrayList<ExprNode>();
}
: (arg=expr { $argz.add($arg.exprNode); } (',' arg=expr { $argz.add($arg.exprNode); })*)?;


primary returns [ExprNode exprNode]
: t=INTEGER { $exprNode  = integerNode($t.getText()); }
| t=CHARACTER {$exprNode  = new IntegerLiteralNode(IntegerTypeRef.charRef(),characterCode($t.getText()));}
| t=STRING { $exprNode  = new StringLiteralNode(new PointerTypeRef(IntegerTypeRef.charRef()),$t.getText());}
| t=IDENTIFIER { $exprNode  = new VariableNode($t.getText());}
| '(' expr ')' {$exprNode  = expr().exprNode;};

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


STRING:     '"' (~["\\\r\n])* '"';
CHARACTER:    '\'' (~['\\\r\n]) '\'';

IDENTIFIER : ID_LETTER (ID_LETTER | DIGIT)* ;
INTEGER: [1-9] [0-9]* ('U')? ('L')?
         | '0' [xX] [0-9a-fA-F]+ ('U')? ('L')?
         | '0' [0-7]* ('U')? ('L')?;
fragment ID_LETTER : 'a'..'z'|'A'..'Z'|'_' ;
fragment DIGIT : '0'..'9';

WS: [ \t\r\n\u000C]+ -> skip;
LINE_COMMENT : '//' ~[\r\n]* ('\n'|'\r\n'|'\r')?  -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;