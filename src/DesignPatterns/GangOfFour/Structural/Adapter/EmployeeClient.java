package DesignPatterns.GangOfFour.Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList(){

        List<Employee> employeeList = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("123", "John", "Wick", "Bob");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("Chewie", "Solo", "Han", "han@email.com");

        employeeList.add(new EmployeeAdapterLdap(employeeFromLdap));

        employeeList.add(employeeFromDB);

        return employeeList;
    }
}
