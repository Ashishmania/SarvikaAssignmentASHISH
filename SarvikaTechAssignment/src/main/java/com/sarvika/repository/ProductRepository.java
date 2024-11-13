package com.sarvika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarvika.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
