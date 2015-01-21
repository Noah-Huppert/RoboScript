package com.noahhuppert.roboscript.compiler.parser;

import com.noahhuppert.roboscript.compiler.parser.models.variable.Variable;

import java.util.List;

/**
 * Created by Noah Huppert on 1/20/2015.
 */
public class Namespace {
    private List<Variable> variables;

    public Namespace(List<Variable> variables) {
        this.variables = variables;
    }
    
    /* Getters */
    public List<Variable> getVariables() {
        return variables;
    }

    /* Setters */
    public void setVariables(List<Variable> variables) {
        this.variables = variables;
    }
}
