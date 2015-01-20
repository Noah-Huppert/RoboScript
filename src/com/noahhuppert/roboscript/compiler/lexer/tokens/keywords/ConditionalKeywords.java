package com.noahhuppert.roboscript.compiler.lexer.tokens.keywords;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/19/2015.
 */
public class ConditionalKeywords {
    public static final String IF = "if";
    public static final String ELSE = "else";
    public static final String ELSE_IF = ELSE + " " + IF;

    public static final List<String> AS_LIST = Arrays.asList(new String[]{
            IF, ELSE, ELSE_IF
    });
}
