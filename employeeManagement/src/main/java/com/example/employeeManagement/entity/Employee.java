package com.example.employeeManagement.entity;


import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Employee {
	@Id            //primary key
	@GeneratedValue(strategy = GenerationType.AUTO)  //for automatic assigning
	private int empid;
	private String empname;
	private String empEmail;
	private String empAddress;
	private double salary;
	public Employee(int empid, String empname, String empEmail, String empAddress, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empEmail = empEmail;
		this.empAddress = empAddress;
		this.salary = salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empEmail=" + empEmail + ", empAddress="
				+ empAddress + ", salary=" + salary + "]";
	}
	
	
}
