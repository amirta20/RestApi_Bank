package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class personService 
{
    @Autowired
    personrepo pr;
    public void createperson(person p)
    {
        pr.save(p);
    }
    public List<person> getperson()
    {
        return pr.findAll();
    }
    
}
