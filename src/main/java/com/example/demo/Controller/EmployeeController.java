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

//creating a get mapping that retrieves all the students detail from the database 
	@GetMapping("/employee")
	private List<Employee> getAllStudent() {
		return employeeService.getAllStudent();
	}

//creating a get mapping that retrieves the detail of a specific student
	@GetMapping("/employee/{id}")
	private Employee getStudent(@PathVariable("id") int id) {
		return employeeService.getStudentById(id);
	}

//creating a delete mapping that deletes a specific student
	@DeleteMapping("/employee/{id}")
	private void deleteStudent(@PathVariable("id") int id) {
		employeeService.delete(id);
	}

//creating post mapping that post the student detail in the database
	@PostMapping("/employee")
	private String saveStudent(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
		return "Data Saved Successfully";
	}
}
