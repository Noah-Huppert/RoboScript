package com.noahhuppert.robocode.models.functions.lib;

import robocode.Robot;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class Fire extends LibFunction {
    public Fire(){
        super("fire");
    }

    @Override
    public void executeInRobocode(Robot robot) {
        super.executeInRobocode(robot);
        if(getArguments() != null && getArguments().get(0) != null){
            robot.fire((Double) getArguments().get(0).getData());
            robot.out.println("FIRE: " + (Double) getArguments().get(0).getData());
        }
    }
}
