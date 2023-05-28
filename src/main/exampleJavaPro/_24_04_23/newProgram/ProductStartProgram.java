package main.exampleJavaPro._24_04_23.newProgram;

public class ProductStartProgram {
    public static void main(String[] args) {
        CatalogOfProducts catalogOfProducts = new CatalogOfProducts();
        Product product1 = new Product("Milk",3.5);
        Product product2 = new Product("Sugar", 3.5);
        Product product3 = new Product("Bread", 1.25);
        Product product4 = new Product("Butter", 1.75);
        Product product5 = new Product("Cheese", 3.15);

        catalogOfProducts.addProduct(1,product1);
        catalogOfProducts.addProduct(2,product2);
        catalogOfProducts.addProduct(3,product3);
        catalogOfProducts.addProduct(4,product4);
        catalogOfProducts.addProduct(5,product5);
        catalogOfProducts.addProduct(5,product4);

        catalogOfProducts.findProduct(2);

        catalogOfProducts.findProduct(7);

        catalogOfProducts.deleteProduct(3);
        catalogOfProducts.deleteProduct(3);
    }
}
