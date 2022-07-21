package com.iq.sms.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.iq.sms.dao.impl.StudentDaoImpl;
import com.iq.sms.domain.Student;
public class StudentClient {
	public static void main(String[] args) throws ParseException {
		String dateFormat = "2016/08/25";
		Date doj = new SimpleDateFormat("yyyy/dd/mm").parse(dateFormat);
		Student student = new Student(1005, "Mithali Raj", "MBA",864449949.00,doj);
		StudentDaoImpl daoImpl=new StudentDaoImpl();
		daoImpl.save(student);
//		List<Student> list=daoImpl.getAllStudent();
//		for (Student student2 : list) {
//			System.out.println(student2);
//		}
//		daoImpl.delete(1006);
		
//		Student student=daoImpl.getById(1009);
//		System.out.println(student);
		
//		Student student=daoImpl.getByName("sony");
//		System.out.println(student);
		
		
	}

}
