package com.noahhuppert.robocode;

import com.noahhuppert.robocode.models.Token;
import com.noahhuppert.robocode.models.TokenType;
import com.noahhuppert.robocode.models.functions.Function;
import com.noahhuppert.robocode.models.variables.VarDouble;

import java.util.ArrayList;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class Parser {
    public static ArrayList<Token> generateAST(ArrayList<ArrayList<Token>> tokens){
        ArrayList<Token> ASTTokens = new ArrayList<Token>();
        
        for(ArrayList<Token> line : tokens){
            Function function = null;
            
            for(Token token : line){
                if(token.getTokenType() == TokenType.FUNCTION_CALL){
                    if(function == null){
                        function = new Function(token.getId(), token.getTokenPosition(), null);
                    } else{
                        System.out.println("[ERROR] - Function call must be only function on line" + token.getTokenPosition());
                    }
                } else if(token.getTokenType() == TokenType.VARIABLE_REFERENCE){
                    if(function != null){
                        try{
                            double data = Double.parseDouble(token.getId());
                            VarDouble varDouble = new VarDouble(token.getId(), token.getTokenPosition(), data);
                            function.getArguments().add(varDouble);
                        } catch(NumberFormatException e){
                            System.out.println("[ERROR] - Expected variable type double but got " + token.getId() + " " + token.getTokenPosition() + " " + e);
                        }
                    } else{
                        System.out.println("[WARN] - A variable by itself does nothing" + token.getTokenPosition());
                    }
                } else{
                    System.out.println("[ERROR] - Unknown token type " + token.getTokenPosition());
                }
            }

            if(function != null){
                ASTTokens.add(function);
            }
        }
        
        return ASTTokens;
    }
}
