package basicEgorov.homework._29_05_2023;
//Создайте 5 потоков, которые выводят числа от 1 до 10.
// Каждый поток должен использовать метод run() для вывода чисел.
public class MultithreadingTask1 {
    public static void main(String[] args) {
        ThreadTs1 ts1 = new ThreadTs1();
        ThreadTs2 ts2 = new ThreadTs2();
        ThreadTs3 ts3 = new ThreadTs3();
        ThreadTs4 ts4 = new ThreadTs4();
        ThreadTs5 ts5 = new ThreadTs5();

        ts1.start();
        ts2.start();
        ts3.start();
        ts4.start();
        ts5.start();
    }


}
class ThreadTs1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}
class ThreadTs2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}
class ThreadTs3 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 3: " + i);
        }
    }
}
class ThreadTs4 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 4: " + i);
        }
    }
}
class ThreadTs5 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 5: " + i);
        }
    }
}