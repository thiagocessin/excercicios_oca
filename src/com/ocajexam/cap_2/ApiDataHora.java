package com.ocajexam.cap_2;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ApiDataHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ApiDataHora();
		
	}
	
	public ApiDataHora() {
		
		classeLocalTime();
	}

	void classeLocalTime() {
		
		//LocalTime inclui várias declarações de métodos que dão suporte a criação de um horário sem fuso e sem data
		System.out.println("METODOS CLASSE LocalTime");
		System.out.println(LocalTime.now());
		//int hour, int minute
		System.out.println(LocalTime.of(13,25));//13:25
		//int hour, int minute, int sec
		System.out.println(LocalTime.of(13,25,10));//13:25:10
		//hour
		System.out.println(LocalTime.parse("10:10"));//10:10
		System.out.println(LocalTime.parse("10:10", DateTimeFormatter.ISO_TIME));//10:10
				
		
		System.out.println(LocalTime.NOON);// 12:00
		System.out.println(LocalTime.MIN);//00:00
		System.out.println(LocalTime.MAX);//23:59:59.999999999
		System.out.println(LocalTime.MIDNIGHT);//00:00
		System.out.println(LocalTime.now(ZoneId.of("Asia/Tokyo")));//região
		
		
	}
	
}
