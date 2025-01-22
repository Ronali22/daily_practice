package com.InterviewPractice.revision;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to print how many male and female employees are there in the organization.
//WAP to print the name of all departments in the org
//WAP what is the average age of male and female employees in the org
//WAP to find the details of highest paid employee
//WAP to filter who has the most working exp in the org
//WAP to count the number of employees in each department.
//WAP to separate the employees who are younger or equal to 25 years and who are older than 25 years
//WAP to  filter the name of employees who joined after 2015.

class EManagement{
	private int employeeId;
	private String employeeName;
	private String employeeGender;
	private String employeeDepartmentName;
	private int employeeAge;
	private double employeeSalary;
	private int employeeYearOfJoining;
	
	public EManagement(int employeeId,String employeeName, String employeeGender, String employeeDepartmentName, int employeeAge, double employeeSalary, int employeeYearOfJoining ) {
		super();
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeGender=employeeGender;
		this.employeeDepartmentName=employeeDepartmentName;
		this.employeeAge=employeeAge;
		this.employeeSalary=employeeSalary;
		this.employeeYearOfJoining=employeeYearOfJoining;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getEmployeeDepartmentName() {
		return employeeDepartmentName;
	}

	public void setEmployeeDepartmentName(String employeeDepartmentName) {
		this.employeeDepartmentName = employeeDepartmentName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeYearOfJoining() {
		return employeeYearOfJoining;
	}

	public void setEmployeeYearOfJoining(int employeeYearOfJoining) {
		this.employeeYearOfJoining = employeeYearOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeGender="
				+ employeeGender + ", employeeDepartmentName=" + employeeDepartmentName + ", employeeAge=" + employeeAge
				+ ", employeeSalary=" + employeeSalary + ", employeeYearOfJoining=" + employeeYearOfJoining + "]";
	}
}
public class EmployeeManagementAppUsingStreamApi{

	public static void main(String[] args) {
		EManagement employee1 = new EManagement(100,"Ram","Male","Electrical",30,40000.00,2017);
		EManagement employee2 = new EManagement(101,"shyam","Male","Mechanical",24,20000.00,2022);
		EManagement employee3 = new EManagement(102,"Rani","Female","Computer",34,60000.00,2015);
		EManagement employee4 = new EManagement(103,"Raju","Male","civil",32,45000.00,2013);
		EManagement employee5 = new EManagement(104,"Sita","Female","Electronics",23,25000.00,2018);
		EManagement employee6 = new EManagement(105,"Rahul","Male","Chemical",33,42000.00,2019);
		EManagement employee7 = new EManagement(106,"Raja","Male","Plastic",29,35000.00,2016);
		EManagement employee8 = new EManagement(107,"Gita","Female","Aeronutics",23,55000.00,2020);
		EManagement employee9 = new EManagement(108,"Bina","Female","Textile",25,37000.00,2024);
		EManagement employee10 = new EManagement(109,"Siva","Male","Marine",37,65000.00,2011);

	List<EManagement> employeeList= List.of(employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10);

//1. WAP to print how many male and female employees are there in the organization.
		//long maleEmployee = employeeList.stream().filter(e->e.getEmployeeGender()=="Male").count();
//		System.out.println(maleEmployee);
//		long femaleEmployee = employeeList.stream().filter(e->e.getEmployeeGender()=="Female").count();
//		System.out.println(femaleEmployee);
//2.WAP to print the name of all departments in the org
//		employeeList.stream().map(e->e.getEmployeeDepartmentName()).collect(Collectors.toList()).forEach(System.out::println);
	
//3.WAP to find the details of highest paid employee
		//EManagement employeeMaxSalary= employeeList.stream().max((a,b)->(int)(a.getEmployeeSalary()-b.getEmployeeSalary())).get();
			//System.out.println(employeeMaxSalary);
	
//4.WAP what is the average age of male and female employees in the org
//		Double avgAgeOfMale = employeeList.stream().filter(e->e.getEmployeeGender()=="Male").collect(Collectors.averagingInt(e->e.getEmployeeAge()));
//		System.out.println(avgAgeOfMale);
//		Double avgAgeOfFemale = employeeList.stream().filter(e->e.getEmployeeGender()=="Female").collect(Collectors.averagingInt(e->e.getEmployeeAge()));
//		System.out.println(avgAgeOfFemale);
		
//5.WAP to filter who has the most working exp in the org
//		EManagement employeeMostWorkExp= employeeList.stream().max((a,b)->(b.getEmployeeYearOfJoining()-a.getEmployeeYearOfJoining())).get();
//		System.out.println(employeeMostWorkExp);

//6.WAP to count the number of employees in each department.
		Map<String, Long> result = employeeList.stream().collect(Collectors.groupingBy(EManagement::getEmployeeDepartmentName, Collectors.counting()));
		result.forEach((key,value)->System.out.println(key+" -> "+value));//printing elements one by one
		System.out.println(result);//printing all elements at once 
		
//7.WAP to separate the employees who are younger or equal to 25 years and who are older than 25 years
//		employeeList.stream().filter(e->e.getEmployeeAge()<=25).collect(Collectors.toList()).forEach(System.out::println);
//		employeeList.stream().filter(e->e.getEmployeeAge()>25).collect(Collectors.toList()).forEach(System.out::println);
	
//8.WAP to  filter employees who joined after 2015.
//		employeeList.stream().filter(e->e.getEmployeeYearOfJoining()>2015).collect(Collectors.toList()).forEach(e->System.out.println(e));
	}
}
	


