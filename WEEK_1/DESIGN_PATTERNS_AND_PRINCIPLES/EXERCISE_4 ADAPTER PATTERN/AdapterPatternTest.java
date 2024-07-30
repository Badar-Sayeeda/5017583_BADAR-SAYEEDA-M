package adapterpattern;

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create an instance of OldPaymentGateway
        OldPaymentGateway oldPaymentGateway = new OldPaymentGateway();
        
        // Create an adapter for the old payment gateway
        PaymentProcessor paymentProcessor = new PaymentAdapter(oldPaymentGateway);
        
        // Use the adapter to process a payment
        paymentProcessor.processPayment(100.0); // Output: Processing payment of $100.0
    }
}

