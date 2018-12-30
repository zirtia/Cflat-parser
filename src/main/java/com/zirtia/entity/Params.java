package com.zirtia.entity;

import com.zirtia.type.ParamTypeRefs;
import com.zirtia.type.TypeRef;

import java.util.ArrayList;
import java.util.List;

public class Params extends ParamSlots<Parameter> {
    public Params(List<Parameter> paramDescs) {
        super(paramDescs, false);
    }

    public List<Parameter> parameters() {
        return paramDescriptors;
    }

    public ParamTypeRefs parametersTypeRef() {
        List<TypeRef> typerefs = new ArrayList<TypeRef>();
        for (Parameter param : paramDescriptors) {
            typerefs.add(param.typeNode().typeRef());
        }
        return new ParamTypeRefs(typerefs, vararg);
    }

    public boolean equals(Object other) {
        return (other instanceof Params) && equals((Params)other);
    }

    public boolean equals(Params other) {
        return other.vararg == vararg
                && other.paramDescriptors.equals(paramDescriptors);
    }
}
