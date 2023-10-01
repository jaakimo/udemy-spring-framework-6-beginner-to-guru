package com.example.udemy_example_project.services.i18n;

import com.example.udemy_example_project.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FI")
@Service("i18nService")
public class FinnishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hei maailma! - FI";
    }
}
