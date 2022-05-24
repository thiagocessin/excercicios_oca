package com.ocajexam.cap_2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import com.ocajexam.cap_2.model.Bicycle;
import com.ocajexam.cap_2.model.TenSpeedBicycle;

public class DefinicoesClassesMain {

	
	static int i;//atribui zero
	
	
	public static void main(String[] args) {
		
	
		// byte, short, char, int, long, float, double, boolean
		
		double detailedScore = 1.2;
		//perda de dados
		float score = (float)detailedScore;
		
		//não há perda de dados
		detailedScore = score;
		
		Float f = 5.7f;
		
				
		
	}
	
	public static void ticTacToeBoard() {
		
		Bicycle b = new Bicycle();
		b.setDegreeOfTurn(0);
		b.pedalRPM(50);
		
		System.out.println("Wheel rpm "+ b.getWheelRPM());
		
		TenSpeedBicycle b2 = new TenSpeedBicycle();
		b2.setDegreeOfTurn(10);
		b2.setGearRatio(3f);
		b2.pedalRPM(40);
		
		System.out.println("Wheel rpm "+ b2.getWheelRPM());
		
		
		Bicycle b3 = new TenSpeedBicycle();
		
		char [] [] ticTacToeBoard = new char[3][3];
		
		for(int y = 0; y < 3; y++) {
			for(int x = 0; x < 3; x++) {
				ticTacToeBoard[x][y] = '-';
			}
			
		}
		

		
		ticTacToeBoard[0][0] = 'X';
		ticTacToeBoard[1][1] = 'O';
		ticTacToeBoard[0][2] = 'X';
		
		for(int y = 0; y < 3; y++) {
			for(int x = 0; x < 3; x++) {
				System.out.println(ticTacToeBoard[x][y] + " ");
			}
			System.out.println("\n");
			
		}
		
		
		
	}
	
	
	public static void sample2() {
	int[] array= {1};
		
		System.out.println(i);
		for(int c : array)		
			System.out.println(c);
		
		List<Integer> lista = new ArrayList<>();
		lista.size();
		
		Integer [] a = new Integer[1];
		int length = a.length;
		
		System.out.println(a.length);//lenth não é um método, nesse caso é um campo público
	
		"".length(); // em strings existe o método length
	
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
