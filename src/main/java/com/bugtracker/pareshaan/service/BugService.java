package com.bugtracker.pareshaan.service;

import com.bugtracker.pareshaan.model.Bug;
import com.bugtracker.pareshaan.repository.BugRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BugService {
    private final BugRepository bugRepository;

    public Bug addBug(Bug bug) {
        return bugRepository.save(bug);
    }

    public Bug getBug(Long id) {
        return bugRepository.findById(id).orElse(null);
    }
    public List<Bug> getBugByUserId(Long userId) {
        return bugRepository.findBugByUserId(userId);
    }

    public void deleteBug(Long id) {
        bugRepository.deleteById(id);
    }

    public List<Bug> getAllBugs() {
        return bugRepository.findAll();
    }

    public Bug updateBug(Bug bug) {
        return bugRepository.save(bug);
    }
}
