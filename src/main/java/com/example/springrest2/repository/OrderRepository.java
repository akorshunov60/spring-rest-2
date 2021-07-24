package com.example.springrest2.repository;


import com.example.springrest2.component.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
