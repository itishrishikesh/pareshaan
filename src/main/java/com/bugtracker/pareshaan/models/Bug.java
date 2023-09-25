package com.bugtracker.pareshaan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Bug {
    @Id
    int id;
    String title;
    String stepsToReproduce;
    String description;
    String priority;
    String attachment;
    String links;
    int project_id;
    Status status;
    User reporter;
    User assignee;
    User resolver;
}
