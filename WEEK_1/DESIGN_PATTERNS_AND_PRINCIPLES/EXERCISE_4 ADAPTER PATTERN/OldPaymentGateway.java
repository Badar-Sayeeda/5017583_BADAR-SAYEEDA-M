package adapterpattern;

public class OldPaymentGateway {
	public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }

}