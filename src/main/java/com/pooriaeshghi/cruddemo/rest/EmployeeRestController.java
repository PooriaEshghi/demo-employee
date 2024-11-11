package com.pooriaeshghi.cruddemo.rest;

import org.springframework.web.bind.annotation.*;

import com.pooriaeshghi.cruddemo.dao.EmployeeDAO;
import com.pooriaeshghi.cruddemo.entity.Employee;

import java.util.List;



@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        return employeeDAO.findAll();
    }
    

}
