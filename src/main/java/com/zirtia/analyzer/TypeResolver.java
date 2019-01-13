package com.zirtia.analyzer;
import com.zirtia.ast.*;
import com.zirtia.entity.*;
import com.zirtia.type.*;
import com.zirtia.utils.ErrorHandler;
import com.zirtia.exception.*;
import java.util.*;

public class TypeResolver extends Visitor
        implements EntityVisitor<Void>, DeclarationVisitor<Void> {

    private final TypeTable typeTable;
    private final ErrorHandler errorHandler;

    public TypeResolver(TypeTable typeTable, ErrorHandler errorHandler) {
        this.typeTable = typeTable;
        this.errorHandler = errorHandler;
    }

    public void resolve(AST ast) {
        defineTypes(ast.types());
        for (TypeDefinition t : ast.types()) {
            t.accept(this);
        }
        for (Entity e : ast.entities()) {
            e.accept(this);
        }
    }

    private void defineTypes(List<TypeDefinition> deftypes) {
        for (TypeDefinition def : deftypes) {
            if (typeTable.isDefined(def.typeRef())) {
                error(def, "duplicated type definition: " + def.typeRef());
            }
            else {
                typeTable.put(def.typeRef(), def.definingType());
            }
        }
    }

    private void bindType(TypeNode n) {
        if (n.isResolved()) return;
        n.setType(typeTable.get(n.typeRef()));
    }


    public Void visit(StructNode struct) {
        resolveCompositeType(struct);
        return null;
    }

    public Void visit(UnionNode union) {
        resolveCompositeType(union);
        return null;
    }

    public void resolveCompositeType(CompositeTypeDefinition def) {
        CompositeType ct = (CompositeType)typeTable.get(def.typeNode().typeRef());
        if (ct == null) {
            throw new Error("cannot intern struct/union: " + def.name());
        }
        for (Slot s : ct.members()) {
            bindType(s.typeNode());
        }
    }

    public Void visit(TypedefNode typedef) {
        bindType(typedef.typeNode());
        bindType(typedef.realTypeNode());
        return null;
    }


    public Void visit(DefinedVariable var) {
        bindType(var.typeNode());
        if (var.hasInitializer()) {
            visitExpr(var.initializer());
        }
        return null;
    }

    public Void visit(UndefinedVariable var) {
        bindType(var.typeNode());
        return null;
    }

    public Void visit(Constant c) {
        bindType(c.typeNode());
        visitExpr(c.value());
        return null;
    }

    public Void visit(DefinedFunction func) {
        resolveFunctionHeader(func);
        visitStmt(func.body());
        return null;
    }

    public Void visit(UndefinedFunction func) {
        resolveFunctionHeader(func);
        return null;
    }

    private void resolveFunctionHeader(Function func) {
        bindType(func.typeNode());
        for (Parameter param : func.parameters()) {
            // arrays must be converted to pointers in a function parameter.
            Type t = typeTable.getParamType(param.typeNode().typeRef());
            param.typeNode().setType(t);
        }
    }

    public Void visit(BlockNode node) {
        for (DefinedVariable var : node.variables()) {
            var.accept(this);
        }
        visitStmts(node.stmts());
        return null;
    }

    public Void visit(CastNode node) {
        bindType(node.typeNode());
        super.visit(node);
        return null;
    }

    public Void visit(SizeofExprNode node) {
        bindType(node.typeNode());
        super.visit(node);
        return null;
    }

    public Void visit(SizeofTypeNode node) {
        bindType(node.operandTypeNode());
        bindType(node.typeNode());
        super.visit(node);
        return null;
    }

    public Void visit(IntegerLiteralNode node) {
        bindType(node.typeNode());
        return null;
    }

    public Void visit(StringLiteralNode node) {
        bindType(node.typeNode());
        return null;
    }

    private void error(Node node, String msg) {
        errorHandler.error(node.location(), msg);
    }
}
