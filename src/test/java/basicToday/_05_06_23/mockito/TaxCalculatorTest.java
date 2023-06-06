package basicToday._05_06_23.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TaxCalculatorTest {

    @Test
    void calculatorTaxFor2021() {
        CurrentYearProvider currentYearProvider = mock(CurrentYearProvider.class);

        TaxCalculator calculator = new TaxCalculator(currentYearProvider);
        when(currentYearProvider.getYear()).thenReturn(2021);

        double income = 1000;

        double expectedTax = 1000*0.22;

        double actualTax = calculator.calculatorTax(income);

        assertEquals(expectedTax,actualTax);
    }
}