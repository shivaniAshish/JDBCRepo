
package com.iq.ems.dao.impl.client;

import java.util.List;

import com.iq.ems.dao.impl.EmployeeDaoImpl;
import com.iq.ems.domain.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
		
		Employee employee=new Employee(106, "kamal", 40000.00);
		EmployeeDaoImpl daoImpl=new EmployeeDaoImpl();
//		daoImpl.save(employee);
//		List<Employee> employees=daoImpl.getAllEmployees();
//		for (Employee employee2 : employees) {
//			System.out.println(employee2.getEmp_id());
//			System.out.println(employee2.getEmp_name());
//			System.out.println(employee2.getEmp_sal());
//		}
//		daoImpl.delete(employee);
		daoImpl.update(employee);
	
	}

}
