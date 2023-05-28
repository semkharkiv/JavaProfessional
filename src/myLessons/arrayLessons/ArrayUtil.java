package myLessons.arrayLessons;

import main.methods.Methods;

import java.util.Arrays;

class ArrayUtil {

    public int[] createArray(int arrayLength) {

       int [] arr = new int [arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Methods.methodRandom();
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        ArrayUtil a=new ArrayUtil();
        a.createArray(5);
    }
}
