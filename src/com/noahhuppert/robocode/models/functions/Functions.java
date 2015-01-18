package com.noahhuppert.robocode.models.functions;

import com.noahhuppert.robocode.models.functions.lib.*;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class Functions {
    private Hashtable<String, Function> libFunctions = new Hashtable<String, Function>();

    public Functions(){
        TurnGunRight turnGunRight = new TurnGunRight();
        TurnGunLeft turnGunLeft = new TurnGunLeft();
        Fire fire = new Fire();
        Ahead ahead = new Ahead();
        Back back = new Back();
        
        libFunctions.put(turnGunRight.getId(), turnGunRight);
        libFunctions.put(turnGunRight.getId(), turnGunLeft);
        libFunctions.put(fire.getId(), fire);
        libFunctions.put(ahead.getId(), ahead);
        libFunctions.put(back.getId(), back);
    }
    
    public Hashtable<String, Function> getLibFunctions(){
        return libFunctions;
    }
}
