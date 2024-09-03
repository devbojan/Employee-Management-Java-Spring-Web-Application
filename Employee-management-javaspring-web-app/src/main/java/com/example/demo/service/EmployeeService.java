package com.example.demo.service;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	void saveEmployee(Employee employee);
	Iterable<Employee> findEmployees();
	Employee getEmployeeId(Long id);
	void deleteEmployee(Long id);
	

}
