package com.iq.JBDC;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoreFile {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/my","root","root");
			PreparedStatement ps=connection.prepareStatement("insert into filetable values(?,?,?)");
			File file=new File("C:\\Users\\gashi\\Documents\\jdbcFile.txt");
			FileReader fileReader=new FileReader(file);
			ps.setInt(1, 101);
			ps.setCharacterStream(2, fileReader,file.length());
			ps.setString(3,"male");
			int i=ps.executeUpdate();
			System.out.println(i+" records affected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
