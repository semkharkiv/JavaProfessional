package main.myLessons.arrayLessons;
/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте среднее значение и выведите его на консоль.
 */
public class Task14 {
    public int [] sredneeArifm() {

        int [] arr = new int[3];
        int srArifm = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100+1);
            System.out.println(i+"-й Элемент массива " + arr[i]);
            srArifm=(srArifm+arr[i])/3;

        }
        System.out.println("Среднее значение = " + srArifm);
        return arr;
    }

    public static void main(String[] args) {
        Task14 task14=new Task14();
        task14.sredneeArifm();

    }
}
