/**
 * Simple Product model representing an item with an identifier, a name,
 * and a stock quantity.
 *
 * Fields are private and exposed via getters. The reduceStock method
 * decreases the available stock and signals an error when the requested
 * removal amount exceeds the available stock.
 */
public class Product {
    private String id;
    private String name;
    private int stockQuantity;

    /**
     * Constructs a new Product.
     *
     * @param id product identifier (should be unique for each product)
     * @param name human-friendly product name
     * @param stockQuantity initial stock level (zero or positive)
     */
    public Product(String id, String name, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
    }

    /**
     * Returns the product identifier.
     *
     * @return id string
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the product name.
     *
     * @return name string
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the current stock quantity for this product.
     *
     * @return available units in stock
     */
    public int getStockQuantity() {
        return stockQuantity;
    }

    /**
     * Reduces the stock by the given amount.
     *
     * Note: the method expects a positive amount. If the requested amount
     * is greater than the available stock, this method throws an Exception
     * describing the problem.
     *
     * @param amount number of units to remove from stock
     * @throws Exception if amount is greater than the available stock
     */
    public void reduceStock(int amount) throws Exception {
        if (amount > stockQuantity) {
            throw new Exception("Insufficient stock for product: " + name);
        }
        this.stockQuantity -= amount;
    }
}