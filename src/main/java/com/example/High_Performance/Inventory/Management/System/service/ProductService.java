package com.example.High_Performance.Inventory.Management.System.service;

import com.example.High_Performance.Inventory.Management.System.model.Product;
import com.example.High_Performance.Inventory.Management.System.model.dto.ProductRequest;
import com.example.High_Performance.Inventory.Management.System.model.dto.ProductResponse;
import com.example.High_Performance.Inventory.Management.System.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public ProductResponse addProduct(ProductRequest product) {
        Product newProduct = Product.builder()
                .name(product.getName())
                .category(product.getCategory())
                .price(product.getPrice())
                .stock(product.getStock())
                .createdAt(LocalDateTime.now())
                .build();
        productRepository.save(newProduct);

        ProductResponse response = ProductResponse.builder()
                .name(newProduct.getName())
                .category(newProduct.getCategory())
                .price(newProduct.getPrice())
                .stock(newProduct.getStock())
                .createdAt(LocalDateTime.now())
                .build();

        return response;
    }

}
