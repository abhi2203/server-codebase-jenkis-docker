package com.example.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/hello")
    ResponseEntity<String> getMessage() {

        return ResponseEntity.ok().body("Hello this is docker api");
    }
}
