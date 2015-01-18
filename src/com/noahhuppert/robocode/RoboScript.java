package com.noahhuppert.robocode;

import com.noahhuppert.robocode.models.Token;
import com.noahhuppert.robocode.models.TokenType;
import com.noahhuppert.robocode.models.functions.Function;
import com.noahhuppert.robocode.models.functions.Functions;
import robocode.Robot;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Objects;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class RoboScript {
    private ArrayList<ArrayList<Token>> tokens;
    private ArrayList<Token> ASTTokens;
    private Hashtable<String, Function> libFunctions;

    public RoboScript(String location){
        tokens = Lexer.getTokens(location);
        ASTTokens = Parser.generateAST(tokens);

        libFunctions = new Functions().getLibFunctions();
    }
    
    public void execute(Robot robot){
        for(Token token : ASTTokens){
            if(token.getTokenType() == TokenType.FUNCTION_CALL){
                Function function = (Function) token;
                if(libFunctions.containsKey(function.getId())){
                    Function toCall = libFunctions.get(function.getId());
                    toCall.setArguments(function.getArguments());
                    toCall.executeInRobocode(robot);
                    
                    robot.out.println("Executing " +  toCall.getId() + "(" + toCall.getArguments().size() + ")");
                }
            }
        }
        
    }
}
