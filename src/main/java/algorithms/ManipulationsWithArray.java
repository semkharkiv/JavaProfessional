package algorithms;

import java.util.Arrays;

public class ManipulationsWithArray {
    public static void main(String[] args) {
        int[] array = {7, 15, 12, 9, 6, 17, 3};
        resultMethod(array);
    }

    public static void resultMethod(int[] array) {
        quicksort(array,
                0,
                array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quicksort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quicksort(arr, left, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivotIndex = left; // выбираем первый элемент в качестве опорного
        int pivotValue = arr[pivotIndex];

        // перемещаем элементы, меньшие опорного, в левую часть массива
        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < pivotValue) {
                pivotIndex++;
                swap(arr, i, pivotIndex);
            }
        }

        // перемещаем опорный элемент на свое место
        swap(arr, left, pivotIndex);

        return pivotIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
