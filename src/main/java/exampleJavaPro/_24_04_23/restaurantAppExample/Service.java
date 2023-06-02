package exampleJavaPro._24_04_23.restaurantAppExample;

public interface Service {
    void addOrder(Order order);  //: Добавляет заказ в конец коллекции.

    void removeOrder(Order order); //: Удаляет указанный заказ из коллекции.

    double getTotalCost(); //: Возвращает общую стоимость всех заказов в коллекции.

    int getOrdersCount(); //: Возвращает количество заказов в коллекции.

    Order getOrderById(int id); //: Возвращает заказ по указанному идентификатору.
}
