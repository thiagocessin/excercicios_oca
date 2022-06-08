package com.ocajexam.cap_2.simulados.questoes.revisoes;

import java.util.Iterator;

public class TypelBozo implements Bozo {
	public TypelBozo() {

		boolean flag = true;
		
		 	if (flag)   //1
			   if (flag)   //2
			   if (flag)   //3
			   System.out.println("False True");
			   else        //4
			   System.out.println("True False");
			   else        //5
			   System.out.println("True True");
			   else        //6
			   System.out.println("False False");
		

	}

	public void jump() {
		System.out.println("jumping..." + type);
	}

	static boolean a;
	static boolean b;
	static boolean c;

	public static void main(String[] args) {
		boolean bool = (a = true) || (b = true) && (c = true);
		System.out.print(a + ", " + b + ", " + c);
	}
}
