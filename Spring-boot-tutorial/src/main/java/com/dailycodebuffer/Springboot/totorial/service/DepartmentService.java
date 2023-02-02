package com.dailycodebuffer.Springboot.totorial.service;

import com.dailycodebuffer.Springboot.totorial.entity.Department;
import com.dailycodebuffer.Springboot.totorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);

    int test();
}
