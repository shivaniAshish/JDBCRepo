package com.iq.ems.queries;

public interface EmployeeQueries {
	String SELECT_QUERY="select * from emp_tab";
	String INSERT_QUERY="insert into emp_tab values(?,?,?)";
	String UPDATE_QUERY="update emp_tab set emp_id=? where emp_name=?";
	String delete_query="delete from emp_tab where emp_id=?";
}
