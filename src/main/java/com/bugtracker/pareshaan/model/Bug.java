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
    @ElementCollection
    private List<String> steps;
    @OneToOne
    @JoinColumn(name = "reporter_id", referencedColumnName = "id")
    private User reporter;
    @OneToOne
    @JoinColumn(name = "assigned_id", referencedColumnName = "id")
    private User assigned;
    @OneToMany
    @JoinColumn(name = "bug_id", referencedColumnName = "id")
    private List<Comment> comments;
    @OneToMany
    @JoinColumn(name = "bug_id", referencedColumnName = "id")
    private List<Attachment> attachments;
}
