package com.example.springrest2.service;

import com.example.springrest2.component.Product;
import com.example.springrest2.controller.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAllProducts();

    ProductDto findProductById(Long id);

    ProductDto findProductByName(String name);

    Product addProduct(Product product);

    void deleteProductById(Long id);
}
