package org.example;

import org.example.dao.EmployeeRepository;
import org.example.dao.EmployeeServiceImpl;
import org.example.service.Service;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"org.example.dao", "org.example.controller"})
@EnableJpaRepositories("org.example.dao")
@EntityScan("org.example.entity")
public class EmployeeConfiguration {

    @Bean
    public Service service (EmployeeService employeeService){
        return new Service(employeeService);
    }
    @Bean
    public EmployeeService employeeService(EmployeeRepository employeeRepository){
        return  new EmployeeServiceImpl(employeeRepository);
    }
}
