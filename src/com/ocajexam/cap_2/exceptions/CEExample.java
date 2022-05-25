package com.ocajexam.cap_2.exceptions;

import java.io.IOException;

public class CEExample implements Runnable{

	
	// o lançamento de uma exceção específica para um thread não impacta a execução de uma sendo executada em paralelo
	public static void main(String[] args) throws IOException{
		
		Thread thrd = new Thread(new CEExample());
		thrd.start();
		
		try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//lança exceção checked não capturada
		throw new IOException("Oops");
		
		
	}

	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Alive");
		}
		
	}

}
