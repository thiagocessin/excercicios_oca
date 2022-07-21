package com.ocajexam.cap_2.inheritance;

public class InheritanceTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//CONFLITO DE MÉTODOS

// Nesse caso, o conflito é resolvido implemetando o método print na classe Teste1
class Teste1 implements A, B {

	public void print() {
		System.out.println("print in Teste1");
	}
}

interface A {
	void print();
}

interface B {
	void print();
}

//=======================

class Teste2 implements C, D {

}

interface C {
	static void print() {
		System.out.println("Print from C");
	}
}

interface D {
	static void print() {
		System.out.println("Print from D");
	}
}
//=============================

class Teste3 extends E implements F {

}

abstract class E {
	public static void print() {
		System.out.println("Print from C");
	}
}

interface F {
	void print();
}






//interface Bar {
//	void bar();
//}
//
//
//
//abstract class FooBase {
//	public static void bar() {
//		System.out.println("In static bar");
//	}
//}
//
//public class Foo extends FooBase implements Bar {
//}
