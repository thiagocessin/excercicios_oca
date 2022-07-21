package com.ocajexam.cap_2.simulados.questoes;

public class CompareTest {

	public static void main(String[] args) {
		
		Integer i1 = 1;
		Integer i2 = new Integer(1);
		int i3 = 1;
		Byte b1 = 1;
		Long g1 = 1l;
		
		Integer i4 = 10;
		byte b2 = 2;
		
		System.out.println(i1==i2);
		System.out.println(i1==i3);
		
		
		//System.out.println(i1==b1);
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(g1));
		System.out.println(i1.equals(b1));
		
		
		System.out.println(i4==b2);

	}

}
