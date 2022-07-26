package com.iq.result.meta.data;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseMetaDataEx {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			Statement statement=connection.createStatement();
			DatabaseMetaData databaseMetaData=connection.getMetaData();
			System.out.println("DataBase Server Name: "+databaseMetaData.getDatabaseProductName());
			System.out.println("DataBase Server Version: "+databaseMetaData.getDatabaseProductVersion());
			System.out.println("Driver Server Version: "+databaseMetaData.getDriverVersion());
			System.out.println("Driver Version Name: "+databaseMetaData.getDriverName());
			System.out.println("Max colums: "+databaseMetaData.getMaxColumnsInTable());
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
