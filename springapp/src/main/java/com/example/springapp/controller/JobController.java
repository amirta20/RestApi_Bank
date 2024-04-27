package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springapp.model.Job;
import com.example.springapp.service.JobService;
import java.util.List;

@RestController
@RequestMapping("/api")
public class JobController {
    @Autowired
    JobService js;

    @PostMapping("/job")
    public ResponseEntity<Job> add(@RequestBody Job j)
    {
        js.createJob(j);
        return new ResponseEntity<>(j, HttpStatus.CREATED);
    }

    @GetMapping("/job")
    public ResponseEntity<List<Job>> getAll()
    {
        try
        
        {
            List<Job> j=js.getAll();
             return new ResponseEntity<>(j,HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/job/{jobId}")
    public ResponseEntity<Job> get(@PathVariable("jobId")int jobId)

    {
        try
        
        {
            Job j=js.getById(jobId);
            return new ResponseEntity<>(j,HttpStatus.OK);
        } 
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/sort/{field}")
    public ResponseEntity<List<Job>> getbysort(@PathVariable String field)
    {
        try{
            return new ResponseEntity<>(js.getbysort(field),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    // @GetMapping("/job/{jobId}")
    // public Optional<Job> getJobById(@PathVariable int jobId) {
    //     Optional<Job> job = js.getJobById(jobId);
    //     return job;
    // }
}