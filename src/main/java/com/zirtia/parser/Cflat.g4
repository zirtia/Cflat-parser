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
    import static com.zirtia.utils.ESCUtils.characterCode;
    import static com.zirtia.utils.ESCUtils.integerValue;
    import static com.zirtia.utils.ESCUtils.stringValue;
}

@parser::members {
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
}

compilation_unit returns [AST ast]
    : import_stmts top_defs EOF
    {
        Declarations decls = $top_defs.decls;
        decls.add($import_stmts.impdecls);
        $ast = new AST(location($import_stmts.start),decls);
    }
    ;

declaration_file returns [Declarations decls]
    @init {
        $decls = new Declarations();
    }
    : import_stmts
        {
            $decls.add($import_stmts.impdecls);
        }
    ( funcdecl
        {
            $decls.addFuncdecl($funcdecl.undefinedFunction);
        }
    | vardecl
        {
            $decls.addVardecl($vardecl.undefinedVariable);
        }
    | defconst
        {
            $decls.addConstant($defconst.contant);
        }
    | defstruct
        {
            $decls.addDefstruct($defstruct.structNode);
        }
    | defunion
        {
            $decls.addDefunion($defunion.unionNode);
        }
    | typedef
        {
            $decls.addTypedef($typedef.typedefNode);
        }
    )*
    ;

