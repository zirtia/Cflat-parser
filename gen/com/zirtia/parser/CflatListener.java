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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CflatParser}.
 */
public interface CflatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CflatParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(CflatParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(CflatParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#declaration_file}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_file(CflatParser.Declaration_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#declaration_file}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_file(CflatParser.Declaration_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#import_stmts}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmts(CflatParser.Import_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#import_stmts}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmts(CflatParser.Import_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(CflatParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(CflatParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#top_defs}.
	 * @param ctx the parse tree
	 */
	void enterTop_defs(CflatParser.Top_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#top_defs}.
	 * @param ctx the parse tree
	 */
	void exitTop_defs(CflatParser.Top_defsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#defvars}.
	 * @param ctx the parse tree
	 */
	void enterDefvars(CflatParser.DefvarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#defvars}.
	 * @param ctx the parse tree
	 */
	void exitDefvars(CflatParser.DefvarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#defconst}.
	 * @param ctx the parse tree
	 */
	void enterDefconst(CflatParser.DefconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#defconst}.
	 * @param ctx the parse tree
	 */
	void exitDefconst(CflatParser.DefconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#defun}.
	 * @param ctx the parse tree
	 */
	void enterDefun(CflatParser.DefunContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#defun}.
	 * @param ctx the parse tree
	 */
	void exitDefun(CflatParser.DefunContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#storage}.
	 * @param ctx the parse tree
	 */
	void enterStorage(CflatParser.StorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#storage}.
	 * @param ctx the parse tree
	 */
	void exitStorage(CflatParser.StorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CflatParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CflatParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#fixedparams}.
	 * @param ctx the parse tree
	 */
	void enterFixedparams(CflatParser.FixedparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#fixedparams}.
	 * @param ctx the parse tree
	 */
	void exitFixedparams(CflatParser.FixedparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CflatParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CflatParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CflatParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CflatParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#defvar_list}.
	 * @param ctx the parse tree
	 */
	void enterDefvar_list(CflatParser.Defvar_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#defvar_list}.
	 * @param ctx the parse tree
	 */
	void exitDefvar_list(CflatParser.Defvar_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#defstruct}.
	 * @param ctx the parse tree
	 */
	void enterDefstruct(CflatParser.DefstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#defstruct}.
	 * @param ctx the parse tree
	 */
	void exitDefstruct(CflatParser.DefstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#defunion}.
	 * @param ctx the parse tree
	 */
	void enterDefunion(CflatParser.DefunionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#defunion}.
	 * @param ctx the parse tree
	 */
	void exitDefunion(CflatParser.DefunionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#member_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_list(CflatParser.Member_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#member_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_list(CflatParser.Member_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#slot}.
	 * @param ctx the parse tree
	 */
	void enterSlot(CflatParser.SlotContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#slot}.
	 * @param ctx the parse tree
	 */
	void exitSlot(CflatParser.SlotContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#funcdecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncdecl(CflatParser.FuncdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#funcdecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncdecl(CflatParser.FuncdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(CflatParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(CflatParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(CflatParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(CflatParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CflatParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CflatParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#labeled_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_stmt(CflatParser.Labeled_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#labeled_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_stmt(CflatParser.Labeled_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(CflatParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(CflatParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(CflatParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(CflatParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#dowhile_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDowhile_stmt(CflatParser.Dowhile_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#dowhile_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDowhile_stmt(CflatParser.Dowhile_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(CflatParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(CflatParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stmt(CflatParser.Switch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stmt(CflatParser.Switch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#case_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCase_clauses(CflatParser.Case_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#case_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCase_clauses(CflatParser.Case_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause(CflatParser.Case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause(CflatParser.Case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(CflatParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(CflatParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_clause(CflatParser.Default_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_clause(CflatParser.Default_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#case_body}.
	 * @param ctx the parse tree
	 */
	void enterCase_body(CflatParser.Case_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#case_body}.
	 * @param ctx the parse tree
	 */
	void exitCase_body(CflatParser.Case_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#goto_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGoto_stmt(CflatParser.Goto_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#goto_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGoto_stmt(CflatParser.Goto_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(CflatParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(CflatParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(CflatParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(CflatParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(CflatParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(CflatParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CflatParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CflatParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#typeref}.
	 * @param ctx the parse tree
	 */
	void enterTyperef(CflatParser.TyperefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#typeref}.
	 * @param ctx the parse tree
	 */
	void exitTyperef(CflatParser.TyperefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#param_typerefs}.
	 * @param ctx the parse tree
	 */
	void enterParam_typerefs(CflatParser.Param_typerefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#param_typerefs}.
	 * @param ctx the parse tree
	 */
	void exitParam_typerefs(CflatParser.Param_typerefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#fixedparam_typerefs}.
	 * @param ctx the parse tree
	 */
	void enterFixedparam_typerefs(CflatParser.Fixedparam_typerefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#fixedparam_typerefs}.
	 * @param ctx the parse tree
	 */
	void exitFixedparam_typerefs(CflatParser.Fixedparam_typerefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#typeref_base}.
	 * @param ctx the parse tree
	 */
	void enterTyperef_base(CflatParser.Typeref_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#typeref_base}.
	 * @param ctx the parse tree
	 */
	void exitTyperef_base(CflatParser.Typeref_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(CflatParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(CflatParser.TypedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CflatParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CflatParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#expr10}.
	 * @param ctx the parse tree
	 */
	void enterExpr10(CflatParser.Expr10Context ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#expr10}.
	 * @param ctx the parse tree
	 */
	void exitExpr10(CflatParser.Expr10Context ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#expr9}.
	 * @param ctx the parse tree
	 */
	void enterExpr9(CflatParser.Expr9Context ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#expr9}.
	 * @param ctx the parse tree
	 */
	void exitExpr9(CflatParser.Expr9Context ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#expr8}.
	 * @param ctx the parse tree
	 */
	void enterExpr8(CflatParser.Expr8Context ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#expr8}.
	 * @param ctx the parse tree
	 */
	void exitExpr8(CflatParser.Expr8Context ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#expr7}.
	 * @param ctx the parse tree
	 */
	void enterExpr7(CflatParser.Expr7Context ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#expr7}.
	 * @param ctx the parse tree
	 */
	void exitExpr7(CflatParser.Expr7Context ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterExpr6(CflatParser.Expr6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitExpr6(CflatParser.Expr6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#expr5}.
	 * @param ctx the parse tree
	 */
	void enterExpr5(CflatParser.Expr5Context ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#expr5}.
	 * @param ctx the parse tree
	 */
	void exitExpr5(CflatParser.Expr5Context ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterExpr4(CflatParser.Expr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitExpr4(CflatParser.Expr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(CflatParser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(CflatParser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(CflatParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(CflatParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(CflatParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(CflatParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#opassign_op}.
	 * @param ctx the parse tree
	 */
	void enterOpassign_op(CflatParser.Opassign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#opassign_op}.
	 * @param ctx the parse tree
	 */
	void exitOpassign_op(CflatParser.Opassign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CflatParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CflatParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(CflatParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(CflatParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(CflatParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(CflatParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CflatParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CflatParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CflatParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CflatParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CflatParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CflatParser.PrimaryContext ctx);
}