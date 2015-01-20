package com.noahhuppert.roboscript.compiler.lexer.tokens.keywords;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/19/2015.
 */
public class TypeKeywords {
    public static final String VOID = "void";
    public static final String INTEGER = "int";
    public static final String FLOAT = "float";
    public static final String BOOLEAN = "boolean";
    public static final String CHARACTER = "char";
    public static final String STRING = "string";

    public static final List<String> AS_LIST = Arrays.asList(new String[]{
        VOID, INTEGER, FLOAT, BOOLEAN, CHARACTER, STRING
    });
}
