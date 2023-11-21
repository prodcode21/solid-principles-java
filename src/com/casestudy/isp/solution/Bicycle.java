package com.casestudy.isp.solution;

public class Bicycle implements IVehicle {

	@Override
	public void start() {
     
		 System.out.println("Cycle is running");
	}

	@Override
	public void stop() {

		 System.out.println("Cycle is stopped");
	}

	
}
