package com.iq.emp.domain.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.iq.connection.utill.ConnectionUtill;
import com.iq.emp.domain.EmployeeDomain;

public class EmployeeDomainImpl implements EmployeeDomain {
	private static Connection connection = null;
	private static Statement statement = null;
	private static String INSERT = "insert into emp values(1006,'sai',250000.00,9761350752,'sai@gmail.com','HCL')";
	private static String UPDATE = "update emp set emp_name='samatha',emp_salary=30000.00,ph_no=9001531986,email='samatha@gmail.com',company_name='sales' where emp_Id=1004";
	private static String DELETE = "delete from emp where emp_id=1006";

	@Override
	public void insert() {

		try {
			connection = ConnectionUtill.openConnection();
			System.out.println(connection);
			statement = connection.createStatement();
			int result = statement.executeUpdate(INSERT);
			System.out.println("Inserted" + result + "Row");

		} catch (SQLException e) {

			e.printStackTrace();
		}
//		ConnectionUtill.colseConnection(connection, statement);		
	}

	@Override
	public void update() {
		connection = ConnectionUtill.openConnection();
		try {
			statement = connection.createStatement();
			int result = statement.executeUpdate(UPDATE);
			System.out.println("Updated" + result + "Rows");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void getAllEmployeeData() {
		connection = ConnectionUtill.openConnection();
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDouble(3));
				System.out.println(rs.getDouble(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete() {
		connection=ConnectionUtill.openConnection();
		try {
			statement=connection.createStatement();
			int result=statement.executeUpdate(DELETE);
			System.out.println("deleted"+result+"row");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
	   EmployeeDomainImpl domainImpl=new EmployeeDomainImpl();
	   domainImpl.insert();
	}

}
