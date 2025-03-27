package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter //using for get the value or it refers to getter methods
@Setter //using for set the value or it refers to setter methods
@ToString //using for print the object
@Entity //to make the class as an entity
@Table(name = "employee") //to provide table name
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//generates id automatically
	private Integer employeeId;
	
	@Column(name = "employeename")
	private String employeeName;
	
	@Column(name = "employeesalary")
	private Double employeeSalary;
	
	@Column(name = "employeeage")
	private Integer employeeAge;
	
	@Column(name = "employeegender")
	private String employeeGender;

}
