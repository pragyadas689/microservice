package com.pwc.employee.service.controller;

import com.pwc.employee.service.entity.Employee;
import com.pwc.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pwc.employee.service.dto.EmployeeDepartment;
import java.util.List;

@RequestMapping("/api/employees")
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
    @GetMapping("/{id}/department")
    public EmployeeDepartment getEmployeeWithDepartment(@PathVariable("id") Long id){
        return employeeService.getEmployeeWithDepartment(id);
    }
}
