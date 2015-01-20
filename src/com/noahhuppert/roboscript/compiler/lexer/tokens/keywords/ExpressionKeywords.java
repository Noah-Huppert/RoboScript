package com.noahhuppert.roboscript.compiler.lexer.tokens.keywords;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/19/2015.
 */
public class ExpressionKeywords {
    public static final String END = ";";
    public static final String BLOCK_START = "{";
    public static final String BLOCK_END = "}";

    public static final List<String> AS_LIST = Arrays.asList(new String[]{
            "" + END, "" + BLOCK_START, "" + BLOCK_END
    });
}
