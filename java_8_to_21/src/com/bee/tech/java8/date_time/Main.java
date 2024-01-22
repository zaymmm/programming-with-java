package com.bee.tech.java8.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		// LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println("Localdate: " + localDate);

		// LocalTime
		LocalTime localTime = LocalTime.now();
		System.out.println("Localtime: " + localTime);

		// LocalTime by zone id
		LocalTime time = LocalTime.now( 
	            ZoneId.systemDefault());
		System.out.println("Zone: " + time);

		// TODO Instant

		// DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = LocalDateTime.now().format(formatter);
		System.out.println(formattedDateTime);
	}

}
