package com.demo.application;

import org.demo.Dao;
import org.demo.service.Service;
import org.demo.dao.DaoImp;
import org.demo.dao.UserRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"org.demo.dao", "org.demo.controller"})
@EnableJpaRepositories("org.demo.dao")
@EntityScan("org.demo.dao")
public class Configured {

    @Bean
    public Service service(Dao dao) {
        return new Service(dao);
    }

    @Bean
    public Dao dao(UserRepository userRepository) {
        return new DaoImp(userRepository);
    }
}
