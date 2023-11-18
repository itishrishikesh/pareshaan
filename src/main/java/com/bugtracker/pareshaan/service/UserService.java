package com.bugtracker.pareshaan.service;

import com.bugtracker.pareshaan.model.User;
import com.bugtracker.pareshaan.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User addUser(User user) {
        return repository.save(user);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User getUserById(Long id) {
    	return repository.findById(id).orElse(null);
    }

    public void updateUser(User user) {
        repository.removeUserByUsername(user.getUsername());
        repository.save(user);
    }

    public void delete(User user) {
        repository.removeUserByUsername(user.getUsername());
    }
}
