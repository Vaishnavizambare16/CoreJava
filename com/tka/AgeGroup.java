package com.tka;

public class AgeGroup {
	public static void main(String[] args) {
		int age = 20;
		if (age <= 18) {
			System.out.println(" Person is Child");
		} else if (age <= 21) {
			System.out.println(" Person is Adult");
		} else {
			System.out.println(" person is seniorCitizen");
		}
	}

}
