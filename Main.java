public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Initializing the inventory
        // Mimicking data management for global clients or ERP structures
        manager.addProduct(new Product("001", "Photo Book", 10));
        manager.addProduct(new Product("002", "Glossy Print", 50));

        System.out.println("--- Starting Order Processing (Java 26) ---");

        // Test 1: Successful execution
        manager.processOrder("Photo Book", 2);

        // Test 2: Level 2 Troubleshooting - Handling stock insufficiency
        // This confirms the 360/360 logic and system reliability
        manager.processOrder("Photo Book", 15);

        // Test 3: Data Integrity - Searching for a non-existent item
        manager.processOrder("Canvas Print", 1);

        System.out.println("--- Processing Complete ---");
    }
}