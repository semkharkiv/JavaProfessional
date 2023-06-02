package exampleJavaPro._30_03_23.entity;

public class Square extends Shape{

    private double sideA;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    @Override
    public double calculateArea() {
        return sideA*sideA;
    }

    @Override
    public double calculatePerimeter() {
        return 4*(sideA);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                '}';
    }
}
