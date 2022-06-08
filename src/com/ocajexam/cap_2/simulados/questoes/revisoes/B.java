package com.ocajexam.cap_2.simulados.questoes.revisoes;

public class B extends A{
	
	   final int i =   4;
	   public static void main(String[] args){
	      A a = new B();
	      a.print();
	   }
	   void print() { System.out.print(i+" "); }
}
