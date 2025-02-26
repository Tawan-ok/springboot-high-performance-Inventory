package com.example.High_Performance.Inventory.Management.System.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ProductRequest {
    private String name;
    private String category;
    private BigDecimal price;
    private Integer stock;


}
