package com.mypr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {

    // Handle GET requests to "/api/greet"
    @GetMapping("/greet")
    public String greet() {
        return "Hello, World!"+1;
    }

    // Handle GET requests to "/api/greet/{name}" where {name} is a path variable
    @GetMapping("/greet/{name}")
    public String greetWithName(@PathVariable String name){
        return "Hello, " + name + "Love You";
    }
}