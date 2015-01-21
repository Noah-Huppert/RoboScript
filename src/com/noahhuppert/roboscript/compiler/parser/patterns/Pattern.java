package com.noahhuppert.roboscript.compiler.parser.patterns;

import com.noahhuppert.roboscript.compiler.lexer.tokens.TokenType;
import com.noahhuppert.roboscript.compiler.parser.Namespace;

/**
 * Created by Noah Huppert on 1/20/2015.
 */
public abstract class Pattern {
    private PatternType type;
    private PatternTemplate template;
    
    public Pattern(PatternType type, TokenType... template){
        this.type = type;
        this.template = new PatternTemplate(template);
    }
    
    /* Actions */
    public abstract void execute(Namespace namespace);
    @Override
    public String toString(){
        return getType() + "{" + getTemplate() + "}";
    }

    /* Getters */
    public PatternTemplate getTemplate() {
        return template;
    }

    public PatternType getType() {
        return type;
    }

    /* Setters */
    public void setTemplate(PatternTemplate template) {
        this.template = template;
    }

    public void setType(PatternType type) {
        this.type = type;
    }
}
