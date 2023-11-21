package com.casestudy.isp.solution;

public class Car implements IVehicle , FuelInterface {

	@Override
	public void start() {

		System.out.println("car is running");
	}

	@Override
	public void stop() {

		System.out.println("car is stopped");
	}

	@Override
	public void checkfuelStatus() {

		System.out.println("checking fuel status in car");

	}

}
