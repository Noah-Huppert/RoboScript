package com.noahhuppert.roboscript.compiler.parser;

import com.noahhuppert.roboscript.compiler.lexer.tokens.Token;

import java.util.List;

/**
 * Created by Noah Huppert on 1/18/2015.
 */
public class Expression {
    private List<Token> tokens;
    
    public Expression(List<Token> tokens){
        this.tokens = tokens;
    }
    
    /* Actions */
    @Override
    public String toString(){
        String out = "";
        
        for(Token token : tokens){
            out += token + " ";
        }
        
        return out;
    }
    
    /* Getters */
    public List<Token> getTokens() {
        return tokens;
    }

    /* Setters */
    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }
}
