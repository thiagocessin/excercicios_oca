package com.ocajexam.cap_2;

public class NovoTeste {

	public static void main(String[] args) throws Exception {
		try {
			amethod();
			System.out.println("try ");
		} catch (Exception e) {
			System.out.print("catch ");
		} finally {
			System.out.print("finally ");
		}
		System.out.print("out ");
	}

	public static void amethod() {
	}

}
