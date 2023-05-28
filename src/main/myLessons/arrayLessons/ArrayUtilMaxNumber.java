package main.myLessons.arrayLessons;

import main.methods.Methods;

import java.util.Arrays;

public class ArrayUtilMaxNumber {
    public int findMaxNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array [i]= Methods.methodRandom();
        }
        System.out.println("Our array is- "+Arrays.toString(array));
        int maxNumb=array [0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maxNumb){
                maxNumb=array[i];
        }
    }
        System.out.println("Max numb is- "+ maxNumb);
        return maxNumb;
    }

    public static void main(String[] args) {
        ArrayUtilMaxNumber a=new ArrayUtilMaxNumber();
        int [] ourArr=new int [6];
        a.findMaxNumber(ourArr);
    }
}
