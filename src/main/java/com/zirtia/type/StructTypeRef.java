package com.zirtia.type;

public class StructTypeRef extends TypeRef {
    protected String name;

    public StructTypeRef(String name) {
        this.name = name;
    }

    public boolean isStruct() {
        return true;
    }

    public boolean equals(Object other) {
        if (!(other instanceof StructTypeRef)) return false;
        return name.equals(((StructTypeRef)other).name);
    }

    public String name() {
        return name;
    }

    public String toString() {
        return "struct " + name;
    }
}
