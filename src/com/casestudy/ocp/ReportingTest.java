package com.casestudy.ocp;

public class ReportingTest {

	public static void main(String[] args) {

		HTMLReport html = new HTMLReport();
		ReportingSystem rs = new ReportingSystem();
		rs.generateReport(html);

	}

}
