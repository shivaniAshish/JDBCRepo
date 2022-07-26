package com.iq.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class batchExUsingStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/my","root","root");
			connection.setAutoCommit(false);
			System.out.println(connection);
			Statement statement=connection.createStatement();
			statement.addBatch("insert into student values (108,'Kamal',15000.00)");
			statement.addBatch("insert into student values (109,'Rukmini',18000.00)");
			statement.addBatch("insert into student values (106,'Sai',15000.00)");
			statement.executeBatch();
			connection.commit();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
