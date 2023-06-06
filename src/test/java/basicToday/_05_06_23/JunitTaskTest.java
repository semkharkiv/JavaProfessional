package basicToday._05_06_23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTaskTest {

    @Test
    void calculateTaxLess20000(){
        JunitTask ju = new JunitTask();
        double income = 100;
        double expectedTax = 25;
        double actualTax = ju.calculateTax(income);

        assertEquals(expectedTax,actualTax);
    }

    @Test
    void calculateTaxMore20000(){
        JunitTask ju = new JunitTask();
        double income = 40000;
        double expectedTax = 5000+8000;
        double actualTax = ju.calculateTax(income);

        assertEquals(expectedTax,actualTax);
    }
    @Test
    void calculateTaxBelowZeroIncome(){
        JunitTask ju = new JunitTask();
        double income = -100;
        assertThrows(IllegalArgumentException.class,()-> {
            ju.calculateTax(income);
        });
    }
}