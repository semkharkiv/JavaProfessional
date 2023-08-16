package basicEgorov._15_08_23;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Order implements Comparable<Order>{
    private int orderId;
    private Person costumer;
    private List<Product> products;
    private LocalDate orderDate;

    public Order(int orderId, Person costumer, List<Product> products, LocalDate orderDate) {
        this.orderId = orderId;
        this.costumer = costumer;
        this.products = products;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", costumer=" + costumer +
                ", products=" + products +
                ", orderDate=" + orderDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return orderId == order.orderId && Objects.equals(costumer, order.costumer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, costumer);
    }

    public int getOrderId() {
        return orderId;
    }

    public Person getCostumer() {
        return costumer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(this.orderId, o.orderId);
    }

    public double calculateTotalPrice(){
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public int getNumberOfProducts(){
        return products.stream()
                .mapToInt(Product::getQuantity)
                .sum();
    }

    public boolean isOrderExpired(){
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(orderDate);
    }
}
