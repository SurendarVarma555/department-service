package com.departmentservice.app.repository;

import com.departmentservice.app.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Repository is a type of Department and Id is of type Long
 * */

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
