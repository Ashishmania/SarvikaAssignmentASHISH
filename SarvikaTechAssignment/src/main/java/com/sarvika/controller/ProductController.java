package com.sarvika.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarvika.dto.ProductDto;
import com.sarvika.entity.Product;
import com.sarvika.exception.ProductNotFoundException;
import com.sarvika.service.ProductService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@Validated
public class ProductController {

	private final ProductService productService;

	@GetMapping
	public List<Product> getAllProducts() {
		return productService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id) {

		Product product = productService.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("product not found with Id : " + id));
		return ResponseEntity.status(HttpStatus.OK).body(product);

	}

	@PostMapping
	public ResponseEntity<ProductDto> createProduct(@Valid @RequestBody ProductDto productDto) {
		// Convert ProductDto to Product entity
		Product product = convertToEntity(productDto);
		Product savedProduct = productService.save(product);

		// Convert saved Product entity back to ProductDto
		ProductDto savedProductDto = convertToDto(savedProduct);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedProductDto);
	}

	// Method to convert ProductDto to Product
	private Product convertToEntity(ProductDto productDto) {
		Product product = new Product();
		product.setName(productDto.getName());
		product.setDescription(productDto.getDescription());
		product.setPrice(productDto.getPrice());
		return product;
	}

	// Method to convert Product to ProductDto
	private ProductDto convertToDto(Product product) {
		return new ProductDto(product.getId(), product.getName(), product.getDescription(), product.getPrice());
	}

	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Long id, @Valid @RequestBody Product product) {
		return productService.update(id, product);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
		productService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
