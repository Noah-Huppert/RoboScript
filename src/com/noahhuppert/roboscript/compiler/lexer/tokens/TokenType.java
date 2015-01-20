package com.noahhuppert.roboscript.compiler.lexer.tokens;

/**
 * Created by Noah Huppert on 1/18/2015.
 */
public enum TokenType {
    IDENTIFIER,
    TYPE,
    LITERAL,
    LITERAL_DELIMITER,
    OPERATOR,
    ASSIGNMENT_OPERATOR,
    BOOLEAN_OPERATOR,
    CONDITIONAL,
    RESERVED_IDENTIFIER,
    OPTIONS_DELIMITER,
    OPTIONS_START,
    OPTIONS_END,
    EXPRESSION_END,
    EXPRESSION_BLOCK_START,
    EXPRESSION_BLOCK_END
}
