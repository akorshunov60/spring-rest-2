package com.example.springrest2.repository;

import com.example.springrest2.component.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
