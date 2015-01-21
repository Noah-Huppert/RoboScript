package com.noahhuppert.roboscript;

import com.noahhuppert.roboscript.compiler.Compiler;

import java.io.PrintStream;

/**
 * Created by Noah Huppert on 1/18/2015.
 */
public class RoboScript {
    private PrintStream out;
    private Compiler compiler;
    
    public RoboScript(String scriptPath, PrintStream out){
        this.out = out;
        
        compiler = new Compiler(scriptPath, getOut());
    }
    
    /* Actions */
    public void compile(){
        getCompiler().compile();
    }
    
    /* Getters */
    public PrintStream getOut() {
        return out;
    }

    public Compiler getCompiler() {
        return compiler;
    }

    /* Setters */
    public void setOut(PrintStream out) {
        this.out = out;
    }

    public void setCompiler(Compiler compiler) {
        this.compiler = compiler;
    }
}
