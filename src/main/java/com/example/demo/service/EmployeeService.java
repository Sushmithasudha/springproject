package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.repository.EmployeeRepository;

//defining the business logic
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

//getting all Employee records
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee -> employees.add(employee));
		return employees;
	}

//getting a specific record
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).get();
	}

	public void saveOrUpdate(Employee employee) {
		employeeRepository.save(employee);
	}

//deleting a specific record
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
}
