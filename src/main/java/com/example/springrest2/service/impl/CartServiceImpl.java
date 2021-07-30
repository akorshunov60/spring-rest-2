package com.example.springrest2.service.impl;

import com.example.springrest2.component.Cart;
import com.example.springrest2.controller.dto.CartDto;
import com.example.springrest2.controller.mapper.CartMapper;
import com.example.springrest2.repository.CartRepository;
import com.example.springrest2.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("cartservice")
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Override
    public List<CartDto> findAllCarts() {
        List<CartDto> cartsDto = new ArrayList<>();
        List<Cart> carts = cartRepository.findAll();
        for (Cart cart : carts) {
            cartsDto.add(CartMapper.CART_MAPPER.fromCart(cart));
        }
        return cartsDto;    }

    @Override
    public CartDto findCartById(Long id) {
        Optional<Cart> cartOptional = cartRepository.findById(id);
        if (cartOptional.isEmpty()) {
            return null;
        }
        Cart cart = cartOptional.get();
        return CartMapper.CART_MAPPER.fromCart(cart);
    }
}
