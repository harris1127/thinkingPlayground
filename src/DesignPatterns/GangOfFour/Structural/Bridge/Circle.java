package DesignPatterns.GangOfFour.Structural.Bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }

    @Override
    public void applyName() {
        System.out.println("Circle");
    }
}
