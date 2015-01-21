package com.noahhuppert.roboscript.compiler.parser.models.variable;

import com.noahhuppert.roboscript.compiler.lexer.tokens.keywords.TypeKeywords;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/20/2015.
 */
public class Types {
    public static final VariableType<Integer> INTEGER = new VariableType<Integer>(TypeKeywords.INTEGER, Integer.class);
    public static final VariableType<Float> FLOAT = new VariableType<Float>(TypeKeywords.FLOAT, Float.class);
    public static final VariableType<Boolean> BOOLEAN = new VariableType<Boolean>(TypeKeywords.BOOLEAN, Boolean.class);
    public static final VariableType<Character> CHARACTER = new VariableType<Character>(TypeKeywords.CHARACTER, Character.class);
    public static final VariableType<String> STRING = new VariableType<String>(TypeKeywords.STRING, String.class);

    public static final List<VariableType> AS_LIST = Arrays.asList(new VariableType[]{
            INTEGER, FLOAT, BOOLEAN, CHARACTER, STRING
    });
}
