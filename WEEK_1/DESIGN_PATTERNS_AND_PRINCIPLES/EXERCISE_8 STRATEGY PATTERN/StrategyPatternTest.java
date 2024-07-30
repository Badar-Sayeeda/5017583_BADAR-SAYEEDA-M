package strategypattern;

public class StrategyPatternTest {
    public static void main(String[] args) {
        // Create PaymentContext
        PaymentContext context = new PaymentContext();
        
        // Set strategy to CreditCardPayment
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(100.00);
        
        // Set strategy to PayPalPayment
        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(150.00);
    }
}

