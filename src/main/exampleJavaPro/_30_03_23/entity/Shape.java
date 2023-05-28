package main.exampleJavaPro._30_03_23.entity;

public abstract class Shape {
    private String tittle;

    public Shape(String tittle) {
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }


    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
