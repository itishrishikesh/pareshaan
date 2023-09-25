package com.bugtracker.pareshaan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Project {
    @Id
    int id;
    String name;
    String description;
    String pointOfContact;
    String email;
}
