package basicEgorov._24_08_2023;

public class MainApp {
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        Thread senderThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sender.sendData(i);
                receiver.receiveData(sender.getDataToSend());
            }

        });
        Thread receiverThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sender.sendData(i);
                receiver.receiveData(sender.getDataToSend());
            }
        });
        Thread mainThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main thread received data " + receiver.getReceiveData());
            }
        });

        receiverThread.start();
        senderThread.start();
        mainThread.start();
    }
}
