package com.fr3nzy.JobApp.service;

import com.fr3nzy.JobApp.model.JobPost;
import com.fr3nzy.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
//        here jobPost kind of object is called DTO - Data Transfer Object
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
}
