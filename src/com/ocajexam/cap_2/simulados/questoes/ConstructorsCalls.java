package com.ocajexam.cap_2.simulados.questoes;

public class ConstructorsCalls {

}

class SuperClass{
	  public SuperClass() {} // A1
	  public SuperClass(String s) {  this();  System.out.println("A :"+s);  }  // A2
	}

	class Sub1 extends SuperClass{
	  public int B(String s) {  System.out.println("B :"+s);  return 0; } // B1
	}
	class Sub2 extends Sub1{
	    private Sub2(){ super(); } // C1
	    public Sub2(String s){  this();  System.out.println("C :"+s);  } // C2
	    public Sub2(int i){} // C3
	}
