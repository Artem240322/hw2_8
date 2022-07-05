package com.example.hw2_8.controller;


import com.example.hw2_8.model.Employee;
import com.example.hw2_8.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Employee findEmployeeWithMaxSalaryFromDepartment(@RequestParam("departmentId") int department) {
        return DepartmentService.findEmployeeWithMaxSalaryFromDepartment(department);

    }
    @GetMapping("/min-salary")
    public Employee findEmployeeWithMaxSalaryFromDepartment(@RequestParam("departmentId") int department) {
        return DepartmentService.findEmployeeWithMaxSalaryFromDepartment(department);

    }
    @GetMapping(value = "/all", params = "departmentId")
    public List<Employee> findEmployeeFromDepartment(@RequestParam("departmentId") int department) {
        return DepartmentService.findEmployeeFromDepartment(department);

    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> findEmployee() {
        return DepartmentService.findEmployee();

    }

}
