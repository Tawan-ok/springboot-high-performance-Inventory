package com.example.High_Performance.Inventory.Management.System.controller;

import com.example.High_Performance.Inventory.Management.System.model.Product;
import com.example.High_Performance.Inventory.Management.System.model.dto.ProductRequest;
import com.example.High_Performance.Inventory.Management.System.model.dto.ProductResponse;
import com.example.High_Performance.Inventory.Management.System.service.ProductService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductResponse> addProduct(@Valid @RequestBody ProductRequest product) {
        logger.info("Received Product Request: {}", product);
        return ResponseEntity.ok(productService.addProduct(product));
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/category/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category) {
        return productService.getProductsByCategory(category);
    }
}
