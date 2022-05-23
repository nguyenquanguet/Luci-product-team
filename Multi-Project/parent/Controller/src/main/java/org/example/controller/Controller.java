package org.example.controller;

import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("")
    public List<Service.ServiceDTO> collection(){
        return service.getAllUser();
    }
}