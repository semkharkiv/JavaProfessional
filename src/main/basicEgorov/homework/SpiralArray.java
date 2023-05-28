package main.basicEgorov.homework;

public class SpiralArray {
    public static void main(String[] args) {
        int N = 5;
        int counter = 1;
        int[][] arraySpiral = new int[N][N];
        for (int i = 0; i <arraySpiral.length; i++) {

            for (int j = 0; j <arraySpiral.length ; j++) {
                arraySpiral[i][j]=counter;
                counter++;
                System.out.print(arraySpiral[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
