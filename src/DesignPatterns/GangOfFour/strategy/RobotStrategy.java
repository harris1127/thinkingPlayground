//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************
package DesignPatterns.GangOfFour.strategy;

/**
 * Created by rharris
 */
public class RobotStrategy {

    /**
     * Robot strategy uses different strategy's from the strategy interface to perform an action
     */

    private StrategyInterface robotStrategy;

    public RobotStrategy(StrategyInterface robotStrategy) {

        this.robotStrategy = robotStrategy;
    }

    public void changeWeapons(StrategyInterface robotStrategy) {

        this.robotStrategy = robotStrategy;
    }

    public void execute() {

        robotStrategy.execute();
    }
}
