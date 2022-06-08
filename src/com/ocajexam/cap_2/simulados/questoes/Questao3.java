package com.ocajexam.cap_2.simulados.questoes;

public class Questao3 {

	public int a = 10;

	public static void main(String[] args) {
		int i = 1234567890;
		float f = i;
		System.out.println(i - (int) f);
	}

	public static void printSum(double a, double b) {
		System.out.println("In double " + (a + b));
	}

	public static void printSum(float a, float b) {
		System.out.println("In float " + (a + b));
	}

}
