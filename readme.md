**Java Inventory Engine: API Evolution**

This project demonstrates the transition from core Java logic to modern backend infrastructure. Originally developed as a CLI tool following my graduation from CodeFactory Vienna, it has been refactored into a Spring Boot service with full database persistence.

**Project Objective**

The goal is to translate professional experience in ERP systems (JTL-Wawi) and Operations into a scalable backend service. The engine handles real-world business scenarios such as stock depletion, inventory integrity, and automated error handling.

**Technical Stack**

Language: Java 21

Framework: Spring Boot 3.x

Database: PostgreSQL 15 (via Spring Data JPA/Hibernate)

Infrastructure: Docker & Docker Compose

**Key Engineering Features**

Business-Logic Alignment: Implementation of "Level 2 Troubleshooting" logic to manage business exceptions (e.g., stock insufficiency) and ensure data integrity.

Architecture: Strict separation of concerns between Data Models (Product), Persistence Layer (Repository), and Business Logic (Service).

Containerization: Orchestrated PostgreSQL environment using Docker to ensure consistency across development and deployment stages.

Persistence: Full migration from local collections to persistent storage, maintaining state across system restarts.

**Project Structure**

The core logic resides in src/main/java/com/mlf/tech/:

SimpleInventoryEngineApplication.java: Entry point and automated integration test runner.

Product.java: Entity model with JPA mapping.

ProductRepository.java: Interface for database communication.

InventoryManager.java: Service layer handling business logic.

**Roadmap**

[x] Initial Java Logic & OOP Structure

[x] Spring Boot Migration & JPA Persistence

[x] Dockerization (PostgreSQL Container)

[ ] REST API Endpoints (Integration with n8n/Make)

[ ] API Documentation (Swagger/OpenAPI)

Developed by Maria Laura Fagioli – Junior Full Stack Developer
