package com.bugtracker.pareshaan.controller;

import com.bugtracker.pareshaan.payload.BugDto;
import com.bugtracker.pareshaan.service.BugService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bug")
@RequiredArgsConstructor
public class BugController {
    private final BugService bugService;
    @PostMapping
    public ResponseEntity<BugDto> createBug(@RequestBody BugDto bugDto) {
        return new ResponseEntity<>(bugService.saveBug(bugDto), HttpStatus.CREATED);
    }
}
