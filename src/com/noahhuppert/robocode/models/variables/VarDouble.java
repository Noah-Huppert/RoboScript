package com.noahhuppert.robocode.models.variables;

import com.noahhuppert.robocode.models.TokenPosition;
import com.noahhuppert.robocode.models.TokenType;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class VarDouble extends Variable<java.lang.Double>{
    public VarDouble(String id, TokenPosition tokenPosition, double data) {
        super(id, tokenPosition, VariableType.DOUBLE, data);
    }
}
