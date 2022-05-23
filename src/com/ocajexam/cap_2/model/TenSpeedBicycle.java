package com.ocajexam.cap_2.model;

public class TenSpeedBicycle extends Bicycle {
	
	private float gearRatio;
	private float wheelRPM;
	
	
	public void pedalRPM(float pedalRPM) {
		
		this.wheelRPM = pedalRPM * gearRatio;
	}
	
	public float getWheelRPM() {
		return wheelRPM;
	}
	public void setGearRatio(float gearRatio) {
		this.gearRatio = gearRatio;
	}
	
	
	
	

}
