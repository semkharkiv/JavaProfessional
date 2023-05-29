package main.basicEgorov.homework._29_05_2023;
//Создайте 2 потока, которые выводят все четные числа от 1 до 20
// и все нечетные числа от 1 до 20 соответственно. Каждый поток должен
// использовать метод run() для вывода чисел.
public class MultithreadingTask3 {
    public static void main(String[] args) {
        ThreadExx1 exx1 = new ThreadExx1();
        ThreadExx2 exx2 = new ThreadExx2();

        exx2.start();
        exx1.start();
    }
}
class ThreadExx1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            if (i%2==0){
                System.out.println("Thread 1 - " + i );
            }
        }
    }
}
class ThreadExx2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            if (i%2!=0){
                System.out.println("Thread 2 - " + i );
            }
        }
    }
}
