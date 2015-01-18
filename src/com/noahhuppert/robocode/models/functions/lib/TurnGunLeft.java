package com.noahhuppert.robocode.models.functions.lib;

import robocode.Robot;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class TurnGunLeft extends LibFunction {
    public TurnGunLeft(){
        super("turnGunLeft");
    }

    @Override
    public void executeInRobocode(Robot robot) {
        super.executeInRobocode(robot);

        if(getArguments() != null && getArguments().get(0) != null){
            robot.turnGunLeft((Double) getArguments().get(0).getData());
        }
    }
}
