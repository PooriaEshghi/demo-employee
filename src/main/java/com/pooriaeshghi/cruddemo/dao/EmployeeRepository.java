package com.pooriaeshghi.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pooriaeshghi.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
