package com.zirtia.ast;

public class ContinueNode extends StmtNode {
    public ContinueNode(Location loc) {
        super(loc);
    }


    public <S,E> S accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
