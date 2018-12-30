package com.zirtia;

import com.zirtia.analyzer.LibraryLoader;
import com.zirtia.analyzer.Parser;
import com.zirtia.ast.AST;
import com.zirtia.exception.FileException;
import com.zirtia.parser.CflatParser;

import java.io.File;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileException {
        AST ast = Parser.parseFile(new File("D:\\inc.cb"),new LibraryLoader());
    }
}
