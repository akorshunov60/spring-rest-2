package com.example.springrest2.controller.dto;

import com.example.springrest2.component.Order;
import com.example.springrest2.component.Product;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class CartEntryDto {

    private Long id;
    private Order order;
    private Product product;
    private Long quantity;
    private BigDecimal acquirePrice;
}
