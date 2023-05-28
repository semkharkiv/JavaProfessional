package main.basicEgorov._24_05_2023;

public class ThreadEx extends Thread{
    boolean b = true;

    @Override
    public void run(){
        long counter =0;
        while (b){
            counter++;
        }
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadEx threadEx = new ThreadEx();
        threadEx.start();

        ThreadEx.sleep(1500);
        System.out.println("After 1.5 sec ......");

        threadEx.b=false;
        threadEx.join();

        System.out.println("Main end");
    }
}
