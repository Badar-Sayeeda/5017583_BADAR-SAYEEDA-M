package adapterpattern;

class PaymentAdapter implements PaymentProcessor {
    private OldPaymentGateway oldPaymentGateway;

    public PaymentAdapter(OldPaymentGateway oldPaymentGateway) {
        this.oldPaymentGateway = oldPaymentGateway;
    }

    public void processPayment(double amount) {
        oldPaymentGateway.makePayment(amount);
    }
}
