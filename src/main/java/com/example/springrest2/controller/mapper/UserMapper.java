package com.example.springrest2.controller.mapper;

import com.example.springrest2.component.User;
import com.example.springrest2.controller.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);

    User toUser(UserDto userDto);

    UserDto fromUser(User user);

    List<User> toUsers(List<UserDto> usersDto);

    List<UserDto> fromUsers(List<User> users);
}
