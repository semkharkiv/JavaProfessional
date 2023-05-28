package main.myLessons.arrayLessons;

/*Напишите программу, в которой:

 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива числом, запрошенным у пользователя,
 - выведите значение каждой ячейки на консоль.

 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExampleWithScanner {
    public int [] userinput(){
    Scanner scan = new Scanner(System.in);
       System.out.println("Please enter your length");
       int size = scan.nextInt();
       int [] createAr = new int[size];
       for (int i=0; i<size;i++){
           System.out.println("Please enter " + i + " element of array - ");
           createAr [i]=scan.nextInt();

       }
        System.out.println("Наш массив: "+Arrays.toString(createAr));
       return createAr;
    }

    public static void main(String[] args) {
        ArrayExampleWithScanner arrayExampleWithScanner = new ArrayExampleWithScanner();
        arrayExampleWithScanner.userinput();

    }
}
