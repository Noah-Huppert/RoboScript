package com.noahhuppert.roboscript.compiler.parser.patterns.pattern;

import com.noahhuppert.roboscript.compiler.lexer.tokens.Token;
import com.noahhuppert.roboscript.compiler.lexer.tokens.TokenType;
import com.noahhuppert.roboscript.compiler.parser.Namespace;
import com.noahhuppert.roboscript.compiler.parser.models.variable.VariableType;
import com.noahhuppert.roboscript.compiler.parser.patterns.Pattern;
import com.noahhuppert.roboscript.compiler.parser.patterns.PatternTemplate;
import com.noahhuppert.roboscript.compiler.parser.patterns.PatternType;

/**
 * Created by Noah Huppert on 1/20/2015.
 */
public class PatternVariableCreate extends Pattern {
    private VariableType type;
    private String identifier;
    
    public PatternVariableCreate(Token typeToken, Token identifierToken){
        super(PatternType.VARIABLE_CREATE, TokenType.TYPE, TokenType.IDENTIFIER);
        //TODO find type from characters
        this.identifier = identifierToken.getCharacters();
    }

    @Override
    public void execute(Namespace namespace) {
        //TODO check to see that var is undefined
        //TODO add var to namespace
    }
}
