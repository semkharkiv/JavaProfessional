package main.algorithms;

import java.util.Arrays;

//Дано число, записанное своими разрядами в массиве, например,
// число 546 будет представлено массивом [5, 4, 6]. Прибавить к этому "числу" 1.
public class ManipulationsWithArray2 {
    public static void main(String[] args) {
        int[] array = {1,9,9,9,9};
        arrayModify(array);
    }


    public static int[] arrayModify(int [] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result * 10 + arr[i];
        }
        result+=1;
        String str = Integer.toString(result);
        int[] newArr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            newArr[i] = str.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
}
