package com.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;
import com.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired//for dependency injection
	EmployeeRepository employeeRepository;
	
	@Override
	public Integer insertEmployee(Employee employee) {
		Employee employeeDetails = employeeRepository.save(employee);
		return employeeDetails.getEmployeeId();
	}

	@Override
	public Employee getOneEmployee(Integer employeeId) {
		Optional<Employee> result = employeeRepository.findById(employeeId);
		return result.get();
	}
	
	@Override
	public List<Employee> getEmployeeList() {
		List<Employee> result = employeeRepository.findAll();
		return result;
	}

	@Override
	public Employee updateEmployee(Integer employeeId, Double newSalary) {
		Optional<Employee> optionalEmployeeObject = employeeRepository.findById(employeeId);
		Employee oldEmployeeDetails = optionalEmployeeObject.get();//extracting actual employee object
		oldEmployeeDetails.setEmployeeSalary(newSalary);
		Employee updatedEmployee = employeeRepository.save(oldEmployeeDetails);
		return updatedEmployee;
	}

	@Override
	public void removeEmployee(String employeeName) {
		Employee dbEmployee = employeeRepository.getEmployeeByEmployeeName(employeeName);
		employeeRepository.deleteById(dbEmployee.getEmployeeId());
	}

}
