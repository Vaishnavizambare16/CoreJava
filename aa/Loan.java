package com.aa;

public class Loan {
	public static void main(String[] args) {
		int age = 18;
		double salary = 40000;

		if (age >= 21) {
			System.out.println(" 1st stage is clear move to next step ");
			if (salary >= 25000) {
				System.out.println(" Loan approved..");
			} else {
				System.out.println(" sorry..!");
			}
		}else {
			System.out.println(" You are not eligible for loan..");
		}

	}

}
