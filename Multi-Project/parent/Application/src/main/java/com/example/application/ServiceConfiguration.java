package com.example.application;

import org.example.Dao;
import org.example.dao.DaoImp;
import org.example.dao.UserRepository;
import org.example.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"org.example.dao", "org.example.controller"})
public class ServiceConfiguration {

    @Bean
    public Service service(Dao dao){
        return new Service(dao);
    }

    @Bean
    public Dao dao(UserRepository userRepository){
        return new DaoImp(userRepository);
    }
}
