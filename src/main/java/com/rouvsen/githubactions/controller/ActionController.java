package com.rouvsen.githubactions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actions")
public class ActionController {

    @GetMapping
    public ResponseEntity<String> action() {
        return ResponseEntity.ok("Github Action Version: %s".formatted("0.1.0"));
    }

    @GetMapping("/test-caching")
    public ResponseEntity<String> testCaching(@RequestHeader String header) {
        return ResponseEntity.ok("Hi, %s.".formatted(header));
    }
}
