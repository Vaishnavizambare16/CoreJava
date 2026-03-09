package com.aa;

public class Consonant {
	public static void main(String[] args) {
		char ch = 'a';

		if (ch >= '0' && ch <= '9') {
			System.out.println(" Digit ");
		} else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(" vowel...");
		} else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println(" Consonant");
		} else {
			System.out.println(" Special Character ");
		}
	}

}
