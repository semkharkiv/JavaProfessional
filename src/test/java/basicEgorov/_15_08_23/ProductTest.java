package basicEgorov._15_08_23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private static final Product product = new Product("product",200.0,55,"category");

    @Test
    void getTotalPrice() {
        assertEquals(11000,product.getTotalPrice());
    }

    @Test
    void isAvailable() {
        assertTrue(product.isAvailable());
    }
}