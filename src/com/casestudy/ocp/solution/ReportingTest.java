package com.casestudy.ocp.solution;

public class ReportingTest {

	public static void main(String[] args) {

		HTMLReport html = new HTMLReport();
		ReportingSystem rs = new ReportingSystem();
		CSVReport csv = new CSVReport();
		rs.generateReport(csv);

	}

}
