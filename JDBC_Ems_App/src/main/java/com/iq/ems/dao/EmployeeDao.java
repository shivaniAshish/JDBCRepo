package com.iq.ems.dao;

import java.util.List;

import com.iq.ems.domain.Employee;

public interface EmployeeDao {
	
	Employee save(Employee employee);
	
	Employee update(Employee employee);
	
	Employee delete(Employee employee);
	
	List<Employee> getAllEmployees();
	

}
