package com.noahhuppert.roboscript.compiler.parser.models.variable;

/**
 * Created by Noah Huppert on 1/20/2015.
 */
public class Variable<DataType> {
    private final String identifier;
    private final VariableType type;
    private DataType data;

    public Variable(String identifier, VariableType type, DataType data) {
        this.identifier = identifier;
        this.type = type;
        this.data = data;
    }
    
    /* Getters */
    public String getIdentifier() {
        return identifier;
    }

    public VariableType getType() {
        return type;
    }

    public DataType getData() {
        return data;
    }
    
    /* Setters */
    public void setData(DataType data) {
        this.data = data;
    }
}
