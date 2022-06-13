package com.ocajexam.cap_2.simulados.questoes.revisoes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TesteLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);
		
		System.out.println(ld);
		
		ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
		date = date.plus(Duration.ofDays(1));
		System.out.println(date);
		
		

	}

}
