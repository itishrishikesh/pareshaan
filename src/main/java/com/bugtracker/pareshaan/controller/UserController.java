package com.bugtracker.pareshaan.controller;

import com.bugtracker.pareshaan.model.User;
import com.bugtracker.pareshaan.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/pareshaan/user")
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
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
