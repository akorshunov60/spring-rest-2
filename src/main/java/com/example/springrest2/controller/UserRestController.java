package com.example.springrest2.controller;

import com.example.springrest2.component.User;
import com.example.springrest2.controller.dto.UserDto;
import com.example.springrest2.controller.mapper.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("users")
public class UserRestController {

    private final List<User> users = new ArrayList<>();

    {
        users.add(new User(1L, "Александр"));
        users.add(new User(2L, "Даниил"));
        users.add(new User(3L, "Никита"));
        users.add(new User(4L, "Сергей"));
    }

    @GetMapping
    public List<UserDto> findAllUsers() {
        return users.stream().map(UserMapper.MAPPER::fromUser).collect(Collectors.toList());
    }

    @GetMapping(value = "/{id}")
    public UserDto findUserById (@PathVariable Long id) {
        return users.stream().filter(it -> it.getId().equals(id)).map(UserMapper.MAPPER::fromUser).findFirst().orElseThrow(() ->
                new NoResultException("Пользователь с указанным id (" + id + ") не существует!"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    public void addUser(@RequestBody UserDto userDto) {
        users.add(UserMapper.MAPPER.toUser(userDto));
    }

    @GetMapping(value = "/delete/{id}")
    public void deleteUserById (@PathVariable Long id) {
        users.removeIf(it -> it.getId().equals(id));
    }

    @GetMapping("exception")
    public void exception() {
        throw new IllegalArgumentException("Пользователь с указанным id не существует!");
    }
}
