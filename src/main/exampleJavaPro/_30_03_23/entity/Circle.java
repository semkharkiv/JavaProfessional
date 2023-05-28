package main.exampleJavaPro._30_03_23.entity;

public class Circle extends Shape {
    private double radius;

    public Circle(String tittle, double radius) {
        super(tittle);
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
