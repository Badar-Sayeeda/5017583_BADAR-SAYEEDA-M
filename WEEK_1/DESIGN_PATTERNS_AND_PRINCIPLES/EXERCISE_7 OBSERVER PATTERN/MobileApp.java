package observerpattern;

public class MobileApp implements Observer {
    public void update(double price) {
        System.out.println("MobileApp received price update: $" + price);
    }

}
