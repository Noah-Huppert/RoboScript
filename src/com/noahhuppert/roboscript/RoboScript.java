package com.noahhuppert.roboscript;

import com.noahhuppert.roboscript.compiler.lexer.Lexer;
import com.noahhuppert.roboscript.compiler.lexer.tokens.Token;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by Noah Huppert on 1/18/2015.
 */
public class RoboScript {
    private PrintStream out;
    private Lexer lexer;
    
    public RoboScript(PrintStream out){
        this.out = out;
        
        lexer = new Lexer();
        List<Token> tokens = lexer.getFileTokens("src/com/noahhuppert/roboscript/test_script.rs", getOut());
        
        for(Token token: tokens){
            out.println(token.getType() + " " + token.getCharacters() + "\n");
        }
    }
    
    /* Getters */
    public PrintStream getOut() {
        return out;
    }

    /* Setters */
    public void setOut(PrintStream out) {
        this.out = out;
    }
}
