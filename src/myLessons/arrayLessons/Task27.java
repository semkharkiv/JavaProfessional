package myLessons.arrayLessons;

import main.methods.Methods;

import java.util.Arrays;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */
public class Task27 {
    public static void workingArrays () {
        int [] array = new int[6];
        System.out.println("Our arrays - ");
        for (int i = 0; i < array.length; i++) {
            array[i]= Methods.methodRandom();
        }
        System.out.println(Arrays.toString(array));
        int maxElement=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maxElement) {
                maxElement=array[i];
            }
        }
        System.out.println("Max element is - "+ maxElement);
    }

    public static void main(String[] args) {
        Task27 task27=new Task27();
        task27.workingArrays();
    }
}
