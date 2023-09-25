package com.bugtracker.pareshaan.services;

import com.bugtracker.pareshaan.models.Bug;
import com.bugtracker.pareshaan.repositories.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BugService {
    @Autowired
    private BugRepository bugRepository;

    public void saveBug(Bug bug) {
        bugRepository.save(bug);
    }
}