package DesignPatterns.GangOfFour.Structural.Adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance){

        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getSurname();
    }

    @Override
    public String getLastName() {
        return instance.getMiddleName();
    }

    @Override
    public String getEmail() {
        return instance.getEmail();
    }

    @Override
    public String toString() {
        return "EmployeeAdapterLdap{" +
                "ID: " + instance.getCn() +
                '}';
    }


}
