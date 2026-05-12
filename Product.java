public class Product {
    private String id;
    private String name;
    private int stockQuantity;

    // Constructor to initialize the product
    public Product(String id, String name, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
    }

    // Basic Getter for the name
    public String getName() {
        return name;
    }

    // Getter for current stock
    public int getStockQuantity() {
        return stockQuantity;
    }

    /**
     * Logic to reduce stock.
     * This simulates Level 2 troubleshooting by handling
     * the error before it breaks the system.
     */
    public void reduceStock(int amount) throws Exception {
        if (amount > stockQuantity) {
            // Throwing an exception if an order exceeds availability
            throw new Exception("Insufficient stock for product: " + name);
        }
        this.stockQuantity -= amount;
    }
}