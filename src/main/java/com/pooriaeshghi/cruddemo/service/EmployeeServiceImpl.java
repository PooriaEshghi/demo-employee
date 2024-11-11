package com.pooriaeshghi.cruddemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pooriaeshghi.cruddemo.dao.EmployeeDAO;
import com.pooriaeshghi.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

}