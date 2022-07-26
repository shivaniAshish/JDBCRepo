package com.iq.batch;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import com.iq.sms.queries.StudentQueries;

public class batchExUsingPrepareStatement {
	public static void main(String[] args) {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/my","root","root");
			connection1.setAutoCommit(false);
			PreparedStatement psInsert=connection1.prepareStatement(StudentQueries.INSERT_QUERY);
			PreparedStatement psUpdate=connection1.prepareStatement(StudentQueries.UPDATE_QUERY);
			PreparedStatement psDelete=connection1.prepareStatement(StudentQueries.DELETE_QUERY);
			
			psInsert.setInt(1,1001);
			psInsert.setString(2, "Aaaa");
			psInsert.setDouble(3, 10000.00);
			psInsert.addBatch();
			
			psInsert.setInt(1,1002);
			psInsert.setString(2, "Baaa");
			psInsert.setDouble(3, 15000.00);
			psInsert.addBatch();
			
			psInsert.setInt(1,1003);
			psInsert.setString(2, "Caaa");
			psInsert.setDouble(3, 10000.00);
			psInsert.addBatch();
			
			psDelete.setInt(1, 1001);
			psDelete.addBatch();
			
			psDelete.setInt(1, 1002);
			psDelete.addBatch();
			
			psUpdate.setString(1, "12344");
			psUpdate.setDouble(2, 123456.00);
			psUpdate.setInt(3, 101);
			psUpdate.addBatch();
			
//			int[] row1=psInsert.executeBatch();
//			int[] row2=psDelete.executeBatch();
			int[] row3=psUpdate.executeBatch();
			connection1.commit();
//			System.out.println(Arrays.toString(row1));
//			System.out.println(Arrays.toString(row2));
			System.out.println(Arrays.toString(row3));
	
			
		} catch (ClassNotFoundException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
