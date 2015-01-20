package com.noahhuppert.roboscript.compiler.lexer.tokens.keywords;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/19/2015.
 */
public class AssignmentOperatorKeywords {
    public static final String EQUAL = "=";
    public static final String ADD_EQUAL = OperatorKeywords.ADD + EQUAL;
    public static final String SUBTRACT_EQUAL = OperatorKeywords.SUBTRACT + EQUAL;
    public static final String MULTIPLY_EQUAL = OperatorKeywords.MULTIPLY + EQUAL;
    public static final String DIVIDE_EQUAL = OperatorKeywords.DIVIDE + EQUAL;
    
    public static final List<String> AS_LIST = Arrays.asList(new String[]{
            EQUAL, ADD_EQUAL, SUBTRACT_EQUAL, MULTIPLY_EQUAL, DIVIDE_EQUAL
    });
}
