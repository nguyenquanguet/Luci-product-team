package org.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Controller {

    @Bean
    Controller controller(){
        return new Controller();
    }

    @Autowired
    private Service userService;

    public void addUser(User user){
        userService.save(user);
    }

    public void updateUser(User user){
        userService.update(user);
    }

    public void deleteUser(User user){
        userService.delete(user);
    }
}