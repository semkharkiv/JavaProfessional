package main.myLessons.arrayLessons;

import main.methods.Methods;

import java.util.Arrays;

public class ArrayUtil2 {
    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]= Methods.methodRandom();
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        ArrayUtil2 arrayUtil2= new ArrayUtil2();
        int [] myArr= new int [6];
        arrayUtil2.printArrayToConsole(myArr);
    }
}
