package com.example.springrest2.controller;

import com.example.springrest2.controller.dto.CartDto;
import com.example.springrest2.service.impl.CartServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("carts")
public class CartController {

    private final CartServiceImpl cartService;

    @GetMapping
    public List<CartDto> findAllCarts() {
        return cartService.findAllCarts();
    }

    @GetMapping(value = "/{id}")
    public CartDto findCartById(@PathVariable Long id) {
        return cartService.findCartById(id);
    }
}
