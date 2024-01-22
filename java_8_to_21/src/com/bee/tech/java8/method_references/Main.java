package com.bee.tech.java8.method_references;

interface Parser {
	String parse(String s);
}

class StringParser {
	public static String convert(String s) {
		if (s.length() > 3)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		return s;
	}
}

class Printer {
	public void print_v1(String str) {
		System.out.println(str);
	}

	public void print_v2(String str, Parser parser) {
		str = parser.parse(str);
		System.out.println(str);
	}
}

public class Main {

	public static void main(String[] args) {
		String str = "Zay mmm";
		Printer printer = new Printer();
		printer.print_v1(str);

		printer.print_v2(str, new Parser() { // step -1
			@Override
			public String parse(String s) {// anonymous class
				return StringParser.convert(s);
			}
		});

		printer.print_v2(str, (String s) -> StringParser.convert(s)); // step-2

		printer.print_v2(str, (s -> StringParser.convert(s))); // step-3

		printer.print_v2(str, (StringParser::convert)); // step-4

	}
}
