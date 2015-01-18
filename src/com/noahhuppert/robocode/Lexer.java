package com.noahhuppert.robocode;

import com.noahhuppert.robocode.models.Token;
import com.noahhuppert.robocode.models.TokenPosition;
import com.noahhuppert.robocode.models.TokenType;
import com.noahhuppert.robocode.models.variables.VarDouble;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class Lexer {
    public static ArrayList<ArrayList<Token>> getTokens(String filePath){
        try{
            ArrayList<ArrayList<Token>> tokens = new ArrayList<ArrayList<Token>>();
            ArrayList<String> lines = FileLoader.getLines(filePath);
            
            int lineNumber = 0;
            
            for(String line : lines){
                tokens.add(lineNumber, new ArrayList<Token>());
                List<String> lineTokens = Arrays.asList(line.split(" "));

                int lineIndex = 0;
                for(String id : lineTokens){
                    int columnNumber = getIdColumn(lineTokens, lineIndex);
                    TokenPosition tokenPosition = new TokenPosition(lineNumber, columnNumber);
                    
                    try{
                        double data = Double.parseDouble(id);
                        
                        Token token = new Token(TokenType.VARIABLE_REFERENCE, id, tokenPosition);
                        tokens.get(lineNumber).add(token);
                    } catch(NumberFormatException e){
                        Token token = new Token(TokenType.FUNCTION_CALL, id, tokenPosition);
                        tokens.get(lineNumber).add(token);
                    }
                    
                    lineIndex ++;
                }
                
                lineNumber++;
            }
            
            return tokens;
        } catch(IOException e){
            System.out.println("[ERROR] Lexer.getTokens() - Failed to load file lines, " + e);
            return null;
        }
    }
    
    public static int getIdColumn(List<String> line, int lineIndex){
        int column = 0;
        for(int i = 0; i < lineIndex; i++){
            column += line.get(i).length();
        }
        
        column++;
        return column;
    }
}
