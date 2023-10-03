package com.example.udemy_example_project.services.environments;

import com.example.udemy_example_project.services.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("staging")
@Service("environmentService")
public class StagingEnvironmentService implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "This is the staging environment";
    }
}
