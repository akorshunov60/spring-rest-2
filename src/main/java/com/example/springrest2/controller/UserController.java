package com.example.springrest2.controller;

import com.example.springrest2.component.User;
import com.example.springrest2.controller.dto.UserDto;
import com.example.springrest2.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("users")
public class UserController {

    private final UserServiceImpl userService;

    @GetMapping
    public List<UserDto> findAllUsers() { return userService.findAllUsers();}

    @GetMapping(value = "/{id}")
    public UserDto findUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    public User addUser(@RequestBody User user) { return userService.addUser(user); }

    @DeleteMapping(value = "/del/{id}")
    public void deleteUserById(@PathVariable Long id) { userService.deleteUserById(id); }
}
