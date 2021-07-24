package com.example.springrest2.controller;

import com.example.springrest2.component.Product;
import com.example.springrest2.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.NoResultException;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductRepository pr;

    public ProductController(ProductRepository pr) {
        this.pr = pr;
    }

    @GetMapping(value = "/{id}")
    public Product getProductById (@PathVariable Long id) {
        return pr.findById(id).orElseThrow(() ->
                new NoResultException("Товар с указанным id (" + id + ") не существует!"));
    }

    @GetMapping(value = "/")
    public List<Product> getAllProducts () {
        return pr.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/")
    public Product saveProduct(Product product) {
        return pr.save(product);
    }

    @GetMapping(value = "/delete/{id}")
    public void deleteProductById (@PathVariable Long id) {
        pr.deleteById(id);
    }
}
