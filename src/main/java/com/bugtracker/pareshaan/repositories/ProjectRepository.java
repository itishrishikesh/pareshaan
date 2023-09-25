package com.bugtracker.pareshaan.repositories;

import com.bugtracker.pareshaan.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
