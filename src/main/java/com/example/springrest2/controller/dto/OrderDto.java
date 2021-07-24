package com.example.springrest2.controller.dto;

import com.example.springrest2.component.CartEntry;
import com.example.springrest2.component.Product;
import com.example.springrest2.component.User;
import lombok.*;

import java.util.List;

@Data
public class OrderDto {

    private Long id;
    private User user;
    private List<Product> products;
    private List<CartEntry> cartEntries;
}
