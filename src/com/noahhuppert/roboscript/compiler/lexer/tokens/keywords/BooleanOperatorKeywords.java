package com.noahhuppert.roboscript.compiler.lexer.tokens.keywords;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/19/2015.
 */
public class BooleanOperatorKeywords {
    public static final String GREATER = ">";
    public static final String LESS = "<";
    public static final String EQUAL = AssignmentOperatorKeywords.EQUAL + AssignmentOperatorKeywords.EQUAL;

    public static final List<String> AS_LIST = Arrays.asList(new String[]{
            GREATER, LESS, EQUAL
    });
}
