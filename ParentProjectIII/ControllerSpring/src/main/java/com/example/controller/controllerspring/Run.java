package com.example.controller.controllerspring;

import com.example.su.seviceuser.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example.controller","com.example.su","com.example.repository"})
public class Run {

}
