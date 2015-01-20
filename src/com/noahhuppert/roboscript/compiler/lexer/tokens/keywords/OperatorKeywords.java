package com.noahhuppert.roboscript.compiler.lexer.tokens.keywords;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/19/2015.
 */
public class OperatorKeywords {
    public static final String ADD = "+";
    public static final String SUBTRACT = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";

    public static final List<String> AS_LIST = Arrays.asList(new String[]{
            ADD, SUBTRACT, MULTIPLY, DIVIDE
    });
}
