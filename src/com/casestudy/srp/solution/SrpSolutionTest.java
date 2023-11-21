package com.casestudy.srp.solution;

import com.casestudy.srp.Student;

public class SrpSolutionTest {

	public static void main(String[] args) {

		Student s = new Student();
		s.setStudentId("5");
		s.setStudentName("Sai");
		StudentService service = new StudentService();
		service.setStudent(s);
		service.save();
	}

}
