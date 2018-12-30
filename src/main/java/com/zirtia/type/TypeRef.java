package com.zirtia.type;

public abstract class TypeRef {

    public int hashCode() {
        return toString().hashCode();
    }
}
