package main.basictoday.testModule3;

import java.util.function.IntUnaryOperator;

public class MathFunctions {
    public static int square(int x) {
        return x * x;
    }

    public static int linear(int x) {
        return 3 * x + 5;
    }

    public static double reciprocal(int x) {
        return 1.0 / x;
    }

    public static int cube(int x) {
        return x * x * x;
    }

    public static int absolute(int x) {
        return Math.abs(x);
    }

    public static void test(IntUnaryOperator function) {
        for (int x = -10; x < 0; x++) {
            int result = function.applyAsInt(x);
            System.out.println("x = " + x + "," + "y = " + result);
        }
    }
    public static void main(String[] args) {
        System.out.println("Testing square:");
        test(MathFunctions::square);

        System.out.println("\nTesting linear:");
        test(MathFunctions::linear);

        System.out.println("\nTesting reciprocal:");
        test(x -> (int) reciprocal(x));

        System.out.println("\nTesting cube:");
        test(MathFunctions::cube);

        System.out.println("\nTesting absolute:");
        test(MathFunctions::absolute);
    }
}
