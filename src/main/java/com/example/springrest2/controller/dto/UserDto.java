package com.example.springrest2.controller.dto;

import com.example.springrest2.component.Order;
import lombok.*;

import java.util.List;

@Data
public class UserDto {

    private Long id;
    private String name;
    private List<Order> orders;
}
