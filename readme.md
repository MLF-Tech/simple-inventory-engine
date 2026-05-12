**Java Inventory Engine: API Evolution**

This project marks my transition from core Java logic to modern backend infrastructure. Originally built as a CLI tool following my 360/360 graduation from CodeFactory Vienna, it is currently being refactored into a RESTful API.

**Objective**
To translate my professional experience in ERP systems (JTL-Wawi) and Operations into a scalable backend service. The engine handles real-world business scenarios like stock depletion, inventory integrity, and automated error handling.

**Technical Stack**
Language: Java 21/26

Framework: Spring Boot 3.x (Migration in progress)

Database: PostgreSQL (Integration via JPA/Hibernate)

Environment: Docker (Planned for containerized deployment)

**Key Engineering Features**
Logic-to-Business Alignment: Implemented "Level 2 Troubleshooting" logic. The system doesn't just run; it manages business exceptions (e.g., stock insufficiency) gracefully, mimicking professional technical support flows.

OOP Architecture: Clear separation of concerns between Data Models (Product), Persistence Layer (Repository), and Business Logic (Service).

Resilient Code: Transitioning from local collections to persistent storage to ensure data integrity across system restarts.

**Project Structure**
src/main/java/com/mlf/tech/

Main.java: Spring Boot entry point.

Product.java: Data model with JPA annotations.

InventoryController.java: REST endpoints for external system communication (n8n/Make/Web).

pom.xml: Dependency management for Spring Web and PostgreSQL.

**Roadmap**
[x] Initial Java Logic & OOP Structure

[x] Spring Boot Migration (Current Step)

[ ] Dockerization: Setting up a PostgreSQL container to remove local OS dependencies.

[ ] API Documentation: Implementing Swagger/OpenAPI.

[ ] Automation: Connecting the engine to an n8n workflow for automated stock alerts.

Developed by Maria Laura Fagioli – Junior Full Stack Developer
