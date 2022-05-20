package com.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//       User user = new User(12,"name", 14);
//       context.getBean(Controller.class).addUser((Dao) user);
    }

}
