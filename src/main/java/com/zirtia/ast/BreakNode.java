package com.zirtia.ast;

public class BreakNode extends StmtNode {
    public <S,E> S accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
