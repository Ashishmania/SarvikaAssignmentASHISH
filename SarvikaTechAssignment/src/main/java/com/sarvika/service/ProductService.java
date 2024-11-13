package com.sarvika.service;

import java.util.List;
import java.util.Optional;

import com.sarvika.entity.Product;

public interface ProductService {
	
	List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    Product update(Long id, Product product);
    void delete(Long id);

}
