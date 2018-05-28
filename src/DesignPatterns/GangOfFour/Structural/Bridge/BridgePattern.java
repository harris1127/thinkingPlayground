package DesignPatterns.GangOfFour.Structural.Bridge;

public class BridgePattern {

    /*
        Example of a bridge pattern:
        Similar to the adapter pattern but the bridge pattern works with new code and adapter works with old code
        Bridge is a driver like JDBC
        Harder than the adapter
        When we ahve something we are not quite aware of the end details
     */

    public static void main(String[] args) {

        Color blue = new Blue();

        Color green = new Green();

        Shape square = new Square(blue);

        Shape circle = new Circle(blue);

        Shape greenCircle = new Circle(green);

        square.applyName();
        square.applyColor();
        System.out.println("");
        circle.applyName();
        circle.applyColor();
    }

}
