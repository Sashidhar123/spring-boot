package com.demo.employee.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.employee.entity.Employee;
import com.demo.employee.repository.EmployeeRepository;
import com.demo.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	

}
