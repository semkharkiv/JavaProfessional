package basicEgorov._31_05_2023;

public class Kvadrat {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int number = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = number++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
