package com.iq.JBDC;

import java.io.FileWriter;

import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class RetrieveFile {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/my","root","root");
			PreparedStatement ps=connection.prepareStatement("select * from filetable");
			ResultSet rs=ps.executeQuery();
			rs.next();
			Clob c= rs.getClob(2);
			Reader reader=c.getCharacterStream();
			
			FileWriter fileWriter=new FileWriter("C:\\Users\\gashi\\Documents\\jdbcFileRetriev.txt");
			int i;
			while((i=reader.read())!=-1) {
				fileWriter.write((char)i);
			}
				fileWriter.close();
				connection.close();
				System.out.println("success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
