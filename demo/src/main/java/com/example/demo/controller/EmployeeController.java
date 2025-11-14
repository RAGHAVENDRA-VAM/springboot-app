package com.example.demo.controller;

import com.example.demo.data.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employeeById/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id")Long id) {
        return employeeService.getEmployeeById(id);
    }


    @GetMapping("/employees")
    public List<com.example.demo.data.Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }


}
