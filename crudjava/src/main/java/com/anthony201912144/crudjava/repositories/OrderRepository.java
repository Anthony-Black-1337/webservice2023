package com.anthony201912144.crudjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anthony201912144.crudjava.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
