package com.bugtracker.pareshaan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Bug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String title;
    String stepsToReproduce;
    String description;
    String priority;
    String attachment;
    String links;
    int projectId;
    Status status;
    int reporterId;
    int assigneeId;
    int resolverId;
}
