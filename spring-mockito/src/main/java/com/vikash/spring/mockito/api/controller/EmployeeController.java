package com.vikash.spring.mockito.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikash.spring.mockito.api.dao.EmployeeRepo;
import com.vikash.spring.mockito.api.model.Employee;
import com.vikash.spring.mockito.api.model.Response;


@RestController
@RequestMapping("EmployeeService")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeRepo repo;
	
	@PostMapping("/addEmployee")
	public Response addEmployee(@RequestBody Employee employee)
	{
		repo.save(employee);
		return new Response("inserted: "+employee.getId(),Boolean.TRUE);
		
		
		
	}
	@GetMapping("/getEmployee")
	public Response getAllEmployee()
	{
		List<Employee> employees=repo.findAll();
		return new Response("record count:"+employees.size(),Boolean.TRUE);
		
		
		
	}

}
