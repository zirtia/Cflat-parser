package com.zirtia.ast;

public class GotoNode extends StmtNode {
    protected String target;

    public GotoNode(String target) {
        super();
        this.target = target;
    }

    public String target() {
        return target;
    }

    public <S,E> S accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
