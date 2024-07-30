package inventory;

public class InventoryTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product("P001", "Product 1", 100, 29.99);
        Product p2 = new Product("P002", "Product 2", 150, 19.99);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        System.out.println("Initial Inventory:");
        inventory.displayProducts();

        // Update a product
        Product updatedP1 = new Product("P001", "Updated Product 1", 120, 34.99);
        inventory.updateProduct("P001", updatedP1);

        // Delete a product
        inventory.deleteProduct("P002");

        System.out.println("Updated Inventory:");
        inventory.displayProducts();
    }
}

