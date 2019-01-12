package com.zirtia;

import com.zirtia.analyzer.LibraryLoader;
import com.zirtia.analyzer.Parser;
import com.zirtia.ast.AST;
import com.zirtia.ast.ExprNode;
import com.zirtia.exception.FileException;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileException, IOException {
        List<String> libs = new ArrayList<>();
        libs.add("D:");
        AST ast = Parser.parseFile(new File("D:\\inc.cb"),new LibraryLoader(libs));
        System.out.println(ast);
    }

}
