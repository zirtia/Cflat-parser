package com.zirtia.entity;
import com.zirtia.ast.TypeNode;
import java.util.List;

public class UndefinedFunction extends Function {
    protected Params params;

    public UndefinedFunction(TypeNode t, String name, Params params) {
        super(false, t, name);
        this.params = params;
    }

    public List<Parameter> parameters() {
        return params.parameters();
    }

    public boolean isDefined() {
        return false;
    }



    public <T> T accept(EntityVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
