package com.practice;

public class Grade {
	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {

		case 'A':
			System.out.println(" Range -> 90 to 100  -> Distinction...!");
			break;
		case 'B':
			System.out.println(" Range -> 80 to 90  -> First Class...! ");
			break;
		case 'C':
			System.out.println(" Range -> 70 to 80  -> Second Class...!");
			break;
		case 'D':
			System.out.println(" Range -> 60 to 70  -> Pass...!");
			break;

		default:
			System.out.println(" Fail...!");

		}
	}

}
