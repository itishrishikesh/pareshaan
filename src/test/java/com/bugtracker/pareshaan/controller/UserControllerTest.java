package com.bugtracker.pareshaan.controller;

import com.bugtracker.pareshaan.payload.UserDto;
import com.bugtracker.pareshaan.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class UserControllerTest {
    @InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void createUser() {
        UserDto userDto = new UserDto(0L, "test@mail.in", "jonathan");
        Mockito.when(userService.addUser(userDto)).thenReturn(userDto);
        UserDto result = userController.createUser(userDto);
        Assertions.assertEquals(userDto, result);
    }
}
