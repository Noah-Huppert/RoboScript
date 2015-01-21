package com.noahhuppert.roboscript.compiler.parser.patterns;

import com.noahhuppert.roboscript.compiler.lexer.tokens.Token;
import com.noahhuppert.roboscript.compiler.lexer.tokens.TokenType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Noah Huppert on 1/20/2015.
 */
public class PatternTemplate {
    private List<TokenType> tokens;
    
    public PatternTemplate(TokenType... template){
        tokens = new ArrayList<TokenType>();
        
        for(TokenType token : template){
            tokens.add(token);
        }
    }
    
    /* Actions */
    @Override
    public String toString(){
        String out = "";
        
        for(TokenType token : getTokens()){
            out += token + " ";
        }
        
        return out;
    }
    
    public boolean isMatch(List<TokenType> toMatch){
        for(int i = 0; i < toMatch.size(); i++){
            if(tokens.get(i) == toMatch.get(i)) {
                continue;
            } else{
                return false;
            }
        }
        
        return false;
    }
    
    /* Getters */
    public List<TokenType> getTokens() {
        return tokens;
    }

    /* Setters */
    public void setTokens(List<TokenType> tokens) {
        this.tokens = tokens;
    }
}
