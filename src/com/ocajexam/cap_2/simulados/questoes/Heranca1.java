package com.ocajexam.cap_2.simulados.questoes;

import java.util.ArrayList;
import java.util.List;

public class Heranca1 {

	public static void main(String[ ] args) {

		new Heranca1();

	}
	
	
	public Heranca1(){
		A a = new A();// 1
		A b = new B();// 2
		
		System.out.println(b.i);
		
		
	}


	class A {
		private int i = 10;

		public List<String> f() {
			
			return new ArrayList<>();
		}

		public void g() {
		}
	}

	class B extends A {
		public int i = 20;

		public void g() {
		}
		
		public ArrayList<Integer> f() {
			return new ArrayList<>();
		}
	}

}
