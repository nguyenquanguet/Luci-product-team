package org.example.controller;

import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class Controller {

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
    public String save(@Valid @RequestBody Service.ServiceDTO serviceDTO){
        service.save(serviceDTO);
        if(service.save(serviceDTO))
            return "Save Success";
        return "Save UnSuccess";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable(value = "id") int userID,  @Valid @RequestBody Service.ServiceDTO serviceDTO){
        service.update(serviceDTO, userID);
        if(service.update(serviceDTO,userID))
            return "Update Success";
        return "Update UnSuccess. Because id not found in entity";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") int userID){
        service.delete(userID);
        if(service.delete(userID))
            return "Delete Success" + userID;
        return "Delete UnSuccess: " + userID;
    }

}