package com.spring.crudapi.dao;

import java.util.List;

import com.spring.crudapi.model.Employee;

public interface EmployeeDao {

	List<Employee> get();
	
	Employee get(int id);

	
	void save(Employee employee);
	
	void delete(int id);
	
}
