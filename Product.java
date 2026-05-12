public class Product {
    private String id;
    private String name;
    private int stockQuantity;

    public Product(String id, String name, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
    }

    // Aggiungi questo metodo qui sotto
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void reduceStock(int amount) throws Exception {
        if (amount > stockQuantity) {
            throw new Exception("Insufficient stock for product: " + name);
        }
        this.stockQuantity -= amount;
    }
}