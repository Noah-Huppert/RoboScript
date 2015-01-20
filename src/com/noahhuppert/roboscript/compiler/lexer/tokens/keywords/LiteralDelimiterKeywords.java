package com.noahhuppert.roboscript.compiler.lexer.tokens.keywords;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/19/2015.
 */
public class LiteralDelimiterKeywords {
    public static final String CHARACTER = "'";
    public static final String STRING = "\"";

    public static final List<String> AS_LIST = Arrays.asList(new String[]{
            CHARACTER, STRING
    });
}
