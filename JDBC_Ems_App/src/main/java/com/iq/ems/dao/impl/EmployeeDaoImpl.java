package com.iq.ems.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iq.connection.ConnectionClass;
import com.iq.ems.dao.EmployeeDao;
import com.iq.ems.domain.Employee;
import com.iq.ems.queries.EmployeeQueries;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Connection connection=null;
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;

	@Override
	public Employee save(Employee employee) {
		
		try {
			connection=ConnectionClass.openConnection();
			ps=connection.prepareStatement(EmployeeQueries.INSERT_QUERY);
			ps.setInt(1, employee.getEmp_id());
			ps.setString(2, employee.getEmp_name());
			ps.setDouble(3, employee.getEmp_sal());
			int result=ps.executeUpdate();
			System.out.println(result+" "+"Row"+" "+"Inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionClass.closeConnection(connection, ps);
		return employee;
	}

	@Override
	public Employee update(Employee employee) {
	
		try {
			connection=ConnectionClass.openConnection();
			ps=connection.prepareStatement(EmployeeQueries.UPDATE_QUERY);
			ps.setInt(1, 1005);
			ps.setString(2, "shiva");
			int result=ps.executeUpdate();
			System.out.println(result+" "+"row"+" "+"updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees=new ArrayList<Employee>();
		
		try {
			connection=ConnectionClass.openConnection();
			ps=connection.prepareStatement(EmployeeQueries.SELECT_QUERY);
			rs= ps.executeQuery();
			while(rs.next()) {
				Employee employee=new Employee();
				employee.setEmp_id(rs.getInt(1));
				employee.setEmp_name(rs.getString(2));
				employee.setEmp_sal(rs.getDouble(3));
				employees.add(employee);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionClass.closeConnection(connection, ps, rs);
		
		return employees;
	}

	@Override
	public Employee delete(Employee employee) {
		connection=ConnectionClass.openConnection();
		try {
			ps=connection.prepareStatement("delete from emp_tab where emp_id=?");
			ps.setInt(1, 106);
			int result=ps.executeUpdate();
			System.out.println(result+" "+"row"+" "+"deleted");
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
