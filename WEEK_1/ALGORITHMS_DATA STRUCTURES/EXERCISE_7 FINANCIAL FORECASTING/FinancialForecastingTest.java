package financial;

public class FinancialForecastingTest {
    public static void main(String[] args) {
        double initialValue = 1000;
        double growthRate = 0.05; // 5% growth rate
        int years = 3;

        double futureValue = FinancialForecasting.predictFutureValue(initialValue, growthRate, years);
        System.out.printf("The future value after %d years is: %.2f%n", years, futureValue);
    }
}

