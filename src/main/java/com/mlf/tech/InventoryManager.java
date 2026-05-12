package com.mlf.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service class that handles inventory logic.
 * It connects the Product model with the PostgreSQL database via
 * ProductRepository.
 */
@Service
public class InventoryManager {

    @Autowired
    private ProductRepository repository;

    /**
     * Persists a new product into the database.
     * The null check addresses the "Null type safety" warning.
     */
    public void addProduct(Product p) {
        if (p != null) {
            repository.save(p);
            System.out.println("LOG: Product successfully saved: " + p.getName());
        }
    }

    /**
     * Processes an order by checking stock levels in the database.
     * Updates the stock quantity directly in PostgreSQL if the order is valid.
     */
    public void processOrder(String productName, int quantity) {
        // Fetching the current state of inventory from Docker/PostgreSQL
        List<Product> products = repository.findAll();

        for (Product p : products) {
            // Case-insensitive search for the product name
            if (p != null && p.getName().equalsIgnoreCase(productName)) {
                try {
                    // Logic from Product class to reduce stock
                    p.reduceStock(quantity);

                    // Crucial: Persist the updated stock back to the database
                    repository.save(p);

                    System.out.println("SUCCESS: Processed " + quantity + " units of " + productName);
                } catch (Exception e) {
                    // Level 2 troubleshooting: Catching insufficient stock errors
                    System.err.println("ALERT: " + e.getMessage());
                }
                return; // Exit after finding and processing the product
            }
        }
        System.out.println("ERROR: Product '" + productName + "' not found in database.");
    }

    /**
     * Returns all products currently stored in the database.
     */
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}