package com.pwc.department.service.controller;

import com.pwc.department.service.entity.Department;
import com.pwc.department.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/departments")
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartment();
    }
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") long id){
        return departmentService.getDepartmentById(id);
    }
    @PostMapping
    public Department createDepartment(@RequestBody Department department){
        return departmentService.createDepartment(department);
    }
}
