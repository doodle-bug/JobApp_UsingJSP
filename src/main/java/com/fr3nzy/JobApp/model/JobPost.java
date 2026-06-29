package com.fr3nzy.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
//this will help you so you don't  have to create getter, setters and toString method'
@NoArgsConstructor
//this will tell that there is no default constructor
@AllArgsConstructor
//this will tell that it will take all the constructor as input

@Component
//this will make the below method as java managed component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;


}
