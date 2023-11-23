package com.bugtracker.pareshaan.controller;

import com.bugtracker.pareshaan.model.Bug;
import com.bugtracker.pareshaan.service.BugService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/bug")
@RequiredArgsConstructor
public class BugController {
    private final BugService bugService;
    @GetMapping("/{id}")
    public Bug getBug(@PathVariable("id") final Long id) {
        Bug bug = bugService.getBug(id);
        if(bug == null){
            throw new NoSuchElementException("Bug not found with id: " + id);
        }
        return bugService.getBug(id);
    }

    @GetMapping("/user/{userId}")
    public List<Bug> getBugByUserId(Long userId) {
        return bugService.getBugByUserId(userId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bug createBug(@RequestBody Bug bug) {
        return bugService.addBug(bug);
    }

    @PutMapping
    public ResponseEntity<Bug> updateBug(@RequestBody Bug bug) {
        if (bugService.getBug(bug.getId()) != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(bugService.updateBug(bug));
        }
        return ResponseEntity.status(HttpStatus.OK).body(bugService.updateBug(bug));
    }

}
