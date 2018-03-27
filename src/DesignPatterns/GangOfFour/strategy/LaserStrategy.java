//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************
package DesignPatterns.GangOfFour.strategy;

import java.util.logging.Logger;

/**
 * Created by rharris
 */
public class LaserStrategy implements StrategyInterface {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LaserStrategy.class));

    @Override
    public void execute() {
        System.out.println("Lasers are engaged!");
    }
}
