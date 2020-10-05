package com.hsbc.java8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Time: "+time);
		System.out.println("Date & Time: "+dateTime);
		
		System.out.println("Format Date & Time: "+dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy 'T' hh:mm:ss")));
	
	}

}
