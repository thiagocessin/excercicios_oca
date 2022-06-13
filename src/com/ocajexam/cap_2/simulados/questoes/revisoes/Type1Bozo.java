package com.ocajexam.cap_2.simulados.questoes.revisoes;

public class Type1Bozo implements Bozo {
	public Type1Bozo() {
		type = 1;
	}

	public void jump() {
		System.out.println("jumping..." + type);
	}

	public static void main(String[] args) {
		Bozo b = new Type1Bozo();
		b.jump();
	}
}