package com.zirtia.entity;
import com.zirtia.ast.TypeNode;
import com.zirtia.type.*;

abstract public class Variable extends Entity {
    public Variable(boolean priv, TypeNode type, String name) {
        super(priv, type, name);
    }
}
