package com.ocajexam.cap_2.interfaces;

public interface InterfaceTeste extends InterfaceTeste2, InterfaceTeste3 {
	
	public void run();
	
	
	default public void runMore() {
		System.out.println("Running more");
	}

}

