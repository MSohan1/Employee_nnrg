package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan
public class Employee3Application {

	public static void main(String[] args) {
		SpringApplication.run(Employee3Application.class, args);
	}

}
