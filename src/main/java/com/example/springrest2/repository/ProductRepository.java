package com.example.springrest2.repository;

import com.example.springrest2.component.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT pr FROM Product pr where pr.name=?1")
    Product findProductByName(String name);
}
