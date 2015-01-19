package com.noahhuppert.roboscript.compiler.lexer;

/**
 * Created by Noah Huppert on 1/18/2015.
 */
public class Lexer {
    private final String data;
    
    public Lexer(String data){
        this.data = data;
    }

    /* Getters */
    private String getData() {
        return data;
    }
}
