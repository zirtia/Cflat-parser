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

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CflatParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CflatVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CflatParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(CflatParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#declaration_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_file(CflatParser.Declaration_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#import_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmts(CflatParser.Import_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(CflatParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#top_defs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_defs(CflatParser.Top_defsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#defvars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvars(CflatParser.DefvarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#defconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefconst(CflatParser.DefconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#defun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefun(CflatParser.DefunContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage(CflatParser.StorageContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CflatParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#fixedparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedparams(CflatParser.FixedparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CflatParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CflatParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#defvar_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar_list(CflatParser.Defvar_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#defstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefstruct(CflatParser.DefstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#defunion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefunion(CflatParser.DefunionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#member_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_list(CflatParser.Member_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#slot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlot(CflatParser.SlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#funcdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdecl(CflatParser.FuncdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(CflatParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(CflatParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CflatParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#labeled_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_stmt(CflatParser.Labeled_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(CflatParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(CflatParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#dowhile_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile_stmt(CflatParser.Dowhile_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(CflatParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#switch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stmt(CflatParser.Switch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#case_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_clauses(CflatParser.Case_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_clause(CflatParser.Case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(CflatParser.CasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_clause(CflatParser.Default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#case_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_body(CflatParser.Case_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#goto_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_stmt(CflatParser.Goto_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(CflatParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(CflatParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(CflatParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CflatParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#typeref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyperef(CflatParser.TyperefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#param_typerefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_typerefs(CflatParser.Param_typerefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#fixedparam_typerefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedparam_typerefs(CflatParser.Fixedparam_typerefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#typeref_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyperef_base(CflatParser.Typeref_baseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#typedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(CflatParser.TypedefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CflatParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#expr10}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr10(CflatParser.Expr10Context ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#expr9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr9(CflatParser.Expr9Context ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#expr8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr8(CflatParser.Expr8Context ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#expr7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr7(CflatParser.Expr7Context ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr6(CflatParser.Expr6Context ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr5(CflatParser.Expr5Context ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr4(CflatParser.Expr4Context ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(CflatParser.Expr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(CflatParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(CflatParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#opassign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpassign_op(CflatParser.Opassign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CflatParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(CflatParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(CflatParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CflatParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CflatParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CflatParser.PrimaryContext ctx);
}