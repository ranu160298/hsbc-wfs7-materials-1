package com.hsbc.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today: "+today);
		LocalDate birthday = LocalDate.of(1980, 12, 26);
		System.out.println("Birthday: "+birthday);
		System.out.println("Enter date in the format dd-MM-yyyy:");
		Scanner scanner = new Scanner(System.in);
		String date = scanner.next();
		LocalDate anotherDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy")); // yyyy-MM-dd
		System.out.println("Another Date: "+anotherDate);
		System.out.println("Display another date in different format: "+anotherDate.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
		
		System.out.println("Month: "+birthday.getMonth()+", Month: "+birthday.getMonthValue());
		System.out.println("Year: "+birthday.getYear());
		scanner.close();
		
	}

}
