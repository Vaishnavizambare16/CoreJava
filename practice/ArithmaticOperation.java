package com.practice;

public class ArithmaticOperation {
	public static void main(String[] args) {
		char operation = '*';

		switch (operation) {
		case '+':
			System.out.println(" Addition... !");
			break;
		case '-':
			System.out.println(" Subtraction...!");
			break;
		case '*':
			System.out.println(" Multiplication..!");
			break;
		case '/':
			System.out.println(" Division...!");
			break;
		default:
			System.out.println(" Invalid Choice...!");

		}
	}

}
