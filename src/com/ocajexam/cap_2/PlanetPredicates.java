package com.ocajexam.cap_2;

import java.awt.Color;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.ocajexam.cap_2.model.Planet;

public class PlanetPredicates {
	
	//Como Predicate é uma Interface Funcional
	// o método espera o retorno de uma implementaçã para o SAM (Single Abstract Method)
	//
	public static Predicate<Planet> hasMoonsMoreThan(Integer moons){
		return p -> p.getNumberOfMoons() > moons;	
	}
	
	public static Predicate<Planet> hasColor(){
		return p -> p.getPrimaryColor() != Color.BLACK;
	}
	
	public static List<Planet> filterPlanets(List<Planet> planetList, Predicate<Planet> predicate){
		return planetList.stream().filter(predicate).collect(Collectors.toList());
	}
	
	public static StringBuilder listFilteredPlanets(List<Planet> planetList, Predicate<Planet> predicate) {
		
		StringBuilder planets = new StringBuilder();
		
		planetList.stream()
			//.filter((planet) -> (predicate.test(planet)))// filtra somente pelo teste que receber no predicate
			.filter(predicate)
			.forEach((planet)->{
				planets.append(planet).append(" ");
			});
		
		
		//ALTERNATIVA
//		for (Planet planet : planetList) {
//			
//			if(predicate.test(planet)) {
//				planets.append(planet).append(" ");
//				
//			}
//		}
			
		return planets;
	}
	
	

}
