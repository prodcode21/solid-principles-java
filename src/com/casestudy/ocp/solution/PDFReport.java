package com.casestudy.ocp.solution;

public class PDFReport implements IReportGenerator {

	@Override
	public void generateReport() {
		System.out.println("It generates PDF Report");
	}

}
