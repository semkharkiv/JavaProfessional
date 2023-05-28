package main.basicEgorov.homework.websiteTwitter;

public class Settings {

    private String yourAcc;
    private String security;
    private String notifications;

    private String getYourAcc(String yourAcc) {
        this.yourAcc = yourAcc;
        return yourAcc;
    }

    private String getSecurity(String security) {
        this.security = security;
        return security;
    }

    private String getNotifications(String notifications) {
        this.notifications = notifications;
        return notifications;

    }
}
