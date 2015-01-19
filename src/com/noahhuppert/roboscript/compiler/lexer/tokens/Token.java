package com.noahhuppert.roboscript.compiler.lexer.tokens;

import com.noahhuppert.roboscript.compiler.Location;

/**
 * Created by Noah Huppert on 1/18/2015.
 */
public class Token {
    private TokenType type;
    private String characters;
    private Location location;

    public Token(TokenType type, String characters, Location location) {
        this.type = type;
        this.characters = characters;
        this.location = location;
    }
    
    /* Getters */
    public TokenType getType() {
        return type;
    }

    public String getCharacters() {
        return characters;
    }

    public Location getLocation() {
        return location;
    }
    
    /* Setters */
    public void setType(TokenType type) {
        this.type = type;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
