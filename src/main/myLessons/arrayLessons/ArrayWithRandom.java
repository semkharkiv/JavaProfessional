package main.myLessons.arrayLessons;

/*
Напишите программу, в которой:

        - создайте массив целых чисел длиной 3,
        - заполните каждую ячейку массива случайным числом,
        - выведите значение каждой ячейки на консоль.*/

public class ArrayWithRandom {
    public int [] randomInput(){
    int [] arr = new int[3];
        System.out.println("We have length"+ arr.length + " arrays");

    for (int i=0; i < arr.length; i++){
        arr [i]= (int) (Math.random()*100)+1;
        System.out.println("Element of array "+ arr[i]);
    }
return arr;
    }

    public static void main(String[] args) {
        ArrayWithRandom arraysRandom = new ArrayWithRandom();
        arraysRandom.randomInput();
    }
}