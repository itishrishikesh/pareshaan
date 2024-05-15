package com.bugtracker.pareshaan.controller;

import com.bugtracker.pareshaan.model.User;
import com.bugtracker.pareshaan.payload.LoginResponseDto;
import com.bugtracker.pareshaan.payload.UserDto;
import com.bugtracker.pareshaan.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/pareshaan/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") final Long id) {
        User user = userService.getUserById(id);
        if (user == null) {
            throw new NoSuchElementException("User with id " + id + " not found");
        }
        return user;
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto user) {
        return userService.addUser(user);
    }

    @PutMapping
    public UserDto updateUser(@RequestBody UserDto user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") final Long id) {
        userService.delete(id);
    }

    @PostMapping
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginResponseDto loginResponseDto) {
        // Todo: Implement Login
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
