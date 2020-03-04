package com.matej.springbootcrud.service;

import com.matej.springbootcrud.model.Employee;

import java.util.List;

public interface EmployeeService {


    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
