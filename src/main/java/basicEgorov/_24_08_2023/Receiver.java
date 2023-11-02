package basicEgorov._24_08_2023;

public class Receiver {
    private volatile int receiveData;

    public synchronized int getReceiveData() {
        return receiveData;
    }

    public synchronized void receiveData(int receiveData) {
        this.receiveData = receiveData;
        System.out.println("Receive Data " + receiveData);
    }
}
