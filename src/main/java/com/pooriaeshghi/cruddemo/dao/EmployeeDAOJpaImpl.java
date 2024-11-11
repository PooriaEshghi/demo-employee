package com.pooriaeshghi.cruddemo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pooriaeshghi.cruddemo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;

    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

}
