package org.example.dao;

import org.example.EmployeeService;
import org.example.entity.Employee;
import org.example.service.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    ///@Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeDTO> listAllEmployee() {
        List<EmployeeDTO> employeeDTO = new ArrayList<EmployeeDTO>();
        for (Employee employee : employeeRepository.findAll()){
            employeeDTO.add(converDAOToDTO(employee));
        }
        return employeeDTO;
    }

    @Override
    public void add(EmployeeDTO employeeDTO) {
        employeeRepository.save(converDTOToDAO(employeeDTO));

    }

    @Override
    public void update(EmployeeDTO employeeDTO, Long id) {
        if(employeeRepository.findById(id).toString()== null) {
            System.out.println("null");
        }
        employeeRepository.save(converDTOToDAO(employeeDTO));
    }

    @Override
    public void delete(Long id) {
        if(employeeRepository.findById(id).toString()== null){
            System.out.println("null");
        }
        employeeRepository.deleteById(id);

    }

    public  static EmployeeDTO converDAOToDTO(Employee employee){

        EmployeeDTO serviceEmployee = new EmployeeDTO();
        serviceEmployee.setId(employee.getId());
        serviceEmployee.setName(employee.getName());
        serviceEmployee.setMobile(employee.getMobile());
        serviceEmployee.setAge(employee.getAge());
        serviceEmployee.setEmail(employee.getEmail());
        return serviceEmployee;
    }

    public  static Employee converDTOToDAO(EmployeeDTO employeeDTO){

        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setName(employeeDTO.getName());
        employee.setMobile(employeeDTO.getMobile());
        employee.setAge(employeeDTO.getAge());
        employee.setEmail(employeeDTO.getEmail());
        return employee;
    }
}
