package DesignPatterns.GangOfFour.Structural.Bridge;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }

    @Override
    public void applyName() {
        System.out.println("Square");
    }
}
