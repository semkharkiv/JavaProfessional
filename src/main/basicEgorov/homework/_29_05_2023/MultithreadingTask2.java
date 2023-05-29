package main.basicEgorov.homework._29_05_2023;
//Создайте 3 потока, которые вычисляют и выводят квадраты чисел от 1 до 10.
// Каждый поток должен использовать метод run() для вычисления и вывода квадратов.
public class MultithreadingTask2 {
    public static void main(String[] args) {
        ThreadEx1 ex1 = new ThreadEx1();
        ThreadEx2 ex2 = new ThreadEx2();
        ThreadEx3 ex3 = new ThreadEx3();

        ex1.start();
        ex2.start();
        ex3.start();
    }
}
class ThreadEx1 extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            int square = i*i;
            System.out.println("Thread 1 - square of " + i + " = " + square);
        }
    }
}
class ThreadEx2 extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            int square = i*i;
            System.out.println("Thread 2 - square of " + i + " = " + square);
        }
    }
}
class ThreadEx3 extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            int square = i*i;
            System.out.println("Thread 3 - square of " + i + " = " + square);
        }
    }
}

