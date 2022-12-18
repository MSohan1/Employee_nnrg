package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {

	@Autowired
	public EmployeeRepository empRepo;
	public Employee create(Employee emp)
	{
		return empRepo.save(emp);
	}
}
