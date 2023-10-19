package com.pwc.employee.service.dto;

import com.pwc.employee.service.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDepartment {
    private Employee employee;
    private Department department;
}
