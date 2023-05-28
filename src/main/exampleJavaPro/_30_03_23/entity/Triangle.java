package main.exampleJavaPro._30_03_23.entity;

public class Triangle extends Shape {

    private double side;

    public Triangle(String tittle, double side) {
        super(tittle);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side*(Math.sqrt(3)/4);
    }

    @Override
    public double calculatePerimeter() {
        return 3*side;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                "} " + super.toString();
    }
}
