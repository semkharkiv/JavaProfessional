package basicEgorov.homework.websiteTwitter;

public class HomePage {

    private String homePage;
    private String name;
    private String[] messages;

    public String refreshHomePage(String homePage) {
        this.homePage = homePage;
        return homePage;
    }

    public String getAccount(String name ){
        this.name=name;
        return name;
    }

    public void openMessages(String[] messages){
        this.messages=messages;
    }
}
