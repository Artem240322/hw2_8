package com.example.hw2_8.service;

import com.example.hw2_8.model.Employee;

import java.util.List;
import java.util.Map;

public class DepartmentService {

    private final EmployeeService employeeService;

    public DepartmentService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    public Employee findEmployeeWithMaxSalaryFromDepartment(int department) {
        Comparable<>
        return EmployeeService.getAll.stream()
                .filter(employee -> employee.getDepartment() == department)
                .max
    }

    public Employee findEmployeeWithMaxSalaryFromDepartment(int department) {
        return null;
        .
    }
    public static List<Employee> findEmployeeFromDepartment(int department) {
        return null;
    }

    public static Map<Integer, List<Employee>> findEmployee() {

    }


}
