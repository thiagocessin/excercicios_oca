package com.ocajexam.cap_2.simulados.questoes;

public class Comparacoes {
	
	public static void main(String[] args) {
		
		Integer i1 = 1;
		Integer i2 = new Integer(1);
		int i3 = 1;
		Byte b1 =1 ;
		Long g1 = 1l;
		
		//return false because both are pointing to different object.
		System.out.println(i1 == i2);
		
		//eturn true because one operand is a primitive int and so the other will be unboxed and then the value will be compared.
		System.out.println(i1 == i3);
		
		//not even compile because type of i1 and b1 references are classes that are not in the same class hierarchy. So == knows at compile time itself that they can't point to the same object.
		//System.out.println(i1 == b1);
		
		//will return true because both are Integer objects and both have the value 1.
		System.out.println(i1.equals(i2));
		//will return false because they are pointing to objects of different types.
		System.out.println(i1.equals(g1));
		System.out.println(i1.equals(b1));
		
		int i = 1,00,11;
		
	}

}
