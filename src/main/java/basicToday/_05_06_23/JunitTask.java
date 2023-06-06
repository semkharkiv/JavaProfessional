package basicToday._05_06_23;

public class JunitTask {

    public double calculateTax(double income) {
        double tax =0;
        if (income < 0){
            throw new IllegalArgumentException("Income cannot be negative");
        }
        if (income <= 20000) {
            tax = income * 0.25;
        } else if (income > 20000) {
            tax = 20000 * 0.25 + (income - 20000) * 0.4;
        }
        return tax;
    }
}
