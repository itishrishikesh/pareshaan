package com.bugtracker.pareshaan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    int id;
    String name;
    String email;
    String password;
    String role;
}
