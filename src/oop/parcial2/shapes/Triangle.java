package oop.parcial2.shapes;

public class Triangle extends Shape{
    private int bottom;
    private int height;

    public Triangle(int bottom, int height) {
        super("Triangle", 3);
        this.bottom = bottom;
        this.height = height;
    }

    public double getPerimeter() {
        double l = Math.sqrt(Math.pow(bottom, 2) + Math.pow(height, 2));
        return l + bottom + height;
    }

    public double getArea() {
        return (bottom * height) / 2;
    }
}
