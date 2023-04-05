package com.example1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.demo.product.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
