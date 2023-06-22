package exampleJavaPro._19_06_2023;

import java.util.concurrent.Semaphore;

public class Sem3App {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        CommonResources resources = new CommonResources();

        new Thread(new CountThread(resources, semaphore," thread 1")).start();
        new Thread(new CountThread(resources, semaphore," thread 2")).start();
        new Thread(new CountThread(resources, semaphore," thread 3")).start();

    }
}
