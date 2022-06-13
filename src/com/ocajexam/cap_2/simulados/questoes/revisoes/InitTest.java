package com.ocajexam.cap_2.simulados.questoes.revisoes;

import java.util.Arrays;

public class InitTest {
	
	String s = this.toString();
	
	public static void main(String args[]){

	      String s = "s";
	      String s2 = new String("s");
	      
	      
	      System.out.println(s == s2);
	      
	      

	      
	   }
	   public static void processStacks(Stack x1, Stack x2){
	      x1.push (new Integer ("100")); //assume that the method push adds the passed object to the stack.
	      x2 = x1;
	   }
}

class Stack{
	
	Integer [] array = new Integer[10];

	
	public void push(Integer i) {
		array[0] = i;
	}


	@Override
	public String toString() {
		return "Stack [array=" + Arrays.toString(array) + "]";
	}
	
	
}