//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************
package DesignPatterns.GangOfFour.strategy;

import java.util.logging.Logger;

/**
 * Created by rharris
 */
public class Main {

    public static void main(String[] args) {

        final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));

        System.out.println("Object ahead");

        RobotStrategy robot = new RobotStrategy(new RocketStrategy());
        robot.execute();


        System.out.println("Monster ahead");

        robot.changeWeapons(new LaserStrategy());
        robot.execute();


    }
}
