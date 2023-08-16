package basicEgorov._15_08_23;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Mock
    Person person;

    @InjectMocks
    Order order;

    @Test
    void calculateTotalPrice() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", 10.0,15,"category"));
        products.add(new Product("Product2", 20.0,16,"category"));
        products.add(new Product("Product3", 15.0,20,"category"));

        Order order = new Order(1,person,products, LocalDate.now());

        double expectedTotalPrice = 10.0 + 20.0 + 15.0;
        double actualTotalPrice = order.calculateTotalPrice();


        assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    @Test
    void getNumberOfProducts() {
    }

    @Test
    void isOrderExpired() {
    }
}