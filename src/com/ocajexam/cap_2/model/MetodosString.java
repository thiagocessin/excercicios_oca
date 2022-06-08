package com.ocajexam.cap_2.model;

public class MetodosString {

	public static void main(String[] args) {
		//aprender usar append, insert, delete, and substring, entre outros
		
		
		System.out.println("SUBSTRING - NAO MODIFICA A STRING");
		
		String teste = "0123456789*";
		//imprime a partir do índice 
		System.out.println(teste.substring(4));
		//imprime a partir do índice (inclusive) até o indice final (não incluído) 
		System.out.println(teste.substring(3, 9));
		
		//índice maior ou menor que o string 
		//retorna a exception - java.lang.StringIndexOutOfBoundsException
		//System.out.println(teste.substring(28));
		
		
		System.out.println("APPEND - MODIFICA A STRING\n");
		
		StringBuilder message = new StringBuilder("Shivers!");
		System.out.println(message.append(false));
		
		
		System.out.println("\nINSERT - MODIFICA A STRING\n");

		StringBuilder sb2 = new StringBuilder("Shiver me Timbers");
		
		//append com CharSequence
		//adiciona ao final da sstring o charsequece da posição zero a cinco
		// exemplo da saída : Shiver ME Timberschars
		//append 
		//start -> início do da string a ser inserido
		//end -> Quantidade de caracteres a serem inseridos
		//teste, 0, 5 -> começa em zero e pega 5 caracteres de 'teste'
		//System.out.println(sb2.append("TESTE",1,2));
		
		
		String s = sb2.append("teste", 2, 5)
		   .insert(3,"hello")
		   .append(true)
		   .substring(3, 7);
		
		System.out.println(s);
		
		
		
		
		
		
		
		
	}

}
