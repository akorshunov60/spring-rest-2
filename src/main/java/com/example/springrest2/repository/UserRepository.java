package com.example.springrest2.repository;

import com.example.springrest2.component.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
