package com.noahhuppert.robocode;

import robocode.Robocode;
import robocode.Robot;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class TESTROBOT extends Robot {
    RoboScript testScript = new RoboScript("C:/Users/noahh_000/Noah/Programing/Java/RoboScript/build/classes/main/com/noahhuppert/robocode/testScript.txt");

    @Override
    public void run() {
        super.run();
        
        while(true) {
            testScript.execute(this);
        }
    }
}
