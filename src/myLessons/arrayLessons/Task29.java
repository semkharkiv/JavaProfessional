package myLessons.arrayLessons;

import main.methods.Methods;

import java.util.Arrays;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
 */
public class Task29 {
    public int [] ourArray() {
        int [] arr = new int[10];
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Methods.methodRandom();
        }
        System.out.println("Наш массив с рандомными числами- " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++,a++) {
            if (arr[i] % 2 == 0) {

                System.out.println(a+"-й "+"индекс массива- "+ arr[i]+" является четным");
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Task29 t= new Task29();
        t.ourArray();
    }
    }

