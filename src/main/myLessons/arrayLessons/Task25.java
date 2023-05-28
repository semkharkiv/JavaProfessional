package main.myLessons.arrayLessons;

import main.methods.Methods;

import java.util.Arrays;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */
public class Task25 {
    public void ArrayByUser(){
        int [] array=new int[Methods.methodScanner("Please fill arrays length - ")];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter data for " + i + " element: ");
            array[i] = Methods.methodScanner("Please fill arrays length - ");

    }
        System.out.println("Our array is- " +Arrays.toString(array));
    }

}
