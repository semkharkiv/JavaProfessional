package basicToday._05_06_23.mockito;

public class TaxCalculator {
    private CurrentYearProvider currentYearProvider;

    public TaxCalculator(CurrentYearProvider currentYearProvider) {
        this.currentYearProvider = currentYearProvider;
    }

    public double calculatorTax(double income){
        double taxAmount = 0;
        if (currentYearProvider.getYear() == 2021){
            taxAmount=income*0.22;
        }else {
            taxAmount=income*0.25;
        }
        return taxAmount;
    }
}
