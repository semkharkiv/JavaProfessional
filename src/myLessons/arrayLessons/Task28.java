package myLessons.arrayLessons;

import main.methods.Methods;

import java.util.Arrays;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */
public class Task28 {
    public static void arrayTask28 () {
        int [] arr = new int[5];
        System.out.println("Our array is -");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Methods.methodRandom();
        }
        System.out.println(Arrays.toString(arr));
        int minElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minElement){
                minElement=arr[i];
            }
        }
        System.out.println("Min element is - " + minElement);
    }

    public static void main(String[] args) {
        Task28 task28 = new Task28();
        task28.arrayTask28();


    }
    }
