package com.iq.emp;

public class EmployeeEms {
	private Integer emp_id;
	private String emp_name;
	private Double emp_salary;
	private Double ph_no;
	private String email;
	private String company_name;
	
	
	public EmployeeEms(Integer emp_id, String emp_name, Double emp_salary, Double ph_no, String email,
			String company_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.ph_no = ph_no;
		this.email = email;
		this.company_name = company_name;
	}


	public Integer getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public Double getEmp_salary() {
		return emp_salary;
	}


	public void setEmp_salary(Double emp_salary) {
		this.emp_salary = emp_salary;
	}


	public Double getPh_no() {
		return ph_no;
	}


	public void setPh_no(Double ph_no) {
		this.ph_no = ph_no;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCompany_name() {
		return company_name;
	}


	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	
	
}
