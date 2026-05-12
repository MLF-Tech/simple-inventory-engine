package com.mlf.tech;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    // List to store products, mimicking a database table
    private List<Product> products = new ArrayList<>();

    // Method to add a product to the catalog
    public void addProduct(Product p) {
        products.add(p);
    }

    /**
     * Processes an order by searching for the product name.
     * Demonstrates Level 2 troubleshooting by catching errors
     * thrown by the Product class.
     */
    public void processOrder(String productName, int quantity) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(productName)) {
                try {
                    p.reduceStock(quantity);
                    System.out.println("SUCCESS: Processed " + quantity + " units of " + productName);
                } catch (Exception e) {
                    // Handling the technical error gracefully
                    System.err.println("ALERT: " + e.getMessage());
                }
                return;
            }
        }
        System.out.println("ERROR: Product '" + productName + "' not found in inventory.");
    }
}