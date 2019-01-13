package com.zirtia.type;
import com.zirtia.ast.Location;
import com.zirtia.exception.*;
import java.util.*;

abstract public class NamedType extends Type {
    protected String name;
    protected Location location;

    public NamedType(String name, Location loc) {
        this.name = name;
        this.location = loc;
    }

    public String name() {
        return name;
    }

    public Location location() {
        return location;
    }
}
