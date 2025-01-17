package com.InterviewPractice.revision;

import java.util.List;
import java.util.stream.Collectors;

//1. WAP to filter female employee.
//2. WAP to increment salary by 20,000 for each employee
//3. WAP to filter employees whose salary is more than 20,000
//4. WAP to filter employees whose name starts with R
//5. WAP to filter employees whose salary is between 20000 to 40000

class Employee{
	private String employeeName;
	private String employeeGender;
	private double employeeSalary;
	
	public Employee(String employeeName, String employeeGender, double employeeSalary ){
		super();
		this.employeeName=employeeName;
		this.employeeGender=employeeGender;
		this.employeeSalary=employeeSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeGender=" + employeeGender + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		
Employee employee1 = new Employee("Raju", "Male", 10000.00);
//System.out.println(employee1.getEmployeeGender());
Employee employee2 = new Employee("Sita", "Female", 20000.00);
Employee employee3 = new Employee("Hari", "Male", 30000.00);
Employee employee4 = new Employee("Gita", "Female", 60000.00);
Employee employee5 = new Employee("Mita", "Female", 50000.00);
Employee employee6 = new Employee("Rahul", "Male", 70000.00);

List<Employee> employeeList= List.of(employee1, employee2, employee3, employee4, employee5, employee6);

	//1.
	List<Employee> result = employeeList.stream().filter(e->e.getEmployeeGender()=="Female").collect(Collectors.toList());
	System.out.println(result);
	
	//2.
	employeeList.stream().map(e->e.getEmployeeSalary()+20000.00).collect(Collectors.toList()).forEach(System.out::println);
	
	//3.
	employeeList.stream().filter(e->e.getEmployeeSalary()>20000.00).collect(Collectors.toList()).forEach(System.out::println);
	
	//4.
	//5.
	}
	


}
