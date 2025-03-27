package com.example.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Employee;

@Component
public class ConsumerController implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		//step1: define one string url
		//String url = "http://localhost:9001/producer/getMessage";
//		step2: create RestTemplate object
		//RestTemplate rt = new RestTemplate();
//		//step3: execute request and get response
		//ResponseEntity<String> resp = rt.getForEntity(url, String.class);
//		
//		//print response
//		System.out.println(resp.getBody());
//		System.out.println(resp.getStatusCode());

//		String url = "http://localhost:9001/producer/getEmployee";
//		RestTemplate rt = new RestTemplate();
//		ResponseEntity<Employee> resp = rt.getForEntity(url, Employee.class);
//		// print response
//		System.out.println(resp.getBody());
//		System.out.println(resp.getStatusCode());
		   
		String url = "http://localhost:9001/producer/getAllEmployees";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<List<Employee>> response = rt.exchange(
			    url,
			    HttpMethod.GET,
			    null,
			    new ParameterizedTypeReference<List<Employee>>(){});
			List<Employee> objects = response.getBody();
//			objects.forEach(System.out::println);
//			System.out.println(response.getStatusCode());
			
			Iterator<Employee> itr = objects.iterator();
			while(itr.hasNext()) {
			    System.out.println( itr.next());
			}

				

	}

}
