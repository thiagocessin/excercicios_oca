package com.ocajexam.cap_2.simulados.questoes.revisoes;

import java.util.ArrayList;
import java.util.List;


class AA extends A { 
  public long getCode(){ return 3;}
}

class TestClass {
    
    public static void main(String[] args) throws Exception {
         A a = new A();
        A aa = new AA();
        System.out.println(a.getCode()+" "+aa.getCode());
    }

    public int getCode() {
        return 1;
    }
}

public class A {

	 public int getCode(){ return 2;}


		
	
}
