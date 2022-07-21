package com.ocajexam.cap_2.inheritance;

public class TesteA {

	public static void main(String[] args) {
		
		B2 b = new B2();
		b.fi = 20;
		System.out.println(b.fi);
		System.out.println(((A2) b).fi);
		
		

	}

}

class A2 {
	final int fi = 10;
}

class B2 extends A2 {
	
	int fi = 15;

	public static void main(String[] args) {
		
	}
}