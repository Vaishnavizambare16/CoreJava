package com.jbki;

public class Result {
	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {

		case 'A':
			System.out.println("Range -> 60 to 100  -> Pass");
			break;
		case 'B':
			System.out.println("Range -> 40 to 60  -> Distinction");
			break;
		default:
			System.out.println(" Fail...!");
		}
	}

}
