package com.zirtia;

import com.zirtia.analyzer.*;
import com.zirtia.ast.AST;
import com.zirtia.ast.Declarations;
import com.zirtia.exception.CompileException;
import com.zirtia.exception.FileException;
import com.zirtia.exception.SemanticException;
import com.zirtia.parser.CflatLexer;
import com.zirtia.parser.CflatParser;
import com.zirtia.type.TypeTable;
import com.zirtia.utils.ErrorHandler;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Compiler {

    private final ErrorHandler errorHandler = new ErrorHandler("c flat");

    static public AST parseFile(File file, LibraryLoader loader) throws FileException {
        return newFileParser(file.getPath(),file, loader).parse();
    }

    static public Declarations parseDeclFile(File file, LibraryLoader loader) throws FileException {
        return newFileParser(file.getPath(),file, loader).parseDecls();
    }

    static final public String SOURCE_ENCODING = "UTF-8";

    static public CflatParser newFileParser(String name,File file, LibraryLoader loader) throws FileException {
        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(file), SOURCE_ENCODING));
            CharStream input = CharStreams.fromReader(r);
            CflatLexer lexer = new CflatLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            return new CflatParser(name,tokens, loader);
        }
        catch (FileNotFoundException ex) {
            throw new FileException(ex.getMessage());
        }
        catch (UnsupportedEncodingException ex) {
            throw new Error("UTF-8 is not supported??: " + ex.getMessage());
        } catch (IOException e) {
            throw new Error("IOException");
        }
    }

    public AST compile(String srcPath,LibraryLoader libraryLoader) throws CompileException {
        AST ast = Compiler.parseFile(new File(srcPath), libraryLoader);
        AST sem = semanticAnalyze(ast, TypeTable.ilp32());
        return sem;
    }

    public AST semanticAnalyze(AST ast, TypeTable types) throws SemanticException {
        new LocalResolver(errorHandler).resolve(ast);
        new TypeResolver(types, errorHandler).resolve(ast);
        types.semanticCheck(errorHandler);
        new DereferenceChecker(types, errorHandler).check(ast);
        new TypeChecker(types, errorHandler).check(ast);
        return ast;
    }

    static public void main(String[] args) throws CompileException , FileException {
        List<String> libs = new ArrayList<>();
        libs.add("D:");
        AST ast = new Compiler().compile("D:\\inc.cb",new LibraryLoader(libs));
        System.out.println(ast);
    }

}
