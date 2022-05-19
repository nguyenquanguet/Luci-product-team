package com.example.controller.controllerspring;

import com.example.dao.daos.User;
import com.example.su.seviceuser.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private Service service;

    @GetMapping("/getUser")
    public List<User> getAll(){
        List<User> users = service.getAll();
        return users;
    }
}
