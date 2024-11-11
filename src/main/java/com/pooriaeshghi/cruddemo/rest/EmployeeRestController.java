package com.pooriaeshghi.cruddemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pooriaeshghi.cruddemo.entity.Employee;
import com.pooriaeshghi.cruddemo.service.EmployeeService;

import java.util.List;



@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        return employeeService.findAll();
    }
    

}
