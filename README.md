# Category Product CRUD Operations

## Overview

This project demonstrates **Category** and **Product** CRUD (Create, Read, Update, Delete) operations, showcasing **many-to-one** and **one-to-many** relationships. The project is built using **Spring Boot**, **JPA**, and **Hibernate** for handling database interactions. The application provides endpoints to manage categories and products, and these endpoints can be tested using **Postman**.

## Key Features:

- **Many-to-One Relationship**: A product can belong to only one category, but a category can have many products.
- **One-to-Many Relationship**: A category can have multiple associated products.
- **Database Integration**: The project uses **JPA** and **Hibernate** to manage database entities.
- **Postman Integration**: Use **Postman** to test CRUD operations for both **Category** and **Product** entities.

## Technology Stack

- **Spring Boot**: Framework for building the Java application.
- **Spring Data JPA**: Used for data access and management of **Category** and **Product** entities.
- **Hibernate**: ORM (Object-Relational Mapping) tool to handle the database transactions.
- **H2 Database**: In-memory database for testing and development (you can replace this with any other database, e.g., MySQL or PostgreSQL).
- **Postman**: Tool for testing and interacting with the APIs.
