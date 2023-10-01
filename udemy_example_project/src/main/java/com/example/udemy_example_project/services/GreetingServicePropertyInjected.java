package com.example.udemy_example_project.services;

import org.springframework.stereotype.Service;

@Service("greetingServiceProperty")
public class GreetingServicePropertyInjected {

    public String sayGreeting() {
        return "Hello from the Property Injected Bean!";
    }
}
