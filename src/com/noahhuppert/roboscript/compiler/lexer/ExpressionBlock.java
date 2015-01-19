package com.noahhuppert.roboscript.compiler.lexer;

import java.util.List;

/**
 * Created by Noah Huppert on 1/18/2015.
 */
public class ExpressionBlock {
    private List<Expression> expressions;

    public ExpressionBlock(List<Expression> expressions) {
        this.expressions = expressions;
    }
    
    /* Getters */
    public List<Expression> getExpressions() {
        return expressions;
    }
    
    /* Setters */
    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }
}
