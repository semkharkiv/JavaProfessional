package main.exampleJavaPro._24_04_23.restaurantAppExample;

import java.util.LinkedList;

public class OrderUtils implements Service{
    private LinkedList<Order> orders=new LinkedList<>();

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order);
    }

    @Override
    public double getTotalCost() {
        double allPriceOfDishes=0;
        for (Order order : orders){
            allPriceOfDishes += order.getPriseOfDish();
        }
        return allPriceOfDishes;
    }

    @Override
    public int getOrdersCount() {
        return orders.size();
    }

    @Override
    public Order getOrderById(int id) {

        for (Order order : orders){
            if(order.getId() == id){
                return order;
            }
        }
        return null;
    }
      //todo
//    public Order getAllOrder(Order order){
//        for (Order order : orders){
//
//        }
//        System.out.println(orders);
//        return order;
//    }
}
