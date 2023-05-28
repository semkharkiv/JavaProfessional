package main.basicToday._29_03_23;

public class Test {
    public static void main(String[] args) {
        System.out.println(M1(Test::M2));
    }
    public static int M2(){
        return 6+1;
    }

    public static int M1(Sum sum) {
        return sum.getSum();
    }
}

@FunctionalInterface
interface Sum {
    int getSum();
}