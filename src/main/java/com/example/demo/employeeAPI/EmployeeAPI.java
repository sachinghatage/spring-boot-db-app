package com.example.demo.employeeAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeAPI {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/get")
	public ResponseEntity<List<Employee>> getEmployee(){
		List<Employee> all = service.getAll();
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Employee employee){
		Employee addEmployee = service.addEmployee(employee);
		return new ResponseEntity<>("Employee created",HttpStatus.CREATED);
		
	}

}
