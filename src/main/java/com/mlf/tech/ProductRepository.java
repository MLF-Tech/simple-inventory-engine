package com.mlf.tech;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Product entity.
 * It provides standard methods for database operations (save, find, delete).
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // No extra code needed! JpaRepository handles the basic CRUD operations.
}