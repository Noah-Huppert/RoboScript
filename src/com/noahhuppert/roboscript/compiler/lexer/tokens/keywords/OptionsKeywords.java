package com.noahhuppert.roboscript.compiler.lexer.tokens.keywords;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/19/2015.
 */
public class OptionsKeywords {
    public static final String START = "(";
    public static final String END = ")";
    public static final String DELIMITER = ",";

    public static final List<String> AS_LIST = Arrays.asList(new String[]{
            START, END, DELIMITER
    });
}
