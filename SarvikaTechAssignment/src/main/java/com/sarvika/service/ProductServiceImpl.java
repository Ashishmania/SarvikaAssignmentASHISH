package com.sarvika.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sarvika.entity.Product;
import com.sarvika.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;

	@Override
	public List<Product> findAll() {

		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findById(Long id) {

		return productRepository.findById(id);
	}

	@Override
	public Product save(Product product) {

		return productRepository.save(product);
	}

	@Override
	public Product update(Long id, Product product) {

		product.setId(id);
		return productRepository.save(product);
	}

	@Override
	public void delete(Long id) {

		productRepository.deleteById(id);
	}

}
