package com.ocajexam.cap_2.simulados.questoes;

public class Questao1 {

	float f = 0x0123;
	float f2 = 4;
	float f3 = -1;
	
	Questao1(){}
	
	public static void main(String args[]){      
		Integer i = new Integer(1) ;      
		Long m = new Long(1); 
		//sempre compara os tipos de objetos no equals, se for diferente já retorna false
		if( i.equals(m)) System.out.println("equal");   // 1       
		else System.out.println("not equal");    
		}
}
