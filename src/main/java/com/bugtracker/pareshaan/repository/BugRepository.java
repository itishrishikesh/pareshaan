package com.bugtracker.pareshaan.repository;

import com.bugtracker.pareshaan.model.Bug;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BugRepository extends JpaRepository<Bug, Long> {
    public List<Bug> findBugByUserId(Long userId);
}
