package main.exampleJavaPro._24_04_23.restaurantAppExample;

public class RestaurantStartProgram {

    public static void main(String[] args) {
    OrderUtils orderUtils = new OrderUtils();

    Order order1 = new Order("BigMak",8,12,1);
    Order order2 = new Order("PotatoesFree",12,5,2);
    Order order3 = new Order("Nuggets",2,7,3);
    Order order4 = new Order("BigTesty",7,15,4);
    Order order5 = new Order("FishRoll",4,11,5);

    orderUtils.addOrder(order1);
    orderUtils.addOrder(order2);
    orderUtils.addOrder(order3);
    orderUtils.addOrder(order4);
    orderUtils.addOrder(order5);

        System.out.println("Total orders- " + orderUtils.getOrdersCount());
        System.out.println("Total orders prise- "+ orderUtils.getTotalCost());

        System.out.println("Get order by id- " + orderUtils.getOrderById(2));
        orderUtils.removeOrder(order4);
        //todo
//        orderUtils.getAllOrder((OrderUtils)orderUtils);

    }
}
