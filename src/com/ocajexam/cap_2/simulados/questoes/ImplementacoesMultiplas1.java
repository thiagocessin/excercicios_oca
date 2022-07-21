package com.ocajexam.cap_2.simulados.questoes;


interface Bar {
	void bar();
}

abstract class FooBase {
	public static void bar() {
		System.out.println("In static bar");
	}
}

public class ImplementacoesMultiplas1 extends FooBase implements Bar {
	
	
}