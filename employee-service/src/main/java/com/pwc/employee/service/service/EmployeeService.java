package com.pwc.employee.service.service;

import com.pwc.employee.service.entity.Employee;
import org.springframework.stereotype.Service;
import com.pwc.employee.service.dto.EmployeeDepartment;

import java.util.List;
@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee createEmployee(Employee employee);
    EmployeeDepartment getEmployeeWithDepartment(Long id);
}
