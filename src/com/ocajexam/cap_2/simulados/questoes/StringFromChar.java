package com.ocajexam.cap_2.simulados.questoes;

public class StringFromChar {

	public static void main(String[] args) {
		
		String myStr = "good";
		
		char[] myCharArr = { 'g', 'o', 'o', 'd' };
		String newStr = null;
		for (char ch : myCharArr) {
			newStr = newStr + ch;// assume null como string + o valor recebido de ch
		}
		
		//false false
		System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));
	}
}
