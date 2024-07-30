package PRODUCTSEARCH;

public class Main {
    public static void main(String[] args) {
        // Create an array of Product objects
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Book", "Education")
        };

        // Test linear search
        int targetId = 3;
        int linearIndex = SearchFunction.linearSearch(products, targetId);
        System.out.println("Linear Search: Product ID " + targetId + " found at index " + linearIndex);

        // Test binary search
        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.productId, p2.productId));
        int binaryIndex = SearchFunction.binarySearch(products, targetId);
        System.out.println("Binary Search: Product ID " + targetId + " found at index " + binaryIndex);
    }
}

