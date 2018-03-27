//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************
package DesignPatterns.GangOfFour.factory;

/**
 * Created by rharris
 */
public interface Car {

    CarFactory manufactureCar(CarType carType);
}
