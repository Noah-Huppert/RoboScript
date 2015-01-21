package com.noahhuppert.roboscript;

/**
 * Created by Noah Huppert on 1/19/2015.
 */
public class Test {
    public static void main(String args[]){
        RoboScript roboScript = new RoboScript("src/com/noahhuppert/roboscript/test_script.rs", System.out);
        roboScript.compile();
    }
}
