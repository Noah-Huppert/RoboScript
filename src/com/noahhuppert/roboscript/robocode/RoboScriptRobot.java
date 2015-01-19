package com.noahhuppert.roboscript.robocode;

import com.noahhuppert.roboscript.RoboScript;
import robocode.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noah Huppert on 1/18/2015.
 */
public class RoboScriptRobot extends AdvancedRobot {
    private List<RoboScript> roboScripts;
    
    public RoboScriptRobot(RoboScript... roboScripts){
        this.roboScripts = Arrays.asList(roboScripts);
    }
    
    //TODO Make RoboScripts execute on events
}
