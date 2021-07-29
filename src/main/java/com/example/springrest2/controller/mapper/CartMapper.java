package com.example.springrest2.controller.mapper;

import com.example.springrest2.component.Cart;
import com.example.springrest2.controller.dto.CartDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CartMapper {

    CartMapper CART_MAPPER = Mappers.getMapper(CartMapper.class);

    Cart toCart(CartDto cartDto);

    CartDto fromCart(Cart cart);
}
