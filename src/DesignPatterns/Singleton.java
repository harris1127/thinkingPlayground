//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************
package DesignPatterns;

/**
 * Created by rharris
 */
public class Singleton {

    /*
        Best example is getter and setter for singleton
        Have a static reference then check for null if its not null return the current reference variable

     */

    private static Singleton instance = null;

    public Singleton() {

    }

    /*
        Rather than doing check if myInstance is assigned to null or not,
        \we assign it initially to a new instance.
        So, whenever the class is loaded by the JVM, the object will be created.
     */

    public static Singleton getInstance() {

        return instance;

    }
}

class Main {

    public static void main(String[] args) {

        Singleton curInstance = Singleton.getInstance();

        System.out.println(curInstance);

    }
}
