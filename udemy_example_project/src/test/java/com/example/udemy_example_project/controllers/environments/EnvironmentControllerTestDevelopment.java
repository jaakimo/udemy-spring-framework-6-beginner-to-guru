package com.example.udemy_example_project.controllers.environments;

import com.example.udemy_example_project.controllers.EnvironmentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"development", "EN"})
@SpringBootTest
class EnvironmentControllerTestDevelopment {
    @Autowired
    EnvironmentController controller;
    @Test
    void testSayEnvironment() {
        System.out.println(controller.sayEnvironment());
    }
}