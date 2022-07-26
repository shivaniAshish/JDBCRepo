package com.iq.result.meta.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultMetaDataEx {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/my","root","root");
			System.out.println("Driver is loaded");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from customer");
			ResultSetMetaData metaData=resultSet.getMetaData();
			int count=metaData.getColumnCount();
			for(int i=1;i<=count;i++) {
				System.out.println("column no "+i);
				System.out.println("column name "+metaData.getCatalogName(i));
				System.out.println("column type: "+metaData.getColumnTypeName(i));
				System.out.println("column size "+metaData.getColumnDisplaySize(i));
				System.out.println("---------------------");
			}
			resultSet.close();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
