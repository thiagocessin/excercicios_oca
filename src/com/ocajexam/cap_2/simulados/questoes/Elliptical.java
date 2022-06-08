package com.ocajexam.cap_2.simulados.questoes;


/*
 * Consider the following class written by a novice programmer.
 * 
 * After some time, the requirements changed and the programmer
 *  now wants to make sure that radiusB is always (200 - radiusA) instead of (100 - radiusA) 
 *  without breaking existing code that other people have written. Which of the following will accomplish his goal?
 * */
/*
 *		 1) Make sum = 200;
 *		 2) Make sum = 200 and make it private.
		 3) Make sum = 200 and make all fields (radiusA, radiusB, and sum) private.
		 4) Write another method setRadius2(int r) and set radiusB accordingly in this method.
		 5) His goal cannot be accomplished. CORRETO
		 6) This class will not compile.
 * 
 * Nessa questão não podemos alterar o modificador de acesso para private pois afetaremos outras classes, então não há como atingir o objetivo
 * 	A classe deveria ter sido criada e encapsulada corretamente no primeiro momento
 * 
 * 
 * 
 * */

public class Elliptical {
	
	public int radiusA, radiusB;
    public int sum = 100;

    public void setRadius(int r){
        if(r>99) throw new IllegalArgumentException();
        radiusA = r;
        radiusB = sum - radiusA;
        
    }

}
