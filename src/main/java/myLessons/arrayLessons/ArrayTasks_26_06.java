package myLessons.arrayLessons;

import java.util.*;

//1 проверить что числа массива находятся в неубывающем порядке
//2 найти максимальный элемент в двумерном массиве
//3 дан массив целых числе. Нужно найти наибольшую разницу между любыми двумя элементами массива.
//4 найти дубликаты чисел в массиве
//5 Дан массив чисел в отсортированном порядке (от меньшего к большему). Нужно вывести
//квадраты этих чисел в отсортированном порядке
public class ArrayTasks_26_06 {
    public static void main(String[] args) {
        //1
        int[] arr = new int[]{1, 3, 4, 6, 9, 15};
        int[] arr2 = new int[]{1, 3, 3, 2, 6, 6, 7, 8, 1 };
        int[] arr3 = new int[]{1, 3, 5, 2, 6, 7, 8 };

        System.out.println(isTrue(arr));
        System.out.println(isTrue(arr2));

        //2
        int[][] arrDimensional = {
                {1, 2, 3},
                {2, 15, 4},
                {1, 7, 12}
        };

        System.out.println(maxNumb(arrDimensional));

        //3
        System.out.println(sumBetweenTwoElem(arr));
        //4
        System.out.println(findDup(arr2));
        //5
        squareOfNumb(arr3);
        squaresSortedArray(arr3);
    }

    //1
    public static boolean isTrue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //2
    public static int maxNumb(int[][] arr) {
        int maxNumb = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > maxNumb) {
                    maxNumb = arr[i][j];
                }
            }
        }
        return maxNumb;
    }

    //3
    public static int sumBetweenTwoElem(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (sum < arr[i] - arr[i - 1]) {
                sum = arr[i] - arr[i - 1];
            }
        }
        return sum;
    }


    //4
    public static Set<Integer> findDup(int[] arr){
        Set<Integer> uniqueDupIt = new HashSet<>();
        Set<Integer> items = new HashSet<>();
//        for (int num : arr) {
//            if (!items.add(num)) {
//                uniqueDupIt.add(num);
//            }
//        }
        //или

        for (int num : arr) {
            if (items.contains(num)) {
                uniqueDupIt.add(num);
            }
             items.add(num);
        }
        return uniqueDupIt;
    }

    //5
    public static TreeSet<Integer> squareOfNumb(int[] arr){
        TreeSet<Integer> squareNumbs = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            squareNumbs.add(arr[i]*arr[i]);
        }
        System.out.println(squareNumbs);
        return squareNumbs;
    }

    //5
        public static int[] squaresSortedArray(int[] nums) {
            int[] squares = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                squares[i] = nums[i] * nums[i];
            }

            Arrays.sort(squares);

            System.out.println(Arrays.toString(squares));
            return squares;
        }
}
