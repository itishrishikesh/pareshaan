package com.bugtracker.pareshaan.repositories;

import com.bugtracker.pareshaan.models.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {
}
