package com.ocajexam.cap_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExpressoesLambda {

	public static void main(String[] args) {
		
		usandoStream();
//		runnableExample();
//		strumms();
		

	}


	private static void strumms() {
		Strummable s = new Strummable() {
			
			@Override
			public void strum() {
				System.out.println("Strummed from new");
				
			}
		};
		
		//indico qual é a implementação do método strum
		Strummable instrument = () -> System.out.println("Strummed from argument!");
		
		instrument.strum();
		s.strum();
	}
	
	
	public static void runnableExample() {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
			System.out.println("Running");
			}
		}).run();;
		
		//envio a implementação do método como parâmetro
		new Thread(() -> System.out.println("Running")).run();
		
	}
	
	public static void usandoStream() {
		
		// API de Stream
		//stream é fluxo de dados
		
		List<Integer> asList = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

		/*
		 * 
		 * A interface Predicate é implementada dentro do fluxo de strems, no filter por exemplo
		 * é enviado uma implementação para o método boolean teste(T t)
		 * o tipo do parâmetro é inferido pelo tipo da lista que está sendo percorrida
		 * 
		 * new Predicate<Integer>() {
			@Override
			public boolean test(Integer e) {
				return e % 2 == 0;
			}
		}
		 * 
		 * */
		
//		
//		asList.stream()
//		.filter(n -> n % 2 ==0)
//		.forEach(n -> System.out.println(n));
		
		
		//não modifica a lista original
		asList.stream()
//			.skip(2)//pula, ignora os 2 primeiros elementos
//			.limit(2)//processa no máximo o n de elementos
//			.distinct()//não permite que os elementos repetidos sejam processados, equals e hashCode
//			.filter(e -> e%2 ==0)
			.map(e -> e*2)//transformação de dados
			.forEach(n -> System.out.println(n));
		
		
		
	}
	
	
	
	
	
	
	@FunctionalInterface
	interface Strummable{
		void strum();
	}
	
	

	
	
	
}
