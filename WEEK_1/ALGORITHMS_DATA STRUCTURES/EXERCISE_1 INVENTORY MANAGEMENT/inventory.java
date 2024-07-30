package inventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Add a product
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    // Update a product
    public void updateProduct(String productId, Product newProduct) {
        if (products.containsKey(productId)) {
            products.put(productId, newProduct);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Display all products
    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}

