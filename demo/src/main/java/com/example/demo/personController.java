package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class personController {
    @Autowired
    personService ps;
    @PostMapping("/pers")
    public void get(@RequestBody person p)
    {
        ps.createperson(p);
    }
    @GetMapping("/perso")
        public List<person> get1()
        {
            return ps.getperson();
        }
    
}
