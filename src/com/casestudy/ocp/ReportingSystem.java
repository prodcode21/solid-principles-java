package com.casestudy.ocp;

public class ReportingSystem {

	public void generateReport(HTMLReport report) {
		report.generateReport();
	}

	
	public void generateReport(PDFReport report) {
		report.generateReport();
	}
	
	
	public void generateReport(ExcelReport report) {
		report.generateReport();
	}
}
