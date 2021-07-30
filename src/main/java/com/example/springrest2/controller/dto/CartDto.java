package com.example.springrest2.controller.dto;

import lombok.Data;

@Data
public class CartDto {

    private Long id;
    private Long quantity;
    private double lastPrice;
}
