package com.zirtia.ast;

public class ForNode extends StmtNode {
    protected StmtNode init;
    protected ExprNode cond;
    protected StmtNode incr;
    protected StmtNode body;

    public ForNode(ExprNode init, ExprNode cond, ExprNode incr, StmtNode body) {
        this.init = new ExprStmtNode(init);
        this.cond = cond;
        this.incr = new ExprStmtNode(incr);
        this.body = body;
    }

    public StmtNode init() {
        return init;
    }

    public ExprNode cond() {
        return cond;
    }

    public StmtNode incr() {
        return incr;
    }

    public StmtNode body() {
        return body;
    }

    public <S,E> S accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
