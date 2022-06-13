package com.ocajexam.cap_2.simulados.questoes.revisoes;

public class StringBuilderTeste {
	
	
	public static final int i = 10;

	public static void main(String[] args) {

		try {
			Class<?> forName = Class.forName("java.lang.String");
			
			
			int a=1234567890;
			float f = a;
			
			
			System.out.println(forName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static int atualiza(int i) {
	
		return ++i;
		
	}

}
