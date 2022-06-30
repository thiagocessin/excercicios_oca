package com.ocajexam.cap_2.interfaces;

interface I1 {
	
	// sempre public static final
	double PI = 3.14;
	
	//sempre é abstrato
	void exibeValor();
	
	
	default String heranca1() {
		return "IN I1";
	}
	

}


interface I2{
	
	void exibeValor();
	
	default String heranca2() {
		
		return "IN I2";
	}
	
}


public class InterfaceExamples1 implements I1, I2{
	
	public static void main(String[] args) {
		
		new InterfaceExamples1();
	}

	
	InterfaceExamples1(){
		
		System.out.println(heranca1());
		System.out.println(heranca2());
	}
	public void exibeValor() {
		
	}

	
	public String defaultMethod() {
		return "";
	}
	
	public String heranca2() {
		
		return "IN Class";
	}
	
	
	
	
	
}





