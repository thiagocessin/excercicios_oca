package com.ocajexam.cap_2.simulados.questoes;

public class Questao2 {

	public void initData(String[] arr) {
		int ind = 0;
		for (String str : arr) {
			str.concat(str + " " + ind);
			ind++;
		}
	}

	public void printData(String[] arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		Questao2 ot = new Questao2();
		String[] arr = new String[2];
		ot.initData(arr);
		ot.printData(arr);
		
		String[] sA = new String[] { "aaa"};
	}

}
