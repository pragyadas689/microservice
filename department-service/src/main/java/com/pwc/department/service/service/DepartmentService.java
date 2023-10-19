package com.pwc.department.service.service;

import com.pwc.department.service.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DepartmentService {
    public List<Department> getAllDepartment();
    public Department getDepartmentById(Long id);
    public Department createDepartment(Department department);
}
