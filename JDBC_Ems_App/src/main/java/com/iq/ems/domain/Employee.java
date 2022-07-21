package com.iq.ems.domain;

public class Employee {
	private Integer emp_id;
	private String emp_name;
	private Double emp_sal;
	public Employee(Integer emp_id, String emp_name, Double emp_sal) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
	}
	public Employee() {
//		super();
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
	public Double getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(Double emp_sal) {
		this.emp_sal = emp_sal;
	}

}
