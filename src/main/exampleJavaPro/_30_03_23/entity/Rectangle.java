package main.exampleJavaPro._30_03_23.entity;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(String tittle, double sideA, double sideB) {
        super(tittle);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA*sideB;
    }


    @Override
    public double calculatePerimeter() {
        return 2*(sideA*sideB);
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "sideA= " + sideA ;
    }
}
