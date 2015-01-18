package com.noahhuppert.robocode.models.functions;

import com.noahhuppert.robocode.models.Token;
import com.noahhuppert.robocode.models.TokenPosition;
import com.noahhuppert.robocode.models.TokenType;
import com.noahhuppert.robocode.models.variables.Variable;
import robocode.Robot;

import java.util.ArrayList;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class Function extends Token {
    private ArrayList<Variable> arguments;
    
    public Function(String id, TokenPosition tokenPosition, ArrayList<Variable> arguments){
        super(TokenType.FUNCTION_CALL, id, tokenPosition);
        if(arguments != null) {
            setArguments(arguments);
        } else{
            setArguments(new ArrayList<Variable>());
        }
    }
    
    /* Actions */
    public void executeInRobocode(Robot robot){};
    
    /* Getters */
    public ArrayList<Variable> getArguments() {
        return arguments;
    }

    /* Setters */
    public void setArguments(ArrayList<Variable> arguments) {
        this.arguments = arguments;
    }
}
