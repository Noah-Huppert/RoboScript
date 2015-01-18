package com.noahhuppert.robocode.models;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class TokenPosition {
    private int line;
    private int column;

    public TokenPosition(int line, int column) {
        setLine(line);
        setColumn(column);
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
    
    /* Setters */
    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
