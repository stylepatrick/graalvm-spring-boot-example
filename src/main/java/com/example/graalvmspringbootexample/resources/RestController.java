package com.example.graalvmspringbootexample.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping(value = "api")
    public ResponseEntity<String>api() {
        return ResponseEntity.ok("API!");
    }

}
