package ORDERSORTING;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 150.0),
            new Order(2, "Bob", 100.0),
            new Order(3, "Charlie", 200.0),
            new Order(4, "Diana", 50.0)
        };

        System.out.println("Original Order:");
        for (Order order : orders) {
            System.out.println(order.orderId + " " + order.customerName + " " + order.totalPrice);
        }

        // Uncomment one of the sorting methods to test
        // OrderSorting.bubbleSort(orders);
        ordersort.quickSort(orders, 0, orders.length - 1);

        System.out.println("\nSorted Order by Total Price:");
        for (Order order : orders) {
            System.out.println(order.orderId + " " + order.customerName + " " + order.totalPrice);
        }
    }
}

