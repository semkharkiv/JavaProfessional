package myLessons.bankApp;

public class BankCard {
    private String cardDetails;
    private String currency;
    private boolean status;

    public BankCard(String cardDetails, String currency, boolean status) {
        this.cardDetails = cardDetails;
        this.currency = currency;
        this.status = status;
    }

    public String getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(String cardDetails) {
        this.cardDetails = cardDetails;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
