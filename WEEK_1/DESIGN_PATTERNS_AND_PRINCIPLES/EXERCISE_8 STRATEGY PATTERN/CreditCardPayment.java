package strategypattern;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card");
    }

}
