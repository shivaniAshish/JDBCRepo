package com.iq.connection.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtill {
	private static Connection connection=null;

//	get connection
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection openConnection() {
		return connection;
	}
	public static void closeConnection(Connection connection) {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void colseConnection(Connection connection,Statement statement ) {
		if(statement!=null) {
			try {
				connection.close();
				statement.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}
