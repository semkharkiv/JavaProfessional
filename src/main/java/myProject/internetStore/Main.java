package myProject.internetStore;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product product1 = new Product("SmartPhone", 1000.0);
        Product product2 = new Product("iPhone", 1600.0);

        shop.getInventory().addProduct(product1,10);
        shop.getInventory().addProduct(product2,8);

        product2.applyDiscount(10.0);  // скидка

        System.out.println(shop);
    }
}
