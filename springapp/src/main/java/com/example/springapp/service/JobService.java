package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Job;
import com.example.springapp.repository.JobRepo;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo jr;
    public Job createJob(Job j)
    {
        return jr.save(j);
    }

    public List<Job> getAll()
    {
        return jr.findAll();
    }

    public Job getById(int jobId)
    {
        return jr.findById(jobId).orElse(null);
    }
    public List<Job> getbysort(String field)
    {
        return jr.findAll(Sort.by(Sort.Direction.ASC,field));
    }
}