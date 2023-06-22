package myProject.internetStore;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Product,Integer> products;



    public Inventory(){
        products = new HashMap<>();
    }


    public void addProduct(Product product, int quantity){
        if (products.containsKey(product)){
            int currentQuantity = products.get(product);
            products.put(product,currentQuantity+quantity);
        }else {
            products.put(product,quantity);
        }
    }
    public void sellProduct(Product product,int quantity){
        if (products.containsKey(product)){
            int currentQuantity = products.get(product);
            if (currentQuantity>=quantity){
                products.put(product,currentQuantity-quantity);
            }else {
                System.out.println("Недостаточно товара на складе");
            }
        }else {
            System.out.println("Товар не найден на складе");
        }
    }
}
