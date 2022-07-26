package com.iq.JBDC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStudent {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
	System.out.println(connection);
	String selectQuery="select * from std";
	Statement statement=connection.createStatement();
	ResultSet rs=statement.executeQuery(selectQuery);
	while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getDouble(4));
	}
		
	}

}
