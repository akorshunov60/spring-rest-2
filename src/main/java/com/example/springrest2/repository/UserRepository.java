package com.example.springrest2.repository;

import com.example.springrest2.component.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u where u.name=?1")
    List<User> findUserByName(String name);
}
