package com.example.springrest2.service.impl;

import com.example.springrest2.component.Product;
import com.example.springrest2.controller.dto.ProductDto;
import com.example.springrest2.controller.mapper.ProductMapper;
import com.example.springrest2.repository.ProductRepository;
import com.example.springrest2.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("productservice")
public class ProductSeviceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> findAllProducts() {
        List<ProductDto> productsDto = new ArrayList<>();
        List<Product> products = productRepository.findAll();
        for (Product product : products) {
            productsDto.add(ProductMapper.Product_MAPPER.fromProduct(product));
        }
        return productsDto;
    }

    @Override
    public ProductDto findProductById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isEmpty()) {
            return null;
        }
        Product product = productOptional.get();
        return ProductMapper.Product_MAPPER.fromProduct(product);
    }

    @Override
    public ProductDto findProductByName(String name) {
        Optional<Product> productOptional = Optional.ofNullable(productRepository
                .findProductByName(name));
        if (productOptional.isEmpty()) {
            return null;
        }
        Product product = productOptional.get();
        return ProductMapper.Product_MAPPER.fromProduct(product);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
