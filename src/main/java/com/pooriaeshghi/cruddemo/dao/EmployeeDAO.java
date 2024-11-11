package com.pooriaeshghi.cruddemo.dao;

import java.util.List;

import com.pooriaeshghi.cruddemo.entity.Employee;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
