package com.example.springrest2.service.impl;

import com.example.springrest2.component.User;
import com.example.springrest2.controller.dto.UserDto;
import com.example.springrest2.controller.mapper.UserMapper;
import com.example.springrest2.repository.UserRepository;
import com.example.springrest2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("userservice")
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserDto> findAllUsers() {
        List<UserDto> usersDto = new ArrayList<>();
        List<User> users = userRepository.findAll();
        for (User user : users) {
            usersDto.add(UserMapper.USER_MAPPER.fromUser(user));
        }
        return usersDto;
    }

    @Override
    public UserDto findUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) {
            return null;
        }
        User user = userOptional.get();
        return UserMapper.USER_MAPPER.fromUser(user);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

//    @Override
//    public ResponseEntity<Object> updUser(User user, Long id) {
//        Optional<User> userOptional = userRepository.findById(id);
//        if (userOptional.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//        user.setId(id);
//        userRepository.save(user);
//        return ResponseEntity.ok().build();
//    }
}
