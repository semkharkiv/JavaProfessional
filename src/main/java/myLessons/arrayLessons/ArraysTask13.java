package myLessons.arrayLessons;
/*
        Напишите программу, в которой:
        - создайте массив целых чисел длиной 3,
        - заполните каждую ячейку массива случайным числом,
        - посчитайте сумму всех ячеек и распечатайте ее на консоль.
 */

public class ArraysTask13 {
    public int [] sumRandomArray() {
        int[] array = new int[3];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] =(int) (Math.random()*100)+1;
            System.out.println(i +" Элемент массива: " +  array[i]);
            sum += array[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
        return array;
    }

    public static void main(String[] args) {
        ArraysTask13 arraysTask13=new ArraysTask13();
        arraysTask13.sumRandomArray();
    }

}
