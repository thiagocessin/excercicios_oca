package com.ocajexam.cap_2;

import java.text.NumberFormat;
import java.util.Locale;

import com.ocajexam.cap_2.enums.Suit;
import com.ocajexam.tutorial.planets.Earth;

public class DefinicoesClassesMain {

	
	static int i;//atribui zero
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sample();
				
		
	}
	
	
	public static void sample() { //bloco A
		
		int totalCount = 0;
		
		for(int i =0; i < 3; i++) {//bloco B
			
			int forCount = 0;
			totalCount++;
			forCount++;
			
			{//bloco c
				
				int block1Count = 0;
				totalCount++;
				forCount++;
				block1Count++;
				
			}//fim bloco c
			
			
			{//bloco d
				
				int block2Count = 0;
				totalCount++;
				forCount++;
				block2Count++;
				
			}//fim bloco d
			
			int block1Count;
			int block2Count;
			
			
			
			
		}//fim do bloco b
		
		
	}//fim bloco a
		
	
	public static void testes() {
		
		
		int [] array = new int[1];
		
		int array2[] = new int[1];
		
		
		float a = 19801216.0f;
		float b = 20120307.12f;
		
		
		
		System.out.println(NumberFormat.getCurrencyInstance().format(a+b));
		
		

		double n = 19801216.0;
		double m = 20120307.12;
		
		System.out.println(NumberFormat.getCurrencyInstance().format(n+m));
		System.out.println(n+m);

		
		
//		char c = 'S';
//		System.out.println();
//		
//		
//		System.out.println(i);
//		
//		
//		
//		 StringBuilder str = new StringBuilder("amrood ");
//	      System.out.println("string = " + str);
//	    
//	      // char array
//	      char[] cArr = new char[]
//	      {'a','d','m','i','n','i','s','t','r','a','t','o','r'};
//		
//	      /* appends the string representation of char array argument to
//	         this StringBuilder with offset at index 0 and length as 5 */
//	      str.append(cArr, 0, 5);
//		
//	      // print the StringBuilder after appending
//	      System.out.println("After append = " + str);
	}

}
