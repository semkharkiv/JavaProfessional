package philosophNikalaj;

import myProject.internetStore.Main;

public class Philosophers implements Runnable {

    Fork forkLeft;
    Fork forkRight;

    Thread th;

    public Philosophers(Fork forkLeft, Fork forkRight) {
        this.forkLeft = forkLeft;
        this.forkRight = forkRight;
        this.th = new Thread(this);
        th.start();
    }

    public void think() {
            try {
                if (Thread.currentThread().isAlive()){
                    Thread.sleep((long) (Math.random() * 2000));
                System.err.println( " While one philosopher is eating, the others are contemplating something.... ");
               }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    @Override
    public void run() {
        while (true) {
            think();
            try {
                Thread.sleep((long) (Math.random() * 1000));
                synchronized (forkLeft) {
                    synchronized (forkRight) {
                        System.out.println(Thread.currentThread().getName() + " кушает");

                        Thread.sleep((long) (Math.random() * 1000));
                        forkLeft.notify();
                        forkRight.notify();
                    }
                    forkLeft.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

