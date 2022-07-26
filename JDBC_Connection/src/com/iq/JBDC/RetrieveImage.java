package com.iq.JBDC;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveImage {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/my","root","root");
			PreparedStatement ps=connection.prepareStatement("select * from imgtable");
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Blob b=rs.getBlob(2);
				byte bar[]=b.getBytes(1, (int) b.length());
				
				FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\gashi\\Pictures\\asl4.jpg");
				fileOutputStream.write(bar);
				fileOutputStream.close();
			}
			connection.close();
			System.out.println("Sucess");
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
