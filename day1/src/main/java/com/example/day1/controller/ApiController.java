package com.example.day1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController 
{
    @GetMapping("/")
    public String get()
    {
        return "Welcome Spring Boot";
    }
}
