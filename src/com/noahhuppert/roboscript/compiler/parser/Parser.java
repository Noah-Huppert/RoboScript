package com.noahhuppert.roboscript.compiler.parser;

import com.noahhuppert.roboscript.compiler.lexer.tokens.Token;
import com.noahhuppert.roboscript.compiler.lexer.tokens.TokenType;
import com.noahhuppert.roboscript.compiler.parser.patterns.Pattern;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Noah Huppert on 1/20/2015.
 */
public class Parser {
    /* Actions */
    public List<Expression> createExpressions(List<Token> tokens, PrintStream out){
        List<Expression> expressions = new ArrayList<Expression>();
        
        Expression currentExpression = new Expression(new ArrayList<Token>());
        
        for(int i = 0; i < tokens.size(); i++){
            Token token = tokens.get(i);
            
            if(token.getType() == TokenType.EXPRESSION_END || 
                    token.getType() == TokenType.EXPRESSION_BLOCK_START ||
                    token.getType() == TokenType.EXPRESSION_BLOCK_END){
                
                currentExpression.getTokens().add(token);
                expressions.add(currentExpression);
                
                currentExpression = new Expression(new ArrayList<Token>());
            } else{
                currentExpression.getTokens().add(token);
            }
        }
        
        return expressions;
    }
    
    public List<Pattern> createPatterns(List<Expression> expressions, PrintStream out){
        List<Pattern> patterns = new ArrayList<Pattern>();
        
        
        
        return patterns;
    }
}
