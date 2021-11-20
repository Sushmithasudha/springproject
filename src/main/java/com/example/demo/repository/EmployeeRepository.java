package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
}
