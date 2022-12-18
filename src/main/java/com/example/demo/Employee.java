package com.example.demo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="NNRG_Employes")

public class Employee {
	@Id
	public String id;
	private String empname;
	private String empfirstname;
	private String emplastname;
	private int empSalary;
	
	public Employee(String id,String empname,String empfirstname,String emplastname,int empSalary)
	{
		this.id= id;
		this.empname=empname;
		this.empfirstname=empfirstname;
		this.emplastname=emplastname;
		this.empSalary=empSalary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpfirstname() {
		return empfirstname;
	}

	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}

	public String getEmplastname() {
		return emplastname;
	}

	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
}
