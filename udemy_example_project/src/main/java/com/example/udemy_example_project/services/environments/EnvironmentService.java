package com.example.udemy_example_project.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"development", "default"})
@Service("environmentService")
public class EnvironmentService implements com.example.udemy_example_project.services.EnvironmentService {
    @Override
    public String getEnvironment() {
        return "This is the default environment";
    }
}
