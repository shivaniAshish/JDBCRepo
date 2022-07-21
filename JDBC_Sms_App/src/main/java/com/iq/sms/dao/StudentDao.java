package com.iq.sms.dao;

import java.util.List;

import com.iq.sms.domain.Student;

public interface StudentDao {
	
	Student save(Student student);
	
	Student update(Student student);
	
	List<Student> getAllStudent();
	
	void delete(int id);
	
	Student getById(int std_id);
	
	Student getByName(String std_name);
	
//	void drop();

}
