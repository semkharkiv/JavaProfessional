package basicEgorov._24_08_2023;

public class Sender {
    private volatile int dataToSend;

    public int getDataToSend() {
        return dataToSend;
    }

    public void sendData(int dataToSend) {
        this.dataToSend = dataToSend;
        System.out.println("Send Data" + dataToSend);
    }
}
