package com.zirtia.ast;
import org.antlr.v4.runtime.Token;

import java.util.*;

public class Location {
    protected String sourceName;
    protected CflatToken token;

    public Location(String sourceName, Token token) {
        this(sourceName, new CflatToken(token));
    }

    public Location(String sourceName, CflatToken token) {
        this.sourceName = sourceName;
        this.token = token;
    }

    public String sourceName() {
        return sourceName;
    }

    public CflatToken token() {
        return token;
    }

    public int lineno() {
        return token.lineno();
    }

    public String toString() {
        return sourceName + ":" + token.lineno();
    }
}
