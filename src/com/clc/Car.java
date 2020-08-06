package com.clc;


public class Car {

	private String carName;
	private Engine engine;
	private Speed vSpeed;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Speed getvSpeed() {
		return vSpeed;
	}
	public void setvSpeed(Speed vSpeed) {
		this.vSpeed = vSpeed;
	}
	public void printCarDetails() {
		System.out.println("My car is "+ carName);
		System.out.println("Engine year: " + engine.getModelYear());
		System.out.println("Vehicle Speed: " + vSpeed.getvSpeed());
		System.out.println("Speed Model: " + vSpeed.getModelYear());
	}

}
