package com.iq.emp.domain.impl.cilent;

import com.iq.emp.domain.impl.EmployeeDomainImpl;

public class EmployeeEmsClient {
	public static void main(String[] args) {
		EmployeeDomainImpl edi=new EmployeeDomainImpl();
		edi.insert();
		edi.update();		 
		edi.getAllEmployeeData();
		edi.delete();
	}

}
