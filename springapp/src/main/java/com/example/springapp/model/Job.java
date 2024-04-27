package com.example.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Job {
    @Id
    int jobId;
    int minSalary,maxSalary;
    
    String jobTitle,jobDescription;
    public Job()
    {
        
    }

    public Job(int jobId,String jobTitle,int minSalary,String jobDescription,int maxSalary)
    {
        this.jobId=jobId;
        this.jobTitle=jobTitle;
        this.minSalary=minSalary;
        this.jobDescription=jobDescription;
        this.maxSalary=maxSalary;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }


    
}