package com.bugtracker.pareshaan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bug {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String summary;
    private String description;
    private List<String> steps;
    private User reporter;
    private User assigned;
    @OneToMany
    @JoinColumn(name = "bug_id", referencedColumnName = "id")
    private List<Comment> comments;
    @OneToMany
    @JoinColumn(name = "bug_id", referencedColumnName = "id")
    private List<Attachment> attachments;
}
