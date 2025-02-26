package com.example.High_Performance.Inventory.Management.System.model.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class ProductResponse {
    private String name;
    private String category;
    private BigDecimal price;
    private Integer stock;
    private LocalDateTime createdAt;
}
