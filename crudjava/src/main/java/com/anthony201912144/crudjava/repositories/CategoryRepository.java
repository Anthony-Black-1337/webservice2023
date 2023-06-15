package com.anthony201912144.crudjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anthony201912144.crudjava.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
