package com.example.springrest2.controller.mapper;

import com.example.springrest2.component.Product;
import com.example.springrest2.controller.dto.ProductDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper Product_MAPPER = Mappers.getMapper(ProductMapper.class);

    Product toProduct(ProductDto productDto);


    ProductDto fromProduct(Product product);

    List<Product> toProducts(List<ProductDto> productDtoList);

    List<ProductDto> fromProducts(List<Product> productList);
}
