package com.zirtia.ast;

public class BreakNode extends StmtNode {
    public BreakNode(Location loc) {
        super(loc);
    }



    public <S,E> S accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
