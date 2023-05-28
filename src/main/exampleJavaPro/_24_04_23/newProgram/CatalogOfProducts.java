package main.exampleJavaPro._24_04_23.newProgram;

import java.util.HashMap;
//todo доделать
public class CatalogOfProducts {
    private HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(int productId, Product product) {
        if (!products.containsKey(productId)) {
            products.put(productId, product);
            System.out.println("Product " + product.getName() + " added successfully");
        } else {
            System.out.println("Product " + product.getName() + " is already exist");
        }
    }

    public void deleteProduct(int productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Product " + productId + " deleted successfully");
        } else {
            System.out.println("Product " + productId + " absent");
        }
    }

    public Product findProduct(int productId){
        Product product = null;
        if (products.containsKey(productId)){
            System.out.println(products);
        }
        return product;
    }
}
