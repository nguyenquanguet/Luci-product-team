package com.demo.application;

import org.demo.Controller;
import org.demo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        User user = new User(12, "Long", 15);
        Controller controller = context.getBean(Controller.class);
        controller.addUser(user);
    }

}
