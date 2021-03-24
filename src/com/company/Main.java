package com.company;

import com.company.builder.OldRobotBuilder;
import com.company.builder.Robot;
import com.company.builder.RobotBuilder;
import com.company.builder.RobotEngineer;

public class Main {

    public static void main(String[] args) {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Built");
        System.out.println(firstRobot);
    }

}