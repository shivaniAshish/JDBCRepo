package com.iq.sms.domain;

import java.sql.Date;

public class Student {
	private Integer std_id;
	private String std_name;
	private String std_coures;
	private Double std_phn;
	private java.util.Date doj;
	public Student() {
		
	}
	public Student(Integer std_id, String std_name, String std_coures, Double std_phn,java.util.Date doj2) {
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_coures = std_coures;
		this.std_phn = std_phn;
		this.doj=doj2;
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
	public String getStd_coures() {
		return std_coures;
	}
	public void setStd_coures(String std_coures) {
		this.std_coures = std_coures;
	}
	public Double getStd_phn() {
		return std_phn;
	}
	public void setStd_phn(Double std_phn) {
		this.std_phn = std_phn;
	}
	public java.util.Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", std_coures=" + std_coures + ", std_phn="
				+ std_phn + ", doj=" + doj + "]";
	}
	
}
