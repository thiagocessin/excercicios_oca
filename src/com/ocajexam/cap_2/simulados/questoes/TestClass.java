package com.ocajexam.cap_2.simulados.questoes;

import java.util.ArrayList;
import java.util.List;

interface A {
	default void hello() {
	}
}

interface B extends A {
//	default void hello() {
//		super.hello();//This is NOT valid.        
//		A.super.hello();//This is valid.    
//	}
}

public class TestClass implements B {
//	public void hello() {
//		super.hello();//This is NOT valid.
//		A.super.hello(); //This is NOT valid because TestClass does not implement A directly.       
//		B.super.hello(); //This is valid.    
//	}

	 public static void main(String args[]){
	        int c = 0;
	        A: for(int i = 0; i < 2; i++){
	            B: for(int j = 0; j < 2; j++){
	                C: for(int k = 0; k < 3; k++){
	                    c++;
	                    if(k>j) break;
	                }
	            }
	        }
	        System.out.println(c);
	    }

}
