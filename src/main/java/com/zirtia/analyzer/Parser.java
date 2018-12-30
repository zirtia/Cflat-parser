package com.zirtia.analyzer;

import com.zirtia.ast.AST;
import com.zirtia.ast.Declarations;
import com.zirtia.exception.FileException;
import com.zirtia.parser.CflatLexer;
import com.zirtia.parser.CflatParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

public class Parser {
    static public AST parseFile(File file, LibraryLoader loader) throws FileException {
        return newFileParser(file, loader).parse();
    }

    static public Declarations parseDeclFile(File file, LibraryLoader loader) throws FileException {
        return newFileParser(file, loader).parseDecls();
    }

    static final public String SOURCE_ENCODING = "UTF-8";

    static public CflatParser newFileParser(File file, LibraryLoader loader) throws FileException {
        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(file), SOURCE_ENCODING));
            CharStream input = CharStreams.fromReader(r);
            CflatLexer lexer = new CflatLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            return new CflatParser(tokens, loader);
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
}
