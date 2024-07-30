package observerpattern;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create the stock market (subject)
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers with the stock market
        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        // Change stock price and notify observers
        stockMarket.setPrice(100.50);
        stockMarket.setPrice(105.75);

        // Deregister one observer and update price again
        stockMarket.deregister(mobileApp);
        stockMarket.setPrice(110.00);
    }
}
