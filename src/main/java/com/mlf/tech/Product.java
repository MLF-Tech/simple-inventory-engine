package com.mlf.tech;

import jakarta.persistence.*; // Essential for mapping Java objects to Database tables

@Entity // Tells Spring Boot: "Map this class to a database table"
@Table(name = "products") // Specifies the table name in PostgreSQL
public class Product {

    @Id // Defines the Primary Key for the table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Database will auto-increment the ID (1, 2, 3...)
    private Long internalId;

    private String id; // This is your business SKU (e.g., "PROD-001")
    private String name; // Name of the item
    private int stockQuantity; // Number of items in stock

    /**
     * DEFAULT CONSTRUCTOR: Mandatory for JPA/Hibernate.
     * It allows the system to create an empty object before filling it with
     * database data.
     */
    public Product() {
    }

    /**
     * Standard constructor for creating new products in your code.
     */
    public Product(String id, String name, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
    }

    // GETTERS AND SETTERS: Required for Spring to access private fields
    public Long getInternalId() {
        return internalId;
    }

    public void setInternalId(Long internalId) {
        this.internalId = internalId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    /**
     * Business logic to decrease stock level.
     * Throws an exception if the requested amount is not available.
     */
    public void reduceStock(int amount) throws Exception {
        if (amount > stockQuantity) {
            throw new Exception("Insufficient stock for: " + name);
        }
        this.stockQuantity -= amount;
    }
}