package com.ocajexam.cap_2.model;

public class Bicycle {
	
	private float wheelRPM;
	private int degreeOfTurn;
	
	public void pedalRPM(float pedalRPM) {
		float gearRatio = 2f;
		this.wheelRPM = pedalRPM * gearRatio;
	}

	public int getDegreeOfTurn() {
		return degreeOfTurn;
	}

	public void setDegreeOfTurn(int degreeOfTurn) {
		this.degreeOfTurn = degreeOfTurn;
	}

	public float getWheelRPM() {
		return wheelRPM;
	}
	

}
