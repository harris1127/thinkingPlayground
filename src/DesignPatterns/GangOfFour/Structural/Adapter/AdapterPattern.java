package DesignPatterns.GangOfFour.Structural.Adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterPattern {

    /*
        Connecting new code to legacy code without having to change legacy code

        1. Client talks to an existing interface
        2. Client talks to an legacy app (Collections API - ex. Arrays -> List

        Makes things work together better
        Makes things work after they have been designed

        Adapter vs Bridge

        Bridge was designed up front
        Adapter was defined after code was written legacy code
     */

    public static void main(String[] args) {

        //Convert arrays to list - BASIC ADAPTER

        /*Integer[] arrayOfInts = new Integer[] {42, 55, 100};

        List<Integer> listOfIntegers = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);
        System.out.println(listOfIntegers);*/

        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }




}
