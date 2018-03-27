//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************
package DesignPatterns.GangOfFour.factory;

/**
 * Created by rharris
 */
public enum CarType {

    Coupe(1, "Coupe"),
    Sedan(2, "Sedan"),
    Truck(3, "Truck");

    private int id;
    private String name;

    CarType(int id, String name) {

        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
