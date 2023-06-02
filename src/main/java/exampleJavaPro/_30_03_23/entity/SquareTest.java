package exampleJavaPro._30_03_23.entity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class SquareTest {

    Square square = new Square("Square", 10);

    @Test
    public void calculateArea() {
        double expectedAreaResult = 100;
        double realAreaResult = square.calculateArea();
        assertEquals(expectedAreaResult, realAreaResult,0);
    }

    @Test
    public void calculatePerimeter() {
        double expectedPerimeter = 40;
        double realPerimeterResult = square.calculatePerimeter();
        assertEquals(expectedPerimeter, realPerimeterResult,0);
    }
}