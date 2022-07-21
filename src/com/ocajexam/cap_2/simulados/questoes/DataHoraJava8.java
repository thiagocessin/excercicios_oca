package com.ocajexam.cap_2.simulados.questoes;

interface Bar1 {
	 void bar();
}

abstract class FooBase1 {
	public void bar() {
		System.out.println("In static bar");
	}
}

class Foo1 extends FooBase1 implements Bar1 {
}




public class DataHoraJava8 {

	static int si = 10;
	int i;
	final boolean bool;
	{

		bool = true;
	}

	public static void main(String[] args) {
		char a = 'a';

		System.out.println(1 + 2 + "3");
		System.out.println("1" + 2 + 3);
		System.out.println(4 + 1.0f);
		System.out.println(5 / 4);
		System.out.println('a' + 1);

		System.out.println(++a);

		"123456".charAt('1');

//		StringBuilder sb = new StringBuilder();
//		
//		sb.setLength(0);
//		
//		// LocalDate - representa uma data: 08/07/2022
//		LocalDate now = LocalDate.now();
//		System.out.println(now);
//		
//		LocalDate of = LocalDate.of(1990, Month.AUGUST, 6);
//		System.out.println(of);
//		
//		
//		//LocalTime - representa uma hora: 11:40:00
//		LocalTime now2 = LocalTime.now();
//		System.out.println(now2);
//		
//		//LocalDateTime - data e hora
//		LocalDateTime now3 = LocalDateTime.now();
//		System.out.println(now3);
//		
//		//Instant - reoresenta um instante/momento na linha do tempo a partir de 01/01/1970 00:00:00 (milisegundos)
//		Instant now4 = Instant.now();
//		System.out.println(now4);
//		
//		
//		//ZonedDateTime - LocalDateTime com Timezone
//		ZonedDateTime now5 = ZonedDateTime.now();
//		System.out.println(now5);
//		
//		
//		/// PERIOD
//		//ANO MES E DIA
//		Period of2 = Period.of(1, 5, 3);
//		System.out.println(of2);
//		
//		LocalDate ld = LocalDate.of(1990, Month.AUGUST, 6);
//		LocalDate ld2 = ld.plusWeeks(2).plusDays(1).plusMonths(1);
//		
//		System.out.println(Period.ofDays(344));
//		System.out.println(Period.ofMonths(12));
//		System.out.println(Period.ofWeeks(34));
//		
//		
//		Period between = Period.between(ld, ld2);
//		System.out.println(between);
//		
//		
//		Period plusDays = between.plusDays(12);
//		
//		System.out.println(plusDays);

	}

}
