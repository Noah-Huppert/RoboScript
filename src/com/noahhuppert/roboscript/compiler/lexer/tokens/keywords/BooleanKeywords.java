package com.noahhuppert.roboscript.compiler.lexer.tokens.keywords;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/19/2015.
 */
public class BooleanKeywords {
    public static final String TRUE = "true";
    public static final String FALSE = "false";

    public static final List<String> AS_LIST = Arrays.asList(new String[]{
            TRUE, FALSE
    });
}
