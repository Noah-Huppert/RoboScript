package com.noahhuppert.robocode.models.variables;

import com.noahhuppert.robocode.models.Token;
import com.noahhuppert.robocode.models.TokenPosition;
import com.noahhuppert.robocode.models.TokenType;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class Variable<DataType> extends Token {
    private VariableType variableType;
    private DataType data;

    public Variable(String id, TokenPosition tokenPosition, VariableType variableType, DataType data) {
        super(TokenType.VARIABLE_REFERENCE, id, tokenPosition);
        setVariableType(variableType);
        setData(data);
    }

    /* Getters */
    public VariableType getVariableType() {
        return variableType;
    }

    public DataType getData() {
        return data;
    }
    
    /* Setters */
    public void setVariableType(VariableType variableType) {
        this.variableType = variableType;
    }

    public void setData(DataType data) {
        this.data = data;
    }
}
