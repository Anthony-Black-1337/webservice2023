package com.anthony201912144.crudjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anthony201912144.crudjava.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
