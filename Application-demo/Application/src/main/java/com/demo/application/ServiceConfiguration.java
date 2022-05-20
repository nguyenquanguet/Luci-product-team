package com.demo.application;

import org.demo.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    Service service(){
        return new Service();
    }

    @Bean
    User user(){
        return new User();
    }

}
