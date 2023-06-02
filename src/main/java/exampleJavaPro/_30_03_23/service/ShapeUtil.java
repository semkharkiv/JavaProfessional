package exampleJavaPro._30_03_23.service;

import exampleJavaPro._30_03_23.entity.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeUtil {
    private Shape createdRandomShape(int range) {
        CreateShape createShape = new CreateShape();
        Random random = new Random();

        int randomChoice = random.nextInt(4);
        if (randomChoice == 0) {
            return createShape.createdCircle(random.nextInt(range)+1);
        }
        else if (randomChoice == 1) {
            return createShape.createdRectangle(random.nextInt(range)+1,random.nextInt(range)+1);
        }
        else if (randomChoice == 2) {
            return createShape.createdSquare(random.nextInt(range)+1);
        }
        else  {
            return createShape.createdTriangle(random.nextInt(range)+1);
        }
    }

    public List<Shape> createRandomShapeCollection(int numbersOFShapes, int range) {
        List<Shape> randomShapeCollection = new ArrayList<>();
        for (int i = 0; i < numbersOFShapes; i++) {
            randomShapeCollection.add(createdRandomShape(range));
        }
        return randomShapeCollection;
    }

    public double CalculateTotalShapesArea(List<Shape> shapes){
        double allShapesArea = 0;
        for (Shape shape : shapes){
            allShapesArea = allShapesArea + shape.calculateArea();
        }
        return allShapesArea;
    }

    public double CalculateTotalShapesPerimeter(List<Shape> shapes){
        double allShapesPerimeter = 0;
        for (Shape shape : shapes) {
            allShapesPerimeter = allShapesPerimeter + shape.calculatePerimeter();
        }
        return allShapesPerimeter;
    }
}
