package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

//creating a get mapping that retrieves all the Employee detail from the database 
	@GetMapping("/employee")
	private List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

//creating a get mapping that retrieves the detail of a specific Employee
	@GetMapping("/employee/{id}")
	private Employee getEmployee(@PathVariable("id") int id) {
		return employeeService.getStudentById(id);
	}

//creating a delete mapping that deletes a specific Employee
	@DeleteMapping("/employee/{id}")
	private void deleteEmployee(@PathVariable("id") int id) {
		employeeService.delete(id);
	}

//creating post mapping that post the Employee detail in the database
	@PostMapping("/employee")
	private String saveEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
		return "Data Saved Successfully";
	}
}