import_stmts returns [Declarations impdecls]
    @init {
        $impdecls = new Declarations();
    }
    : (import_stmt
        {
            Declarations decls = loader.loadLibrary($import_stmt.impdecl);
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
        $defs.add(new DefinedVariable($s.bool, $t.typeNode, $n.text, $e.ctx != null ? $e.exprNode : null));
    }
    ( ',' n1=IDENTIFIER ('=' e1=expr)?
        {
               $defs.add(new DefinedVariable($s.bool, $t.typeNode, $n1.text,  $e1.ctx != null ? $e1.exprNode : null));
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
    : t=VOID
        {
            $parameters = new Params(location($t),new ArrayList<Parameter>());
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
        $parameters = new Params($p.parameter.location(),parameters1);
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
     : t='{' dvl=defvar_list ss=stmts '}'
        {
            $blockNode = new BlockNode(location($t),$dvl.result,$ss.ss);
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
    : t=STRUCT n=IDENTIFIER ml=member_list ';'
     {
         $structNode = new StructNode(location($t),new StructTypeRef($n.text), $n.text, $ml.membs);
     }
    ;


defunion returns [UnionNode unionNode]
    : t=UNION n=IDENTIFIER ml=member_list ';'
     {
         $unionNode = new UnionNode(location($t),new UnionTypeRef($n.text), $n.text, $ml.membs);
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
            if ($s.stmtNode != null) $ss.add($s.stmtNode);
        }
    )*
    ;

 stmt returns[StmtNode stmtNode]
    : ( ';'

    | labeled_stmt
        {
            $stmtNode = $labeled_stmt.labelNode;
        }
    | expr ';'
        {
            $stmtNode = new ExprStmtNode($expr.exprNode.location(),$expr.exprNode);
        }
    | block
        {
            $stmtNode =$block.blockNode;
        }
    | if_stmt
        {
            $stmtNode =$if_stmt.ifNode;
        }
    | while_stmt
        {
            $stmtNode = $while_stmt.whileNode;
        }
    | dowhile_stmt
        {
            $stmtNode = $dowhile_stmt.doWhileNode;
        }
    | for_stmt
        {
            $stmtNode =$for_stmt.forNode;
        }
    | switch_stmt
        {
            $stmtNode =$switch_stmt.switchNode;
        }
    | break_stmt
        {
            $stmtNode =$break_stmt.breakNode;
        }
    | continue_stmt
        {
            $stmtNode = $continue_stmt.continueNode;
        }
    | goto_stmt
        {
            $stmtNode = $goto_stmt.gotoNode;
        }
    | return_stmt
        {
            $stmtNode = $return_stmt.returnNode;
        }
    )
    ;

labeled_stmt returns[LabelNode labelNode]
    : t=IDENTIFIER ':'s=stmt
        {
            $labelNode = new LabelNode(location($t),$t.text, $s.stmtNode);
        }
    ;

if_stmt returns[IfNode ifNode]
    : IF '(' cond = expr ')' thenBody = stmt (ELSE elseBody = stmt)?
        {
            $ifNode = new IfNode(location($IF),$cond.exprNode, $thenBody.stmtNode, $elseBody.ctx != null ? $elseBody.stmtNode : null);
        }
    ;

while_stmt returns[WhileNode whileNode]
    : WHILE '(' cond = expr ')' body = stmt
        {
            $whileNode = new WhileNode(location($WHILE),$cond.exprNode, $body.stmtNode);
        }
    ;

dowhile_stmt returns[DoWhileNode doWhileNode]
    : DO body = stmt WHILE '(' cond = expr ')' ';'
        {
            $doWhileNode = new DoWhileNode( location($DO),$body.stmtNode, $cond.exprNode);
        }
    ;

for_stmt returns[ForNode forNode]
    : FOR '(' (init = expr)? ';' (cond = expr)? ';' (incr = expr)? ')' body = stmt
        {
            $forNode = new ForNode(location($FOR),$init.ctx != null ? $init.exprNode : null , $cond.ctx != null ? $cond.exprNode : null ,  $incr.ctx != null ? $incr.exprNode : null, $body.stmtNode);
        }
    ;

switch_stmt returns[SwitchNode switchNode]
    : SWITCH '(' cond = expr ')' '{' bodies = case_clauses '}'
        {
            $switchNode = new SwitchNode(location($SWITCH),$cond.exprNode, $bodies.clauses);
        }
    ;


case_clauses returns [List<CaseNode> clauses]
    @init{
        $clauses = new ArrayList<CaseNode>();
    }
    :(case_clause
        {
            $clauses.add($case_clause.caseNode);
        }
    )*
    (default_clause
        {
            $clauses.add($default_clause.caseNode);
        }
    )?
    ;

case_clause returns[CaseNode caseNode]
    : values = cases body = case_body
        {
         $caseNode =  new CaseNode($body.blockNode.location(),$values.values, $body.blockNode);
        }
    ;

cases returns[List<ExprNode> values]
    @init {
        $values = new ArrayList<ExprNode>();
    }
    : (CASE primary ':'
        {
            $values.add($primary.exprNode);
        }
    )+
    ;

default_clause returns[CaseNode caseNode ]
    : DEFAULT ':' body=case_body
        {
            $caseNode = new CaseNode($body.blockNode.location(),new ArrayList<ExprNode>(), $body.blockNode);
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
             $blockNode =  new BlockNode(stmts.get(0).location(),new ArrayList<DefinedVariable>(),stmts);
    }
    : (s=stmt
        {
            if ($s.stmtNode != null) stmts.add($s.stmtNode);
        }
    )+
    ;

goto_stmt returns [GotoNode gotoNode]
    @after{
        $gotoNode = new GotoNode(location($t),$n.text);
    }
    : t=GOTO n=IDENTIFIER ';'
    ;

break_stmt returns [BreakNode breakNode]
    @after {
        $breakNode = new BreakNode(location($t));
    }
    : t=BREAK ';'
    ;

continue_stmt returns [ContinueNode continueNode]
    @after {
        $continueNode = new ContinueNode(location($t));
    }
    : t=CONTINUE ';'
    ;

return_stmt returns [ReturnNode returnNode]
    : t=RETURN ';'
        {
            $returnNode =  new ReturnNode(location($t),null);
        }
    | t=RETURN expr0=expr ';'
        {
            $returnNode =  new ReturnNode(location($t),$expr0.exprNode);
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
    : t=VOID
        {
            $typeRef =  new VoidTypeRef(location($t));
        }
    | t=CHAR
        {
            $typeRef =  IntegerTypeRef.charRef(location($t));
        }
    | t=SHORT
        {
            $typeRef =  IntegerTypeRef.shortRef(location($t));
        }
    | t=INT
        {
            $typeRef =  IntegerTypeRef.intRef(location($t));
        }
    | t=LONG
        {
            $typeRef =  IntegerTypeRef.longRef(location($t));
        }
    | t=UNSIGNED CHAR
        {
            $typeRef =  IntegerTypeRef.ucharRef(location($t));
        }
    | t=UNSIGNED SHORT
        {
            $typeRef =  IntegerTypeRef.ushortRef(location($t));
        }
    | t=UNSIGNED INT
        {
            $typeRef =  IntegerTypeRef.uintRef(location($t));
        }
    | t=UNSIGNED LONG
        {
            $typeRef =  IntegerTypeRef.ulongRef(location($t));
        }
    | t=STRUCT n=IDENTIFIER
        {
            $typeRef =  new StructTypeRef(location($t),$n.text);
        }
    | t=UNION n=IDENTIFIER
        {
            $typeRef =  new UnionTypeRef(location($t),$n.text);
        }
    | n=IDENTIFIER
        {
           if (isType($n.text)){
                $typeRef =  new UserTypeRef(location($n),$n.text);
           }
        }
    ;

typedef returns[TypedefNode typedefNode]
    : td=TYPEDEF t=typeref n=IDENTIFIER ';'
    {   addType($n.text);
        $typedefNode =  new TypedefNode(location($td),$t.typeRef, $n.text);
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

term returns[ExprNode exprNode] // ( ++ -- + - ! ~ * & sizeof sizeof( sizeofD INTEGER char string iden (expr
    :'(' type ')' term
        {
            $exprNode =  new CastNode($type.typeNode, $term.exprNode);
        }
    | unary
        {
            $exprNode = $unary.exprNode ;
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
            $exprNode  = integerNode(location($t),$t.text);
        }
    | t=CHARACTER
        {
            $exprNode  = new IntegerLiteralNode(location($t),IntegerTypeRef.charRef(),characterCode($t.text));
        }
    | t=STRING
        {
            $exprNode  = new StringLiteralNode(location($t),new PointerTypeRef(IntegerTypeRef.charRef()),stringValue($t.text));
        }
    | t=IDENTIFIER
        {
            $exprNode  = new VariableNode(location($t),$t.text);
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

WS:  (' '|'\t'|'\r'|'\n')+ -> skip ;
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;

STRING:       '"' ( ESC | ~["\\] )*? '"';
CHARACTER:    '\''( UNICODE | . )'\'';
IDENTIFIER :  ID_LETTER (ID_LETTER|DIGIT)* ;
INTEGER
    : '1'..'9' DIGIT* 'U'? 'L'?
    |'0' [xX] [0-9a-fA-F]+ 'U'? 'L'?
    |'0' ('0'..'7')* 'U'? 'L'?;

fragment ID_LETTER : 'a'..'z'|'A'..'Z'|'_' ;
fragment DIGIT : '0'..'9';
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;
