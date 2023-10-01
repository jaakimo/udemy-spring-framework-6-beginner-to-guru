package com.example.udemy_example_project;

import com.example.udemy_example_project.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UdemyExampleProjectApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(UdemyExampleProjectApplication.class, args);
        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In main method.");
        System.out.println(controller.sayHello());

    }

}
