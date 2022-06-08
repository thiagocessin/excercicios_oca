package com.ocajexam.cap_2.model;

import java.util.Comparator;

//classe com algoritmo de ordenaçao
public class WaterSort implements Comparator<Water> {
	

	@Override
	public int compare(Water w1, Water w2) {
		return w1.getSource().compareTo(w2.getSource());
	}

}
