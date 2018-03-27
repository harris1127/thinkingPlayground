//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************
package DesignPatterns.GangOfFour.strategy;

import java.util.logging.Logger;

/**
 * Created by rharris
 */
public class RocketStrategy implements StrategyInterface {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(RocketStrategy.class));

    @Override
    public void execute() {

        System.out.println("Rockets are engaged!");

    }
}
