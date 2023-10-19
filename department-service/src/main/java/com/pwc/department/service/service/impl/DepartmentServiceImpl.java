package com.pwc.department.service.service.impl;

import com.pwc.department.service.entity.Department;
import com.pwc.department.service.repository.DepartmentRepository;
import com.pwc.department.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
