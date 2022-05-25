package org.example.controller;

import org.example.service.EmployeeDTO;
import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/list")
    public List<EmployeeDTO> getAllEmployee() {
        return service.getAllEmployee();
    }

    @PostMapping("/add")
    public void addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        service.add(employeeDTO);
    }

    @PutMapping("/update")
    public void updateEmployee(@RequestParam("id") Long id, @RequestBody EmployeeDTO employeeDTO) {
        service.update(employeeDTO, id);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(@RequestParam("id") Long id, @RequestBody EmployeeDTO employeeDTO) {
        service.delete(id);
    }

//    @DeleteMapping("/delete/{id}")
//    public void deleteEmployee(@PathVariable("id") Long id) {
//        service.delete(id);
//    }
}
