package com.InterviewPractice.example;

import java.util.Optional;

class Employee {
	private String employeeName;
	private String employeeGender;
	private double employeeSalary;

	public Employee(String employeeName, String employeeGender, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeGender = employeeGender;
		this.employeeSalary = employeeSalary;
	}

	public static Optional<Employee> getEmployee(String employeeName, String employeeGender, double employeeSalary) {
		// assuming data base logic written below and its fetching data from db
		return Optional.of(new Employee(employeeName, employeeGender, employeeSalary));
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeGender=" + employeeGender + ", employeeSalary="
				+ employeeSalary + "]";
	}
}

public class OptionalClassExample {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("raju","male",25000.00);

		Optional<Employee> optionalEmployee = Employee.getEmployee("", "", 00000.00);
		if (optionalEmployee.isEmpty() || optionalEmployee.isPresent())
			System.out.println(optionalEmployee.get());// getting the actual employee object as final result by using get()
	}
}
