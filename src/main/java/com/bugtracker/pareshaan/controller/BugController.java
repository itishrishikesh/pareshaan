package com.bugtracker.pareshaan.controller;

import com.bugtracker.pareshaan.payload.BugDto;
import com.bugtracker.pareshaan.service.BugService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/bug")
@RequiredArgsConstructor
public class BugController {
    private final BugService bugService;

    @PostMapping
    public ResponseEntity<BugDto> createBug(@RequestBody BugDto bugDto) {
        return new ResponseEntity<>(bugService.saveBug(bugDto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<BugDto> updateBug(@RequestBody BugDto bugDto) {
        return new ResponseEntity<>(bugService.updateBug(bugDto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<BugDto>> findBug(@RequestParam Map<String, String> filter) {
        return new ResponseEntity<>(bugService.findAllBugsByFilter(filter), HttpStatus.OK);
    }
}
