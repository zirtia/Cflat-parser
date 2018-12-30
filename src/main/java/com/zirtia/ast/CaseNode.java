package com.zirtia.ast;

import java.util.List;

public class CaseNode extends StmtNode {
    protected List<ExprNode> values;
    protected BlockNode body;

    public CaseNode(List<ExprNode> values, BlockNode body) {
        this.values = values;
        this.body = body;
    }

    public List<ExprNode> values() {
        return values;
    }

    public boolean isDefault() {
        return values.isEmpty();
    }

    public BlockNode body() {
        return body;
    }

    public <S,E> S accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
