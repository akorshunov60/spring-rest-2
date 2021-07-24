package com.example.springrest2.controller.mapper;

import com.example.springrest2.component.User;
import com.example.springrest2.controller.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    //    @Mapping(source = "name", target = "name")
    User toUser(UserDto userDto);

    //При наличии аннотаций Mapping на методе toProduct, аннотация InheritInverseConfiguration будет производить обратную обработку этих правил.
    //В отсутствии Mapping использовать InheritInverseConfiguration не обязательно
//    @InheritInverseConfiguration
    UserDto fromUser(User user);

    List<User> toUsers(List<UserDto> userDtoList);

    List<UserDto> fromUsers(List<User> userList);}
