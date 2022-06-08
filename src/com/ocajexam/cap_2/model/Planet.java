package com.ocajexam.cap_2.model;

import java.awt.Color;

public class Planet {

	private String name = "Unknown";
	private Color primaryColor = Color.WHITE;
	private Integer numberOfMoons = 0;
	private Boolean ringed = false;

	public Planet(String name, Color primaryColor, Integer numberOfMoons, Boolean ringed) {
		super();
		this.name = name;
		this.primaryColor = primaryColor;
		this.numberOfMoons = numberOfMoons;
		this.ringed = ringed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getPrimaryColor() {
		return primaryColor;
	}

	public void setPrimaryColor(Color primaryColor) {
		this.primaryColor = primaryColor;
	}

	public Integer getNumberOfMoons() {
		return numberOfMoons;
	}

	public void setNumberOfMoons(Integer numberOfMoons) {
		this.numberOfMoons = numberOfMoons;
	}

	public Boolean isRinged() {
		return ringed;
	}

	public void setRinged(Boolean ringed) {
		this.ringed = ringed;
	}

	@Override
	public String toString() {
		return "Planet [name=" +name +"]";
	}
	
	

}
