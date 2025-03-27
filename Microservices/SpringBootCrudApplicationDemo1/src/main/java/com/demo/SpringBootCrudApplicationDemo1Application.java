package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication: its a combination of @ComponentScan, @Configuration, @EnableAutoConfiguration
@SpringBootApplication
public class SpringBootCrudApplicationDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplicationDemo1Application.class, args);
	}

}
