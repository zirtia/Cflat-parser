package com.zirtia.ast;

public class ReturnNode extends StmtNode {
    protected ExprNode expr;

    public ReturnNode(ExprNode expr) {
        this.expr = expr;
    }

    public ExprNode expr() {
        return this.expr;
    }

    public void setExpr(ExprNode expr) {
        this.expr = expr;
    }

    public <S,E> S accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
