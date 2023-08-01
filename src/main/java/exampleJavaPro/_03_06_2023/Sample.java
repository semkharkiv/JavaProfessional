package exampleJavaPro._03_06_2023;

public class Sample {

    private String s;

    public Sample() {
        s = "Java Reflection";
    }

    public void method1(){
        System.out.println("Какая-то инф - " + s);
    }

    public void method2(int x) {
        System.out.println("Целое число: " + x);
    }

    private void method3() {
        System.out.println("Вызов приватного метода");
    }


}
