package com.raselahmedb.audit.controller;

import com.raselahmedb.audit.model.Product;
import com.raselahmedb.audit.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PatchMapping("/{productId}")
    public void updateProduct(@PathVariable Long productId, @RequestBody Product product) {
        productRepository.save(product);
    }
}