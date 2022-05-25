package org.example.service;

import org.example.EmployeeService;

import java.util.List;

public class Service {
    private EmployeeService employeeService;

    public Service() {
    }

    public Service(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public List<EmployeeDTO> getAllEmployee(){
        return employeeService.listAllEmployee();
    }

    public void add(EmployeeDTO employeeDTO){
        employeeService.add(employeeDTO);
    }

    public void update(EmployeeDTO employeeDTO, Long id){
        employeeService.update(employeeDTO, id);
    }

    public void delete(Long id){
        employeeService.delete(id);
    }


}
