package com.iq.sms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iq.connection.utill.ConnectionClass;
import com.iq.sms.dao.StudentDao;
import com.iq.sms.domain.Student;
import com.iq.sms.queries.StudentQueries;

public class StudentDaoImpl implements StudentDao {
	
	private static Connection connection=null;
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;

	public Student save(Student student) {
		try {
		connection=ConnectionClass.openConnection();
		ps=connection.prepareStatement(StudentQueries.INSERT_QUERY);
		ps.setInt(1, student.getStd_id());
		ps.setString(2, student.getStd_name());
		ps.setString(3, student.getStd_coures());
		ps.setDouble(4, student.getStd_phn());
		java.sql.Date doj=new java.sql.Date(student.getDoj().getTime());
		ps.setDate(5, doj);
		int result=ps.executeUpdate();
		System.out.println(result+" "+"Row"+" "+"Inserted");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	ConnectionClass.closeConnection(connection, ps);
		
		return student;
	}

	public Student update(Student student) {
		
		connection=ConnectionClass.openConnection();
		try {
			ps=connection.prepareStatement(StudentQueries.UPDATE_QUERY);
			ps.setString(1, student.getStd_name());
			ps.setDouble(2,student.getStd_phn());
			ps.setString(3,student.getStd_coures() );
			java.sql.Date doj=new java.sql.Date(student.getDoj().getTime());
			ps.setDate(4, doj);
			ps.setInt(5, student.getStd_id());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionClass.closeConnection(connection, ps);
		
		return student;
	}

	public List<Student> getAllStudent() {
		List<Student> students=new ArrayList<Student>();
		try {
			connection=ConnectionClass.openConnection();
			ps=connection.prepareStatement(StudentQueries.SELECT_QUERY);
			rs=ps.executeQuery();
			while(rs.next()) {
				Student student=new Student();
				student.setStd_id(rs.getInt(1));
				student.setStd_name(rs.getString(2));
				student.setStd_coures(rs.getString(3));
				student.setStd_phn(rs.getDouble(4));
				student.setDoj(rs.getDate(5));
				students.add(student);
			}
			return students;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionClass.closeConnection(connection, ps, rs);
		
		return null;
	}

	public Student delete(Student student) {
		
		return null;
	}

	public void delete(int id) {
		connection=ConnectionClass.openConnection();
		try {
			ps=connection.prepareStatement(StudentQueries.DELETE_QUERY);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Student getById(int std_id) {
		
		Connection connection=ConnectionClass.getConnection();
		try {
			ps=connection.prepareStatement(StudentQueries.SELECT_BY_ID_QUERY);
			ps.setInt(1, std_id);
			rs=ps.executeQuery();
			Student student=new Student();
			if(rs.next()) {
				student.setStd_id(rs.getInt(1));
				student.setStd_name(rs.getString(2));
				student.setStd_coures(rs.getString(3));
				student.setStd_phn(rs.getDouble(4));
				student.setDoj(rs.getDate(5));
			}
			return student;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionClass.closeConnection(connection, ps, rs);
		}
		return null;
	}

	public Student getByName(String std_name) {
		Connection connection=ConnectionClass.getConnection();
		try {
			ps=connection.prepareStatement(StudentQueries.SELECT_BY_NAME_QUERY);
			ps.setString(1, std_name);
			rs=ps.executeQuery();
			Student student=new Student();
			if(rs.next()) {
				student.setStd_id(rs.getInt(1));
				student.setStd_name(rs.getString(2));
				student.setStd_coures(rs.getString(3));
				student.setStd_phn(rs.getDouble(4));
				student.setDoj(rs.getDate(5));
			}
			return student;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionClass.closeConnection(connection, ps, rs);
		}
		return null;
	}

}
