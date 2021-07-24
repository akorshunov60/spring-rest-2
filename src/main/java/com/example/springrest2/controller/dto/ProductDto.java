package com.example.springrest2.controller.dto;

import com.example.springrest2.component.CartEntry;
import com.example.springrest2.component.Order;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {

    private Long id;
    private String name;
    private BigDecimal price;
    private List<Order> orders;
    private List<CartEntry> cartEntries;
}
