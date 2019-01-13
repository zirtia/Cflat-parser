package com.zirtia.ast;
import org.antlr.v4.runtime.Token;

public class CflatToken {
    protected Token token;

    public CflatToken(Token token) {
        this.token = token;
    }

    public String toString() {
       return token.getText();
    }

    public int lineno() {
        return token.getLine();
    }
}
