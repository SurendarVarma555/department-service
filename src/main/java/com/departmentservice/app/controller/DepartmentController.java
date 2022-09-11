package com.departmentservice.app.controller;

import com.departmentservice.app.entity.Department;
import com.departmentservice.app.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/* http://localhost:9001/departments/
   http://localhost:9001/departments/2
* */

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Optional<Department> findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside getDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }

}
