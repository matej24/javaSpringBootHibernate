package com.matej.springbootcrud.controller;

import com.matej.springbootcrud.model.Employee;
import com.matej.springbootcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> get() {
       return employeeService.get();
    }
    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employeeObj) {
        employeeService.save(employeeObj);
        return  employeeObj;
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id) {
       return employeeService.get(id);
    }

}
