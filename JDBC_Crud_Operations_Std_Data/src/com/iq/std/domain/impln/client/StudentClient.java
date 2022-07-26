package com.iq.std.domain.impln.client;

import com.iq.std.domain.impln.StudentDomainImpln;

public class StudentClient {
	public static void main(String[] args) {
		StudentDomainImpln domainImpln=new StudentDomainImpln();
		domainImpln.insert();
	}

}
