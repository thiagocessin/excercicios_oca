package com.ocajexam.cap_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ocajexam.cap_2.model.Water;
import com.ocajexam.cap_2.model.WaterSort;

public class LambdaComparator {

	
	
	public static void main(String[] args) {
		
		compareWaterSource();

	}
	
	
	static void comparatorUsinglambda(){
		
		Comparator<Water> waterSort = (Water w1, Water w2) ->{
			return w1.getSource().compareTo(w2.getSource());
		};
		
	}
	
	
	//Interface comparator usada coo uma classe interna anônima
	//não há necessidade de usar uma classe WaterSort
	private static void compareWaterSource2() {
		
		
		Comparator<Water> waterSort = new Comparator<Water>() {

			@Override
			public int compare(Water w1, Water w2) {
				return w1.getSource().compareTo(w2.getSource());
			}
		
		
		};
		
		//Collections.sort(null);
		
		
		
	}
	
	
	//comparator implementada a partir de uma classe
	private static void compareWaterSource() {
		
		
		Water hardWater = new Water("Hard");
		Water softWater = new Water("Soft");
		Water boiledWater = new Water("Boiled");
		Water rawWater = new Water("Raw");
		Water rainWater = new Water("Rain");
		Water snowWater = new Water("Snow");
		
		
		List<Water> waterList = Arrays.asList(hardWater,softWater,boiledWater,rawWater,rainWater,snowWater);
		
		
		System.out.println("Not Sorted: ");
		
		waterList.forEach(w -> System.out.println(w.getSource()));
		
		System.out.println("\nSORTED\n");
	
		WaterSort waterSort = new WaterSort();
		Collections.sort(waterList, waterSort);

		waterList.forEach(w -> System.out.println(w.getSource()));

		
	}
	

}
