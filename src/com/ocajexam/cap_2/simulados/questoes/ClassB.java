package com.ocajexam.cap_2.simulados.questoes;

public class ClassB extends ClassA {

	public static void main(String args[]) throws Exception {
		try {
			m1();
			System.out.println("A");
		} finally {
			System.out.println("B");
		}
		System.out.println("C");
	}

	public static void m1() throws Exception {
		throw new Exception();
	}

}
