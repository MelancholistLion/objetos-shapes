package oop.parcial2.shapes;

public class Rectangle extends Shape{
    private int bottom;
    private int height;

    public Rectangle(int bottom, int height) {
        super("Rectangle", 4);
        this.bottom = bottom;
        this.height = height;
    }

    public double getPerimeter() {
        return bottom * height * 2;
    }

    public double getArea() {
        return bottom * height;
    }
}
