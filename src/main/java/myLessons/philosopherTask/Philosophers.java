package myLessons.philosopherTask;

public class Philosophers implements Runnable {
    private String name;
    private final Fork forkLeft;
    private final Fork forkRight;

    Thread th;

    public Philosophers(String name,Fork forkLeft, Fork forkRight) {
        this.name = name;
        this.forkLeft = forkLeft;
        this.forkRight = forkRight;
        this.th = new Thread(this);
        th.start();
    }

    @Override
    public String toString() {
        return "Philosophers " +
                 name ;
    }

    public void think() {
            try {
                if (Thread.currentThread().isAlive()){
                    Thread.sleep((long) (Math.random() * 1000));
                System.err.println("While " + this + " is eating, the others are contemplating something.... ");
               }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((long) (Math.random() * 1000));
                synchronized (forkLeft) {
                    synchronized (forkRight) {
                        System.out.println(this + " eats");
                        Thread.sleep((long) (Math.random() * 1000));
                        forkLeft.notify();
                        forkRight.notify();
                    }
                    Thread.sleep(1000);
                    think();
                    forkLeft.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

