package com.iq.std;

public class Student {
	private Integer std_id;
	private String std_name;
	private String std_course;
	private  Double std_phn;
	private String std_college;
	public Student(Integer std_id, String std_name, String std_course, Double std_phn, String std_college) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_course = std_course;
		this.std_phn = std_phn;
		this.std_college = std_college;
	}
	public Integer getStd_id() {
		return std_id;
	}
	public void setStd_id(Integer std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_course() {
		return std_course;
	}
	public void setStd_course(String std_course) {
		this.std_course = std_course;
	}
	public Double getStd_phn() {
		return std_phn;
	}
	public void setStd_phn(Double std_phn) {
		this.std_phn = std_phn;
	}
	public String getStd_college() {
		return std_college;
	}
	public void setStd_college(String std_college) {
		this.std_college = std_college;
	}
	

}
