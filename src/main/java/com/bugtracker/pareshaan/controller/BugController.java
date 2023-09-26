package com.bugtracker.pareshaan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bugs")
public class BugController {
   @GetMapping("/hello")
    public String bugs(){
       return "bugs are here!";
   }
}
