package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	public EmployeeServices service;
	
	@PostMapping("/employee")
	public Employee createEmployee(@Validated @RequestBody Employee emp )
	{
		return service.create(emp);
	}
	
}
