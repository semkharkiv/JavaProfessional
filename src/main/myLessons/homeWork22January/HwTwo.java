package main.myLessons.homeWork22January;
/*
Дан массив из N целых чисел и целое число  K ,
найдите количество пар элементов в массиве, сумма которых равна K.
 */

import java.util.Arrays;
import java.util.Scanner;


public class HwTwo {
    public int inputLengthForArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the array:");
        int arrayLength = scanner.nextInt();
        return arrayLength;
    }

    public int numberForSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number for check:");
        int numberForCheck = scanner.nextInt();
        return numberForCheck;
    }
    public int[] createArray(){
        int arrLength = inputLengthForArr();
        int[] array = new int[arrLength];
        for (int i = 0; i <arrLength; i++) {
            array[i]=(int) ((Math.random()*10)+1);
        }
        return array;
    }
    public void ourProgramTask2(){
        int[] array = createArray();
        int inputNumber = numberForSearch();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == inputNumber) {
                    counter++;
                }
            }
        }
        System.out.println("Length for array = "+array.length+":");
        System.out.println(Arrays.toString(array));
        System.out.println("Entered number is- "+inputNumber+":");
        System.out.println("The sum of the pairs of elements equals your number- " + counter + " times");
    }

    public static void main(String[] args) {
        HwTwo two = new HwTwo();
        two.ourProgramTask2();
    }
}
