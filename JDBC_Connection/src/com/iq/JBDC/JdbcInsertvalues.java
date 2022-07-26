package com.iq.JBDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertvalues {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
		PreparedStatement ps=connection.prepareStatement("insert into person values(?,?,?,?)");
		ps.setInt(1, 100);
		ps.setString(2, "Sai");
		ps.setString(3, "Ram");
		ps.setString(4, "HYD");
		ps.setInt(1, 101);
		ps.setInt(1, 103);
		ps.setString(2, "Sai");
		ps.setString(3, "Arun");
		ps.setString(4, "KNR");
		int i=ps.executeUpdate();
		System.out.println(i+ "records inserted");
		connection.close();
		
	}

}
