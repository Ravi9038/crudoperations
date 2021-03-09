package com.spring.crudapi.services;

import java.util.List;

import com.spring.crudapi.model.Employee;

public interface EmployeeServices {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	
}
