package com.ocajexam.cap_2.simulados.questoes;

public class Switcher {

	
	/**
	 * Atenção ao escopo de variáveis
	 * 
	 * 
	 * A chamda do programa foi feita com java Switcher 1 2 3
	 * 
	 * No caso a variável b foi declarada dentro do switch
	 * 
	 * Apesar de estar dentro do case, está dentrod o bloco e se torna uma variável existente
	 * 
	 * **/
	
	 public static void main(String[] args){
		 
		 
	       switch(Integer.parseInt(args[1]))  //1
	       {
	          case 0 :
	             boolean b = false;
	             break;
	     
	          case 1 :
	             b = true; //2
	             break;
	       }
	       
	       //erro de compilação será nessa linha
	       if(b) System.out.println(args[2]);
	   }
	
}


