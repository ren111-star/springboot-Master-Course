package com.dailycodebuffer.Springboot.totorial.service;

import com.dailycodebuffer.Springboot.totorial.entity.Department;
import com.dailycodebuffer.Springboot.totorial.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean  // MOCK departmentRepository 来代替直接注入
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentId(1L)
                        .departmentName("IT")
                        .departmentAddress("Ahmedabad")
                        .departmentCode("IT-06")
                        .build();
        Mockito.when(departmentRepository.findDepartmentByDepartmentNameIgnoreCase("IT"))  // 拦截
                .thenReturn(department);
    }

    @Test
    @DisplayName("Get Data base on Valida Department Name")
    public void whenValidDepartmentName_thenDepartmentShouldFound () {
        String departmentName = "IT";
        Department found
                = departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());
    }
}