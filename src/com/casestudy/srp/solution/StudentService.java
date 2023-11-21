package com.casestudy.srp.solution;

import com.casestudy.srp.Student;

public class StudentService {

	private Student student;

	public void setStudent(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return this.student;
	}

	// save into database

	public void save() {
		System.out.println(this.student.getStudentId());
	}
}
