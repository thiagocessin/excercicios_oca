package com.ocajexam.cap_2;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import com.ocajexam.cap_2.model.Planet;


import com.ocajexam.cap_2.PlanetPredicates.*;
import com.ocajexam.cap_2.interfaces.InterfaceTeste;

public class PlanetApp implements InterfaceTeste{

	public static void main(String[] args) {
		
		

		Planet mercury = new Planet("Mercury", Color.GRAY, 0, false);
		Planet venus = new Planet("Venus", Color.YELLOW , 0, false);
		Planet earth = new Planet("Earth", Color.BLUE, 1, false);
		Planet mars = new Planet("Mars", Color.RED, 2, false);
		Planet jupiter = new Planet("Jupiter", Color.YELLOW, 67, true);
		Planet saturn = new Planet("Saturn", Color.ORANGE, 62, true);
		Planet uranus = new Planet("Uranus", Color.GREEN, 27, true);
		Planet neptune = new Planet("Neptune", Color.BLUE, 14, true);
		
		
		List<Planet> planetList = Arrays.asList(mercury,venus,earth,mars,jupiter,saturn,uranus,neptune);
		
		//CENÁRIO 1 - quais planetas tem anéis?
		StringBuilder ringedPlanets = PlanetPredicates.listFilteredPlanets(planetList, (Planet p) -> p.isRinged());
		System.out.println("Ringed Planets: "+ ringedPlanets +"\n");
		
		
		//CENÁRIO 2 - Quais planetas são azuis e tem luas
		System.out.println(PlanetPredicates.listFilteredPlanets(planetList, (Planet p)-> p.getNumberOfMoons() > 0 && p.getPrimaryColor().equals(Color.BLUE)));
		// OU
		
		planetList.stream()
			.filter(p -> p.getNumberOfMoons() > 0 && p.getPrimaryColor().equals(Color.BLUE))
			.forEach(p ->{
				System.out.println(p);
				
			});
		
		//CENÁRIO 3 - Quais planetas tem mais de 20 luas
		
		System.out.println(PlanetPredicates.filterPlanets(planetList, PlanetPredicates.hasMoonsMoreThan(20)));
		

		// CENÁRIO 4 - Que planeta tem uma cor que não seja preta
		System.out.println(PlanetPredicates.filterPlanets(planetList, PlanetPredicates.hasColor()));
		
		// OU
		
		planetList.stream()
			.filter(PlanetPredicates.hasColor())
			.forEach(p->{
				System.out.println(p);
			});
		
		//CENÁRIO 5 - Que planetas tem luas
		System.out.println(PlanetPredicates.filterPlanets(planetList, PlanetPredicates.hasMoonsMoreThan(0)));
		// OU
		
		planetList.removeIf((Planet p) -> {
			return p.getNumberOfMoons() == 0;
		});
		
		
		
		
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
