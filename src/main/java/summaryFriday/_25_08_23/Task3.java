package summaryFriday._25_08_23;

public class Task3 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Another thread");
        });

        t.start(); //до start тоже ничего нельзя писать


        System.out.println("Main thread");
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
