package com.example.udemy_example_project.controllers;

import com.example.udemy_example_project.services.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final EnvironmentService environmentService;

    public EnvironmentController(@Qualifier("environmentService") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String sayEnvironment() {
        System.out.println("Hello World in EnvironmentController");
        return environmentService.getEnvironment();
    }
}
