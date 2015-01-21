package com.noahhuppert.roboscript.compiler;

/**
 * Created by Noah Huppert on 1/18/2015.
 */
public class Location {
    private final int line;
    private final int column;
    
    public Location(int line, int column){
        this.line = line;
        this.column = column;
    }
    
    /* Actions */
    @Override
    public String toString() {
        return "(" + getLine() + ", " + getColumn() + ")";
    }

    /* Getters */
    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
