package com.jbki;

public class Operator {
	public static void main(String[] args) {
		String ch = "/";
		int num = 10;
		int num1 = 20;
		switch (ch) {
		case "+":
			System.out.println(" Addtion = " + (num + num1));
			break;

		case "-":
			System.out.println(" Substrcation = " + (num - num1));
			break;

		case "*":
			System.out.println("Multiplaction is  = " + (num * num1));
			break;

		case "/":
			System.out.println(" Division = " + (num / num1));
			break;

		default:
			System.out.println("Invalid Input...!");

		}
	}

}
