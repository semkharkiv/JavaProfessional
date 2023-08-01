package myLessons.bankApp;

public class Client {
    private String name;
    private BankCard bankCard;
    private double balance;

    public Client(String name, BankCard bankCard, double balance) {
        this.name = name;
        this.bankCard = bankCard;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
