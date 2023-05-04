package com.example.employeeManagement.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.example.employeeManagement.entity.*;
import com.example.employeeManagement.repo.EmployeeRepo;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo employeeRepo;
	
	@PostMapping("/api/employee")
	public ResponseEntity<Employee> insert(@RequestBody Employee employee) {
		return new ResponseEntity<>(employeeRepo.save(employee),HttpStatus.CREATED);
	}
	
	@GetMapping("/api/employee")
	public ResponseEntity<List<Employee>> getEmployees() {
		return new ResponseEntity<>(employeeRepo.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/api/employee/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int id) {
		Optional<Employee> employee = employeeRepo.findById(id);
		if(employee.isPresent()) {
			return new ResponseEntity<>(employee.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PutMapping("/api/employee/{id}")
	public ResponseEntity<Employee> updateEmployeeput(@PathVariable int id,@RequestBody Employee emp) {
		Optional<Employee> employee = employeeRepo.findById(id);
		if(employee.isPresent()) {
			employee.get().setEmpname(emp.getEmpname());
			employee.get().setEmpEmail(emp.getEmpEmail());
			employee.get().setEmpAddress(emp.getEmpAddress());
			employee.get().setSalary(emp.getSalary());
			return new ResponseEntity<>(employeeRepo.save(employee.get()),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	

	@DeleteMapping("/api/employee/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable int id) {
		Optional<Employee> employee = employeeRepo.findById(id);
		if(employee.isPresent()) {
			employeeRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
}
