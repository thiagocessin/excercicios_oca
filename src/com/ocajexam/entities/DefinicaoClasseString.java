package com.ocajexam.entities;

import java.util.HashMap;
import java.util.Map;

public class DefinicaoClasseString {
	
	private Map<String, String> construtores = new HashMap<>();
	private Map<String, String> metodos = new HashMap<>();
	private int erros = 0;
	
	public DefinicaoClasseString() {
		construtores.put("vazio","");
		construtores.put("CharSequence", "seq");
		construtores.put("int", "capacity");
		construtores.put("String", "str");
		
		
		metodos.put("append", "boolean b");
		metodos.put("append", "char c");
		metodos.put("append", "char[] str");
		metodos.put("append", "char[] str, int offset, int len");
		metodos.put("append", "char c");
		metodos.put("append", "char c");
		metodos.put("append", "char c");
		metodos.put("append", "char c");
		metodos.put("append", "char c");
		metodos.put("append", "char c");
		metodos.put("append", "char c");
		metodos.put(null, null);
		metodos.put(null, null);
		
		
	}
	
	
	
	public String getConstructor(String arg) {
		
		if(construtores.get(arg) == null) { 
			++erros;
			return "Construtor não existe";
		}
		return construtores.get(arg);
	}
	
	
	public String getMetodo(String arg) {
		
		if(metodos.get(arg) == null) { 
			++erros;
			return "Método não existe";
		}
		return metodos.get(arg);
	}


	public int getErros() {
		return erros;
	}


}
