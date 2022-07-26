package com.iq.sms.queries;

public interface StudentQueries {
	
    final String SELECT_QUERY = "select * from student";
	final String INSERT_QUERY = "insert into student "
			+ "values (?,?,?)";
	final String UPDATE_QUERY = "update student set "
			+ "std_name=?,  std_fee=? where std_id=?";
	final String DELETE_QUERY = "delete from student "
			+ "where std_id=?";
	
	}


