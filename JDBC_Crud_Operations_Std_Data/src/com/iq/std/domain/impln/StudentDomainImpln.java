package com.iq.std.domain.impln;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.iq.connection.ConnectionClass;
import com.iq.std.domain.StudentDomain;

public class StudentDomainImpln implements StudentDomain {
	private static Connection connection = null;
	private Statement statement = null;
	private static String INSERT = "insert into std_data values(1008,'Vishnu','Bcom',9106234091,'srr')";

	@Override
	public void insert() {
		try {
			connection = ConnectionClass.openConnection();
			System.out.println(connection);
			statement = connection.createStatement();
			int result = statement.executeUpdate(INSERT);
			System.out.println("Inserted " + result + " row");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
