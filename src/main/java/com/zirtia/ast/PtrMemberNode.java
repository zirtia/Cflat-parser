package com.zirtia.ast;
import com.zirtia.type.Type;
import com.zirtia.type.CompositeType;
import com.zirtia.type.PointerType;
import com.zirtia.exception.*;

public class PtrMemberNode extends LHSNode {
    public ExprNode expr;
    public String member;

    public PtrMemberNode(ExprNode expr, String member) {
        this.expr = expr;
        this.member = member;
    }

    public CompositeType dereferedCompositeType() {
        try {
            PointerType pt = expr.type().getPointerType();
            return pt.baseType().getCompositeType();
        }
        catch (ClassCastException err) {
            throw new SemanticError(err.getMessage());
        }
    }

    public Type dereferedType() {
        try {
            PointerType pt = expr.type().getPointerType();
            return pt.baseType();
        }
        catch (ClassCastException err) {
            throw new SemanticError(err.getMessage());
        }
    }

    public ExprNode expr() {
        return expr;
    }

    public String member() {
        return member;
    }

    public long offset() {
        return dereferedCompositeType().memberOffset(member);
    }

    protected Type origType() {
        return dereferedCompositeType().memberType(member);
    }

    public Location location() {
        return expr.location();
    }

    public <S,E> E accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
