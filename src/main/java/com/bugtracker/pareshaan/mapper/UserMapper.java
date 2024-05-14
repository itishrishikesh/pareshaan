package com.bugtracker.pareshaan.mapper;

import com.bugtracker.pareshaan.model.User;
import com.bugtracker.pareshaan.payload.UserDto;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToUserDto(User user);

    User userDtoToUser(UserDto userDto);
}
