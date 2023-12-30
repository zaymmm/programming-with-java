package com.bee.tech.java8.date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		// TODO LocalDate

		// TODO LocalTime

		// TODO LocalTime by zone id

		// TODO Instant

		// TODO DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = LocalDateTime.now().format(formatter);
		System.out.println(formattedDateTime);
	}

}
