package myLessons.arrayLessons;

import main.methods.Methods;

import java.util.Arrays;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */
public class Task26 {
    public void ArraysMt(){
        int [] array = new int[Methods.methodScanner("Fill length of arrays -")];
        for (int i = 0; i < array.length; i++) {
        array [i]=Methods.methodRandom();
        }
        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {
        Task26 task26=new Task26();
        task26.ArraysMt();
    }
}
