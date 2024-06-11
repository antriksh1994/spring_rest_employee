package com.demo.springboot.cruddemo.dao;

import com.demo.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
