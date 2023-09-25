package com.bugtracker.pareshaan.repositories;

import com.bugtracker.pareshaan.models.Bug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BugRepository extends JpaRepository<Bug, Long> {
}
