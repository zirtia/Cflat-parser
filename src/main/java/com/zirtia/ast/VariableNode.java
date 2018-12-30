package com.zirtia.ast;

import com.zirtia.entity.DefinedVariable;
import com.zirtia.entity.Entity;
import com.zirtia.type.Type;

public class VariableNode extends LHSNode {
    private String name;
    private Entity entity;

    public VariableNode(String name) {
        this.name = name;
    }

    public VariableNode(DefinedVariable var) {
        this.entity = var;
        this.name = var.name();
    }

    public String name() {
        return name;
    }

    public boolean isResolved() {
        return (entity != null);
    }

    public Entity entity() {
        if (entity == null) {
            throw new Error("VariableNode.entity == null");
        }
        return entity;
    }

    public void setEntity(Entity ent) {
        entity = ent;
    }

    public TypeNode typeNode() {
        return entity().typeNode();
    }

    public boolean isParameter() {
        return entity().isParameter();
    }

    protected Type origType() {
        return entity().type();
    }

    public <S,E> E accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
