package com.bugtracker.pareshaan.service;

import com.bugtracker.pareshaan.mapper.UserMapper;
import com.bugtracker.pareshaan.model.User;
import com.bugtracker.pareshaan.payload.UserDto;
import com.bugtracker.pareshaan.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public UserDto addUser(UserDto user) {
        User userToSave = UserMapper.INSTANCE.userDtoToUser(user);
        return UserMapper.INSTANCE.userToUserDto(repository.save(userToSave));
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User getUserById(Long id) {
    	return repository.findById(id).orElse(null);
    }

    public UserDto updateUser(UserDto user) {

        repository.findById(user.getId()).orElseThrow();

        User userToUpdate = UserMapper.INSTANCE.userDtoToUser(user);

        return UserMapper.INSTANCE.userToUserDto(repository.save(userToUpdate));
    }

    public void delete(Long id) {
        repository.findById(id).orElseThrow();
        repository.deleteById(id);
    }
}
