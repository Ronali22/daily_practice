package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController //ReST + Controller => ReST(Representational state transfer) its an architecture.
//in web applications we use it to declare that the class is a controller which handles all type of web requests POST, GET, PATCH, DELETE etc.. 
@RequestMapping("/v1") //to map controller method requests, here we are using it as base url for all other methods present inside controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Value("${server.port}")
	private String port;
	
	@Value("${app.title}")
	private String title;
	
//	CREATE
//	@RequestMapping(name = "/save", method = RequestMethod.POST)
	@PostMapping("/save")
	ResponseEntity<Integer> saveEmployee(@RequestBody Employee employeeDetails){
		Integer employeeId = employeeService.insertEmployee(employeeDetails);
		return new ResponseEntity<Integer>(employeeId, HttpStatus.CREATED);
	}
	
//	READ
	@GetMapping("/getOne/{employeeId}")
	ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") Integer employeeId){
		Employee result = employeeService.getOneEmployee(employeeId);
		return new ResponseEntity<Employee>(result,HttpStatus.FOUND);
	}
	
	@GetMapping("/getAll")
	ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> result = employeeService.getEmployeeList();
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
//	UPDATE
	@PatchMapping("/update/{employeeId}")
	ResponseEntity<Employee> updateEmployee(@PathVariable("employeeId") Integer employeeId, 
			@RequestParam("employeeSalary") Double employeeSalary){
		Employee updatedEmployee = employeeService.updateEmployee(employeeId, employeeSalary);
		return new ResponseEntity<>(updatedEmployee,HttpStatus.OK);
	}
	
//	DELETE
	@DeleteMapping("/delete/{emloyeeName}")
	ResponseEntity<String> removeEmployee(@PathVariable("emloyeeName") String employeeName){
		employeeService.removeEmployee(employeeName);
		return new ResponseEntity<>("User details removed succefully!",HttpStatus.OK);
	}
	@GetMapping("/show")
	public ResponseEntity<String> showData() {
		return new ResponseEntity<>("Hello! from "+ title +" application : " + port, HttpStatus.OK);// port, title
	}

}
