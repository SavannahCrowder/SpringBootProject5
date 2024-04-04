package com.careersforyou.jobservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Project4Application {

    public static void main(String[] args) {
        SpringApplication.run(Project4Application.class, args);
    }

}
