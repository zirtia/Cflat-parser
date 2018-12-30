package com.zirtia.ast;

abstract public class StmtNode extends Node {
    abstract public <S,E> S accept(ASTVisitor<S,E> visitor);
}
