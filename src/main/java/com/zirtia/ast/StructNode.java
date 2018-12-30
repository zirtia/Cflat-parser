package com.zirtia.ast;

import com.zirtia.type.*;

import java.util.List;

public class StructNode extends CompositeTypeDefinition {
    public StructNode(TypeRef ref, String name, List<Slot> membs) {
        super(ref, name, membs);
    }

    public String kind() {
        return "struct";
    }

    public boolean isStruct() {
        return true;
    }

    // #@@range/definingType{
    public Type definingType() {
        return new StructType(name(), members());
    }
    // #@@}

    public <T> T accept(DeclarationVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
