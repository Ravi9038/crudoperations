package com.spring.crudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crudapi.model.Employee;
import com.spring.crudapi.services.EmployeeServices;

//New Branch 3

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping("/employee")
	public List<Employee> get(){
		
		return employeeServices.get();
	}
	
}
