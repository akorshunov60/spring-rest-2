package com.example.springrest2.repository;

import com.example.springrest2.component.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findProductByName(String name);
}
