package com.example.springrest2.service;

import com.example.springrest2.component.User;
import com.example.springrest2.controller.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAllUsers();

    UserDto findUserById(Long id);

    UserDto findUserByName(String name);

    User addUser(User user);

    void deleteUserById(Long id);

}
