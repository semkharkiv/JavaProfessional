package basicEgorov.homework._29_05_2023;

import java.time.LocalDateTime;
import java.time.ZoneId;

//Создайте 4 потока, которые выводят сообщение "Hello, World!"
// каждый с задержкой в 1 секунду. Каждый поток должен использовать
// метод run() для вывода сообщения.
public class MultithreadingTaskWithSleep  {

    public static void main(String[] args) throws InterruptedException {
        Ex1 ex1 = new Ex1();
        Ex2 ex2 = new Ex2();
        Ex3 ex3 = new Ex3();
        Ex4 ex4 = new Ex4();

        ex1.start();
        ex2.start();
        ex3.start();
        ex4.start();

        Thread.sleep(1000);
        System.out.println("After 1 sec ...");
        System.out.println("Main end of work");

        ex1.join();
        ex2.join();
        ex3.join();
        ex4.join();

    }
}
class Ex1 extends Thread{

    @Override
    public void run(){
            System.out.println("Thread 1 - Hello world");
    }
}
class Ex2 extends Thread{

    @Override
    public void run(){
            System.out.println("Thread 2 - Hello world");

    }
}
class Ex3 extends Thread{
    @Override
    public void run() {
            System.out.println("Thread 3 - Hello world");
    }
}
class Ex4 extends Thread{

    @Override
    public void run() {
            System.out.println("Thread 4 - Hello world");
    }
}