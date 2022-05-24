package com.ocajexam.cap_2.exceptions;

public class CEExample implements Runnable{

	public static void main(String[] args) {

		Thread thrd = new Thread(new CEExample());
		thrd.start();
		
		
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
