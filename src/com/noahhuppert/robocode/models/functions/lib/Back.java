package com.noahhuppert.robocode.models.functions.lib;

import robocode.Robot;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class Back extends LibFunction {
    public Back(){
        super("back");
    }

    @Override
    public void executeInRobocode(Robot robot) {
        super.executeInRobocode(robot);
        if(getArguments() != null && getArguments().get(0) != null){
            robot.back((Double) getArguments().get(0).getData());
        }
    }
}
