package com.bugtracker.pareshaan.repository;

import com.bugtracker.pareshaan.model.Bug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BugRepository extends JpaRepository<Bug, Long> {
}
