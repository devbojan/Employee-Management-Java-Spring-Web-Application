package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {
		
		employeeRepository.save(employee);
		
	}

	@Override
	public Iterable<Employee> findEmployees() {
		return employeeRepository.findAll();
		
	}

	@Override
	public Employee getEmployeeId(Long id) {
		
		Employee employee = employeeRepository.findById(id);
		
		return employee;
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		
		
	}
	
	

}
