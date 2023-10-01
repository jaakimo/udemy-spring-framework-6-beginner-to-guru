package com.example.udemy_example_project.controllers;

import com.example.udemy_example_project.services.GreetingService;
import com.example.udemy_example_project.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }
    public String sayHello() {
        System.out.println("Hello World in MyController");
        return greetingService.sayGreeting();
    }

}