# Simple Inventory Engine (Java 26)

## 🚀 Overview

This is my first Java project, developed following my graduation from CodeFactory Vienna (360/360 score).
The application is a backend logic engine designed to manage warehouse stocks and order processing, inspired by my professional experience managing ERP infrastructures (JTL-Wawi).

## 🛠️ Technical Implementation

The project demonstrates core Object-Oriented Programming (OOP) principles and advanced error handling:

- **Data Integrity & Encapsulation**: Uses private fields and getters to ensure data consistency.
- **Exception Handling (Level 2 Troubleshooting)**: Implemented a robust `try-catch` logic to handle business errors (e.g., insufficient stock) without system interruption.
- **Scalable Architecture**: Decoupled the Data Model (`Product`) from the Business Logic (`InventoryManager`).

## 📁 File Structure

- **Product.java**: Defines the product entity and contains the core validation logic for stock movements.
- **InventoryManager.java**: Manages the product collection and orchestrates the order fulfillment flow.
- **Main.java**: The entry point used to simulate real-world production scenarios and edge cases.

## 📈 Why Java 26?

As a **quick and self-learner**, I chose to build this project using the latest **Java 26** release to explore the most modern features of the JVM ecosystem and stay ahead of industry standards.

## ⚙️ How to Run

1. Ensure JDK 26 is installed.
2. Open terminal in the project folder.
3. Compile: `javac Main.java`
4. Run: `java Main`

---

_Developed by Maria Laura Fagioli – Junior Full-Stack Web Developer_
