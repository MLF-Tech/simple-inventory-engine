package com.mlf.tech;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SimpleInventoryEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleInventoryEngineApplication.class, args);
    }

    /**
     * This bean runs automatically after the application starts.
     * It populates the database with some initial data to test the Docker
     * connection.
     */
    @Bean
    public CommandLineRunner demo(InventoryManager inventoryManager) {
        return args -> {
            System.out.println("--- Starting Database Integration Test ---");

            // 1. Create and add some products
            inventoryManager.addProduct(new Product("SKU-001", "Laptop Pro", 10));
            inventoryManager.addProduct(new Product("SKU-002", "Monitor 4K", 5));
            inventoryManager.addProduct(new Product("SKU-003", "Mechanical Keyboard", 15));

            // 2. Test the business logic (Process an order)
            System.out.println("Processing order for Laptop Pro...");
            inventoryManager.processOrder("Laptop Pro", 2);

            // 3. Retrieve and print everything from PostgreSQL
            System.out.println("Current Inventory in PostgreSQL:");
            List<Product> allProducts = inventoryManager.getAllProducts();
            for (Product p : allProducts) {
                System.out
                        .println("Item: " + p.getName() + " | Stock: " + p.getStockQuantity() + " | SKU: " + p.getId());
            }

            System.out.println("--- Integration Test Completed Successfully ---");
        };
    }
}