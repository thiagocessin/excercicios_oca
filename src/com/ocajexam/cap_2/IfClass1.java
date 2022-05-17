package com.ocajexam.cap_2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class IfClass1 {

	
	
	public static void main(String[] args) {
		
	
		
		
	
		
	}
	
	private static void concatStrings() {
		
		//erro de compilaçãopois concatenação de boolean com string não é permitida
		//System.out.println(true | false & true + ",");
	}
	
	
	private static void testeEquals() {
		
		String s1 = new String();
		String s2 = new String();
		
		System.out.println(s1.equals(s2));

		Integer value1 = new Integer("312");
		Integer value2 = new Integer("312");
		
		System.out.println(value1.equals(value2));
 
		//false pois possuem referências diferentes
		Object object1 = new Object();
		Object object2 = new Object();
		
		System.out.println(object1.equals(object2));
		
	}
	
	
	private static void treinoRestos(){
		
		
		
		long p  = 17496;
		
		//retorna a raiz quadrada
		Double primeSquareRoot = Math.sqrt(p);
		boolean isPrime= true;
		
		
		for(long j =2; j <= primeSquareRoot.longValue(); j++){
			if(p % j ==0) {
				//exibe divisores
				System.out.println(j + "x" + p/j);
				isPrime = false;
			}
		}

		System.out.println("Prime number: "+ isPrime);
		
		
		
		
//		System.out.println(123 % 35);
//		System.out.println(44 % 32 % 25 % 21 );
//		
		
		
		
		
		
	}
	
	private static void strings() {
		
		
		System.out.println("teste " + (10 + 10));//teste 20
		System.out.println("teste " + 10 + 10);//teste 1010
		System.out.println("teste " + 10 * 10);//teste 100
		System.out.println("teste " + 10 / 10);//teste 1
		System.out.println("teste " + 10 % 10);//teste 0
		//System.out.println("teste " + 10 - 10);//erro de compilacao
		
		long d = 10;
		long dSoma = 10+10;
		System.out.println("teste " + d + d);//teste 1010
		System.out.println("teste " + dSoma);//teste 20
		
		byte n = 1;
		byte n2 = 2;
		
		// menor tipo retornável do java é int
		int e = n+n2;
		//byte b = n+n2; erro de compilação
		
		//Divisão por zero
		//int div = 10/0; // erro em tempo de execucao Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		//retorna sempre o maior tipo
		double divZero = 10 / 0.0; 
		
		//retorna infinity
		System.out.println("Div por zero retorna "+ divZero);
		
		//retorna infinity negativo
		divZero = -10 / 0.0; 
		System.out.println("Div por zero retorna "+ divZero);

		
		String s = "Shiver Me Timbers!";
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.delete(6, 8));
		
		
		//Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
		System.out.println(new StringBuilder(10));
		
		
		
//		String s = "string de teste substring";
//		
//		System.out.println(s.substring(2)); //inclui o índice 2 no retorno, e retorna todo o restante
//		System.out.println(s.substring(2, 25)); // exclui o item 10
//		//beginIndex is inclusive and endIndex is exclusive while getting the substring
//		
//		System.out.println(s.substring(2,2));//retorna espaço em branco
//		System.out.println(s.substring(2,3)); // retorna o char na posição 2
		
		
		
		
		
//		String quote = "Dead men tell no tales"; //STRINGS SÂO IMUTÁVEIS
//		
//		StringBuilder sb = new StringBuilder("TESTE 1");
//		
//		sb.replace(0, 2, "TE");
//		
//		
//		quote.replace("no tales", "tales");//retorna um novo valor mas não muda a string
//		
//		System.out.println(sb);
		
		
//		float reale = .007812f;
//		float escudo = .125f;
//				
//		
//		System.out.println((reale + escudo) + "% of one gold doubloon"); //soma valores
//		System.out.println(reale + escudo + "% of one gold doubloon"); // soma valores
//		System.out.println("% of one gold doubloon "+ (reale + escudo)); // soma valores
//		System.out.println("% of one gold doubloon "+ reale + escudo); // exibe valor concatenado
//		
//		
//		String title1 = " shovels.";
//		String title2 = "Shovels: ";
//		int flatShovels = 5;
//		int roundPointShovels = 6;
//		
//		System.out.println(flatShovels + roundPointShovels + title1);
//		System.out.println(title2 + flatShovels + roundPointShovels);
//		System.out.println(title2 + (flatShovels + roundPointShovels)); //soma valores por causa da precedência dos parenteses
//		
//		
//		//**IMPORTANTE
//		//**método length() string usa parênteses, array não
//		System.out.println("stringteste".length());
//		
//		String [] array = new String[10];
//		System.out.println(array.length);
		

		
	}
	
	

	private static void precedencia() {
		
		int p1 = 1; int p2 = 5; int p3 = 10; int p4 = 25;
		
		System.out.println((p1 * (p2 + p3))- p4);
		
	}

	
	
	private static void comparacoes() {
		
		Object a = new Object();
		Object b = new Object();
		Object c = b;
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(b == c);
	}
	
	private static void pag84() {
		
		byte a = 1;
		
		System.out.println(a ^= 3);
	}
	
	private static void switchTeste() {
		
		
		Random r = new Random();
		int i = r.nextInt(4);
		
		String[] array = {"Leao", "Tigre", "Cachorro", "Gato"};
		
		switch (array[i]) {
			case "Leao": {
				
				System.out.println("Animal Leão");
				break;
			}
			case "Tigre": {
						
						System.out.println("Animal Tigre");
						break;
					}
			case "Gato": {
				
				System.out.println("Animal Gato");
				break;
			}
			case "Cachorro": {
				
				System.out.println("Animal Cachorro");
				break;
			}
			default:
			
			}
		
		
	}
	
	private static void ex2ArraysListFor() {
		
		List<Float> fishLengthList = Arrays.asList(10.0f, 15.5f, 18.0f,29.5f, 45.5f);
		
		for(Float f : fishLengthList) {
			if(f >28f) System.out.println(f);
		}
		
	}
	
	private static void extracted() {
		boolean b;
		boolean bValue = (b=true);
		
		if(bValue) System.out.println("TRUE");
		
		else System.out.println("FALSE");
		
		//**
		
		if(bValue = false) System.out.println("TRUE");
		else System.out.println("FALSE");
		
		//**
		if(bValue == false) System.out.println("TRUE");
		else System.out.println("FALSE");
		
		int i;
		int iValue = (i=1);
		
		pag84();
		//switchTeste();
		//ex2ArraysListFor();
		
		if(true) ; {};
		
		char a = 12345;
		
		double fl = (double)9;
		
		boolean c = 'A' < 'B';
	}
}
