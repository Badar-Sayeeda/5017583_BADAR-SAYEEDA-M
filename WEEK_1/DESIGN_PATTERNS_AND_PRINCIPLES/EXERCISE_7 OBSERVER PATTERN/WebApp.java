package observerpattern;

public class WebApp implements Observer {
    public void update(double price) {
        System.out.println("WebApp received price update: $" + price);
    }

}
