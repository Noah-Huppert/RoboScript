package com.noahhuppert.robocode.models;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class Token {
    private TokenType tokenType;
    private String id;
    private TokenPosition tokenPosition;
    
    public Token(TokenType tokenType, String id, TokenPosition tokenPosition){
        setTokenType(tokenType);
        setId(id);
        setTokenPosition(tokenPosition);
    }
    
    /* Getters */
    public TokenType getTokenType() {
        return tokenType;
    }

    public String getId() {
        return id;
    }

    public TokenPosition getTokenPosition() {
        return tokenPosition;
    }

    /* Setters */
    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTokenPosition(TokenPosition tokenPosition) {
        this.tokenPosition = tokenPosition;
    }
}
