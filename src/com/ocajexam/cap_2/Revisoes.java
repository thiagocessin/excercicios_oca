package com.ocajexam.cap_2;

public class Revisoes {

	static char ch;

	public static void main(String[] args) throws Exception {

		boolean b1 = false;
		int i1 = 2;
		int i2 = 3;
		if (b1 = i1 == i2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	private static void teste3() {

		int a = Integer.MIN_VALUE;
		int b = -a;
		System.out.println(a + "   " + b);
	}

	private static void teste1() throws Exception {

		Super sub = new Sub();
		sub.m1();

	}

	private static void teste2() {

		int[] arr = new int[10];

		System.out.println(arr[-1]);

	}

	private static void arrayZero() {
		int arr[] = new int[0];

		System.out.println(arr.length);

	}

}

//In file AccessTest.java package a; 

// In file AccessTester.java package b; import a.AccessTest;

interface I {

	/// sempre public static final
	int a = 10;

}

class Super {

	void m1() throws Exception {
		System.out.println("In super");
	}

}

class Sub extends Super implements I {

	public void m1() {
		System.out.println("In sub");

	}

	void m() {

		// a = 15; campo final
		int x = I.a;// campo estático
	}

}