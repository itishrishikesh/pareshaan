package com.bugtracker.pareshaan.repository;

import com.bugtracker.pareshaan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findUserByUsername(String username);
    public void removeUserByUsername(String username);
}
