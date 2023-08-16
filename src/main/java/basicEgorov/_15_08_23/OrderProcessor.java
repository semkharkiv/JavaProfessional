package basicEgorov._15_08_23;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        if (order == null){
            throw new OrderDoesNotExistException("Order is null");
        }
        if (!orders.contains(order)) {
            throw new OrderAlreadyExistException("Order is already exist");
        }
        orders.add(order);

    }

    public double calculateTotalRevenue(){
        return orders.stream()
                .mapToDouble(Order::calculateTotalPrice)
                .sum();
    }

    public List<Order> getExpiredOrders(){
        return orders.stream()
                .filter(Order::isOrderExpired)
                .toList();
    }
}
