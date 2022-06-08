package com.ocajexam.cap_2.simulados.questoes;

public class QuestoesGenericas {
	
	
	/*
	 * 
	 * Given: String mStr = "123"; 
	 * 		  long m = // 1 
	 * 
	 * Which of the following options when put at //1 will assign 123 to m?
	 * 
	 * DATA TYPES
	 * */
	
	
	{
		 String mStr = "123";
		 
		 // CORRETA - auto unboxing
		 new Long(mStr);
		 
		 //CORRETA
		 Long.parseLong(mStr);
		 
		 //ERRADA - logValue é um método não estático
		 Long.longValue(mStr);
		 new Long(0).longValue(); //exemplo
		 
		 //ERRADA
		 (new Long()).parseLong(mStr);

		 //CORRETA
		 Long.valueOf(mStr).longValue();
		 
		 
		 /*
		  *  Nenhuma classe Wrapper tem construtor vazio
		  * */
		
	}
	
	

}
