package com.noahhuppert.roboscript.compiler;

import com.noahhuppert.roboscript.compiler.lexer.Lexer;
import com.noahhuppert.roboscript.compiler.lexer.tokens.Token;
import com.noahhuppert.roboscript.compiler.parser.Expression;
import com.noahhuppert.roboscript.compiler.parser.Parser;
import com.noahhuppert.roboscript.compiler.parser.patterns.Pattern;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by Noah Huppert on 1/20/2015.
 */
public class Compiler {
    private String scriptPath;
    private PrintStream out;
    private Lexer lexer;
    private Parser parser;

    public Compiler(String scriptPath, PrintStream out){
        this.scriptPath = scriptPath;
        this.out = out;

        lexer = new Lexer();
        parser = new Parser();
    }
    
    /* Actions */
    public void compile(){
        List<Token> tokens = getLexer().getFileTokens(getScriptPath(), getOut());
        
        List<Expression> expressions = getParser().createExpressions(tokens, getOut());
        List<Pattern> patterns = getParser().createPatterns(expressions, getOut());
        
        //TODO Implement patterns
        
        for(Pattern pattern : patterns){
            getOut().println(pattern);
        }
    }

    /* Getters */
    public PrintStream getOut() {
        return out;
    }

    public String getScriptPath() {
        return scriptPath;
    }

    public Lexer getLexer() {
        return lexer;
    }

    public Parser getParser() {
        return parser;
    }

    /* Setters */
    public void setOut(PrintStream out) {
        this.out = out;
    }

    public void setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
    }

    public void setLexer(Lexer lexer) {
        this.lexer = lexer;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }
}
