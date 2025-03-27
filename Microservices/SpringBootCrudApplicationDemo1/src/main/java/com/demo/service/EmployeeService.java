package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {
	Integer insertEmployee(Employee employee);
	Employee getOneEmployee(Integer employeeId);
	Employee updateEmployee(Integer employeeId, Double newSalary);
	void removeEmployee(String employeeName);
	List<Employee> getEmployeeList();
}
