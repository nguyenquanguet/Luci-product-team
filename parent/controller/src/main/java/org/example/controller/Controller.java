package org.example.controller;

import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class Controller {

    @Autowired
    private Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Service.ServiceDTO> collection(){
        return service.getAllUser();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void save(@Valid @RequestBody Service.ServiceDTO serviceDTO){
        service.save(serviceDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable(value = "id") int userID,  @Valid @RequestBody Service.ServiceDTO serviceDTO){
        service.update(serviceDTO, userID);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") int userID){
        service.delete(userID);
    }

}