package basicEgorov._21_06_2023;

public class ArrayTask {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        System.out.println(hasElem(array,16));
    }

    public static boolean hasElem(int[][] arr, int elem) {
        int x = 0;
        int y = arr[0].length - 1;

        while (x < arr.length && y >= 0) {
            if (arr[x][y] == elem) {
                return true;
            } else if (arr[x][y] < elem) {
                x++;
            }else {
                y--;
            }
        }
        return true;
    }
}
