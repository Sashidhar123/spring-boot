package com.demo.employee.service;

import java.util.List;

import com.demo.employee.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
}
