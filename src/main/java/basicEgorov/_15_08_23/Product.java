package basicEgorov._15_08_23;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return name.equals(product.name) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }

    @Override
    public int compareTo(Product o) {
        int categoryComparison = category.compareTo(o.category);
        if (categoryComparison == 0) {
            return name.compareTo(o.name);
        }
        return categoryComparison;
    }

    public double getTotalPrice() {
        return getPrice() * getQuantity();
    }

    public boolean isAvailable() {
        if (getQuantity() > 0) {
            return true;
        }
        return false;
    }

}
