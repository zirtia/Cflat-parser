package com.zirtia.ast;

public class ExprStmtNode extends StmtNode {
    protected ExprNode expr;

    public ExprStmtNode(ExprNode expr) {
        this.expr = expr;
    }

    public ExprNode expr() {
        return expr;
    }

    public void setExpr(ExprNode expr) {
        this.expr = expr;
    }

    public <S,E> S accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
