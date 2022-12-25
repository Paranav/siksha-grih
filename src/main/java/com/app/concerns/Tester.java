package com.app.concerns;

public class Tester {

	public static void main(String[] args) {
		
		Person person = new Student();
		
		person.color();
		
		((Person)person).color();

	}

}
