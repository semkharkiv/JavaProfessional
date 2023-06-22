package myProject.internetStore;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private double discount;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.price, price) == 0 && quantity == product.quantity && Double.compare(product.discount, discount) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity, discount);
    }

    public void applyDiscount(double discountPercentage) {
        discount = discountPercentage;
        price -= (price * discountPercentage) / 100;
    }
}
