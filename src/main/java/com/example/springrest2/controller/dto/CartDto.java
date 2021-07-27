package com.example.springrest2.controller.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CartDto {

    private Long id;
    private Long quantity;
    private double lastPrice;
}
