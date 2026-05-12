## **Java Inventory Engine (JDK 26)**

This is my first Java project, developed right after graduating from CodeFactory Vienna with a perfect score of 360/360.

**Why I built this**
Coming from a professional background in Strategic Project Management and ERP infrastructure (such as JTL-Wawi), I wanted to rebuild a warehouse stock logic from scratch. My goal was to translate my operational experience into clean, functional code that handles real-world business scenarios.

**Key Technical Features**
Level 2 Troubleshooting Logic: I implemented custom exception handling using try-catch blocks. Instead of letting the program crash, the system catches business errors (like insufficient stock) and logs them gracefully—just like the technical support flows I managed in my previous roles.

**Data Integrity & OOP**
I used core Object-Oriented Programming principles to separate the data model (Product) from the business logic (InventoryManager), ensuring that product data is protected and modified only through secure methods.

**Modern Java**
I chose to use JDK 26 to immediately work with the latest features of the language, proving my ability to quickly learn and implement modern technology stacks.

**Project Structure**
Product.java: Defines the product model and the core logic for stock reduction.

**InventoryManager.java**
Manages the product collection and processes orders.

**Main.java**
The entry point used to test different scenarios (successful orders, stock alerts, and "product not found" errors).

**How to Run**
Compile: javac Main.java

Run: java Main

---

Developed by _Maria Laura Fagioli - Full Stack Web Developer_

## Next steps

- Try small edits: add another product or change initial stock to see how the program reacts.
- Improve console messages to be clearer when orders succeed or fail.
- Check inputs: ensure order quantities are positive numbers before processing.
- Practice the edit/compile/run cycle: edit code, recompile with `javac *.java`, then run `java Main` to see results.
- Keep sample runs: save a few console outputs to show examples of program behavior.
- Tests (JUnit): write basic tests to check stock updates and missing products.
- JSON: save or load product lists from a small JSON file to keep data between runs.
- REST API: connect this logic to a web server (using Spring Boot) to allow external applications to check stock and process orders via HTTP requests (GET/POST) and JSON responses.
