package com.ocajexam.cap_2.simulados.questoes;

public class TesteWrapperClassesImutable {

	//All the wrapper objects are immutable. When you do i++, what actually happens is something like this:
	//i = Integer.valueOf( i.intValue()  + 1);  As you can see, a different Integer object is assigned back to i.
	public static void main(String[] args){
        Integer i = Integer.parseInt(args[0]);
        Integer j = i;
        i--;
        i++;
        System.out.println((i==j));
        
    }
}
