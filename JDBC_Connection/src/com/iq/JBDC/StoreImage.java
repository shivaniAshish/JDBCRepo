package com.iq.JBDC;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoreImage {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/my","root","root");
			PreparedStatement ps=connection.prepareStatement("insert into imgtable values(?,?)");
	//		System.out.println(connection);
			ps.setString(1, "Ram");
			FileInputStream fileInputStream=new FileInputStream("C:\\Users\\gashi\\Pictures\\asl.jpg");
//			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(fileInputStream));
			ps.setBinaryStream(2, fileInputStream, fileInputStream.available());
			int i=ps.executeUpdate();
			System.out.println(i+" records affected");
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
