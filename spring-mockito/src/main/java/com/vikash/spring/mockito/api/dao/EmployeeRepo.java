package com.vikash.spring.mockito.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikash.spring.mockito.api.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
