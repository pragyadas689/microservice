package com.pwc.employee.service.service.impl;

import com.pwc.employee.service.dto.Department;
import com.pwc.employee.service.dto.EmployeeDepartment;
import com.pwc.employee.service.entity.Employee;
import com.pwc.employee.service.repository.EmployeeRepository;
import com.pwc.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private  EmployeeRepository employeeRepository;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeDepartment getEmployeeWithDepartment(Long id) {
        //get employee
        Employee employee = employeeRepository.findById(id).get();

        //department
        Department department = restTemplate.getForObject("http://localhost:9000/api/departments/"+ employee.getDepartmentId(),
                Department.class);
        EmployeeDepartment response = new EmployeeDepartment();
        response.setEmployee(employee);
        response.setDepartment(department);
        return response;
    }
}
