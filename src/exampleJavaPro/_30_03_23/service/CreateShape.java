package exampleJavaPro._30_03_23.service;

import main.exampleJavaPro._30_03_23.entity.Circle;
import main.exampleJavaPro._30_03_23.entity.Rectangle;
import main.exampleJavaPro._30_03_23.entity.Square;
import main.exampleJavaPro._30_03_23.entity.Triangle;

public class CreateShape {
    public Circle createdCircle(double radius){
        return new Circle("Circle",radius);
    }

    public Square createdSquare(double side){
        return new Square("Square",side);
    }

    public Rectangle createdRectangle(double sideA,double sideB){
        return new Rectangle("Rectangle",sideA,sideB);
    }
    public Triangle createdTriangle(double side){
        return new Triangle("Triangle",side);
    }
}
