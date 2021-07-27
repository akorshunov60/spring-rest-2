package com.example.springrest2.service;

import com.example.springrest2.controller.dto.CartDto;

import java.util.List;

public interface CartService {

    List<CartDto> findAllCarts();

    CartDto findCartById(Long id);
}
