package com.iq.JBDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateValues {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			PreparedStatement ps=connection.prepareStatement("update person set name=? where id=?");
			ps.setString(100, "Kalyan");
			int i=ps.executeUpdate();
			System.out.println(i+"Record updated");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
