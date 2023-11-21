package com.casestudy.srp;

public class Student {

	// infra code --- creating the student
	private String studentId;
	private String studentName;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// save into database

		public void save() {
			System.out.println(this.getStudentId());
		}

}
