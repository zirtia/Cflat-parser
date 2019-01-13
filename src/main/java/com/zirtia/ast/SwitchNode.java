package com.zirtia.ast;
import java.util.List;

public class SwitchNode extends StmtNode {
    protected ExprNode cond;
    protected List<CaseNode> cases;

    public SwitchNode(Location loc, ExprNode cond, List<CaseNode> cases) {
        super(loc);
        this.cond = cond;
        this.cases = cases;
    }

    public ExprNode cond() {
        return cond;
    }

    public List<CaseNode> cases() {
        return cases;
    }

    public <S,E> S accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
