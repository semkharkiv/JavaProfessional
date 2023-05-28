package myLessons.arrayLessons;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль,
 - увеличьте значение каждой ячейки на 2,
 - выведите значение каждой ячейки на консоль.
 */
public class Task15 {
    public int [] methodarray (){
        int [] arr=new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100+1);
            System.out.println(i+"-й Элемент массива = "+ arr[i]);
            arr[i]+=2;
            System.out.println("Элемент после выполнения условия = "+ arr[i]);
            System.out.println("--------");
        }
        return arr;
    }

    public static void main(String[] args) {
        Task15 task15=new Task15();
        task15.methodarray();


    }
}
