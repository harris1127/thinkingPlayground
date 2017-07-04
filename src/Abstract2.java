//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************

/**
 * Created by rharris
 */
public class Abstract2 extends Abstract {

    String getTemp() {
        return "This is abstract setup";
    }

    public static void main(String[] args) {

        Abstract2 abstract2 = new Abstract2();
        System.out.println(abstract2.getTemp());
    }
}
