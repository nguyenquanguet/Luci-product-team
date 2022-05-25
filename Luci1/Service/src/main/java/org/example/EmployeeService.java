package org.example;

import org.example.service.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDTO> listAllEmployee();

    void add(EmployeeDTO employeeDTO);

    void update(EmployeeDTO employeeDTO, Long id);

    void delete(Long id);

}
