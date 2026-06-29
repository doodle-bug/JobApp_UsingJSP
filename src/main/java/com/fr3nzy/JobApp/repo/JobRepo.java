package com.fr3nzy.JobApp.repo;

import com.fr3nzy.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer",
                    "Looking for an experienced Java developer to work on enterprise applications",
                    3,
                    List.of("Java", "Spring Boot", "MySQL", "REST API")),
            new JobPost(2, "Frontend Developer",
                    "Seeking a creative frontend developer with strong UI/UX skills",
                    2,
                    List.of("React", "JavaScript", "HTML", "CSS", "Tailwind")),
            new JobPost(3, "Full Stack Developer",
                    "Full stack developer needed for building scalable web applications",
                    5,
                    List.of("Java", "Spring", "Angular", "PostgreSQL", "Docker")),
            new JobPost(4, "DevOps Engineer",
                    "DevOps engineer to manage CI/CD pipelines and cloud infrastructure",
                    4,
                    List.of("AWS", "Jenkins", "Kubernetes", "Terraform", "Linux")),
            new JobPost(5, "Data Scientist",
                    "Data scientist to analyze data and build machine learning models",
                    3,
                    List.of("Python", "TensorFlow", "Pandas", "SQL", "Jupyter"))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }
}
