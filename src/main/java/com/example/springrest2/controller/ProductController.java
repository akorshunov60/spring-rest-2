package com.example.springrest2.controller;

import com.example.springrest2.component.Product;
import com.example.springrest2.controller.dto.ProductDto;
import com.example.springrest2.service.impl.ProductSeviceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductSeviceImpl productService;

    @GetMapping
    public List<ProductDto> findAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping(value = "/{id}")
    public ProductDto findProductById(@PathVariable Long id) {
        return productService.findProductById(id);
    }

    @GetMapping(value = "/find_by_name/{name}")
    public ProductDto findProductByName(@PathVariable String name) { return productService.findProductByName(name);}

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    public Product addProduct(@RequestBody Product product) { return productService.addProduct(product); }

    @DeleteMapping(value = "/del/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }
}
