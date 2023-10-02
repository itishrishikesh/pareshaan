package com.bugtracker.pareshaan.controller;

import com.bugtracker.pareshaan.models.Bug;
import com.bugtracker.pareshaan.services.BugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bugs")
public class BugController {
    @Autowired
    private BugService bugService;
   @GetMapping("/")
    public List<Bug> bugs(){
       return bugService.getAllBugs();
   }

   @PostMapping("/")
   public void saveBug(@RequestBody Bug bug){
       bugService.saveBug(bug);
   }
}
