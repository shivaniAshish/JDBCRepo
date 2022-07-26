package com.iq.JBDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTableCreation {
	public static void main(String[] args) {
//step 1: Register the driver
		try {
			DriverManager.getDriver("com.mysql.uj.Driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("driver is registered");

//step 2: get the connection from the DataBase
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I got the connection object is : "+ con);

		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("create the statement object :"+stmt);
		System.out.println("Sending the Query to DB for executing it");

		 try {
			stmt.executeUpdate("create table sms(eno number(5),name varchar2(25),address varchar2(25),salary number(10,2),doj date)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("table is created");

		}
}

