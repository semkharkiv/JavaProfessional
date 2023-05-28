package basicEgorov._13_05_2023;

// перевернуть кубик на бок влево ,вправо и на 180 градусов
public class LogicExample {
    public static void main(String[] args) {
        int[][] square = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("изначальная матрица");
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("положил на 90 градусов вправо");
        int temp = 0;
        for (int i = 0; i < square.length; i++) {
            for (int j = square.length-1; j >=0; j--) {
                temp = square[j][i];
                System.out.print(temp + " ");
            }
            System.out.println();
        }

        System.out.println("положил на 90 градусов влево");
        for (int i = square.length-1; i >=0; i--) {
            for (int j = 0; j < square.length; j++) {
                temp = square[j][i];
                System.out.print(temp + " ");
            }
            System.out.println();
        }

        System.out.println("перевернул на 180 градусов");
        for (int i = square.length-1; i >=0; i--) {
            for (int j = square.length-1; j >=0; j--) {
                temp = square[i][j];
                System.out.print(temp + " ");
            }
            System.out.println();
        }

    }
}
